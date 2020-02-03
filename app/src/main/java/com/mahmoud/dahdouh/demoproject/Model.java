package com.mahmoud.dahdouh.demoproject;

public class Model {
    private String text;
    private String url;

    public Model(String text) {
        this.text = text;
    }

    public String getText() {
        return text;

    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
