package com.example.callingapps;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

			i.setAction("android.intent.action.MUSIC_PLAYER");// Opening Music Player
			startActivity(i);
			break;
			
		case R.id.b7:
			i.setData(Uri.parse("sms:"));// opening SMS messenger
			i.setAction(Intent.ACTION_VIEW);
			startActivity(i);
			break;
			
		case R.id.b8:
			Intent emailIntent = new Intent(Intent.ACTION_SEND); // 3 parameters required 1. Action 2. data 3. type
			emailIntent.setData(Uri.parse("mailto:"));
			String[] to = {""};
			String[] cc = {""};
			emailIntent.putExtra(Intent.EXTRA_EMAIL, to); // Intent.EXTRA_EMAIL is a predefined Key and "to" is its value.
			emailIntent.putExtra(Intent.EXTRA_CC, cc);
			emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Test mail");
			emailIntent.putExtra(Intent.EXTRA_TEXT, "Hi all , Enjoying learning with Rocky sir");
			emailIntent.setType("message/rfc822");

			startActivity(Intent.createChooser(emailIntent, "Email"));


			break;
			
		case R.id.b9:
			i.setClassName("com.google.android.calendar", "com.android.calendar.LaunchActivity");// Opening Calendar
			startActivity(i);
			break;
			
		case R.id.b10:
			// this would work only for HTC and few Samsung phones
			//i.setClassName("com.android.calculator2","com.android.calculator2.Calculator"); // opening Calculator

			ArrayList<HashMap<String,Object>> items =new ArrayList<HashMap<String,Object>>();
			PackageManager pm;
			pm = getPackageManager();
			List<PackageInfo> packs = pm.getInstalledPackages(0);
			for (PackageInfo pi : packs) {
				if( pi.packageName.toString().toLowerCase().contains("calcul")){
					HashMap<String, Object> map = new HashMap<String, Object>();
					map.put("appName", pi.applicationInfo.loadLabel(pm));
					map.put("packageName", pi.packageName);
					items.add(map);
				}
			}
			//and now you can launch calculator application as:

			if(items.size()>=1){
				String packageName = (String) items.get(0).get("packageName");
				i = pm.getLaunchIntentForPackage(packageName);
				if (i != null)
					startActivity(i);
			}
			else{
				// Application not found
			}


			startActivity(i);
			break;
			
		default:
			break;
		}
		
	}
}
