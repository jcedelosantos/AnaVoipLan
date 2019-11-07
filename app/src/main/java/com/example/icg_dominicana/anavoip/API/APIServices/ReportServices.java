package com.example.icg_dominicana.anavoip.API.APIServices;

import com.example.icg_dominicana.anavoip.Fragments.Reports;
import com.example.icg_dominicana.anavoip.Models.MainReport;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ReportServices {
    @GET("reports")
    //ojo
    Call<List<MainReport>> getReport();
}
