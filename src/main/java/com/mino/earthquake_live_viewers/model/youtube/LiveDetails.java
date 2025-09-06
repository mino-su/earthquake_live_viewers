package com.mino.earthquake_live_viewers.model.youtube;

import java.util.List;

public record LiveDetails(List<Items> items) {

    /**
     * "kind": "youtube#videoListResponse",
     *   "etag": "e9wffznWOWMUPq31CiYb-uUgoTY",
     *   "items": [
     *     {
     *       "kind": "youtube#video",
     *       "etag": "GWYq06RBm11-SuobW7Ycq_AXRek",
     *       "id": "c7_kqMFDE8c",
     *       "liveStreamingDetails": {
     *         "actualStartTime": "2024-01-11T00:06:08Z",
     *         "scheduledStartTime": "2024-01-11T00:05:00Z",
     *         "concurrentViewers": "1888",
     *         "activeLiveChatId": "Cg0KC2M3X2txTUZERThjKicKGFVDVVZXb3lfckdQZFplVXA3ampSSE9hURILYzdfa3FNRkRFOGM"
     *       }
     *     }
     *   ],
     *   "pageInfo": {
     *     "totalResults": 1,
     *     "resultsPerPage": 1
     *   }
     * }
     */
}
