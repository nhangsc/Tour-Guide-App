package com.example.mytour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
*Fragment that displays "EatFragment"
 */
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create a list of Places
        final ArrayList <Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.name11), getString(R.string.address11), getString(R.string.phone11),(R.drawable.macd)));
        places.add(new Place(getString(R.string.name12), getString(R.string.address12), getString(R.string.phone12),(R.drawable.bking)));
        places.add(new Place(getString(R.string.name13), getString(R.string.address13), getString(R.string.phone13),(R.drawable.pizza)));
        places.add(new Place(getString(R.string.name14), getString(R.string.address14), getString(R.string.phone14),(R.drawable.sake)));
        places.add(new Place(getString(R.string.name15), getString(R.string.address15), getString(R.string.phone15),(R.drawable.doan)));



        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
       ListView listView = (ListView) rootView.findViewById (R.id.list);
       listView.setAdapter(adapter);


        return rootView;



    }
}
