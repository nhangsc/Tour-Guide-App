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
public class VisitFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create a list of Places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.name21), getString(R.string.address21), getString(R.string.phone21),(R.drawable.zoo)));
        places.add(new Place(getString(R.string.name22), getString(R.string.address22), getString(R.string.phone22),(R.drawable.bow)));
        places.add(new Place(getString(R.string.name23), getString(R.string.address23), getString(R.string.phone23),(R.drawable.down)));
        places.add(new Place(getString(R.string.name24), getString(R.string.address24), getString(R.string.phone24),(R.drawable.skate)));
        places.add(new Place(getString(R.string.name25), getString(R.string.address25), getString(R.string.phone25),(R.drawable.blow)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById (R.id.list);
        listView.setAdapter(adapter);

        return rootView;


    }
}