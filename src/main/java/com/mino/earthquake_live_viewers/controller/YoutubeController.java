package com.mino.earthquake_live_viewers.controller;

import com.mino.earthquake_live_viewers.model.youtube.ConCurrent;
import com.mino.earthquake_live_viewers.service.YoutubeKakaoTalkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/youtube")
public class YoutubeController {

    private final YoutubeKakaoTalkService youtubeVideoService;



}
