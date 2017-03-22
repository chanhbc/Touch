package com.touch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.widget.ImageView;

public class CustomView extends ImageView {
    private Paint paint;
    //    private Path path;
    private float x;
    private float y;

    public CustomView(Context context) {
        super(context);
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG | Paint.FILTER_BITMAP_FLAG);
        paint.setColor(Color.parseColor("#500BDFFF"));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(40);
        paint.setStyle(Paint.Style.STROKE);
//        path = new Path();
//        path.addCircle(100, 100, 100, Path.Direction.CCW);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x = event.getX();
                y = event.getY();
                invalidate();
                break;
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawPath(path, paint);
//        canvas.drawPaint(paint);
        canvas.drawPoint(x, y, paint);
    }
}
