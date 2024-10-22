package com.bryan.mvc_web_app.models.dtos;

public class PaginationDto {

    private int limit;
    private int skip;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

}
