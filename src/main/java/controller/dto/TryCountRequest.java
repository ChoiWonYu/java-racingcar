package controller.dto;

import domain.TryCount;

public class TryCountRequest {

    private final Integer countRequest;

    private TryCountRequest(Integer count) {
        this.countRequest=count;
    }

    public static TryCountRequest from(String countInput) {
        return new TryCountRequest(Integer.parseInt(countInput));
    }

    public TryCount createTryCount() {
        return new TryCount(countRequest);
    }
}
