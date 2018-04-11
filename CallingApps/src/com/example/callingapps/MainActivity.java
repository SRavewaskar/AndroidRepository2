package com.example.callingapps;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b1 = (Button) findViewById(R.id.b1);
		Button b2 = (Button) findViewById(R.id.b2);
		Button b3 = (Button) findViewById(R.id.b3);
		Button b4 = (Button) findViewById(R.id.b4);
		Button b5 = (Button) findViewById(R.id.b5);
		Button b6 = (Button) findViewById(R.id.b6);
		Button b7 = (Button) findViewById(R.id.b7);
		Button b8 = (Button) findViewById(R.id.b8);
		Button b9 = (Button) findViewById(R.id.b9);
		Button b10 = (Button) findViewById(R.id.b10);
	
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		b10.setOnClickListener(this);
	
	}

	
	public void onClick(View v) {
		
		Intent i = new Intent();
		switch (v.getId()) {
		
		case R.id.b1:
			i.setData(Uri.parse("tel:9892544177")); // calling 
			i.setAction(Intent.ACTION_DIAL);
			startActivity(i);
			break;

		case R.id.b2:
			i.setData(Uri.parse("http://www.google.com")); // opening browser
			i.setAction(Intent.ACTION_VIEW);
			startActivity(i);
			break;
			
		case R.id.b3:
			i.setData(Uri.parse("geo:19.049496, 72.891398")); // opening maps
			i.setAction(Intent.ACTION_VIEW);
			startActivity(i);
			break;
			
		case R.id.b4:
			i.setData(ContactsContract.Contacts.CONTENT_URI); // opening Contacts
			i.setAction(Intent.ACTION_VIEW);
			startActivity(i);
			break;
			
		case R.id.b5:
			i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);// opening Camera
			startActivity(i);
			break;
			
		case R.id.b6:
			//i.setAction(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
			i.setAction("android.intent.action.MUSIC_PLAYER");// Opening Music Player
			
			/*
			 Intent i1;
			 
			if(android.os.Build.VERSION.SDK_INT >= 15){
				i1 = Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, Intent.CATEGORY_APP_MUSIC);  
				i1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		}
			else
				i1 = new Intent("android.intent.action.MUSIC_PLAYER");
				startActivity(i1);
			*/
			startActivity(i);
			break;
			
		case R.id.b7:
			i.setData(Uri.parse("sms:"));// opening SMS messenger
			i.setAction(Intent.ACTION_VIEW);
			startActivity(i);
			break;
			
		case R.id.b8:
			i.setData(Uri.parse("test@gmail.com")); // opening Gmail app
			i.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
			i.putExtra(Intent.EXTRA_SUBJECT, "Test");
			i.putExtra(Intent.EXTRA_TEXT, "This is a test message");
			startActivity(i);
			break;
			
		case R.id.b9:
			i.setClassName("com.google.android.calendar", "com.android.calendar.LaunchActivity");// Opening Calendar
			startActivity(i);
			break;
			
		case R.id.b10:
			i.setClassName("com.android.calculator2","com.android.calculator2.Calculator"); // opening Calculator
			startActivity(i);
			break;
			
		default:
			break;
		}
		
	}
}
