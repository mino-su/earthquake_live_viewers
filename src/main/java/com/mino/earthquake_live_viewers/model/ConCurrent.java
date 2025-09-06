package com.mino.earthquake_live_viewers.model;

import java.time.LocalDateTime;

public record ConCurrent(LocalDateTime now, Integer concurrentViewers) {
    public static ConCurrent from(LiveStreamingDetails liveStreamingDetails) {
        var now = LocalDateTime.now();
        var concurrentViewers = liveStreamingDetails.concurrentViewers();
        return new ConCurrent(now, concurrentViewers);
    }
}
