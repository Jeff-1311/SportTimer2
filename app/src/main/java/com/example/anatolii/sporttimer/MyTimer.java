package com.example.anatolii.sporttimer;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by anatolii on 17.07.2014.
 */

public class MyTimer extends CountDownTimer {

    final String TAG = "SportTimer";
    FirstFragment ff = new FirstFragment();
    TextView tv = ff.methodGetTextView();

 Log.



    public MyTimer(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);


    }


    @Override
    public void onFinish() {
        android.util.Log.d(TAG, "timer onFinish");

        finalTimer.start();
    }


    @Override
    public void onTick(long millisUntilFinished) {

        android.util.Log.d(TAG, "обект MyTimer/ timer onTick");
        tv.setText("cvb");

    }

    CountDownTimer finalTimer = new CountDownTimer(10000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {

        }
    };

}
