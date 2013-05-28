package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
 
public class FullscreenActivity extends Activity {
 
	Button button;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen);
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		button = (Button) findViewById(R.id.button1);			//button1
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ksg-leipzig.de/aktuelles-m/articles/aktuelles-m.html"));
			  startActivity(browserIntent);
			}
 
		});
		button = (Button) findViewById(R.id.button2);			//button2 
 		button.setOnClickListener(new OnClickListener() {
 			@Override
			public void onClick(View v) {
 			  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ksg-leipzig.de/aktuelles-m/articles/woche.html"));
			    startActivity(browserIntent);
 			}
 		});
 		button = (Button) findViewById(R.id.button3);			//button3 
 		button.setOnClickListener(new OnClickListener() {
 			@Override
			public void onClick(View v) {
 			  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ksg-leipzig.de/aktuelles-m/articles/imageslider-m.html"));
			    startActivity(browserIntent);
 			}
 		
 		});
 		button = (Button) findViewById(R.id.button4);			//button4 
 		button.setOnClickListener(new OnClickListener() {
 			@Override
			public void onClick(View v) {
 			  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ksg-leipzig.de/aktuelles-m/articles/we.html"));
			    startActivity(browserIntent);
 			}
 		
 		});
	}
	
	
}
