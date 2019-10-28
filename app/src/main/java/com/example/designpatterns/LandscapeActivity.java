package com.example.designpatterns;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Copyright (C), 2015-2019
 * FileName: LandscapeActivity
 * Author: wei.zheng
 * Date: 2019/10/26 17:32
 * Description: 横屏
 */
public class LandscapeActivity extends AppCompatActivity {
    private TextView back;
    private TextView content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_landscape);

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
                startActivity(new Intent(LandscapeActivity.this, PortraitActivity.class));
            }
        });
    }
}
