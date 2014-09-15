/**
 * 
 */
package com.techfiesta.asaanintro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

import com.techfiesta.asaanintro.adapter.IntroPagerAdapter;

/**
 * @author Touhid
 * 
 */
public class AsaanIntroLogin extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro_main);

		ViewPager vp = (ViewPager) findViewById(R.id.vpIntro);
		vp.setAdapter(new IntroPagerAdapter(getSupportFragmentManager(), this));
		vp.setCurrentItem(1);
		
		findViewById(R.id.btnLoginFb).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(AsaanIntroLogin.this, Profile.class);
				i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(i);
			}
		});

	}

}
