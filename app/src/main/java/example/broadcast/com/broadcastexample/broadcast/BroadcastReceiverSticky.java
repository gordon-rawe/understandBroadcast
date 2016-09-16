package example.broadcast.com.broadcastexample.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.concurrent.TimeUnit;

/**
 * Created by gordon on 16/9/16.
 */
public class BroadcastReceiverSticky extends BroadcastReceiver {

    public static final String ACTION_STICKY_BROADCAST = "example.broadcast.com.broadcastexample.ACTION_STICKY_BROADCAST";
    public static final String TAG = BroadcastReceiverSticky.class.getCanonicalName();

    @Override
    public void onReceive(Context context, Intent intent) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.i(TAG, "收到了粘性广播" + i);
                }
            }
        }).start();
    }
}
