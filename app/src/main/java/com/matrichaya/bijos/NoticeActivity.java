package com.matrichaya.bijos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class NoticeActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        initToolbar();
    }

    private void initToolbar(){
        toolbar=findViewById(R.id.NoticeToolbarID);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.notice);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}