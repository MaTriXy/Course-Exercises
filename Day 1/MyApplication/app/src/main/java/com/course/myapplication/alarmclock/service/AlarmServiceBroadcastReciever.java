package com.course.myapplication.alarmclock.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmServiceBroadcastReciever extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d("AlarmSBReciever", "onReceive()");
		Intent serviceIntent = new Intent(context, AlarmService.class);
		context.startService(serviceIntent);
	}

}
