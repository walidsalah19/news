package com.example.news.retrofit;

import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofit {
    private static Retrofit retrofit;
    public static api getRetrofit()
    {
        if(retrofit==null) {
            retrofit = new Builder()
                    .baseUrl("https://newsapi.org/v2/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(api.class);
    }
}
