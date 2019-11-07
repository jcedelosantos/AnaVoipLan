package com.example.icg_dominicana.anavoip.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.icg_dominicana.anavoip.Models.MainReport;
import com.example.icg_dominicana.anavoip.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<MainReport> reportsArrayList;
    private Context context;

    public Adapter(ArrayList<MainReport> reports, Context context) {
        this.reportsArrayList = reports;
        this.context = context;

    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from( context).inflate( R.layout.recycler_view_general, parent, false );
        context = parent.getContext();
        Adapter.ViewHolder vh = new Adapter.ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        MainReport rep  = reportsArrayList.get( position );

        holder.textViewAltitud.setText(""+  rep.getSip_phone_found() );
        holder.textViewtemp.setText(""+ rep.getReceived_packet());
        holder.textViewHumedad.setText( ""+rep.getExtension_found());
        holder.textViewPresionBar.setText( ""+rep.getRtp_packet());
        holder.textViewFecha.setText( ""+rep.getMain_report_id());
    }

    @Override
    public int getItemCount() {return reportsArrayList.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewtemp;
        public TextView textViewHumedad;
        public TextView textViewPresionBar;
        public TextView textViewAltitud;
        public TextView textViewFecha;
        public ImageView imageView;


        public  ViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById( R.id.id_imageView );
            textViewtemp = (TextView) itemView.findViewById( R.id.id_value_temperatura );
            textViewHumedad = (TextView) itemView.findViewById( R.id.id_value_humedad);
            textViewPresionBar = (itemView.findViewById( R.id.id_textview_presionbar));
            textViewAltitud =  itemView.findViewById( R.id.id_value_altitud );
            textViewFecha =   itemView.findViewById(R.id.id_value_fecha);

        }

    }


}
