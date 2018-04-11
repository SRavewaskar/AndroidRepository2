package com.example.passingdatatypes;

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
		
		Bundle b = getIntent().getExtras();
		
		s+= "String value: " +b.getString("string"); // getting string
		
		s+= '\n' +"Int value: " + String.valueOf(b.getInt("int")); // getting int value
		
		s+= '\n' +"Short value: " + String.valueOf(b.getShort("short")); // getting short value
		
		s+= '\n' +"Float value: " + String.valueOf(b.getFloat("float")); // getting float value
		
		s+= '\n' +"Byte value: " + String.valueOf(b.getByte("byte")); // getting byte value
		
		String []str = b.getStringArray("strarray");
		
		s+= '\n' + "String Array: ";
		for(int i=0 ; i<str.length ; i++)
			s+=str[i]+" ";		// getting string array
		
		tv.setText(s);
		
	}
}
