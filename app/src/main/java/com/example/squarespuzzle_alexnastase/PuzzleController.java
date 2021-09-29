package com.example.squarespuzzle_alexnastase;

import android.view.View;
import android.widget.Button;


public class PuzzleController implements View.OnClickListener{

    private PuzzleView puzzleView;
    private PuzzleModel puzzleModel;

    public PuzzleController(PuzzleView pv){
        puzzleView = pv;
        puzzleModel = puzzleView.getPuzzleModel();
    }


    @Override
    public void onClick(View view) {
        puzzleView.resetPuzzle();
    }


}
