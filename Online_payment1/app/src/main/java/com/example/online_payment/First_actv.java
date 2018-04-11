package com.example.online_payment;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class First_actv extends Activity{

	private AutoCompleteTextView actv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_actv);
		String[] banks = getResources().
				   getStringArray(R.array.list);
		
				   ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,banks);


				   actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
				   actv.setAdapter(adapter);
				   
				   
	}
	
	public void Click(View v){
			Intent i=new Intent(First_actv.this,Last_actv.class);
		    startActivity(i);
		    finish();
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first_actv, menu);
		return true;
	}


}
