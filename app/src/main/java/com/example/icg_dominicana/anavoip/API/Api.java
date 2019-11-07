package com.example.icg_dominicana.anavoip.API;

import android.support.v7.widget.RecyclerView;

import com.example.icg_dominicana.anavoip.API.Deserializers.MyDeserializer;
import com.example.icg_dominicana.anavoip.Models.MainReport;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    public static final String BASE_URL = "http://192.168.88.247:8000/";

    private static Retrofit retrofit = null;

    public static Retrofit getApi(){
        if (retrofit == null){
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter( MainReport.class, new MyDeserializer() );
            retrofit =  new Retrofit.Builder()
                    .baseUrl( BASE_URL )
                    .addConverterFactory( GsonConverterFactory.create() )
                    .build();
        }
        return retrofit;
    }

}
