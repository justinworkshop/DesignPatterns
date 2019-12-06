package com.example.abstractfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.abstractfactory.uml.AbstractFactory;
import com.example.abstractfactory.uml.BYDQinFactory;
import com.example.abstractfactory.uml.BYDTangFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        testAbstractFactoryPattern();
    }

    /**
     * 抽象工厂模式使用示例
     */
    private void testAbstractFactoryPattern() {
        AbstractFactory qinFactory = new BYDQinFactory();
        qinFactory.createEngine().desc();
        qinFactory.createTile().desc();

        AbstractFactory tangFactory = new BYDTangFactory();
        tangFactory.createEngine().desc();
        tangFactory.createTile().desc();
    }
}
