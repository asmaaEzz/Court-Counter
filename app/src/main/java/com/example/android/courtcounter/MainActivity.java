package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0 ;
    int scoreB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void increase2forA(View v){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void increase3forA(View v){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void increase1forA(View v){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    public void increase2forB(View v){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void increase3forB(View v){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void increase1forB(View v){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void reset(View v){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    }


