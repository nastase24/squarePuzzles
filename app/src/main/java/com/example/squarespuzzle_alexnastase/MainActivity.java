package com.example.squarespuzzle_alexnastase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    PuzzleView puzzle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PuzzleView puzzle = new PuzzleView();
        puzzle.generatePuzzle();


        PuzzleController puzzleController = new PuzzleController(puzzle);
        setArrayList(puzzle,puzzleController);

        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(puzzleController);

    }


    public void reset(PuzzleView puzzle, PuzzleController puzzleController){
        puzzle.generatePuzzle();
        setArrayList(puzzle, puzzleController);
    }

    public void setArrayList(PuzzleView puzzle, PuzzleController puzzleController){
        Button b1 = findViewById(R.id.buttonCol0);
        puzzle.buttonArrayList.add(b1);
        puzzle.buttonArrayList.get(0).setText("" + puzzle.puzzleArray[0][0]);

        Button b2 = findViewById(R.id.buttonCol1);
        puzzle.buttonArrayList.add(b2);
        puzzle.buttonArrayList.get(1).setText("" + puzzle.puzzleArray[0][1]);

        Button b3 = findViewById(R.id.buttonCol2);
        puzzle.buttonArrayList.add(b3);
        puzzle.buttonArrayList.get(2).setText("" + puzzle.puzzleArray[0][2]);


        Button b4 = findViewById(R.id.buttonCol3);
        puzzle.buttonArrayList.add(b4);
        puzzle.buttonArrayList.get(3).setText("" + puzzle.puzzleArray[0][3]);


        Button b5 = findViewById(R.id.buttonCol1_0);
        puzzle.buttonArrayList.add(b5);
        puzzle.buttonArrayList.get(4).setText("" + puzzle.puzzleArray[1][0]);

        Button b6 = findViewById(R.id.buttonCol1_1);
        puzzle.buttonArrayList.add(b6);
        puzzle.buttonArrayList.get(5).setText("" + puzzle.puzzleArray[1][1]);

        Button b7 = findViewById(R.id.buttonCol1_2);
        puzzle.buttonArrayList.add(b7);
        puzzle.buttonArrayList.get(6).setText("" + puzzle.puzzleArray[1][2]);

        Button b8 = findViewById(R.id.buttonCol1_3);
        puzzle.buttonArrayList.add(b8);
        puzzle.buttonArrayList.get(7).setText("" + puzzle.puzzleArray[1][3]);

        Button b9 = findViewById(R.id.buttonCol2_0);
        puzzle.buttonArrayList.add(b9);
        puzzle.buttonArrayList.get(8).setText("" + puzzle.puzzleArray[2][0]);

        Button b10 = findViewById(R.id.buttonCol2_1);
        puzzle.buttonArrayList.add(b10);
        puzzle.buttonArrayList.get(9).setText("" + puzzle.puzzleArray[2][1]);

        Button b11 = findViewById(R.id.buttonCol2_2);
        puzzle.buttonArrayList.add(b11);
        puzzle.buttonArrayList.get(10).setText("" + puzzle.puzzleArray[2][2]);

        Button b12 = findViewById(R.id.buttonCol2_3);
        puzzle.buttonArrayList.add(b12);
        puzzle.buttonArrayList.get(11).setText("" + puzzle.puzzleArray[2][3]);

        Button b13 = findViewById(R.id.buttonCol3_0);
        puzzle.buttonArrayList.add(b13);
        puzzle.buttonArrayList.get(12).setText("" + puzzle.puzzleArray[3][0]);

        Button b14 = findViewById(R.id.buttonCol3_1);
        puzzle.buttonArrayList.add(b14);
        puzzle.buttonArrayList.get(13).setText("" + puzzle.puzzleArray[3][1]);

        Button b15 = findViewById(R.id.buttonCol3_2);
        puzzle.buttonArrayList.add(b15);
        puzzle.buttonArrayList.get(14).setText("" + puzzle.puzzleArray[3][2]);

        Button b16 = findViewById(R.id.buttonCol3_3);
        puzzle.buttonArrayList.add(b16);
        puzzle.buttonArrayList.get(15).setText("" + puzzle.puzzleArray[3][3]);

    }
}