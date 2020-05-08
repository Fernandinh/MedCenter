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

public class ContactsAdapter extends BaseAdapter{

    List<Coisas> coisasList;
    Context context;

    public ContactsAdapter(List<Coisas> coisasList, Context context) {
        this.coisasList = coisasList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return coisasList.size();
    }

    @Override
    public Coisas getItem(int position) {
        return coisasList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);

        TextView nome = view.findViewById(R.id.nome);
        TextView descricao = view.findViewById(R.id.descricao);
        TextView qtd = view.findViewById(R.id.qtd);
        ImageView foto = view.findViewById(R.id.foto);

        Coisas coisas = coisasList.get(position);

        nome.setText(coisas.getNome());
        descricao.setText(coisas.getDescricao());
        qtd.setText(coisas.getQtd());

        return view;

    }
}
