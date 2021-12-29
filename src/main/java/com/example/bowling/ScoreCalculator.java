package com.example.bowling;

public class ScoreCalculator {
    private static boolean ifAnotherThrowRequired(int frameNumber, int throwNumber, int throwScore) {
        if (frameNumber != 10) {
            if(throwNumber==2)
            {
                return false;
            }
            if (throwNumber == 1) {
                if (throwScore < 10) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isStrike(int frameNumber, int throwNumber, int throwScore)
    {
        if(frameNumber!=10 && throwNumber==1 && throwScore==10)
        {
            return true;
        }
        return false;
    }

    private static boolean isSpare(int frameNumber, int throwNumber, int frameScore)
    {
        if(frameNumber!=10 && throwNumber==2 && frameScore==10)
        {
            return true;
        }
        return false;
    }

    private static int calculateFrameScore(int frameNumber,int [][] frame)
    {
       int frameScore=0;
       if(frameNumber!=10) {
           for (int frameIndex = 0; frameIndex < 2; frameIndex++) {
               frameScore = frameScore + frame[frameNumber][frameIndex];
           }
       }
       return frameScore;
    }
}