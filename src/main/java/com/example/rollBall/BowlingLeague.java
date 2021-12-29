package com.example.rollBall;

import java.util.concurrent.ThreadLocalRandom;

public class BowlingLeague {
    private int totalPinsDown;

    public static void main(String[] args) {
        BowlingLeague BowlingLeague = new BowlingLeague(0);
        BowlingLeague.playBowling();
    }

    public BowlingLeague(int totalPinsDown) {
        this.totalPinsDown = totalPinsDown;
    }

    public void playBowling() {
        for (int frameCounter = 1; frameCounter <= 10; frameCounter++) {
            currentFrame(frameCounter);
        }
    }

    public void currentFrame(int frameCounter) {
        for (int bowlingTurnCounter = 1; bowlingTurnCounter <= 3; bowlingTurnCounter++) {
            bowlingTurn(bowlingTurnCounter);
        }
    }

    public void bowlingTurn(int bowlingTurnCounter) {
        rollTheBowl();
    }

    public int rollTheBowl() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        return randomNum;
    }
}
