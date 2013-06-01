package com.july.intent_value_delivering;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Open_otheractivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_open_otheractivity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.open_otheractivity, menu);
		return true;
	}

}
