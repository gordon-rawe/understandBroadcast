package example.broadcast.com.broadcastexample.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import example.broadcast.com.broadcastexample.OrderBroadcastActivity;

/**
 * Created by gordon on 16/9/16.
 */
public class BroadcastReceiverTwo extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(OrderBroadcastActivity.class.getCanonicalName(), "BroadcastReceiverTwo receive message " + intent.getStringExtra(OrderBroadcastActivity.KEY_VALUE));
        Log.d(OrderBroadcastActivity.class.getCanonicalName(),getResultExtras(true).getString(BroadcastReceiverOne.KEY_BROAD_CAST_ONE));
    }
}
