package me.kamili.rachid.walmartapp.utils;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import me.kamili.rachid.walmartapp.view.details.DetailsActivity;

public class ActivitySwipeDetector implements View.OnTouchListener {

    static final String logTag = "ActivitySwipeDetector";
    private DetailsActivity activity;
    static final int MIN_DISTANCE = 100;// TODO change this runtime based on screen resolution. for 1920x1080 is to small the 100 distance
    private float downX, upX;


    public ActivitySwipeDetector(Activity activity) {
        this.activity = (DetailsActivity) activity;
    }

    public void onRightToLeftSwipe() {
        Toast.makeText(activity, "RightToLeftSwipe", Toast.LENGTH_SHORT).show();
        activity.swipeToPrev();
    }

    public void onLeftToRightSwipe() {
        Toast.makeText(activity, "LeftToRightSwipe", Toast.LENGTH_SHORT).show();
        activity.swipeToNext();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                downX = event.getX();
                return true;
            }
            case MotionEvent.ACTION_UP: {
                upX = event.getX();
                float deltaX = downX - upX;
                if (Math.abs(deltaX) > MIN_DISTANCE) {
                    if (deltaX < 0) {
                        this.onLeftToRightSwipe();
                        return true;
                    }
                    if (deltaX > 0) {
                        this.onRightToLeftSwipe();
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

}
