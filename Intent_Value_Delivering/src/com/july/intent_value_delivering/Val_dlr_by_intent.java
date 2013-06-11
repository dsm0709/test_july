package com.july.intent_value_delivering;

import android.os.Bundle;
import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Val_dlr_by_intent extends Activity {

	private TextView text1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_val_dlr_by_intent);
		text1 = (TextView)findViewById(R.id.textview1);
		Intent i = getIntent();
	    String name = i.getStringExtra("str");
		int tel = i.getIntExtra("num", 0);
		text1.setText("str:"+name+"\nnum:"+tel);
	}


}
