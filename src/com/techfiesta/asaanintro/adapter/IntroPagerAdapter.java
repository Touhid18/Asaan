/**
 * 
 */
package com.techfiesta.asaanintro.adapter;

import com.techfiesta.asaanintro.fragment.IntroFragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author Touhid
 * 
 */
public class IntroPagerAdapter extends FragmentPagerAdapter {

	private static Context tContext;
	private static final int NUM_PAGES = 3;
	private final String[] tabNameList = { "ALL NEWS", "BOOKMARKED NEWS" };

	public IntroPagerAdapter(FragmentManager fm, Context ctx) {
		super(fm);
		tContext = ctx;
	}

	@Override
	public int getCount() {
		return NUM_PAGES;
	}

	@Override
	public Fragment getItem(int index) {
		return IntroFragment.newInstance(tContext, index);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		if (position > -1 && position < NUM_PAGES)
			return tabNameList[position];
		return super.getPageTitle(position);
	}

}