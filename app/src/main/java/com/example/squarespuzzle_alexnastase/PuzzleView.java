package com.example.squarespuzzle_alexnastase;

import android.graphics.Canvas;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;


public class PuzzleView{

    private PuzzleModel puzzleModel;

    public static final int PUZZLE_SIZE = 4;
    int[][] puzzleArray;
    int[][] solutionArray;
    ArrayList<Button> buttonArrayList;

    /**
     * Insitantiates a puzzle array to -1, and a solution array to the correct order
     *
     */
    public PuzzleView(){

        puzzleModel = new PuzzleModel();


        puzzleArray = new int[PUZZLE_SIZE][PUZZLE_SIZE];

        buttonArrayList = new ArrayList<Button>(16);

        solutionArray = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, -1}};

        }

    /**
     * Iterates through a double array 1 less than the amount of indeices, and assigns a 1-15 to the
     * array if the value is not -1
     */
    public void generatePuzzle(){
        for(int i = 0; i < PUZZLE_SIZE; i++){
            for(int j = 0; j < PUZZLE_SIZE; j++){
                puzzleArray[i][j] = -1;

            }
        }
        for(int i = 1; i <= PUZZLE_SIZE*PUZZLE_SIZE-1; i++){
            int randomRow = (int) ((PUZZLE_SIZE)*Math.random());
            int randomCol = (int) ((PUZZLE_SIZE)*Math.random());
            if(puzzleArray[randomRow][randomCol] == -1){
                puzzleArray[randomRow][randomCol] = i;
            }else{
                i--;
            }

        }
    }

    public void resetPuzzle(){
        this.generatePuzzle();
        this.buttonArrayList.get(0).setText("" + this.puzzleArray[0][0]);
        this.buttonArrayList.get(1).setText("" + this.puzzleArray[0][1]);
        this.buttonArrayList.get(2).setText("" + this.puzzleArray[0][2]);
        this.buttonArrayList.get(3).setText("" + this.puzzleArray[0][3]);
        this.buttonArrayList.get(4).setText("" + this.puzzleArray[1][0]);
        this.buttonArrayList.get(5).setText("" + this.puzzleArray[1][1]);
        this.buttonArrayList.get(6).setText("" + this.puzzleArray[1][2]);
        this.buttonArrayList.get(7).setText("" + this.puzzleArray[1][3]);
        this.buttonArrayList.get(8).setText("" + this.puzzleArray[2][0]);
        this.buttonArrayList.get(9).setText("" + this.puzzleArray[2][1]);
        this.buttonArrayList.get(10).setText("" + this.puzzleArray[2][2]);
        this.buttonArrayList.get(11).setText("" + this.puzzleArray[2][3]);
        this.buttonArrayList.get(12).setText("" + this.puzzleArray[3][0]);
        this.buttonArrayList.get(13).setText("" + this.puzzleArray[3][1]);
        this.buttonArrayList.get(14).setText("" + this.puzzleArray[3][2]);
        this.buttonArrayList.get(15).setText("" + this.puzzleArray[3][3]);


    }

    public PuzzleModel getPuzzleModel(){ return puzzleModel; }

    public void switchButtons(ImageButton a, ImageButton b){
        ImageButton tempButton;
        this.buttonArrayList
    }



}
