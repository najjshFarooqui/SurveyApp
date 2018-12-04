package com.example.mac.surveyapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CountryApi {
    boolean success=false;
        public String BASE_URL = "http://applligent.com/project/survey/api/countries/";
        @GET("countries")
        Call<List<CountryResponse>> getCountries();
    }

