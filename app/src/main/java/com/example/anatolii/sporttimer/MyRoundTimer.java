package com.example.anatolii.sporttimer;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by anatolii on 24.07.2014.
 */
public class MyRoundTimer  extends CountDownTimer{
    final String TAG = "SportTimer";

    int i = 0;

    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public MyRoundTimer(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);



    }

    @Override
    public void onTick(long millisUntilFinished) {
        Log.d(TAG, "обект класа MyRoundTimer, onTick. i="+i);
i++;

    }

    @Override
    public void onFinish() {

    }
}
