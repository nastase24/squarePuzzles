package com.example.squarespuzzle_alexnastase;

import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;


public class PuzzleView{

    private PuzzleModel puzzleModel;

    public static final int PUZZLE_SIZE = 4;
    int[][] puzzleArray;
    Button[][] buttonArray;
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
        buttonArray = new Button[PUZZLE_SIZE][PUZZLE_SIZE];

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

    /**
     * regenerates the puzzle array, and sets the button array to match the numbers
     */
    public void resetPuzzle(){
        this.generatePuzzle();
        this.buttonArray[0][0].setText("" + this.puzzleArray[0][0]);
        this.buttonArray[0][1].setText("" + this.puzzleArray[0][1]);
        this.buttonArray[0][2].setText("" + this.puzzleArray[0][2]);
        this.buttonArray[0][3].setText("" + this.puzzleArray[0][3]);
        this.buttonArray[1][0].setText("" + this.puzzleArray[1][0]);
        this.buttonArray[1][1].setText("" + this.puzzleArray[1][1]);
        this.buttonArray[1][2].setText("" + this.puzzleArray[1][2]);
        this.buttonArray[1][3].setText("" + this.puzzleArray[1][3]);
        this.buttonArray[2][0].setText("" + this.puzzleArray[2][0]);
        this.buttonArray[2][1].setText("" + this.puzzleArray[2][1]);
        this.buttonArray[2][2].setText("" + this.puzzleArray[2][2]);
        this.buttonArray[2][3].setText("" + this.puzzleArray[2][3]);
        this.buttonArray[3][0].setText("" + this.puzzleArray[3][0]);
        this.buttonArray[3][1].setText("" + this.puzzleArray[3][1]);
        this.buttonArray[3][2].setText("" + this.puzzleArray[3][2]);
        this.buttonArray[3][3].setText("" + this.puzzleArray[3][3]);


    }

    /**
     * getter for the puzzleModel
     * @return - the puzzleModel
     */
    public PuzzleModel getPuzzleModel(){ return puzzleModel; }


    /**
     * Iterates through the button array and finds the matching index for the a button
     * and if the call to isNextToEmpty returns true, it switches the button texts
     * @param a - the button to switch with the empty square
     * @param emptySquare - the button set to -1
     */

    public void switchButtons(Button a, Button emptySquare){
        CharSequence tempText;
        int tempInt;
        for(int i = 0; i < PUZZLE_SIZE; i++){
            for(int j = 0; j < PUZZLE_SIZE; j++){
                if(buttonArray[i][j].getText() == a.getText()){
                    if(isNextToEmpty(i,j)){
                        tempText = a.getText();
                        a.setText(emptySquare.getText());
                        emptySquare.setText(tempText);
                        synchonizeArrays();
                    }
                }
            }
        }
    }

    /**
     * Computes the directly adjacent indices to the index params and if one is -1, returns true
     * @param row - row index
     * @param col - col index
     * @return - true if next to empty (-1) square
     */
    public boolean isNextToEmpty(int row, int col){
        //above
        if(row-1 >= 0 && puzzleArray[row-1][col] == -1){
            return true;
        }
        //below
        if( row+1 <= PUZZLE_SIZE-1 && puzzleArray[row+1][col] == -1){
            return true;
        }
        //left
        if( col-1 >= 0 && puzzleArray[row][col-1] == -1){
            return true;
        }
        //right
        if( col+1 <= PUZZLE_SIZE-1 && puzzleArray[row][col+1] == -1){
            return true;
        }
        return false;
    }

    /**
     * matches the puzzleArray with the buttonArray numbers
     */
    public void synchonizeArrays(){
        for(int i = 0; i < PUZZLE_SIZE; i++){
            for(int j = 0; j < PUZZLE_SIZE; j++){
                puzzleArray[i][j] = Integer.parseInt(buttonArray[i][j].getText().toString());
            }
        }
    }

    /**
     * iterathes through the button array and returns the empty square
     * @return - returns the button with -1 (empty) value
     */
    public Button getEmpty(){
        for(int i = 0; i < PUZZLE_SIZE; ++i){
            for(int j = 0; j < PUZZLE_SIZE; ++j){
                if(buttonArray[i][j].getText().equals("-1")){
                    return buttonArray[i][j];
                }
            }
        }
        return null;
    }

    /**
     * iterates through buttonArray and returns the one with the id param value
     * @param id - button ID
     * @return - the button with the matching ID
     */
    public Button getButton(int id){
        Button temp = null;
        for(int i = 0; i < PUZZLE_SIZE; i++){
            for(int j = 0; j < PUZZLE_SIZE; j++){
                if(buttonArray[i][j].getId() == id){
                    temp = buttonArray[i][j];
                }
            }
        }
        return temp;
    }


}
