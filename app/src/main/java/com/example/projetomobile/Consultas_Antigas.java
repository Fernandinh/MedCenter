package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import model.Coisas;
import model.Consultas_Agendadas;
import model.Consultas_Finalizadas;

public class Consultas_Antigas extends AppCompatActivity {

    ListView lista4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas__antigas);

        lista4 = findViewById(R.id.list_contacts_antigas);

        List<Consultas_Finalizadas> consultass = new ArrayList<Consultas_Finalizadas>();

       Consultas_Finalizadas consultas_finalizadas = new Consultas_Finalizadas("DATA: 30/01/2020", "ESPECIALIDADE: Pediatra", "MÉDICO: Fernando Luiz", "HOSPITAL/UBS: Adriano Jorge");
        consultass.add(consultas_finalizadas);

        consultass.add(new Consultas_Finalizadas("DATA: 05/03/2020", "ESPECIALIDADE: Endocrinologista", "MÉDICO: Daniel Lopes","HOSPITAL/UBS: Dr. Luiz Montenegro"));
        consultass.add(new Consultas_Finalizadas("DATA: 21/05/2020", "ESPECIALIDADE: Pediatra", "MÉDICA: Yara Nunes","HOSPITAL/UBS: João Lúcio"));
        consultass.add(new Consultas_Finalizadas("DATA: 17/08/2020", "ESPECIALIDADE: Fisioterapia", "MÉDICA: Mitca Lopes","HOSPITAL/UBS: 28 de Agosto"));



        ContactsAdapter_ConsultasFinalizadas contactsAdapterConsultasFinalizadas = new ContactsAdapter_ConsultasFinalizadas(consultass, this);
        lista4.setAdapter(contactsAdapterConsultasFinalizadas);


    }
}