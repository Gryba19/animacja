package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageKostka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageKostka = findViewById(R.id.imageKostka);
        startAnime();
    }
    private void startAnime(){

        Animation out = new AlphaAnimation(1,0);
        out.setDuration(4000);
        //
        Animation in = new AlphaAnimation(0,1);
        in.setDuration(4000);

        out.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(MainActivity.this, "Animacja wystartowała", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) { imageKostka.startAnimation(in);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        in.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {imageKostka.startAnimation(out);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageKostka.startAnimation(out);
    }
}