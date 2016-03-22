package com.hcititembanksys.activity;

import com.example.hcititembanksys.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.ContextMenu.ContextMenuInfo;

public class JtxActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	 requestWindowFeature(Window.FEATURE_NO_TITLE); 
     setContentView(R.layout.activity_jtx);
}
@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}
}
