/**
 * 
 */
package com.techfiesta.asaanintro;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

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

	}

}
