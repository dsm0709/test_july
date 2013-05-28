package com.example.add_food;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button button1;
	private Button button2;
	private ImageView image1;
	private TextView text1;
	@Override 
	protected void onActivityResult(int requestCode,int resultCode,Intent data) { 
	//完成照相后回调用此方法 
	super.onActivityResult(requestCode, resultCode, data); 
	switch (resultCode) { 
	case Activity.RESULT_OK: { 
	Uri uri = data.getData(); 
	Cursor cursor = this.getContentResolver().query(uri, null, 
	null, null, null); 
	cursor.moveToFirst(); 
	cursor.close(); 
	 //Options options = new BitmapFactory.Options(); 
	//options.inJustDecodeBounds = false; 
	 //options.inSampleSize = 10; 
	// Bitmap bitmap = BitmapFactory.decodeFile(imgPath, options); 
	image1.setImageURI(uri);
	} 
	break; 
	case Activity.RESULT_CANCELED:// 取消 
	break; 
	} 
	} 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1=(Button)findViewById(R.id.choosepic);
		image1=(ImageView)findViewById(R.id.foodpic);
		text1=(TextView)findViewById(R.id.add_foodname);
		button1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_PICK, 
						android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);//调用android的图库 
						startActivityForResult(i, 2); 
			

			}
		});
		
	}

	


};
