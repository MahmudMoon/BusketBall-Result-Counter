package com.example.moonc.courtcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Third extends AppCompatActivity {


    TextView txt1;
    TextView txt2;

    int TeamOneScore;
    int TeamTwoScore;

    TextView TeamOne;
    TextView TeamTwo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        txt1 = (TextView)findViewById(R.id.txt1);
        txt2 = (TextView)findViewById(R.id.txt2);
        TeamOne = (TextView)findViewById(R.id.TeamOne);
        TeamTwo = (TextView)findViewById(R.id.TeamTwo);
        txt1.setText(getIntent().getExtras().getString("FirstTeam"));
        txt2.setText(getIntent().getExtras().getString("SecondTeam"));
        TeamOneScore = 0;
        TeamTwoScore = 0;
    }


    public void TeamOneFst(View view)
    {
        TeamOneScore += 3;
        String str;
        str = Integer.toString(TeamOneScore);
        TeamOne.setText(str);
    }


    public void TeamOneSec(View view){
        TeamOneScore += 2;
        String str;
        str = Integer.toString(TeamOneScore);
        TeamOne.setText(str);
    }

    public void TeamOneThd(View view)
    {
        TeamOneScore += 1;
        String str;
        str = Integer.toString(TeamOneScore);
        TeamOne.setText(str);
    }



    public void TeamTwoFst(View view)
    {
        TeamTwoScore += 3;
        String str;
        str = Integer.toString(TeamTwoScore);
        TeamTwo.setText(str);
    }

    public void TeamTwoSec(View view){
        TeamTwoScore += 2;
        String str;
        str = Integer.toString(TeamTwoScore);
        TeamTwo.setText(str);
    }

    public void TeamTwoThd(View view)
    {
        TeamTwoScore += 1;
        String str;
        str = Integer.toString(TeamTwoScore);
        TeamTwo.setText(str);
    }

    public void Reset(View view)
    {
        TeamOne.setText("");
        TeamTwo.setText("");
        txt1.setText("");
        txt2.setText("");
        TeamOneScore = 0;
        TeamTwoScore = 0;
    }

}
