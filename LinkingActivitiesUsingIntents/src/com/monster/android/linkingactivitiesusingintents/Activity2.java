package com.monster.android.linkingactivitiesusingintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class Activity2 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
}
		
	public boolean onKeyDown(int keyCode, KeyEvent event)
    {
    if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT) //KEYCODE_DPAD_LEFT is a constant. 
    {
   //startActivity(new Intent("com.monster.android.activity3")); // please notice the <intent filter tag> in the manifest file
   startActivity(new Intent(Activity2.this,activity3.class));
    }
    return false;
    }
}