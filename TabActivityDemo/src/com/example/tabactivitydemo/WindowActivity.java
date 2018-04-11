package com.example.tabactivitydemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class WindowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textview = new TextView(this);
        textview.setText("This is Windows tab");
        setContentView(textview);
	}


}
