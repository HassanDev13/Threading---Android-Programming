package com.practice.backgroundtheardpratice.LooperMQH;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;

class LooperThread extends Thread {
    private static final String TAG = "LooperThread";
    public Handler handler;
    Looper looper;
    @Override
    public void run() {
        looper = Looper.myLooper();
        Looper.prepare();
        handler = new ExampleHendler();
        Looper.loop();

        Log.d(TAG, "end of run");
    }
}
