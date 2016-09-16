package example.broadcast.com.broadcastexample.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by gordon on 16/9/16.
 */
public class ExampleBroadcastReceiver extends BroadcastReceiver {

    public static final String TAG = ExampleBroadcastReceiver.class.getCanonicalName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "接收到一条来自" + intent.getAction() + "的广播请求");
    }
}
