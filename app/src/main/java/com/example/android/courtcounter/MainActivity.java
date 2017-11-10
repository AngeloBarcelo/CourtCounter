package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int currentScoreHome = 0;
    int currentScoreVistor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void twoPointsHomeTeam(View v) {
        currentScoreHome += 2;
        displayForTeamA(currentScoreHome);
    }

    public void threePointsHomeTeam(View v) {
        currentScoreHome += 3;
        displayForTeamA(currentScoreHome);
    }

    public void onePointHomeTeam(View v) {
        currentScoreHome++;
        displayForTeamA(currentScoreHome);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void twoPointsVisterTeam(View v) {
        currentScoreVistor += 2;
        displayForTeamB(currentScoreVistor);
    }

    public void threePointsVisitorTeam(View v) {
        currentScoreVistor += 3;
        displayForTeamB(currentScoreVistor);
    }

    public void onePointVisitorTeam(View v) {
        currentScoreVistor++;
        displayForTeamB(currentScoreVistor);
    }
}
