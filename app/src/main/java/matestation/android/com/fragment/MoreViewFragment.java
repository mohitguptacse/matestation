package matestation.android.com.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import matestation.android.com.activity.R;
import matestation.android.com.adapter.MoreViewRecyclerAdapter;
import matestation.android.com.adapter.NotificationsViewRecyclerAdapter;

/**
 * Created by mgupta on 21-03-2016.
 */
public class MoreViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_more_view, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.more_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<String> s = new ArrayList<>();
        recyclerView.setAdapter(new MoreViewRecyclerAdapter(s));
        return rootView;
    }
}