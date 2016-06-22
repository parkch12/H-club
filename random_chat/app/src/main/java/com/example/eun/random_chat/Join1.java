package com.example.eun.random_chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;


/**
 * Created by eun on 2016-02-22.
 */
public class Join1 extends AppCompatActivity {

    CheckBox check;

    TextView facebook;

    LoginButton loginButton;

    CallbackManager callbackManager; //facebook callback class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(this);

        setContentView(R.layout.join1);

        check=(CheckBox)findViewById(R.id.checkbox);

        facebook = (TextView) findViewById(R.id.facebook);

        callbackManager = CallbackManager.Factory.create();
        loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Toast.makeText(getApplicationContext(), "로그인 성공", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancel() {
                Toast.makeText(getApplicationContext(), "로그인 취소", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(getApplicationContext(), "로그인 에러", Toast.LENGTH_LONG).show();
            }
        });



    }

    public void onButton2Clicked(View v){
        if(check.isChecked()){
            Intent myIntent = new Intent(getApplicationContext(), Join2.class);
            startActivity(myIntent);
        }
        else{
            Toast toast = Toast.makeText(getBaseContext(), "약관 동의 여부를 확인해 주세요", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }


    public void onButton1Clicked(View v) {
        if(check.isChecked()){
            if (v == facebook) {
                loginButton.performClick();
            }
        }
        else{
            Toast toast = Toast.makeText(getBaseContext(), "약관 동의 여부를 확인해 주세요", Toast.LENGTH_LONG);
            toast.show();
        }
    }

}
