package com.monster.android.linkingactivitiesusingintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class LinkingActivitiesUsingIntentsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
    if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT) //KEYCODE_DPAD_LEFT is a constant. 
    //	if (keyCode == KeyEvent.KEYCODE_BUTTON_A) //int	KEYCODE_BUTTON_A , or B or C or X , Y , Z 
    {
    startActivity(new Intent(LinkingActivitiesUsingIntentsActivity.this,Activity2.class));
    //startActivity(new Intent("com.monster.android.Activity2"));    	
    }
    return false;
    }
	
}



