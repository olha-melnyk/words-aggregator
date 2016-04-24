package com.olga.pearson;

import java.util.List;

public class Response {
    private int status;
    private int offset;
    private int limit;
    private int count;
    private int total;
    private List<ResultItem> results;

    public Response(int status, int offset, int limit, int count, int total, List<ResultItem> results) {
        this.status = status;
        this.offset = offset;
        this.limit = limit;
        this.count = count;
        this.total = total;
        this.results = results;
    }

    public int getStatus() {
        return status;
    }

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public int getCount() {
        return count;
    }

    public int getTotal() {
        return total;
    }

    public List<ResultItem> getResults() {
        return results;
    }
}
