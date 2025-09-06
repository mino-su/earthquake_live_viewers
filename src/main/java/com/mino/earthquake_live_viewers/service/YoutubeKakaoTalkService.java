package com.mino.earthquake_live_viewers.service;


import com.mino.earthquake_live_viewers.http.KakaoTalkClient;
import com.mino.earthquake_live_viewers.http.YoutubeClient;
import com.mino.earthquake_live_viewers.model.youtube.ConCurrent;
import com.mino.earthquake_live_viewers.model.youtube.LiveStreamingDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Youtube Api
 * Videos: LiveStreamDetails
 *
 */

@Service
@RequiredArgsConstructor
public class YoutubeKakaoTalkService {
    private final YoutubeClient youtubeClient;
    private final KakaoTalkClient kakaoTalkClient;

    public void execute() {
        // youtube api 호출
        LiveStreamingDetails liveDetails = youtubeClient.getLiveDetails();
        ConCurrent from = ConCurrent.from(liveDetails);

        // 카카오톡 api 호출

    }


}
