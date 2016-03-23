package com.hcititembanksys.service;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

public class NetworkStateService extends Service{

	private static final String tag="tag";
	private ConnectivityManager connectivityManager;
    private NetworkInfo mobileNetInfo;
    private NetworkInfo wifiNetInfo;
    public Context mContext;
    private AlertDialog.Builder builder;
    
    private BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            mContext=context;
            connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
            mobileNetInfo=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            wifiNetInfo=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            Log.e("NetworkStateService", "asd");
            if(!mobileNetInfo.isConnected() && !wifiNetInfo.isConnected()){
            	Toast.makeText(mContext, "断网啦", Toast.LENGTH_SHORT).show();
            	showTips();
                Log.e("NetworkStateService", "isCon");

            }else{
            	Toast.makeText(mContext, "网络连接ok", Toast.LENGTH_SHORT).show();
            	
            }
        }
    };
    
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		IntentFilter mFilter = new IntentFilter();
		mFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
		registerReceiver(mReceiver, mFilter);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		unregisterReceiver(mReceiver);
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		return super.onStartCommand(intent, flags, startId);
	}
	
	private void showTips()
    {
//		alert.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
		Log.e("context==null",(mContext==null)+"");
		builder = new AlertDialog.Builder(mContext);
//        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setTitle("没有可用网络");
        builder.setMessage("当前网络不可用，是否设置网络？");
		Log.e("builder","setmessage");

        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // 如果没有网络连接，则进入网络设置界面
            	try {
//            		startActivity(intent);
				} catch (Exception e) {
					// TODO: handle exception
					Log.e("queding - intne", e.toString(),e);
				}
            	
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
 
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad= builder.create();
        ad.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
//        Log.e("builder","create");
//        try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        try {
//            builder.show();
//        	builder.setT
		} catch (Exception e) {
			// TODO: handle exception
//			Log.e("ee-show", e.toString(),e);
		}
//        ad.setCanceledOnTouchOutside(false);
        ad.show();
        Log.e("builder","show");
    }

	
}
