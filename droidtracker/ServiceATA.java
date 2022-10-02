package wick.droidtracker;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.IBinder;

import android.widget.Toast;

import androidx.annotation.Nullable;


public    class ServiceATA extends Service
{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();


    }

    @Override

    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Started", Toast.LENGTH_LONG).show();
        Intent i= new Intent(this,SendMsgSim.class);
        startService(i);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        Intent i= new Intent(this,ServiceATA.class);
        startService(i);
        Intent restartServiceTask = new Intent(this,ServiceATA.class);
        restartServiceTask.setPackage(getPackageName());
        super.onTaskRemoved(rootIntent);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Stopped", Toast.LENGTH_LONG).show();

    }
}
