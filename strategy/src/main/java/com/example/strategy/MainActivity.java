package com.example.strategy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.strategy.uml.BusStrategy;
import com.example.strategy.uml.CalculatorContext;
import com.example.strategy.uml.CarStrategy;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Strategy";

    private CalculatorContext mCalculatorContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mCalculatorContext = new CalculatorContext();

        mCalculatorContext.setStrategy(new BusStrategy());
        int busPrice = mCalculatorContext.calculatePrice(20);

        mCalculatorContext.setStrategy(new CarStrategy());
        int carPrice = mCalculatorContext.calculatePrice(20);

        Log.d(TAG, "busPrice:" + busPrice + ", carPrice:" + carPrice);
    }
}
