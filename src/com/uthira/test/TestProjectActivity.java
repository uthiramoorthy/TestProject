package com.uthira.test;

import android.app.Activity;
import android.os.Bundle;

public class TestProjectActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Eclipse commit
	}

	@Override
	protected void onStart() {
		super.onStart();

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}