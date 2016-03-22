package com.example.hcititembanksys;

import com.slidingmenu.lib.SlidingMenu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView jtx=null;//计算机与通信工程学院
	TextView dzx=null;//电子系
	TextView sxy=null;//商学院
	TextView gjj=null;//国际交流
	TextView jdx=null;//机电系
	TextView qcx=null;//汽车系
	TextView dqx=null;//电气系
	TextView shkx=null;//社会科学。。
	TextView jcb=null;//基础部
	TextView cmx=null;//传媒系
	TextView wdl=null;//未登录
	TextView tc=null;//退出

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); 
        setContentView(R.layout.activity_main);
       init();
    }
  public void init(){
	 SlidingMenu  menu=new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        menu.setBehindWidth(600);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setMenu (R.layout.layout_menu) ;
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        jtx=(TextView)findViewById(R.id.jtx);
        jtx.setOnClickListener(new MyOnClickListener());
        dzx=(TextView)findViewById(R.id.dzx);
        dzx.setOnClickListener(new MyOnClickListener());
        sxy=(TextView)findViewById(R.id.sxy);
        sxy.setOnClickListener(new MyOnClickListener());
        dqx=(TextView)findViewById(R.id.dqx);
        dqx.setOnClickListener(new MyOnClickListener());
        qcx=(TextView)findViewById(R.id.qcx);
        qcx.setOnClickListener(new MyOnClickListener());
        jdx=(TextView)findViewById(R.id.jdx);
        jdx.setOnClickListener(new MyOnClickListener());
        jcb=(TextView)findViewById(R.id.jcb);
        jcb.setOnClickListener(new MyOnClickListener());
        wdl=(TextView)findViewById(R.id.wdl);
        wdl.setOnClickListener(new MyOnClickListener());
        tc=(TextView)findViewById(R.id.tc);
        gjj=(TextView)findViewById(R.id.gjj);
        gjj.setOnClickListener(new MyOnClickListener());
        shkx=(TextView)findViewById(R.id.shkx);
        shkx.setOnClickListener(new MyOnClickListener());
        cmx=(TextView)findViewById(R.id.cmx);
        cmx.setOnClickListener(new MyOnClickListener());
}

  class MyOnClickListener implements android.view.View.OnClickListener {
	  @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		  Intent in=new Intent();
		switch(v.getId()){
		case R.id.wdl:
			in.setClass(MainActivity.this, WdlActivity.class);
			startActivity(in);
			break;
		case R.id.jtx:
			in.setClass(MainActivity.this, JtxActivity.class);
			startActivity(in);
			break;
		case R.id.cmx:
			in.setClass(MainActivity.this, CmxActivity.class);
			startActivity(in);
			break;
		case R.id.dqx:
			in.setClass(MainActivity.this, DqxActivity.class);
			startActivity(in);
			break;
		case R.id.dzx :
			in.setClass(MainActivity.this, DzxActivity.class);
			startActivity(in);
			break;
		case R.id.gjj:
			in.setClass(MainActivity.this, GjjActivity.class);
			startActivity(in);
			break;
		case R.id.jcb:
			in.setClass(MainActivity.this, JcbActivity.class);
			startActivity(in);
			break;
		case R.id.jdx:
			in.setClass(MainActivity.this, JdxActivity.class);
			startActivity(in);
			break;
		case R.id.qcx:
			in.setClass(MainActivity.this, QcxActivity.class);
			startActivity(in);
			break;
		case R.id.shkx:
			in.setClass(MainActivity.this, ShkxActivity.class);
			startActivity(in);
			break;
		case R.id.sxy:
			in.setClass(MainActivity.this, SxyActivity.class);
			startActivity(in);
			break;
		}
	}
  }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
