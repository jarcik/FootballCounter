package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    /**
     * Points for A team
     */
    private int pointsA = 0;
    /**
     * Points for B team
     */
    private int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * add 5 points to specified team
     */
    public void add5Points(View view) {
        //statically add 5 points in this method
        int points = 5;
        //convert from tag to which team to add points
        String tag = (String) view.getTag();
        //add points
        addPoints(points, tag);
    }

    /**
     * add 10 points to specified team
     */
    public void add10Points(View view) {
        //statically add 10 points in this method
        int points = 10;
        //convert from tag to which team to add points
        String tag = (String) view.getTag();
        //add points
        addPoints(points, tag);
    }

    /**
     * add fault to specified team
     */
    public void addFault(View view) {
        //statically add a fault in this method
        int points = -1;
        //convert from tag to which team to add points
        String tag = (String) view.getTag();
        //add points
        addPoints(points, tag);
    }

    /**
     * Reseting all points
     */
    public void reset(View view) {
        pointsA = 0;
        pointsB = 0;
        TextView aTextView = findViewById(R.id.pointsA);
        aTextView.setText(String.valueOf(pointsA));
        TextView bTextView = findViewById(R.id.pointsB);
        bTextView.setText(String.valueOf(pointsB));
    }

    /**
     * add specified amount of points to specified Team
     * @param points number of points to add
     * @param team to which team add points
     */
    private void addPoints(int points, String team) {
        //init of textview for points to specific team
        TextView textView = null;
        //init of number of points to specific team
        int countedPoints = 0;
        //decide the team and global varialbles
        switch (team) {
            case "A":
                //assign textview for points
                textView = findViewById(R.id.pointsA);
                //count points to global variables
                pointsA = pointsA + points;
                //assing points for the view
                countedPoints = pointsA;
                break;
            case "B":
                //assign textview for points
                textView = findViewById(R.id.pointsB);
                //count points to global variables
                pointsB = pointsB + points;
                //assing points for the view
                countedPoints = pointsB;
                break;
        }
        if(textView == null) return;
        //write points to the view
        textView.setText(String.valueOf(countedPoints));
    }
}
