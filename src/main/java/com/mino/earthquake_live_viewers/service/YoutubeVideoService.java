package com.mino.earthquake_live_viewers.service;


import com.mino.earthquake_live_viewers.model.ConCurrent;
import com.mino.earthquake_live_viewers.model.Items;
import com.mino.earthquake_live_viewers.model.LiveDetails;
import com.mino.earthquake_live_viewers.model.LiveStreamingDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Youtube Api
 * Videos: LiveStreamDetails
 *
 */

@Service
public class YoutubeVideoService {
    private final RestClient restClient = RestClient.create();

    private final String apiKey;
    private final String apiUri;
    private final String videoId;

    private final String part = "liveStreamingDetails";

    public YoutubeVideoService(@Value("${google-api.api_key}")String apiKey,
                               @Value("${google-api.api_uri}")String apiUri,
                               @Value("${google-api.video_id}")String videoId) {
        this.apiKey = apiKey; // youtube api key
        this.apiUri = apiUri; // youtube api uri
        this.videoId = videoId;
    }

    public LiveStreamingDetails getLiveDetails() {
        var response = restClient
                .get()
                .uri(apiUri+"part="+part+"&id="+videoId+"&key="+apiKey)
                .retrieve()
                .body(LiveDetails.class);

        if (response == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return response.items().get(0).liveStreamingDetails();


    }

}
