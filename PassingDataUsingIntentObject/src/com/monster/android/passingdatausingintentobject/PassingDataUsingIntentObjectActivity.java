package com.monster.android.passingdatausingintentobject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

public class PassingDataUsingIntentObjectActivity 
extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void Click(View v)
	{
			Intent i = new Intent("Activity2");
			// specify the name as given in action
			startActivityForResult(i, 1);  
	}
	
	
	public void onActivityResult(int requestCode, 
								 int resultCode, 
								 Intent data )
	{
		if (requestCode == 1) {
			if (resultCode == RESULT_OK) {
				Toast.makeText(this,data.getData().toString(),
						Toast.LENGTH_LONG).show();
			}
			else
			{
				Toast.makeText(this,"Error Msg",
						Toast.LENGTH_LONG).show();
				
			}
		}
	}
}