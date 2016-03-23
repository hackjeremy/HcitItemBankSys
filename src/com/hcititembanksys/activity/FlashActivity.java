package com.hcititembanksys.activity;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;

import com.example.hcititembanksys.R;
import com.hcititembanksys.service.NetworkStateService;

public class FlashActivity extends Activity{
	private RelativeLayout rl_splash;
	private AlphaAnimation rl_splash_animotion;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);
		initView();
		Intent netService=new Intent(this,NetworkStateService.class);
		startService(netService);
		
		initAnimation();
		
		sleep();
	}
	
	private void sleep(){
		TimerTask task=new TimerTask(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				loadMainUI();
			}
			
		};
		Timer timer = new Timer();
		timer.schedule(task, 2000);
	}
	
	private void initView(){
		rl_splash=(RelativeLayout) findViewById(R.id.rl_splash);
	}
	
	private void initAnimation(){
		rl_splash_animotion = new AlphaAnimation(0.2f, 1.0f);
		rl_splash_animotion.setDuration(2000);
		rl_splash.startAnimation(rl_splash_animotion);
	}

	private void loadMainUI(){
		Intent intent=new Intent(FlashActivity.this,MainActivity.class);
		startActivity(intent);
		finish();
	}
	
}