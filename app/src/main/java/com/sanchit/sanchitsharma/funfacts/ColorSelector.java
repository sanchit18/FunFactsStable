package com.sanchit.sanchitsharma.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by sanchitsharma on 03/08/15.
 */
public class ColorSelector {

    public String[] mColor = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    public Random randomGenerator = new Random();

    public int GetColor(){
        String color1;
        int next = randomGenerator.nextInt(mColor.length);
        color1 = mColor[next];
        int nextColor = Color.parseColor(color1);

        return nextColor;
    }
}
