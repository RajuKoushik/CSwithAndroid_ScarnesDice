package com.example.rajukoushik.scarnesdice;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import static com.example.rajukoushik.scarnesdice.R.drawable.dice1;

public class MainActivity extends AppCompatActivity {
    private int overallUserScore;
    private int userScore;
    private int computerScore;
    private int overallComputerScore;
    Random random = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickRoll(View view) {
        int max = 6;
        int min = 1;
        int randomNum = random.nextInt((max - min) + 1) + min;
        ImageView whoamiwith = (ImageView)findViewById(R.id.imageView);
        whoamiwith.setImageDrawable(dice1);

    }
}
