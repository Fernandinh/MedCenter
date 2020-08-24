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
import model.Vacinas_Informacoes;


public class ContactsAdapter_Vacinas extends BaseAdapter {

    List<Vacinas_Informacoes> vacinas;
    Context context;

    public ContactsAdapter_Vacinas(List<Vacinas_Informacoes> vacinas, Context context) {
        this.vacinas = vacinas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return vacinas.size();
    }

    @Override
    public Vacinas_Informacoes getItem(int position) {
        return vacinas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_list_vacinas, parent, false);

        TextView nome = view.findViewById(R.id.nome);
        TextView descricao = view.findViewById(R.id.descricao);


        Vacinas_Informacoes vacinas_informacoes = vacinas.get(position);

        nome.setText(vacinas_informacoes.getNome());
        descricao.setText(vacinas_informacoes.getDescricao());


        return view;

    }

}
