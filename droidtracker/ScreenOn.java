package wick.droidtracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class ScreenOn extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean screenOff = false;
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            screenOff = true;

            Toast.makeText(context, "this is screen on", Toast.LENGTH_SHORT).show();
            Log.i("via Receiver","Normal ScreenOFF" );




        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            screenOff = false;
        } else if(intent.getAction().equals(Intent.ACTION_ANSWER)) {

        }

    }
}
