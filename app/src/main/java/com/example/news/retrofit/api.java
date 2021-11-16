package com.example.news.retrofit;

import com.example.news.jason_class.main_class;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface api {
    @GET("top-headlines")
    Call<main_class>calldata(@Query("country") String country,
                             @Query("apiKey") String apiKey );
    @GET("top-headlines")
    Call<main_class>calldata_category(@Query("country") String country,
                                      @Query("category") String category,
                                     @Query("apiKey") String apiKey );

}
