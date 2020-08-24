package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import model.Coisas;
import model.Vacinas_Informacoes;

public class Vacinas extends AppCompatActivity {

    ListView lista5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacinas);

        lista5 = findViewById(R.id.list_contacts_vacinas);

        List<Vacinas_Informacoes> vacina = new ArrayList<Vacinas_Informacoes>();

        vacina.add(new Vacinas_Informacoes("Bacilo Calmette-Guérin - BCG", "Combate a tuberculose"));
        vacina.add(new Vacinas_Informacoes("Hepatite B", "Combate a Hepatite B"));
        vacina.add(new Vacinas_Informacoes("Pneumocócica", "Combate a Pnemonia"));
        vacina.add(new Vacinas_Informacoes("Tríplice Viral - MMR", "Combate a Sarampo, Caxumba e Rubéola"));

        ContactsAdapter_Vacinas contactsAdapter_vacinas = new ContactsAdapter_Vacinas(vacina, this);
        lista5.setAdapter(contactsAdapter_vacinas);






    }
}