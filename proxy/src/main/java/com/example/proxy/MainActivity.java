package com.example.proxy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.proxy.dynamicuml.DynamicClient;
import com.example.proxy.uml.Client;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("静态代理");
        Client.main(null);

        System.out.println("动态代理");
        DynamicClient.main(null);
    }
}
