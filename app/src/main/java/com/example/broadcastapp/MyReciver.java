package com.example.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 果红艳。 on 2016/9/8 0008.
 */
public class MyReciver extends BroadcastReceiver {
    public MyReciver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String strMsg=intent.getStringExtra("broadcastmsg");
        Toast.makeText(context,strMsg, Toast.LENGTH_LONG).show();

    }
}
