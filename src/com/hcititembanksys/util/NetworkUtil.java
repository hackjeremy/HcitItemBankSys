package com.hcititembanksys.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtil {
	// �ж��ƶ������Ƿ�������
	public static boolean isMobileConnected(Context context) {
		ConnectivityManager manager = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo mobileInfo = manager
				.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
		if (mobileInfo != null && mobileInfo.isConnected()) {
			return true;
		} else {
			return false;
		}
	}

}
