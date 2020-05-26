package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class buscar_ubs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_ubs);
    }


    public  void Montenegro (View view)
    {
        localização(Uri.parse("geo:-3.0955644,-60.0235054"));
    }

    public  void Jose (View view)
    {
        localização(Uri.parse("geo:-3.0887115,-60.0279592"));
    }

    public void localização( Uri local) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(local);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }


}
