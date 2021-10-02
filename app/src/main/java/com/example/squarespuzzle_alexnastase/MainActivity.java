/*
Alex Nastase, 10/1/2021, no known deficiencies.
 */
package com.example.squarespuzzle_alexnastase;

import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PuzzleView puzzle = new PuzzleView();
        puzzle.generatePuzzle();


        PuzzleController puzzleController = new PuzzleController(puzzle);
        setArray(puzzle, puzzleController);

        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(puzzleController);

    }

    /**
     * resets the puzzle with random setup
     * @param puzzle - puzzleView obj to remake
     * @param puzzleController - pass through to setArray
     */
    public void reset(PuzzleView puzzle, PuzzleController puzzleController){
        puzzle.generatePuzzle();
        setArray(puzzle, puzzleController);
    }


    /**
     * creates button objs, adds them to arrays, and arrayLists, and sets the listeners
     * @param puzzle - Puzzleview obj
     * @param cc - puzzleController to set listeners
     */
    public void setArray(PuzzleView puzzle, PuzzleController cc){
        Button b1 = findViewById(R.id.buttonCol0);
        puzzle.buttonArrayList.add(b1);
        puzzle.buttonArray[0][0] = b1;
        puzzle.buttonArrayList.get(0).setText("" + puzzle.puzzleArray[0][0]);
        b1.setOnClickListener(cc);


        Button b2 = findViewById(R.id.buttonCol1);
        puzzle.buttonArrayList.add(b2);
        puzzle.buttonArray[0][1] = b2;
        puzzle.buttonArrayList.get(1).setText("" + puzzle.puzzleArray[0][1]);
        b2.setOnClickListener(cc);


        Button b3 = findViewById(R.id.buttonCol2);
        puzzle.buttonArrayList.add(b3);
        puzzle.buttonArray[0][2] = b3;
        puzzle.buttonArrayList.get(2).setText("" + puzzle.puzzleArray[0][2]);
        b3.setOnClickListener(cc);



        Button b4 = findViewById(R.id.buttonCol3);
        puzzle.buttonArrayList.add(b4);
        puzzle.buttonArray[0][3] = b4;
        puzzle.buttonArrayList.get(3).setText("" + puzzle.puzzleArray[0][3]);
        b4.setOnClickListener(cc);



        Button b5 = findViewById(R.id.buttonCol1_0);
        puzzle.buttonArrayList.add(b5);
        puzzle.buttonArray[1][0] = b5;
        puzzle.buttonArrayList.get(4).setText("" + puzzle.puzzleArray[1][0]);
        b5.setOnClickListener(cc);


        Button b6 = findViewById(R.id.buttonCol1_1);
        puzzle.buttonArrayList.add(b6);
        puzzle.buttonArray[1][1] = b6;
        puzzle.buttonArrayList.get(5).setText("" + puzzle.puzzleArray[1][1]);
        b6.setOnClickListener(cc);


        Button b7 = findViewById(R.id.buttonCol1_2);
        puzzle.buttonArrayList.add(b7);
        puzzle.buttonArray[1][2] = b7;
        puzzle.buttonArrayList.get(6).setText("" + puzzle.puzzleArray[1][2]);
        b7.setOnClickListener(cc);


        Button b8 = findViewById(R.id.buttonCol1_3);
        puzzle.buttonArrayList.add(b8);
        puzzle.buttonArray[1][3] = b8;
        puzzle.buttonArrayList.get(7).setText("" + puzzle.puzzleArray[1][3]);
        b8.setOnClickListener(cc);


        Button b9 = findViewById(R.id.buttonCol2_0);
        puzzle.buttonArrayList.add(b9);
        puzzle.buttonArray[2][0] = b9;
        puzzle.buttonArrayList.get(8).setText("" + puzzle.puzzleArray[2][0]);
        b9.setOnClickListener(cc);


        Button b10 = findViewById(R.id.buttonCol2_1);
        puzzle.buttonArrayList.add(b10);
        puzzle.buttonArray[2][1] = b10;
        puzzle.buttonArrayList.get(9).setText("" + puzzle.puzzleArray[2][1]);
        b10.setOnClickListener(cc);


        Button b11 = findViewById(R.id.buttonCol2_2);
        puzzle.buttonArrayList.add(b11);
        puzzle.buttonArray[2][2] = b11;
        puzzle.buttonArrayList.get(10).setText("" + puzzle.puzzleArray[2][2]);
        b11.setOnClickListener(cc);


        Button b12 = findViewById(R.id.buttonCol2_3);
        puzzle.buttonArrayList.add(b12);
        puzzle.buttonArray[2][3] = b12;
        puzzle.buttonArrayList.get(11).setText("" + puzzle.puzzleArray[2][3]);
        b12.setOnClickListener(cc);


        Button b13 = findViewById(R.id.buttonCol3_0);
        puzzle.buttonArrayList.add(b13);
        puzzle.buttonArray[3][0] = b13;
        puzzle.buttonArrayList.get(12).setText("" + puzzle.puzzleArray[3][0]);
        b13.setOnClickListener(cc);


        Button b14 = findViewById(R.id.buttonCol3_1);
        puzzle.buttonArrayList.add(b14);
        puzzle.buttonArray[3][1] = b14;
        puzzle.buttonArrayList.get(13).setText("" + puzzle.puzzleArray[3][1]);
        b14.setOnClickListener(cc);


        Button b15 = findViewById(R.id.buttonCol3_2);
        puzzle.buttonArrayList.add(b15);
        puzzle.buttonArray[3][2] = b15;
        puzzle.buttonArrayList.get(14).setText("" + puzzle.puzzleArray[3][2]);
        b15.setOnClickListener(cc);


        Button b16 = findViewById(R.id.buttonCol3_3);
        puzzle.buttonArrayList.add(b16);
        puzzle.buttonArray[3][3] = b16;
        puzzle.buttonArrayList.get(15).setText("" + puzzle.puzzleArray[3][3]);
        b16.setOnClickListener(cc);

        }
}