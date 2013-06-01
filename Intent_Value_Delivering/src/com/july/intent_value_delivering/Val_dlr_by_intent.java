package com.july.intent_value_delivering;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Val_dlr_by_intent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_val_dlr_by_intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.val_dlr_by_intent, menu);
		return true;
	}

}
