package com.july.intent_value_delivering;

import com.july.intent_value_delivering.R.id;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.text.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;


public class Val_dlr_by_clipboard extends Activity {
	private TextView text3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_val_dlr_by_clipboard);
		text3 = (TextView)findViewById(R.id.textview4);
		ClipboardManager clipboardManager = (android.text.ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
		String b = clipboardManager.getText().toString();
		text3.setText(b);
		
		
	}

	
	
}
