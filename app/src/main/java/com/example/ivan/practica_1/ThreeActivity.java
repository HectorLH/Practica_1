package com.example.ivan.practica_1;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;


public class ThreeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);

        textView.setText(message);
        setContentView(textView);

        ValueAnimator anim = ObjectAnimator.ofInt(textView, "textColor", Color.RED, Color.GREEN, Color.BLUE);
        anim.setDuration(1000);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.start();
        //ObjectAnimator anim = ObjectAnimator.ofInt(textView, "textColor", Color.RED, Color.GREEN, Color.BLUE);
        //anim.setDuration(1000);
        //anim.start();
        /*
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000); //Time of the blink
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        textView.startAnimation(anim);
        */
    }
}
