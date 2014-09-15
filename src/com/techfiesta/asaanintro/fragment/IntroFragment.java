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

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(tag, "inside onCreate()");
	}

	public static IntroFragment newInstance(int pos) {
		IntroFragment f = new IntroFragment();
		Bundle b = new Bundle();
		b.putInt("pos", pos);
		f.setArguments(b);
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.d(tag, "inside OncreateView()");
		ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.frag_intro, container, false);
		LinearLayout ll = (LinearLayout) rootView.findViewById(R.id.llFragIntro);
		int position = getArguments().getInt("pos");
		Log.d("IntroFragment", "position: " + position);
		if (position == 1)
			ll.setBackgroundResource(R.color.BlueViolet);
		else if (position == 0)
			ll.setBackgroundResource(R.color.Red);
		else if (position == 2)
			ll.setBackgroundResource(R.color.Green);
		return rootView;
	}
}