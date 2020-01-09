package com.example.facade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.facade.uml.Client;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Client.main(null);
    }
}
