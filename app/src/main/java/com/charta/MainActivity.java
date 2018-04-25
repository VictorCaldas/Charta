package com.charta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.digitalcharta.Charta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Charta meuMapa = new Charta(R.layout.activity_main,R.id.map,this);
    }
}
