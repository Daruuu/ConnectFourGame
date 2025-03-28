package com.daruuu.connectfourgame.model;

public class GameBoard
{
    private char[][]    board;
    private int         columns;
    private int         rows;
    private long        startGame;
    private long        endGame;
    private int         total_time;
    private int         count_moves;

    public GameBoard (int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        this.board = new char[rows][columns];
    }

    public void initializeBoard()
    {
        int i;
        int j;

        i = 0;
        j = 0;
        while (i < rows)
        {
            while (j < columns)
            {
                board[i][j] = ' ';
                j ++;
            }
            i ++;
        }

    }
}
