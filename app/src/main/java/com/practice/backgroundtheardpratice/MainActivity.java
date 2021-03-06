package com.practice.backgroundtheardpratice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startThread(View view) {
       ExempleRunnabe exempleRunnabe = new ExempleRunnabe(10);
       new Thread(exempleRunnabe).start();
    }

    public void stopThread(View view) {
    }
    // start the backgournd Thread emp1
    class  ExempleThread extends Thread{
        int seconds ;

        public ExempleThread(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {
            for(int i= 0 ; i<seconds; i++ ){
                Log.d(TAG, "startThread: "+ i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class ExempleRunnabe implements Runnable{
        int seconds ;

        public ExempleRunnabe(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {
            for(int i= 0 ; i<seconds; i++ ){
                Log.d(TAG, "startThread: "+ i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}