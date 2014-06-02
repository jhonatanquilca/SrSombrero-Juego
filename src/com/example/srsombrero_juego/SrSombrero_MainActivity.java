package com.example.srsombrero_juego;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SrSombrero_MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sr_sombrero__main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sr_sombrero__main, menu);
		return true;
	}

}
