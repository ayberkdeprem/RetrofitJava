package com.deprems.retrofitjava.service;

import com.deprems.retrofitjava.model.CryptoModel;

import java.util.List;
import java.util.Observable;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    //URL BASE -> www.website.com
    // GET -> price?key=xxx

    //https://api.nomics.com/v1/currencies/ticker?key=48a740d54f1124652655657fd05add4c702fd4d1

    @GET("currencies/ticker?key=48a740d54f1124652655657fd05add4c702fd4d1")
    //Observable<List<CryptoModel>> getData();

    Call<List<CryptoModel>> getData();

}
