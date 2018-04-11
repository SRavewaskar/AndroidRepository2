package com.monster.android.builtinappsusingintents;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class BuiltInAppsUsingIntentsActivity extends Activity {
Button b1, b2, b3, b4;
int request_Code = 1;
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.main);
//---Web browser button---
b1 = (Button) findViewById(R.id.btn_webbrowser);
b1.setOnClickListener(new OnClickListener()
{
public void onClick(View arg0){  		  
Intent i = new
Intent(Intent.ACTION_VIEW,
Uri.parse("http://www.google.com"));
startActivity(i);
}
});
//---Make calls button---
b2 = (Button) findViewById(R.id.btn_makecalls);
b2.setOnClickListener(new OnClickListener()
{
public void onClick(View arg0){
Intent i = new
Intent(Intent.ACTION_DIAL,
Uri.parse("tel:+91 98 925 44177"));
startActivity(i);
}
});
//---Show Map button---
b3 = (Button) findViewById(R.id.btn_showMap);
b3.setOnClickListener(new OnClickListener()
{
public void onClick(View arg0){
Intent i = new
Intent(Intent.ACTION_VIEW,
Uri.parse("geo:37.827500,-122.481670"));
startActivity(i);
}
});

//---Choose Contact button---
b4 = (Button) findViewById(R.id.btn_chooseContact);
b4.setOnClickListener(new OnClickListener()
{
public void onClick(View arg0){
Intent i = new
Intent(Intent.ACTION_PICK); // incomplete intent object
i.setType(ContactsContract.Contacts.CONTENT_TYPE);
startActivityForResult(i,request_Code);
//startActivity(i);
}
});
}

public void onActivityResult(int requestCode, 
		int resultCode, Intent data)
{
if (requestCode == request_Code)
{
if (resultCode == RESULT_OK)
{
/*Toast.makeText(this,data.getData().toString(),
Toast.LENGTH_LONG).show();*/
Intent i = new Intent( Intent.ACTION_VIEW, 
		Uri.parse(data.getData().toString()));

startActivity(i);  
}
}
}
}