package com.techfiesta.asaanintro.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.techfiesta.asaanintro.R;

public class IntroFragment extends Fragment {

	private final String tag = this.getClass().getSimpleName();
	@SuppressWarnings("unused")
	private static Context thisContext;

	private int position;

	public IntroFragment(int pos) {
		this.position = pos;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(tag, "inside onCreate()");
	}

	public static IntroFragment newInstance(Context context, int pos) {
		thisContext = context;
		return new IntroFragment(pos);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.d(tag, "inside OncreateView()");
		ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.frag_intro, container, false);
		LinearLayout ll = (LinearLayout) rootView.findViewById(R.id.llFragIntro);
		if (position == 1)
			ll.setBackgroundResource(R.drawable.qi1);
		else if (position == 0)
			ll.setBackgroundResource(android.R.color.darker_gray);
		else if (position == 2)
			ll.setBackgroundResource(android.R.color.background_light);
		return rootView;
	}
}