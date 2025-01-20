package com.example.assisthub.Retrofit.retrofitFile;

import com.example.assisthub.Retrofit.interfac.HTTP_Method;
import com.example.assisthub.Retrofit.interfac.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VerificationPhoneNumberRetrofit {


    private static VerificationPhoneNumberRetrofit Retrofit = null ;
    private HTTP_Method HTTP_Method ;

    private VerificationPhoneNumberRetrofit() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(URL.VerificationPhoneNumber)
                .addConverterFactory(GsonConverterFactory.create()).build();
        HTTP_Method = retrofit .create (HTTP_Method .class);
    }

    public static synchronized VerificationPhoneNumberRetrofit checkInstance() {
        if ( Retrofit == null)
            Retrofit  = new VerificationPhoneNumberRetrofit();

        return  Retrofit;
    }

    public HTTP_Method  getServicesInterface() {
        return HTTP_Method ;
    }


}
