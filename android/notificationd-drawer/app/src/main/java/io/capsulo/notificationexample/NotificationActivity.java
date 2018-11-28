package io.capsulo.notificationexample; /**
 * Copyright (C) 2018 henocsese.com. All rights reserved.
 *
 * @author Henoc Sese (lemarcque)
 */

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Activity that shows notification in different locations and formats
 * Source : https://developer.android.com/training/notify-user/build-notification
 */
public class NotificationActivity extends AppCompatActivity {

    private int notificationId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.main_activity_layout);
        this.start();
    }

    /**
     * Start the app's features
     */
    private void start() {
        this.createNotificationChannel();
        this.initStatusNotification();
    }


    /**
     * Create a notification channel
     */
    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String id = getString(R.string.channel_id);
            String description = "Lorem ipsum dolor";
            CharSequence name = getString(R.string.channel_name);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel channel = new NotificationChannel(id, name, importance);
            channel.setDescription(description);

            // Register the channel with the system
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }


    /**
     * todo : describe the method
     */
    private void initStatusNotification() {
        notificationId++;

        // Create an Intent to open an Activity when the user taps on the notification
        Intent intent = new Intent(this, NotificationActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);


        // Instantiate notification via Builder
        String channelId = getString(R.string.channel_id);
        String textTitle = "John Doe";
        String textContent = "Hey, how are you my friend ?!";
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, channelId)
                .setSmallIcon(R.drawable.notification_sms_icon)
                .setContentTitle(textTitle)
                .setContentText(textContent)
                .setPriority(NotificationCompat.PRIORITY_MAX)
                // Set the intent that will fire when the users taps the notification
                .setContentIntent(pendingIntent)
                // Remove the notification when the user taps it
                .setAutoCancel(true);

        // Show the notification
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(notificationId, builder.build());
    }
}
