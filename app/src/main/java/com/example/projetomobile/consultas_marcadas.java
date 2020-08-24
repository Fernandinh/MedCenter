package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import model.Coisas;
import model.Consultas_Agendadas;
import model.Consultas_Finalizadas;

public class consultas_marcadas extends AppCompatActivity {

    ListView lista1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas_marcadas);

        lista1 = findViewById(R.id.list_contacts_consultas_marcadas);

        List<Consultas_Agendadas> consultas = new ArrayList<Consultas_Agendadas>();

        Consultas_Agendadas consultas_agendadas = new Consultas_Agendadas("DATA: 31/08/2020", "ESPECIALIDADE: Dermatologia", "MÉDICO: Lucas Gabriel", "HOSPITAL/UBS: João Lúcio");
        consultas.add(consultas_agendadas);

        consultas.add(new Consultas_Agendadas("DATA: 16/09/2020", "ESPECIALIDADE: Oftalmologia", "MÉDICA: Marcela Silva","HOSPITAL/UBS: Adriano Jorge"));
        consultas.add(new Consultas_Agendadas("DATA: 25/10/2020", "ESPECIALIDADE: Psiquiatria", "MÉDICO: Rafael Freitas","HOSPITAL/UBS: 28 de Agosto"));
        consultas.add(new Consultas_Agendadas("DATA: 03/12/2020", "ESPECIALIDADE: Urologia", "MÉDICO: Vanessa Chagas","HOSPITAL/UBS: Dr. Luiz Montenegro"));





        ContacsAdapter_ConsultasMarcadas contacsAdapter_consultasMarcadas = new ContacsAdapter_ConsultasMarcadas(consultas, this);
        lista1.setAdapter(contacsAdapter_consultasMarcadas);
    }
}