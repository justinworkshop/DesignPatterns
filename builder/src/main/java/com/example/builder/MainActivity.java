package com.example.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.builder.uml.Orchestration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Orchestration.Builder builder = new Orchestration.Builder();
        builder.setAuthor("Jack")
                .setDuration(5 * 60 * 1000)
                .setName("Rock roll")
                .setType("Pop");
        Orchestration orchestration = builder.build();
    }
}
