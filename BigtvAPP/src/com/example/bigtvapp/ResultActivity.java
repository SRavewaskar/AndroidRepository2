package com.example.bigtvapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
 
public class ResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
 
        Bundle b = getIntent().getExtras();
        String[] resultArr = b.getStringArray("selectedItems");
        ListView lv = (ListView) findViewById(R.id.outputList);
 
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, resultArr);
        lv.setAdapter(adapter);
    }
    
    public void EXIT(View v){
    	
    	finish();
    }
}

