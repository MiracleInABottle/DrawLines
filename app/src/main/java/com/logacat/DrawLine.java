package com.logacat;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

class DrawLine extends View {
    Paint black = new Paint();
    Paint blue = new Paint();
    Paint white = new Paint();
    Paint red = new Paint();
    Paint cyan =new Paint();

    public DrawLine(Context context) {
        super(context);
        black.setColor(Color.BLACK);
        black.setStrokeWidth(3);
        blue.setColor(Color.BLUE);
        blue.setStrokeWidth(3);
        white.setColor(Color.WHITE);
        white.setStrokeWidth(3);
        red.setColor(Color.RED);
        red.setStrokeWidth(3);
        cyan.setColor(Color.CYAN);
        cyan.setStrokeWidth(3);
    }
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0,0,300,300, black);
        canvas.drawLine(50, 100, 50, 550, red);
        canvas.drawLine(50, 550, 650, 550, blue);
        canvas.drawCircle(150, 100, 5, blue);
        canvas.drawCircle(250, 200, 10, cyan);
        canvas.drawCircle(350, 300, 20, white);
        canvas.drawCircle(450, 400, 40, red);

    }

}