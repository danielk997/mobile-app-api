package com.example.demo2;

import java.util.Random;

public class Utils {

    public static Integer plusOrMinus() {
        return new Random().nextBoolean() ? 1 : -1;
    }
}
