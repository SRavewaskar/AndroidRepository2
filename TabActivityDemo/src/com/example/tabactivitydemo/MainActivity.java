package com.example.tabactivitydemo;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
 
public class MainActivity extends TabActivity {
 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 
		Resources ressources = getResources(); 
		TabHost tabHost = getTabHost(); 
 
		// Android tab
		//Intent intentAndroid = new Intent().setClass(this, AndroidActivity.class);
		Intent intentAndroid = new Intent(MainActivity.this, AndroidActivity.class);
		TabSpec tabSpecAndroid = tabHost
		  .newTabSpec("Android")
		  .setIndicator("", ressources.getDrawable(R.drawable.android_logo_config))
		  .setContent(intentAndroid);
 
		// Apple tab
		//Intent intentApple = new Intent().setClass(this, AppleActivity.class);
		Intent intentApple = new Intent(MainActivity.this, AppleActivity.class);
		TabSpec tabSpecApple = tabHost
		  .newTabSpec("Apple")
		  .setIndicator("", ressources.getDrawable(R.drawable.icon_apple_config))
		  .setContent(intentApple);
 
		//Window Tab
		Intent intentWindow = new Intent().setClass(this, WindowActivity.class);
		TabSpec tabSpecWindow = tabHost
		  .newTabSpec("Windows 8")
		  .setIndicator("", ressources.getDrawable(R.drawable.windows_config))
		  .setContent(intentWindow);
		
				// add all tabs 
		tabHost.addTab(tabSpecAndroid);
		tabHost.addTab(tabSpecApple);
		tabHost.addTab(tabSpecWindow);
 
		//set Android tab as default (zero based)
		tabHost.setCurrentTab(0);
	}
 
}





