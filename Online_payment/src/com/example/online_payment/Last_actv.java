package com.example.online_payment;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Last_actv extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.last_actv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.last_actv, menu);
		return true;
	}

}
