package com.hcititembanksys.activity;

import com.example.hcititembanksys.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TkActivity extends Activity{
	private ImageView shangyt=null;
	private ImageView xiayt=null;
	private ImageView jiexi=null;
	private ImageView topbutton=null;
	private TextView tvjx=null;
	
	
  @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_tk);
	init();
}
  public void init(){
	  shangyt=(ImageView)findViewById(R.id.shangyt);
	  xiayt=(ImageView)findViewById(R.id.xiayt);
	  jiexi=(ImageView)findViewById(R.id.jiexi);
	  topbutton=(ImageView)findViewById(R.id.topButton);
	  tvjx=(TextView)findViewById(R.id.tvjx);
	  tvjx.setVisibility(View.GONE);//View.VISIBLE 显示
	  topbutton.setOnClickListener(new MyOnClickListener());
  }
  class MyOnClickListener implements android.view.View.OnClickListener {

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
		case R.id.topButton:
			TkActivity.this.finish();
			break;
		}
	}
	  
  }
}
