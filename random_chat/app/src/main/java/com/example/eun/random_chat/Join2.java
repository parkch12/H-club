package com.example.eun.random_chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by eun on 2016-02-22.
 */
public class Join2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join2);

        Spinner email = (Spinner)findViewById(R.id.spinner_email);
        ArrayAdapter emailAdapter = ArrayAdapter.createFromResource(this,
                R.array.email, android.R.layout.simple_spinner_item);
        emailAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        email.setPrompt("선택하세요"); //선택하세요 멘트 안나옴 나중에 해결하기
        email.setAdapter(emailAdapter);
    }

    public void onButton1Clicked(View v){
        Intent myIntent = new Intent(getApplicationContext(), Join3.class);
        startActivity(myIntent);
    }
}
