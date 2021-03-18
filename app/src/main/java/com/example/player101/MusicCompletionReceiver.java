package com.example.player101;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MusicCompletionReceiver extends BroadcastReceiver {

    com.example.player101.MainActivity mainActivity;

    public MusicCompletionReceiver(){
        //empty constructor
    }

    public MusicCompletionReceiver(com.example.player101.MainActivity mainActivity) {
        this.mainActivity= mainActivity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String musicName= intent.getStringExtra(MusicService.MUSICNAME);
    }
}