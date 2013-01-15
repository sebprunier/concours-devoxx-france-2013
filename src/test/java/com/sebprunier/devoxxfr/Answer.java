package com.sebprunier.devoxxfr;

public class Answer {
    private int status;
    private String body;

    public Answer(int status, String body) {
        super();
        this.status = status;
        this.body = body;
    }

    public int getStatus() {
        return status;
    }

    public String getBody() {
        return body;
    }

}