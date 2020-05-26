package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import model.Coisas;

public class Listagem extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);

        lista = findViewById(R.id.list_contacts);

        List<Coisas> coisasList = new ArrayList<Coisas>();

        Coisas coisas = new Coisas("Paracetamol", "utilizado para edução da febre e para o alívio temporário de dores leves a moderadas", "100 disponiveis", null);
        coisasList.add(coisas);

        coisasList.add(new Coisas("Dipirona", "utilizado no tratamento de dores e febre", "65 disponiveis", null));
        coisasList.add(new Coisas("Buscopam", " utilizado para tratar sintomas de cólicas intestinais, estomacais", "80 disponiveis", null));
        coisasList.add(new Coisas("Ibuprofeno", " indicado para febre e dores de intensidade leve a moderada", "48 disponiveis", null));


        ContactsAdapter contactsAdapter = new ContactsAdapter(coisasList, this);
        lista.setAdapter(contactsAdapter);


    }
}
