package com.example.state;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.state.uml.Client;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Client.main(null);
    }
}
