package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int currentScore = 0;

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

    public void twoPoints(View v) {
        currentScore += 2;
        displayForTeamA(currentScore);
    }

    public void threePoints(View v) {
        currentScore += 3;
        displayForTeamA(currentScore);
    }

    public void onePoint(View v) {
        currentScore ++;
        displayForTeamA(currentScore);
    }
}
