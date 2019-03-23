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
public class StayFragment extends Fragment {

    public StayFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create a list of Places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.name41), getString(R.string.address41), getString(R.string.phone41),(R.drawable.ht)));
        places.add(new Place(getString(R.string.name42), getString(R.string.address42), getString(R.string.phone42),(R.drawable.grand)));
        places.add(new Place(getString(R.string.name43), getString(R.string.address43), getString(R.string.phone43),(R.drawable.motel)));
        places.add(new Place(getString(R.string.name44), getString(R.string.address44), getString(R.string.phone44),(R.drawable.sheraton)));
        places.add(new Place(getString(R.string.name45), getString(R.string.address45), getString(R.string.phone45),(R.drawable.homestay)));



        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById (R.id.list);
        listView.setAdapter(adapter);


        return rootView;

    }
}