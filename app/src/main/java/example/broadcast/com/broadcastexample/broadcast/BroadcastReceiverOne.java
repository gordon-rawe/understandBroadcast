package example.broadcast.com.broadcastexample.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import example.broadcast.com.broadcastexample.OrderBroadcastActivity;

/**
 * Created by gordon on 16/9/16.
 */
public class BroadcastReceiverOne extends BroadcastReceiver {
    public static final String KEY_BROAD_CAST_ONE = "KEY_BROAD_CAST_ONE";
    public static final String MESSAGE_FROM_BROAD_CAST_ONE = "MESSAGE_FROM_BROAD_CAST_ONE";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(OrderBroadcastActivity.class.getCanonicalName(), "BroadcastReceiverOne receive message " + intent.getStringExtra(OrderBroadcastActivity.KEY_VALUE));
        Bundle bundle = new Bundle();
        bundle.putString(KEY_BROAD_CAST_ONE, MESSAGE_FROM_BROAD_CAST_ONE);
        setResultExtras(bundle);
    }
}
