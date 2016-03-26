package matestation.android.com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import matestation.android.com.adapter.CategoriesViewRecyclerAdapter;

public class CategoriesViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_view);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.categories_recycler_view);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        ArrayList<String> s = new ArrayList<>();
        recyclerView.setAdapter(new CategoriesViewRecyclerAdapter(s));

    }
}
