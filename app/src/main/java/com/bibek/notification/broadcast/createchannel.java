package com.bibek.notification.broadcast;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

public class createchannel {
    Context context;
    public final static String CHANNEL_1 = "Channel1";
    public final static String CHANNEL_2 = "Channel2";

    public createchannel(Context context) {
        this.context = context;
    }
    public void createChannel(){
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_1,
                    "channel 1",
                    NotificationManager.IMPORTANCE_HIGH


            );
            channel.setDescription("This is channel 1");
            NotificationChannel channel2 = new NotificationChannel(
                    CHANNEL_2,
                    "Channel 2",
                    NotificationManager.IMPORTANCE_LOW
            );
            channel2.setDescription("This is channel 2");
            NotificationManager manager = context.getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
            manager.createNotificationChannel(channel2);
        }
    }

}
