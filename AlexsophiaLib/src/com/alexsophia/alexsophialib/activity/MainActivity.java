package com.alexsophia.alexsophialib.activity;

import com.alexsophia.alexsophialib.util.TextViewBuilder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = null;
		tv.setText(new TextViewBuilder().setText("asdfasdfas")
				.setTextSize(24, true, 0, 4).build());
	}
}
