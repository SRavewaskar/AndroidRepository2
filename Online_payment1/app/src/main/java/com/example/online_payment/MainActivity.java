package com.example.online_payment;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
EditText ed1,ed2;
	String s1[],s2[];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);
		s1=getResources().getStringArray(R.array.user);
		s2=getResources().getStringArray(R.array.pass);
	}
	public void Click(View v){
		int count = 0;
		for(int i=0;i<s1.length;i++){
		if(ed1.getText().toString().equals(s1[i])&&ed2.getText().toString().equals(s2[i])){
			++count;
			break;
			}
		}
		if(count>0){
			Intent i=new Intent(MainActivity.this,First_actv.class);
			startActivity(i);
			finish();
		}
		else 
		{
			
			Toast.makeText(getBaseContext(), "Invalid", Toast.LENGTH_LONG).show();
		}
	}

}
