package com.july.intent_value_delivering;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Val_dlr_by_static extends Activity {
	
	public static int num;
	public static String str;
	private TextView text2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_val_dlr_by_static);
		text2 = (TextView)findViewById(R.id.textview2);
		text2.setText("str:"+str+"\nnum:"+num);
	}


}
