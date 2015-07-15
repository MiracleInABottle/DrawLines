package com.logacat;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends Activity {
    DrawLine drawLine;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawLine = new DrawLine(this);
        drawLine.setBackgroundColor(Color.CYAN);
        setContentView(drawLine);
    }
}
