package com.spaebo.mazingtowerdefense;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        GameBoard board = new GameBoard(this);
        board.setNumColumns(12);
        board.setNumRows(6);
        setContentView(board);
    }
}
