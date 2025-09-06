package com.mino.earthquake_live_viewers.model;

public record Items(String id, LiveStreamingDetails liveStreamingDetails) {

    /**
     * "items": [
     *      *     {
     *      *       "kind": "youtube#video",
     *      *       "etag": "GWYq06RBm11-SuobW7Ycq_AXRek",
     *      *       "id": "c7_kqMFDE8c",
     *      *       "liveStreamingDetails": {
     *      *         "actualStartTime": "2024-01-11T00:06:08Z",
     *      *         "scheduledStartTime": "2024-01-11T00:05:00Z",
     *      *         "concurrentViewers": "1888",
     *      *         "activeLiveChatId": "Cg0KC2M3X2txTUZERThjKicKGFVDVVZXb3lfckdQZFplVXA3ampSSE9hURILYzdfa3FNRkRFOGM"
     *      *       }
     *      *     }
     *      *   ]
     */
}
