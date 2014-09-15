package com.techfiesta.asaanintro.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.techfiesta.asaanintro.R;
import com.techfiesta.asaanintro.model.Restaurent;

public class RestaurentListAdapter extends ArrayAdapter<Restaurent> {

	private Context tContext;

	public RestaurentListAdapter(Context context, int resource, ArrayList<Restaurent> restaurentList) {
		super(context, resource, restaurentList);
		tContext = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		ViewHolder h = null;
		if (v == null) {
			v = ((LayoutInflater) tContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(
					R.layout.rest_item, parent, false);
			h = new ViewHolder();
			h.tvName = (TextView) v.findViewById(R.id.tvRestaurentName);
			v.setTag(h);
		}else
			h=(ViewHolder) v.getTag();
		h.tvName.setText(getItem(position).getName());

		return v;
	}

	private class ViewHolder {
		TextView tvName;
	}
}
