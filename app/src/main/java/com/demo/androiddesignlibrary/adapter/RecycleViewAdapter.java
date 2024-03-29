package com.demo.androiddesignlibrary.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.androiddesignlibrary.R;

/**
 * Created by Sanjaykumar.M on 17-08-2015.
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>
{
    private static final String TAG = RecycleViewAdapter.class.getSimpleName();

    private String[] mDataset;

    // Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        // each data item is just a string in this case
        public TextView mTextView;

        public ViewHolder(TextView v)
        {
            super(v);
            mTextView = v;
        }

    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RecycleViewAdapter(String[] myDataset)
    {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder((TextView)view);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount()
    {
        Log.d(TAG, "====mDataset.length====" + mDataset.length);
        return mDataset.length;
    }
}
