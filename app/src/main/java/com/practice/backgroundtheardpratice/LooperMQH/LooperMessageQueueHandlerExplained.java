package com.practice.backgroundtheardpratice.LooperMQH;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;

import com.practice.backgroundtheardpratice.R;

import static com.practice.backgroundtheardpratice.LooperMQH.ExampleHendler.TASK_A;
import static com.practice.backgroundtheardpratice.LooperMQH.ExampleHendler.TASK_B;


public class LooperMessageQueueHandlerExplained extends AppCompatActivity {
    private static final String TAG = "LooperMessageQueueHandl";
    private LooperThread looperThread = new LooperThread();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looper_message_queue_handler_explained);
    }

    public void startThread(View view) {
        looperThread.start();
    }

    public void stopThread(View view) {
        looperThread.looper.quit();

    }

    public void taskA(View view) {
        Message msg = Message.obtain();
        msg.what = TASK_A;
        looperThread.handler.sendMessage(msg);
        /*
                Handler threadHandler = new Handler(looperThread.looper);

        threadHandler.post(new Runnable() {
           @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Log.d(TAG, "run: "+ i);
                    SystemClock.sleep(1000);
                }
            }
        });
         */

    }

    public void taskB(View view) {
        Message msg = Message.obtain();
        msg.what = TASK_B;
        looperThread.handler.sendMessage(msg);
    }
}