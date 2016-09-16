package example.broadcast.com.broadcastexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class OrderBroadcastActivity extends AppCompatActivity implements View.OnClickListener {

    private View sendBroadcast;
    public static final String KEY_VALUE = "KEY_VALUE";
    public static final String MESSAGE_FROM_SENDER = "MESSAGE_FROM_SENDER";
    public static final String ACTION_ORDER_BROADCAST = "example.broadcast.com.broadcastexample.ACTION_ORDER_BROADCAST";
    public static final String PERMISSION_ORDER_BROADCAST = "example.broadcast.com.broadcastexample.PERMISSION_ORDER_BROADCAST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_broadcast);
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
            intent.setAction(ACTION_ORDER_BROADCAST);
            // 3. 设置传值内容
            intent.putExtra(KEY_VALUE, MESSAGE_FROM_SENDER);
            // 4. 发送普通广播
            sendOrderedBroadcast(intent, PERMISSION_ORDER_BROADCAST);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
