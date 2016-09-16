package example.broadcast.com.broadcastexample;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import example.broadcast.com.broadcastexample.broadcast.BroadcastReceiverSticky;
import example.broadcast.com.broadcastexample.broadcast.ExampleBroadcastReceiver;

public class StickyBroadcastActivity extends AppCompatActivity implements View.OnClickListener {

    private View sendBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendBroadcast = findViewById(R.id.send_broadcast);
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
            intent.setAction(BroadcastReceiverSticky.ACTION_STICKY_BROADCAST);
            // 3. 发送粘性广播
            sendStickyBroadcast(intent);
        }
    }
}
