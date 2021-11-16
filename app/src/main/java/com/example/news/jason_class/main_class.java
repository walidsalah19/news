package com.example.news.jason_class;

import java.util.List;

public class main_class {
    String status,totalResults;
    List<mode_class> articles;

    public main_class(String status, String totalResults, List<mode_class> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public List<mode_class> getArticles() {
        return articles;
    }
}
