package com.example.eun.random_chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by eun on 2016-02-22.
 */
public class Join5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join5);
    }

    public void onButton2Clicked(View v){
        Intent myIntent = new Intent(getApplicationContext(), Join6.class);
        startActivity(myIntent);
    }
}