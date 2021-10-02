package com.example.squarespuzzle_alexnastase;

import android.util.Log;
import android.view.View;
import android.widget.Button;


public class PuzzleController implements View.OnClickListener{

    private PuzzleView puzzleView;
    private PuzzleModel puzzleModel;

    /**
     * Constructor for PuzzleController
     * @param pv - Puzzleview object
     */
    public PuzzleController(PuzzleView pv){
        puzzleView = pv;
        puzzleModel = puzzleView.getPuzzleModel();
    }

    /**
     * switch statement that execiutes actions based on the button, reset it resets the puzzle,
     * all others attempt to switch with the empty square;
     * @param view
     */
    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch(view.getId()) {
            case R.id.resetButton:
                puzzleView.resetPuzzle();
                break;
            case R.id.buttonCol0:

                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol0), puzzleView.getEmpty());
                break;
            case R.id.buttonCol1:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol1), puzzleView.getEmpty());
                break;
            case R.id.buttonCol2:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol2), puzzleView.getEmpty());
                break;
            case R.id.buttonCol3:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol3), puzzleView.getEmpty());
                break;
            case R.id.buttonCol1_0:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol1_0), puzzleView.getEmpty());
                break;
            case R.id.buttonCol1_1:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol1_1), puzzleView.getEmpty());
                break;
            case R.id.buttonCol1_2:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol1_2), puzzleView.getEmpty());
                break;
            case R.id.buttonCol1_3:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol1_3), puzzleView.getEmpty());
                break;
            case R.id.buttonCol2_0:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol2_0), puzzleView.getEmpty());
                break;
            case R.id.buttonCol2_1:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol2_1), puzzleView.getEmpty());
                break;
            case R.id.buttonCol2_2:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol2_2), puzzleView.getEmpty());
                break;
            case R.id.buttonCol2_3:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol2_3), puzzleView.getEmpty());
                break;
            case R.id.buttonCol3_0:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol3_0), puzzleView.getEmpty());
                break;
            case R.id.buttonCol3_1:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol3_1), puzzleView.getEmpty());
                break;
            case R.id.buttonCol3_2:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol3_2), puzzleView.getEmpty());
                break;
            case R.id.buttonCol3_3:
                puzzleView.switchButtons(puzzleView.getButton(R.id.buttonCol3_3), puzzleView.getEmpty());
                break;

        }
    }


}
