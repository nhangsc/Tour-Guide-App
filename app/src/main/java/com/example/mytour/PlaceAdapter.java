package com.example.mytour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Create a new {@link PlaceAdapter} object.
     *  @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID app_textView.
        TextView textView = listItemView.findViewById(R.id.name_textView);
        // Get the carolinas address from the currentPlace object and set this text on
        // the carolinas TextView.
        textView.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the ID default_textView.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_textView);
        // Get the default textView from the currentPlace object and set this text on
        // the default TextView.
        addressTextView.setText(currentPlace.getAddress());

        // Find the TextView in the list_item.xml layout with the ID app_textView.
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_textView);
        // Get the carolinas address from the currentPlace object and set this text on
        // the carolinas TextView.
        phoneTextView.setText(currentPlace.getPhone());
        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}