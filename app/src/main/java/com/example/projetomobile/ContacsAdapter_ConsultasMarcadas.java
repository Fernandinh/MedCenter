package com.example.projetomobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import model.Coisas;
import model.Consultas_Agendadas;

public class ContacsAdapter_ConsultasMarcadas extends BaseAdapter {

    List<Consultas_Agendadas> consultas;
    Context context;

    public ContacsAdapter_ConsultasMarcadas(List<Consultas_Agendadas> consultas, Context context) {
        this.consultas = consultas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return consultas.size();
    }

    @Override
    public Consultas_Agendadas getItem(int position) {
        return consultas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_list_marcadas, parent, false);

        TextView dia = view.findViewById(R.id.dia);
        TextView descric = view.findViewById(R.id.descric);
        TextView doutt = view.findViewById(R.id.doutt);
        TextView loc = view.findViewById(R.id.loc);

        Consultas_Agendadas consultas_agendadas = consultas.get(position);

        dia.setText(consultas_agendadas.getDia());
        descric.setText(consultas_agendadas.getDesc());
        doutt.setText(consultas_agendadas.getDoutt());
        loc.setText(consultas_agendadas.getLoc());

        return view;

    }
}
