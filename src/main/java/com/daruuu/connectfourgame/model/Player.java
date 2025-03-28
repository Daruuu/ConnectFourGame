package com.daruuu.connectfourgame.model;

public class Player
{
    private int     id;
    private String  name;
    private int     score;
    private long    entryTime;
    private long    totalTime;
    private char    token;  // Ficha del jugador ('X' o 'O')

    public Player() {
    }

    public Player(int id, String name, int score, long entryTime, long totalTime, char token) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.entryTime = entryTime;
        this.totalTime = totalTime;
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public char getToken() {
        return token;
    }

    public void increaseScore() {
        score ++;
    }

    public void updateTotalTime(){
        this.totalTime = System.currentTimeMillis() -  this.entryTime;
    }


}
