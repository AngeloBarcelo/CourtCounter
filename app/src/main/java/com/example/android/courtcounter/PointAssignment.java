package com.example.android.courtcounter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.courtcounter.databinding.ActivityMainBinding;

public class PointAssignment extends BaseObservable {

    int currentScoreLeft = 0;
    int currentScoreRight = 0;
    int onePoint = 1;
    int twoPoints = 2;
    int threePoints = 3;

    public PointAssignment(int currentScoreLeft, int currentScoreRight) {
        this.currentScoreLeft = currentScoreLeft;
        this.currentScoreRight = currentScoreRight;
    }

    @Bindable
    public int getCurrentScoreLeft()  {
        return currentScoreLeft;
    }

    public void setCurrentScoreLeft(int currentScoreLeft) {
        this.currentScoreLeft = currentScoreLeft;
        notifyPropertyChanged(BR.currentScoreLeft);
    }

    @Bindable
    public int getCurrentScoreRight() {
        return currentScoreRight;
    }

    public void setCurrentScoreRight(int currentScoreRight) {
        this.currentScoreRight = currentScoreRight;
        notifyPropertyChanged(BR.currentScoreRight);
    }

    public void addPoints(int view) {
        switch (view) {
            case R.id.leftOnePoint_btn:
                setCurrentScoreLeft(getCurrentScoreLeft() + onePoint);
                break;
            case R.id.leftTwoPoints_btn:
                setCurrentScoreLeft(getCurrentScoreLeft() + twoPoints);
                break;
            case R.id.leftThreePoints_btn:
                setCurrentScoreLeft(getCurrentScoreLeft() + threePoints);
                break;
            case R.id.rightOnePoint_btn:
                setCurrentScoreRight(getCurrentScoreRight() + onePoint);
                break;
            case R.id.rightTwoPoints_btn:
                setCurrentScoreRight(getCurrentScoreRight() + twoPoints);
                break;
            case R.id.rightThreePoints_btn:
                setCurrentScoreRight(getCurrentScoreRight() + threePoints);
                break;
            case R.id.reset_btn:
                setCurrentScoreRight(0);
                setCurrentScoreLeft(0);
                break;

        }
    }

    public void subtractPoint(int view) {
        switch (view) {
            case R.id.leftOnePoint_btn:
                setCurrentScoreLeft(getCurrentScoreLeft() - onePoint);
                break;
            case R.id.leftTwoPoints_btn:
                setCurrentScoreLeft(getCurrentScoreLeft() - twoPoints);
                break;
            case R.id.leftThreePoints_btn:
                setCurrentScoreLeft(getCurrentScoreLeft() - threePoints);
                break;
            case R.id.rightOnePoint_btn:
                setCurrentScoreRight(getCurrentScoreRight() - onePoint);
                break;
            case R.id.rightTwoPoints_btn:
                setCurrentScoreRight(getCurrentScoreRight() - twoPoints);
                break;
            case R.id.rightThreePoints_btn:
                setCurrentScoreRight(getCurrentScoreRight() - threePoints);
                break;
        }
    }
}
