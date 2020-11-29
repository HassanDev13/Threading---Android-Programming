package com.practice.backgroundtheardpratice.LooperMQH;


import android.os.Handler;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;

class ExampleHendler extends Handler {
    private static final String TAG = "Hendler";
    public static final int TASK_A = 1;
    public static final int TASK_B = 2;
    @Override
    public void handleMessage(@NonNull Message msg) {
        switch (msg.what){
            case TASK_A:
                Log.d(TAG, "TASK A excuted ");
                break;
            case TASK_B:
                Log.d(TAG, "TASK B excuted ");
                break;
        }
    }
}
