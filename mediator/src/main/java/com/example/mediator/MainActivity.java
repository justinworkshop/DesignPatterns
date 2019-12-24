package com.example.mediator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mediator.uml.Client;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Client.main(null);
    }
}
