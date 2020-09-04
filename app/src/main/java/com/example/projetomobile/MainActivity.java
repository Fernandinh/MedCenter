package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void proximaTela(View view){

        Intent intent = new Intent(this, Listagem.class);
        startActivity(intent);
    }

    public void Menu(View view){

        Intent intent = new Intent(this, Menu.class);

        startActivity(intent);
    }
    public void consultas_marcadas(View view){

        Intent intent = new Intent(this, consultas_marcadas.class);

        startActivity(intent);
    }

    public void consultas_antigas(View view){

        Intent intent = new Intent(this, Consultas_Antigas.class);

        startActivity(intent);
    }

    public void listagem_ubss(View view){

        Intent intent = new Intent(this, Ubs.class);
        startActivity(intent);
    }

    public void listagem_vacinas(View view){

        Intent intent = new Intent(this, Vacinas.class);
        startActivity(intent);
    }

    public void cadastro(View view){

        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
