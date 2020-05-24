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
}
