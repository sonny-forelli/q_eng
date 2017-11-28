package com.example.lg.q_eng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QEngMainActivity extends AppCompatActivity {
    Button mButton1;
    Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = (Button) findViewById(R.id.button);
        mButton2 = (Button) findViewById(R.id.button2);
    }

    public void clickButton1(View view) {
        Intent mIntent = new Intent(this, WordActivity.class);
        startActivity(mIntent);
    }
}
