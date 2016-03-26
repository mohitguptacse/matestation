package matestation.android.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import matestation.android.com.activity.CreatePostActivity;
import matestation.android.com.activity.R;
import matestation.android.com.adapter.PostsViewRecyclerAdapter;

/**
 * Created by mgupta on 20-03-2016.
 */
public class PostsViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_post_view, container, false);

        CardView cardView = (CardView)rootView.findViewById(R.id.create_post_view);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CreatePostActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.postfeed_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<String> s = new ArrayList<>();
        recyclerView.setAdapter(new PostsViewRecyclerAdapter(s));
        return rootView;
    }
}
