package com.example.passingdatathroughintents;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class SecondActivity extends Activity {

	String s = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		TextView tv = (TextView) findViewById(R.id.tv);
		
		s += "String value: " + getIntent().getStringExtra("k1"); 
		// getting string value
		
		String [] str = getIntent().getStringArrayExtra("strarray");
		s += '\n' + "String Array: ";
		for(int i=0 ; i<str.length ; i++)
			s += str[i] + " "; // getting string array
		
		s += '\n' + "int value: " + getIntent().
				getIntExtra("int", 1000); 
		
		
		int []intarr = getIntent().getIntArrayExtra("intarr");
		s += '\n' + "int Array: ";
		for(int i=0 ; i<intarr.length ; i++)
			s+= intarr[i] + " "; 		// getting int array
		
		s += '\n' + "Double value: " +getIntent().
				getDoubleExtra("double", 0); 
		// getting double value
		
		s += '\n' + "Float value: " +getIntent().
				getFloatExtra("float", 0); 
		// getting float value
		
		tv.setText(s);
	
	}
}
