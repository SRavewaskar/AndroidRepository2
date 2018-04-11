package com.monster.android.passingdatausingintentobject;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Activity2 extends Activity {
	
	EditText txt_username;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);

		// Binding Java and XML component
		txt_username=(EditText) findViewById(R.id.txt_username);  
		
	}
	
	
	public void backToMain(View v) 
	{
	Intent data = new Intent();
			
	data.setData(Uri.parse( txt_username.getText().toString())); 
	// we can put data directly also into the Intent, like this :
	// data.putExtra("name" , "ABC");
				 
	// setResult() is optional. default value is RESULT_CANCELED
	// It is a easy way to tell the Rx about the result. 
	setResult(RESULT_OK, data);

	//setResult(RESULT_CANCELED, data);
	// RESULT_FIRST_USER not much used. It means user defined result.
	
	finish();
	}
}
