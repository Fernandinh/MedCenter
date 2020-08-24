package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import model.Coisas;
import model.Ubs_Informacoes;

public class Ubs extends AppCompatActivity {

    ListView lista2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubs);

        lista2 = findViewById(R.id.list_contacts_ubs);

        List<Ubs_Informacoes> informacoes = new ArrayList<Ubs_Informacoes>();



        informacoes.add(new Ubs_Informacoes("Dr. Luiz Montenegro", "Funcionamento de Segunda a Sexta das 6h as 17h", " Nossa Senhora das Graças, 37", null));
        informacoes.add(new Ubs_Informacoes("José Rayol dos Santos", " Funcionamento de segunda a sexta das 8h as 20:30", "Av. Constantino Nery", null));

        ContactsAdapter_Ubs contactsAdapter_ubs = new ContactsAdapter_Ubs(informacoes, this);
        lista2.setAdapter(contactsAdapter_ubs);
    }

}