package matestation.android.com.adapter;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import matestation.android.com.fragment.IntroductionFragment;
import matestation.android.com.activity.R;

/**
 * Created by mgupta on 20-03-2016.
 */
public class IntroductionActivityPagerAdapter extends FragmentPagerAdapter {

    Activity activity;

    public IntroductionActivityPagerAdapter(FragmentManager fm, Activity activity) {
        super(fm); this.activity = activity;
    }

    @Override
    public Fragment getItem(int position) {
        IntroductionFragment fragment;
        switch (position){
            case 0: fragment = new IntroductionFragment();
                fragment.setText("Searching for mates?");
                fragment.setBackground(new ColorDrawable(activity.getResources().getColor(R.color.indigo)));
                fragment.setSkipVisible(View.VISIBLE);
                fragment.setDoneVisible(View.INVISIBLE);
                return fragment;
            case 1: fragment = new IntroductionFragment();
                fragment.setText("Fragment Second");
                fragment.setBackground(new ColorDrawable(activity.getResources().getColor(R.color.deepOrange)));
                fragment.setSkipVisible(View.VISIBLE);
                fragment.setDoneVisible(View.INVISIBLE);
                return fragment;
            case 2: fragment = new IntroductionFragment();
                fragment.setText("Fragment Third");
                fragment.setBackground(new ColorDrawable(activity.getResources().getColor(R.color.green)));
                fragment.setSkipVisible(View.INVISIBLE);
                fragment.setDoneVisible(View.VISIBLE);
                return fragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
