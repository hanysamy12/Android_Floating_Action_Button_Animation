package com.example.floatingactionbutton;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton btnShare;
    FloatingActionButton fBtn1;
    FloatingActionButton fBtn2;
    FloatingActionButton fBtn3;
    FloatingActionButton fBtn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnShare = findViewById(R.id.floatingActionButton);
        fBtn1 = findViewById(R.id.fBtn1);
        fBtn2 = findViewById(R.id.fBtn2);
        fBtn3 = findViewById(R.id.fBtn3);
        fBtn4 = findViewById(R.id.fBtn4);

        Boolean isVisable = false;
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils
                        .loadAnimation(MainActivity.this, R.anim.anim_from_down_to_up);

                Animation animation2 = AnimationUtils
                        .loadAnimation(MainActivity.this, R.anim.anim_from_up_to_down);
                if (fBtn1.getVisibility() == View.INVISIBLE) {
                    fBtn1.setVisibility(View.VISIBLE);
                    fBtn2.setVisibility(View.VISIBLE);
                    fBtn3.setVisibility(View.VISIBLE);
                    fBtn4.setVisibility(View.VISIBLE);
                    fBtn1.startAnimation(animation);
                    fBtn2.startAnimation(animation);
                    fBtn3.startAnimation(animation);
                    fBtn4.startAnimation(animation);
                } else {
                    fBtn1.startAnimation(animation2);
                    fBtn2.startAnimation(animation2);
                    fBtn3.startAnimation(animation2);
                    fBtn4.startAnimation(animation2);
                    fBtn1.setVisibility(View.INVISIBLE);
                    fBtn2.setVisibility(View.INVISIBLE);
                    fBtn3.setVisibility(View.INVISIBLE);
                    fBtn4.setVisibility(View.INVISIBLE);

                }


            }
        });

    }
}