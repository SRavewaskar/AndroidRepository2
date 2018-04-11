package com.monster.android.linkingactivitiesusingintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class activity3 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity3);
}

	
	public boolean onKeyDown(int keyCode, KeyEvent event)
	    {
	    if (keyCode == KeyEvent.KEYCODE_DPAD_UP) //KEYCODE_DPAD_LEFT is a constant. 
	    //	if (keyCode == KeyEvent.KEYCODE_BUTTON_A) //int	KEYCODE_BUTTON_A , or B or C or X , Y , Z 
	    {
	    startActivity(new Intent(activity3.this,activity4.class));
	    //startActivity(new Intent("com.monster.android.activity4"));    	
	    }
	    return false;
	    }
	

}