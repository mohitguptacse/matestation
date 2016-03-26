package matestation.android.com.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import matestation.android.com.activity.R;

/**
 * Created by mgupta on 20-03-2016.
 */
public class CategoriesViewRecyclerAdapter extends RecyclerView.Adapter<CategoriesViewRecyclerAdapter.ViewHolder> {
    private ArrayList<String> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(View v) {
            super(v);
            //mTextView = v;
            //TextView title = (TextView)v.findViewById(R.id.post_card_view).findViewById(R.id.post_card_text); // title
            //mTextView = title;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CategoriesViewRecyclerAdapter(ArrayList<String> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CategoriesViewRecyclerAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_activity_categories_view, parent, false);

        LinearLayout linearLayout = (LinearLayout)v.findViewById(R.id.category_image);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(parent.getResources().getColor(R.color.amber));
            }
        });
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(CategoriesViewRecyclerAdapter.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //holder.mTextView.setText(mDataset.get(position));

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return 12;//mDataset.size();
    }
}
