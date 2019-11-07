package com.example.appreciatesolidandlod;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private static class CleaningExample implements AutoCloseable {
//        private static final Cleaner cleaner;

        @Override
        public void close() throws Exception {

        }
    }
}
