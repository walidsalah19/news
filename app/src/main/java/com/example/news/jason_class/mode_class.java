package com.example.news.jason_class;

import android.net.Uri;

import java.util.List;

public class mode_class {
    private String auther,title,description,url,urlToImage,publishedAt,content;

    public mode_class(String auther, String title, String description, String url, String urlToImage, String publishedAt, String content) {
        this.auther = auther;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.content = content;
    }

    public String getAuther() {
        return auther;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }
}
