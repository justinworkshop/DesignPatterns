package com.example.responsibility;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.responsibility.uml.Client;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Client.main(null);
    }
}
