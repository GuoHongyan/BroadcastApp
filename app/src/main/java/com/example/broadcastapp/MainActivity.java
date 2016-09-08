package com.example.broadcastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MyReceiver receiver=new MyReceiver();
//        IntentFilter filter=new IntentFilter();
//        filter.addAction("android.intent.action.MY_BROADCAST");
//        registerReceiver(receiver,filter);

        Button button = (Button) findViewById(R.id.buttonSend);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.MY_BROADCAST");
                intent.putExtra("broadcastmsg", "hello receiver.");
                sendBroadcast(intent);

            }
        });

    }

}

