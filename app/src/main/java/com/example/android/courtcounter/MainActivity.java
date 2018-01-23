package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int currentScoreHome = 0;
    int currentScoreVistor = 0;
    int freeThrow = 1;
    int basket = 2;
    int threePointer = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Displays the given score for the Home team.
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void onePoint(View v) {
        if (v.getId() == R.id.leftOnePoint) {
            currentScoreHome += freeThrow;
            displayForTeamA(currentScoreHome);
        } else if (v.getId() == R.id.rightOnePoint) {
            currentScoreVistor += freeThrow;
            displayForTeamB(currentScoreVistor);
        }
    }

    public void twoPoints(View v) {
        if (v.getId() == R.id.leftTwoPoints) {
            currentScoreHome += basket;
            displayForTeamA(currentScoreHome);
        } else if ((v.getId() == R.id.rightTwoPoints)) {
            currentScoreVistor += basket;
            displayForTeamB(currentScoreVistor);
        }
    }

    public void threePoints(View v) {
        if (v.getId() == R.id.leftThreePoints) {
            currentScoreHome += threePointer;
            displayForTeamA(currentScoreHome);
        } else if (v.getId() == R.id.rightThreePoints) {
            currentScoreVistor += threePointer;
            displayForTeamB(currentScoreVistor);
        }
    }

    public void resetScore(View v) {
        currentScoreHome = 0;
        currentScoreVistor = 0;
        displayForTeamA(currentScoreHome);
        displayForTeamB(currentScoreVistor);
    }
}