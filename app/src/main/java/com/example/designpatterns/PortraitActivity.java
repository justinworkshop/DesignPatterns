package com.example.designpatterns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Copyright (C), 2015-2019
 * FileName: PortraitActivity
 * Author: wei.zheng
 * Date: 2019/10/26 17:45
 * Description: 竖屏
 */
public class PortraitActivity extends AppCompatActivity {
    private TextView back;
    private TextView content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_portrait);

        back = findViewById(R.id.back);
        content = findViewById(R.id.text);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
