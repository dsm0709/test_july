package com.july.intent_value_delivering;

import android.R.anim;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.text.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private EditText edit1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button)findViewById(R.id.button1);
		btn2 = (Button)findViewById(R.id.button2);
		btn3 = (Button)findViewById(R.id.button3);
		btn4 = (Button)findViewById(R.id.button4);
		edit1 = (EditText)findViewById(R.id.text1);
	
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Open_otheractivity.class);
				startActivity(intent);
			}
		});
		
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Val_dlr_by_intent.class);
				intent.putExtra("str", "delivering a string by intent.putExtra ");
				intent.putExtra("num", 123);
				startActivity(intent);
				}
		});
		
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			Intent intent = new Intent(MainActivity.this, Val_dlr_by_static.class);
			Val_dlr_by_static.str = "delivering a string by a static variable of  the launched activity ";
			Val_dlr_by_static.num = 123;
			startActivity(intent);
				
			}
		});
		
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ClipboardManager clipboardManager = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
				Toast toast  = Toast.makeText(MainActivity.this, "剪切板中无文本请添加后剪切",Toast.LENGTH_SHORT);
				String a  = clipboardManager.getText().toString();
				if(""==a)
					toast.show();
				else 
				{
					clipboardManager.setText(a);
					Intent intent = new Intent(MainActivity.this, Val_dlr_by_clipboard.class);
					startActivity(intent);
				}
				
			}
		});
	}

}
