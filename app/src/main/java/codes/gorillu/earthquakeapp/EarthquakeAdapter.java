package codes.gorillu.earthquakeapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquake) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquake);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake earthquakeData = getItem(position);

        TextView quakeMagnitude = listItemView.findViewById(R.id.magnitude);
        quakeMagnitude.setText(earthquakeData.getMagnitude());

        TextView quakeLocation = (TextView) listItemView.findViewById(R.id.location);
        quakeLocation.setText(earthquakeData.getLocation());

        TextView quakeDate = (TextView) listItemView.findViewById(R.id.date);
        quakeDate.setText(earthquakeData.getDate());

        return listItemView;
    }
}