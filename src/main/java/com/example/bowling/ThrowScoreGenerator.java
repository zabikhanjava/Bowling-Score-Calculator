package com.example.bowling;

import java.util.concurrent.ThreadLocalRandom;

public class ThrowScoreGenerator {

    private static int getPinsDown(int totalFrameScore)
    {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        return randomNum;
    }
}
