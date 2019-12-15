package com.example.command;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.command.uml.Client;
import com.example.command.uml2.Client2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Client.main(null);

        Client2.main(null);
    }
}
