package com.anton.antohin.horse;

import android.util.Log;

/**
 * Created by User on 08.06.2017.
 */

public class TwoHorse {
    private final String IMPOSSIBLE = "IMPOSSIBLE";

    public void distanceForCoord(int x1, int y1, int x2, int y2) {
        String res = distance(Math.abs(x2 - x1), Math.abs(y2 - y1));
        Log.d("TwoHorse", res);
    }

    public String distance(int x, int y) {
        if(x < y) {
            int t = x;
            x = y;
            y = t;
        }
        int delta = x - y;
        if(delta % 2 != 0) {
            return IMPOSSIBLE;
        }

        if(x == 2 && y == 2) return String.valueOf(4);


        int result;
        if(y > delta) {
            result = delta - 2 * (int) (Math.floor((delta - y) / 3));
            result /= 2;
            return String.valueOf(result);
        } else {
            result = delta - 2 * (int) (Math.floor((delta - y) / 4));
            result /= 2;
            return String.valueOf(result);
        }
    }
}
