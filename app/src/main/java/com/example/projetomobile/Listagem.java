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

        Coisas coisas = new Coisas("Fernando", "Programador", "1", "null");
        coisasList.add(coisas);

        coisasList.add(new Coisas("Daniel", "Programador", "1", null));
        coisasList.add(new Coisas("Yara", "Programadora", "1", null));


        ContactsAdapter contactsAdapter = new ContactsAdapter(coisasList, this);
        lista.setAdapter(contactsAdapter);


    }
}
