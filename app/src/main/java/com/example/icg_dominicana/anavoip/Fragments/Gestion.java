package com.example.icg_dominicana.anavoip.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.icg_dominicana.anavoip.API.APIServices.ReportServices;
import com.example.icg_dominicana.anavoip.API.Api;
import com.example.icg_dominicana.anavoip.Adapters.MyAdapter;
import com.example.icg_dominicana.anavoip.Models.MainReport;
import com.example.icg_dominicana.anavoip.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static android.support.constraint.Constraints.TAG;

public class Gestion extends Fragment {

    private static final String ARG_REPORT = "REPORT";
    private Retrofit retrofit;
    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter myAdapter;
    ArrayList<MainReport> listReport =  new ArrayList<>();

    public Gestion() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View  view = inflater.inflate( R.layout.fragment_reports,container,false );
       // final View view = LayoutInflater.from(getParentFragment().getContext()).inflate(R.layout.fragment_reports, container, false);

        myRecyclerView = (RecyclerView) view.findViewById( R.id.id_recyclerView );
        myRecyclerView.setLayoutManager( new LinearLayoutManager( getContext() ) );

        getReport();

        myAdapter =  new MyAdapter(listReport, getContext());
        myRecyclerView.setAdapter( myAdapter );
        myAdapter.notifyDataSetChanged();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                getReport();
                handler.postDelayed(this, 15000); //now is every 2 minutes
            }
        }, 15000); //Every 120000 ms (2 minutes)
        return view;
    }

    private void getReport() {

        ReportServices services = Api.getApi().create( ReportServices.class );
        Call<List<MainReport>> reportCall = services.getReport();
        reportCall.enqueue( new Callback<List<MainReport>>() {
            @Override
            public void onResponse(Call<List<MainReport>> call, Response<List<MainReport>> response) {
                if(!response.isSuccessful()) {
                    Log.e( TAG, "ai chichi" + response.code() );
                    return;
                }
                for (int i = 0; i < response.body().size(); i++) {
                    listReport.add( response.body().get( i ) );
                }
                Collections.reverse( listReport );
                myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<MainReport>> call, Throwable t) {
                Log.e( TAG, "onFailure ai mama" + t.getMessage() );
            }
        } );

    }

}
