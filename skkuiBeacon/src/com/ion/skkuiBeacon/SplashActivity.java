package com.ion.skkuiBeacon;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.annotation.SuppressLint;
import android.app.Activity;

@SuppressLint("HandlerLeak")
public class SplashActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Handler handler = new Handler(){
			public void handleMessage(Message msg){
				finish();
			}
		};
		handler.sendEmptyMessageDelayed(0, 3000);
	}
}
