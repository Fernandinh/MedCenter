package com.example.projetomobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import model.Ubs_Informacoes;

public class ContactsAdapter_Ubs extends BaseAdapter {

    List<Ubs_Informacoes> informacoes;
    Context context;

    public ContactsAdapter_Ubs(List<Ubs_Informacoes> informacoes, Context context) {
        this.informacoes = informacoes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return informacoes.size();
    }

    @Override
    public Ubs_Informacoes getItem(int position) {
        return informacoes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_list_ubs, parent, false);

        TextView nome = view.findViewById(R.id.nome);
        TextView descricao = view.findViewById(R.id.descricao);
        TextView endereco = view.findViewById(R.id.endereco);
        ImageView foto = view.findViewById(R.id.foto);

        Ubs_Informacoes ubs_informacoes = informacoes.get(position);

        nome.setText(ubs_informacoes.getNome());
        descricao.setText(ubs_informacoes.getDescricao());
        endereco.setText(ubs_informacoes.getEndereco());

        return view;
    }

}
