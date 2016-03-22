package com.hcititembanksys.activity;

import com.example.hcititembanksys.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.ContextMenu.ContextMenuInfo;

public class CmxActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
    requestWindowFeature(Window.FEATURE_NO_TITLE); 
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_cmx);
}
@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}
}
