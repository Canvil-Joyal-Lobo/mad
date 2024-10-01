package com.example.test7;

import android.app.Service;
import android.content.Intent; import android.media.MediaPlayer; import android.os.IBinder;
public class backgroundService extends Service { private MediaPlayer mediaPlayer;
    public IBinder onBind(Intent intent) {
        return null; }
    @Override
    public void onCreate(){
        super.onCreate(); mediaPlayer=MediaPlayer.create(this,R.raw.song); mediaPlayer.setLooping(true);
    }
    @Override
    public int onStartCommand(Intent intent,int flag,int startId){ mediaPlayer.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy(); if(mediaPlayer!=null){
            mediaPlayer.stop();
            mediaPlayer.release(); }
    } }
