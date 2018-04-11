package com.monster.android.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;


public class ActivityLifecycleActivity extends Activity {
    /** Called when the activity is first created. */
	
	String tag = "Events";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //---hides the title bar---
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        Log.d("Events", "In the onCreate() event");
    }
    
	public void onStart(){
	super.onStart();
	Log.d(tag, "In the onStart() event");
	}
	
	public void onRestart(){
	super.onRestart();
	Log.d(tag, "In the onRestart() event");
	}
	
	public void onResume(){
	super.onResume();
	Log.d(tag, "In the onResume() event");
	}
	
	public void onPause(){
	super.onPause();
	Log.d(tag, "In the onPause() event");
	}
	
	public void onStop(){
	super.onStop();
	Log.d(tag, "In the onStop() event");
	}
	
	public void onDestroy(){
	super.onDestroy();
	Log.d(tag, "In the onDestroy() event");
	}
    
	
	public void callAnotherActivity1(View v)
	{
		//Intent i = new Intent(this,A3.class);
		
		Intent i = new Intent("net.suven.Braindumps.A3");
		
		startActivity(i);
	}
	

}










