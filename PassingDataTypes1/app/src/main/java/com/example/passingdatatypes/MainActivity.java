package com.example.passingdatatypes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button) findViewById(R.id.btn);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		
				String str[] = { "Android" , "Windows" , "Iphone" };
				Short s = -32;
				Byte byt = 127;
				
				Bundle b = new Bundle();
			
				b.putString("string", "Android");
				b.putInt("int", 21);
				b.putShort("short", s);
				b.putFloat("float", 3.16f);
				b.putByte("byte", byt);
				b.putStringArray("strarray", str);
				
				Intent i = new Intent(getBaseContext() , 
						SecondActivity.class);
				
				i.putExtras(b);
				
				startActivity(i);
				
			}
		});
		
	}
}
