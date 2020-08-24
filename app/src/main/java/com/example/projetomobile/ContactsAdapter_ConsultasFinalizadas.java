package com.example.projetomobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import model.Coisas;
import model.Consultas_Finalizadas;

public class ContactsAdapter_ConsultasFinalizadas extends BaseAdapter {

    List<Consultas_Finalizadas> consultass;
    Context context;

    public ContactsAdapter_ConsultasFinalizadas(List<Consultas_Finalizadas> consultass, Context context) {
        this.consultass = consultass;
        this.context = context;
    }

    @Override
    public int getCount() {
        return consultass.size();
    }

    @Override
    public Consultas_Finalizadas getItem(int position) {
        return consultass.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_list_consultas_antigas, parent, false);

        TextView day = view.findViewById(R.id.day);
        TextView description = view.findViewById(R.id.description);
        TextView doctor = view.findViewById(R.id.doctor);
        TextView locau = view.findViewById(R.id.locau);

        Consultas_Finalizadas consultas_finalizadas = consultass.get(position);

        day.setText(consultas_finalizadas.getDay());
        description.setText(consultas_finalizadas.getDescription());
        doctor.setText(consultas_finalizadas.getDoctor());
        locau.setText(consultas_finalizadas.getLocau());


        return view;
    }



    }
