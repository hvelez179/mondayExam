package com.example.android.mondayexam;


import com.example.android.userinfocall2.Entities.RandomAPI;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {

    @GET("api")
    Call<RandomAPI> getRandomUser();
}
