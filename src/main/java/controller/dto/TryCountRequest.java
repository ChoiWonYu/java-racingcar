package controller.dto;

import domain.TryCount;

public class TryCountRequest {

    private final int countRequest;

    private TryCountRequest(final int count) {
        this.countRequest = count;
    }

    public static TryCountRequest from(final String countInput) {
        return new TryCountRequest(Integer.parseInt(countInput));
    }

    public TryCount createTryCount() {
        return new TryCount(countRequest);
    }
}
