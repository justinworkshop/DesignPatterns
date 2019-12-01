package com.example.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.factory.uml.Client;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Client.main(null);
    }
}
