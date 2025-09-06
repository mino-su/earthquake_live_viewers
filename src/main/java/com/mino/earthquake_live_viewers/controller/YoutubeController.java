package com.mino.earthquake_live_viewers.controller;

import com.mino.earthquake_live_viewers.model.ConCurrent;
import com.mino.earthquake_live_viewers.model.LiveStreamingDetails;
import com.mino.earthquake_live_viewers.service.YoutubeVideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/youtube")
public class YoutubeController {

    private final YoutubeVideoService youtubeVideoService;

    @GetMapping("/concurrent")
    public ResponseEntity<ConCurrent> getConcurrentViewers() {
        var liveDetails = youtubeVideoService.getLiveDetails();
        return ResponseEntity.ok(ConCurrent.from(liveDetails));
    }

}
