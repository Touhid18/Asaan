package com.techfiesta.asaanintro;

import java.util.ArrayList;

import com.techfiesta.asaanintro.adapter.RestaurentListAdapter;
import com.techfiesta.asaanintro.model.Restaurent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class RestaurentList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rest_list);
		
		ArrayList<Restaurent> restaurentList = new ArrayList<>();
		restaurentList.add(new Restaurent(0, 5, 5, 51, "Restaurent 1", "Janin na", 0.5f, .71f));
		restaurentList.add(new Restaurent(1, 6, 7, 53, "Restaurent 2", "Janin na", 0.6f, .67f));
		
		RestaurentListAdapter adapter=new RestaurentListAdapter(this, R.layout.rest_item, restaurentList);
		ListView lvRestaurent = (ListView) findViewById(R.id.lvRestaurentList);
		lvRestaurent.setAdapter(adapter);
	}

}
