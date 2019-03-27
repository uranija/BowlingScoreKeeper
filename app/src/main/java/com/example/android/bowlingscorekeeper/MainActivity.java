package com.example.android.bowlingscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.bowlingscorekeeper.R.id.team_a_score;
import static com.example.android.bowlingscorekeeper.R.id.team_b_score;

public class MainActivity extends AppCompatActivity {


    public static final String SCORE_A_KEY = "SCORE_A_KEY";
    public static final String SCORE_B_KEY = "SCORE_B_KEY";

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        TextView teamBScore = (TextView) findViewById(R.id.team_b_score);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(SCORE_A_KEY);
            scoreTeamB = savedInstanceState.getInt(SCORE_B_KEY);
        }

        teamAScore.setText(String.valueOf(scoreTeamA));
        teamBScore.setText(String.valueOf(scoreTeamB));
    }


    /**
     * This method increases the score fot team A by 3.
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method increases the score fot team A by 2.
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method increases the score fot team A by 1.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }


    /**
     * This method increases the score fot team A by 4.
     */
    public void addFourForTeamA(View view) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method increases the score fot team A by 5.
     */
    public void addFiveForTeamA(View view) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method increases the score fot team A by 6.
     */
    public void addSixForTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method increases the score fot team A by 7.
     */
    public void addSevenForTeamA(View view) {
        scoreTeamA = scoreTeamA + 7;
        displayForTeamA(scoreTeamA);

    }


    /**
     * This method increases the score fot team A by 8.
     */
    public void addEightForTeamA(View view) {
        scoreTeamA = scoreTeamA + 8;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method increases the score fot team A by 9.
     */
    public void addNineForTeamA(View view) {
        scoreTeamA = scoreTeamA + 9;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method increases the score fot team A by 10.
     */
    public void addSpareForTeamA(View view) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);

    }


    /**
     * This method increases the score fot team A by 10.
     */
    public void addStrikeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);

    }


    /**
     * This method increases the score fot team B by 3.
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method increases the score fot team B by 2.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method increases the score fot team B by 1.
     */

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }


    /**
     * This method increases the score fot team B by 4.
     */

    public void addFourForTeamB(View view) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method increases the score fot team B by 5.
     */

    public void addFiveForTeamB(View view) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method increases the score fot team B by 6.
     */

    public void addSixForTeamB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method increases the score fot team B by 7.
     */

    public void addSevenForTeamB(View view) {
        scoreTeamB = scoreTeamB + 7;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method increases the score fot team B by 8.
     */

    public void addEightForTeamB(View view) {
        scoreTeamB = scoreTeamB + 8;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method increases the score fot team B by 9.
     */

    public void addNineForTeamB(View view) {
        scoreTeamB = scoreTeamB + 9;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method increases the score fot team B by 10.
     */

    public void addSpareForTeamB(View view) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method increases the score fot team B by 10.
     */

    public void addStrikeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);

    }


    /**
     * This method resets the score.
     */

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_A_KEY, scoreTeamA);
        outState.putInt(SCORE_B_KEY, scoreTeamB);
    }
}




