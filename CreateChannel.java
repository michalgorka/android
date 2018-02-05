private static final CHANNEL_ID = "kanal1";
private static final CHANNEL_NAME = "Kanal 1";
...
NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

int importance = NotificationManager.IMPORTANCE_HIGH;
NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, importance);

// Konfiguracja kanalu
mChannel.setDescription(„Moj kanal 1”);
mChannel.enableLights(true);

// TODO: dodac komentarz
mChannel.setLightColor(Color.RED);
mChannel.enableVibration(true);
mNotificationManager.createNotificationChannel(mChannel);
