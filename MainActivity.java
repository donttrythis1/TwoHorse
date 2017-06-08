package com.anton.antohin.horse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TwoHorse twoHorse = new TwoHorse();
        int x1 = 1;
        int y1 = 1;
        int x2 = 10;
        int y2 = 4;

        twoHorse.distanceForCoord(x1,y1,x2,y2);

        // or

        String result = twoHorse.distance(Math.abs(x2 - x1), Math.abs(y2 - y1));
        Log.d("TwoHorse", result);
    }
}
