package matestation.android.com.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import matestation.android.com.adapter.IntroductionActivityPagerAdapter;

public class IntroductionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        IntroductionActivityPagerAdapter pagerAdapter = new IntroductionActivityPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(pagerAdapter);
    }
}
