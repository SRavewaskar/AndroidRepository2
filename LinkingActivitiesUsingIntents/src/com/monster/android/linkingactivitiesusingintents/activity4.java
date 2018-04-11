package com.monster.android.linkingactivitiesusingintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class activity4 extends Activity {
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity4);
	    }

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	if(keyCode == KeyEvent.KEYCODE_DPAD_CENTER)
	{
	//Intent i = new Intent("com.monster.android.linkingactivitiesusingintents.A5");
		startActivity(new Intent(activity4.this,A5.class));
		//startActivity(i);	
		
	}
		
		return false;
	} 
}
