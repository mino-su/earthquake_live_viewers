package com.mino.earthquake_live_viewers.model.youtube;

public record LiveStreamingDetails(Integer concurrentViewers,
                                   String activeLiveChatId) {

    /**
     * "liveStreamingDetails": {
     *      *      *         "actualStartTime": "2024-01-11T00:06:08Z",
     *      *      *         "scheduledStartTime": "2024-01-11T00:05:00Z",
     *      *      *         "concurrentViewers": "1888",
     *      *      *         "activeLiveChatId": "Cg0KC2M3X2txTUZERThjKicKGFVDVVZXb3lfckdQZFplVXA3ampSSE9hURILYzdfa3FNRkRFOGM"
     *      *      *       }
     */
}
