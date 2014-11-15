package com.example.ivan.practica_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.example.ivan.practica1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendmessage1(View view) {
        Intent intent = new Intent(this, OneActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText_Name);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendmessage2(View view) {
        Intent intent = new Intent(this, TwoActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText_Surname);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendmessage3(View view) {
        Intent intent = new Intent(this, ThreeActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText_Age);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendmessage4(View view) {
        Intent intent = new Intent(this, FourActivity.class);
        startActivity(intent);
    }
}
