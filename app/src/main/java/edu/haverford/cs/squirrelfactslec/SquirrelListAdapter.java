package edu.haverford.cs.squirrelfactslec;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SquirrelListAdapter extends ArrayAdapter<Squirrel> {
    ArrayList<Squirrel> mSquirrels;

    public SquirrelListAdapter(Context context, ArrayList<Squirrel> squirrels) {
        super(context, 0, squirrels);
        mSquirrels = squirrels;
    }

    @Override
    public View getView(int position, View toFillOut, ViewGroup parent) {
        // Get the data item for this position
        Squirrel squirrel = mSquirrels.get(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (toFillOut == null) {
            toFillOut = LayoutInflater.from(getContext()).inflate(R.layout.squirrel_list_item,
                    parent,
                    false);
        }
        // Lookup view for data population
        TextView name = (TextView) toFillOut.findViewById(R.id.squirrel_name);
        TextView location = (TextView) toFillOut.findViewById(R.id.squirrel_location);

        // Populate the data into the template view using the data object
        name.setText(squirrel.getName());
        location.setText(squirrel.getLocation());

        // Return the completed view to render on screen
        return toFillOut;
    }
}
