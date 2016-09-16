package example.broadcast.com.broadcastexample;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import example.broadcast.com.broadcastexample.broadcast.ExampleBroadcastReceiver;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View sendBroadcast;
    private ExampleBroadcastReceiver exampleBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendBroadcast = findViewById(R.id.send_broadcast);
        exampleBroadcastReceiver = new ExampleBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("example.broadcast.com.broadcastexample.ACTION_BROADCAST_SEND");
        registerReceiver(exampleBroadcastReceiver,intentFilter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        sendBroadcast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.send_broadcast) {
            // 1. 创建一个 Intent 对象；
            Intent intent = new Intent();
            // 2. 设置 Action;
            intent.setAction("example.broadcast.com.broadcastexample.ACTION_BROADCAST_SEND");
            // 3. 发送普通广播
            sendBroadcast(intent);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(exampleBroadcastReceiver);
    }
}
