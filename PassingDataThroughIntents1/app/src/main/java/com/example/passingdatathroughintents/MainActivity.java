package com.example.passingdatathroughintents;

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
		Button b = (Button) findViewById(R.id.btn);
		
		final String arr[] = {"Android" , "Windows" , "Iphone" };
		final int intarr[] = { 12 , 13 , 14 };
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(getBaseContext(), 
						SecondActivity.class);
				
				i.putExtra("k1", "Android");
				i.putExtra("strarray", arr);
				i.putExtra("int", 22);
				i.putExtra("intarr", intarr);
				i.putExtra("double", 12.23);
				i.putExtra("float", 12.5f);
				
				startActivity(i);
				
			}
		});
		
	}

}
