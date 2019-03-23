package com.example.mytour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create a list of Places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.name31), getString(R.string.address31), getString(R.string.phone21),(R.drawable.nf)));
        places.add(new Place(getString(R.string.name32), getString(R.string.address32), getString(R.string.phone21),(R.drawable.macy)));
        places.add(new Place(getString(R.string.name33), getString(R.string.address33), getString(R.string.phone21),(R.drawable.target)));
        places.add(new Place(getString(R.string.name34), getString(R.string.address34), getString(R.string.phone21),(R.drawable.wm)));
        places.add(new Place(getString(R.string.name35), getString(R.string.address35), getString(R.string.phone21),(R.drawable.bb)));



        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById (R.id.list);
        listView.setAdapter(adapter);


        return rootView;

    }
}