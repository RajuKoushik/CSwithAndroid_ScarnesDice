package com.example.rajukoushik.scarnesdice;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static com.example.rajukoushik.scarnesdice.R.drawable.dice1;

public class MainActivity extends AppCompatActivity {
    private int overallUserScore = 0;
    private int userScore = 0;
    private int computerScore = 0;
    private int overallComputerScore = 0;
    private TextView scoreCard;
    private Button rollButton = (Button)findViewById(R.id.button);
    private Button holdButton = (Button)findViewById(R.id.button2);
    private Button resetButton = (Button)findViewById(R.id.button3);
    Random random = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreCard = (TextView) findViewById(R.id.textView);
    }

    public void clickRoll(View view) {
        int max = 6;
        int min = 1;
        int randomNum = random.nextInt((max - min) + 1) + min;
        ImageView whoamiwith = (ImageView)findViewById(R.id.imageView);
        if(randomNum ==1)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice1);

        }
        else if(randomNum ==2)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice2);
        }
        else if(randomNum ==2)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice3);
        }
        else if(randomNum ==2)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice4);
        }
        else if(randomNum ==2)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice5);
        }
        else
        {

            whoamiwith.setBackgroundResource(R.drawable.dice6);
        }
        if(randomNum ==1)
        {
            userScore = 0;
            scoreCard.setText("Your Score : 0  Computer Score : 0 Your turn Score: " + userScore);

        }
        else
        {
            userScore = randomNum + userScore;
            scoreCard.setText("Your Score : 0  Computer Score : 0 Your turn Score: " + userScore);
        }


    }

    public void clickHold(View view) {
        overallUserScore = overallUserScore  + userScore;
        userScore = 0;
        scoreCard.setText("Your Score : "+overallUserScore+" Computer Score : 0 Your turn Score: " + userScore);


    }

    public void clickReset(View view) {
         overallUserScore = 0;
        userScore = 0;
        computerScore = 0;
         overallComputerScore = 0;
        scoreCard.setText("Your Score : "+overallUserScore+" Computer Score : 0 Your turn Score: " + userScore);

    }
    public void computerTurn()
    {
        rollButton.setEnabled(false);
        holdButton.setEnabled(false);
        resetButton.setEnabled(false);
        int max = 6;
        int min = 1;
        int randomNum = random.nextInt((max - min) + 1) + min;
        ImageView whoamiwith = (ImageView)findViewById(R.id.imageView);
        if(randomNum ==1)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice1);

        }
        else if(randomNum ==2)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice2);
        }
        else if(randomNum ==2)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice3);
        }
        else if(randomNum ==2)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice4);
        }
        else if(randomNum ==2)
        {
            whoamiwith.setBackgroundResource(R.drawable.dice5);
        }
        else
        {

            whoamiwith.setBackgroundResource(R.drawable.dice6);
        }
        if(randomNum ==1)
        {
            computerScore = 0;
            scoreCard.setText("Your Score :"+overallComputerScore + " Computer Score :"+computerScore+"Your turn Score: " + userScore);

        }
        else
        {
            computerScore = randomNum + userScore;
            scoreCard.setText("Your Score :"+overallComputerScore + " Computer Score :"+computerScore+"Your turn Score: " + userScore);
        }


    }


}
