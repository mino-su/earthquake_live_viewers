package com.mino.earthquake_live_viewers.service;

import com.google.api.client.json.jackson2.JacksonFactory;
import org.springframework.stereotype.Service;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.VideoListResponse;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Service
public class YoutubeSearchService {


    private static final String API_KEY = "${google.api_key}"; // 발급받은 API 키를 입력하세요.
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    public static String getLiveViewers(String videoId) throws GeneralSecurityException, IOException {
        YouTube youtube = new YouTube.Builder(
                GoogleNetHttpTransport.newTrustedTransport(),
                JSON_FACTORY,
                request -> { /* 요청 처리 */ }
        ).setApplicationName("youtube-api-example").build();
        // Videos: list 엔드포인트 사용
        YouTube.Videos.List request = youtube.videos()
                .list("liveStreamingDetails"); // 실시간 시청자수는 liveStreamingDetails 필드에 포함됩니다.
        request.setKey(API_KEY);
        request.setId(videoId); // 조회할 동영상 ID를 설정합니다.
        VideoListResponse response = request.execute();
        // 응답에서 실시간 시청자수를 파싱합니다.
        if (response != null && !response.getItems().isEmpty()) {
            // 실제로는 response.getItems().get(0).getLiveStreamingDetails().getConcurrentViewers() 와 같은 형식으로 가져옵니다.
            // 이 필드는 라이브 스트리밍 시에만 존재합니다.
            // 예시를 위해 임시로 문자열 반환
            return "실시간 시청자수: " + response.getItems().get(0).getLiveStreamingDetails().getConcurrentViewers().toString();
        }
        return "정보를 찾을 수 없습니다.";
    }

//        public static void main(String[] args) {
//            String videoId = "YOUR_VIDEO_ID"; // 실제 동영상 ID를 입력하세요.
//            try {
//                String viewers = getLiveViewers(videoId);
//                System.out.println(viewers);
//            } catch (GeneralSecurityException | IOException e) {
//                e.printStackTrace();
//            }
//        }

}
