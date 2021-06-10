package com.example.creatinguianimated;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static  int SPLASH_TIME_OUT = 5000;

    //Mooke
    View first,second,third,fourth,fifth,sixth;
    TextView a,slogan,slogan2;

    //Animations
    Animation topAnimation,bottomAnimation,middleAnimation;

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED, WindowManager.LayoutParams.FLAGS_CHANGED);
        setContentView(R.layout.activity_main);

        handler= new Handler(getMainLooper());
        // android:label="home" in android manifest
        handler.postDelayed(new Runnable() {
            @Override
            public void run(){
            Intent mainIntent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(mainIntent);
            finish();
        }
    }, SPLASH_TIME_OUT);

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this, R.anim.middle_animation);

        // Nooks
        first = findViewById(R.id.firstLine);
        second = findViewById(R.id.secondLine);
        third = findViewById(R.id.thirdLine);
        fourth = findViewById(R.id.fourthLine);
        fifth = findViewById(R.id.fifthLine);
        sixth = findViewById(R.id.sixthLine);

        a = findViewById(R.id.task);
        slogan = findViewById(R.id.tagLine);
        slogan2 = findViewById(R.id.tagLine2);

        /*final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity.
                Intent mainIntent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);*/

       /* Handler().postDelayed({
                val intent = Intent(this, SecondActivity:: class.java)
        startActivity(intent);
        finish();
        },3000) */



    }
}

