package matestation.android.com.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import matestation.android.com.adapter.MainControlActivityPagerAdapter;

public class MainControlActivity extends AppCompatActivity {

    ViewPager viewPager;
    ImageButton imageButton_posts;
    ImageButton imageButton_contacts;
    ImageButton imageButton_notifications;
    ImageButton imageButton_more;
    LinearLayout layout_posts;
    LinearLayout layout_contacts;
    LinearLayout layout_notifications;
    LinearLayout layout_more;
    TextView textView_posts;
    TextView textView_contacts;
    TextView textView_notifications;
    TextView textView_more;

    private void setTabButtons(int position) {
        switch (position) {
            case 0:
                imageButton_posts.setColorFilter(getResources().getColor(android.R.color.black));
                imageButton_contacts.setColorFilter(getResources().getColor(android.R.color.darker_gray));
                imageButton_notifications.setColorFilter(getResources().getColor(android.R.color.darker_gray));
                imageButton_more.setColorFilter(getResources().getColor(android.R.color.darker_gray));

                textView_posts.setTextColor(getResources().getColor(android.R.color.black));
                textView_contacts.setTextColor(getResources().getColor(android.R.color.darker_gray));
                textView_notifications.setTextColor(getResources().getColor(android.R.color.darker_gray));
                textView_more.setTextColor(getResources().getColor(android.R.color.darker_gray));

                break;
            case 1:
                imageButton_posts.setColorFilter(getResources().getColor(android.R.color.darker_gray));
                imageButton_contacts.setColorFilter(getResources().getColor(android.R.color.black));
                imageButton_notifications.setColorFilter(getResources().getColor(android.R.color.darker_gray));
                imageButton_more.setColorFilter(getResources().getColor(android.R.color.darker_gray));

                textView_posts.setTextColor(getResources().getColor(android.R.color.darker_gray));
                textView_contacts.setTextColor(getResources().getColor(android.R.color.black));
                textView_notifications.setTextColor(getResources().getColor(android.R.color.darker_gray));
                textView_more.setTextColor(getResources().getColor(android.R.color.darker_gray));
                break;
            case 2:
                imageButton_posts.setColorFilter(getResources().getColor(android.R.color.darker_gray));
                imageButton_contacts.setColorFilter(getResources().getColor(android.R.color.darker_gray));
                imageButton_notifications.setColorFilter(getResources().getColor(android.R.color.black));
                imageButton_more.setColorFilter(getResources().getColor(android.R.color.darker_gray));

                textView_posts.setTextColor(getResources().getColor(android.R.color.darker_gray));
                textView_contacts.setTextColor(getResources().getColor(android.R.color.darker_gray));
                textView_notifications.setTextColor(getResources().getColor(android.R.color.black));
                textView_more.setTextColor(getResources().getColor(android.R.color.darker_gray));
                break;
            case 3:
                imageButton_posts.setColorFilter(getResources().getColor(android.R.color.darker_gray));
                imageButton_contacts.setColorFilter(getResources().getColor(android.R.color.darker_gray));
                imageButton_notifications.setColorFilter(getResources().getColor(android.R.color.darker_gray));
                imageButton_more.setColorFilter(getResources().getColor(android.R.color.black));

                textView_posts.setTextColor(getResources().getColor(android.R.color.darker_gray));
                textView_contacts.setTextColor(getResources().getColor(android.R.color.darker_gray));
                textView_notifications.setTextColor(getResources().getColor(android.R.color.darker_gray));
                textView_more.setTextColor(getResources().getColor(android.R.color.black));
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_control);

        viewPager = (ViewPager)findViewById(R.id.post_view_pager);
        MainControlActivityPagerAdapter postsViewActivityPagerAdapter = new MainControlActivityPagerAdapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(postsViewActivityPagerAdapter);

        layout_posts = (LinearLayout)findViewById(R.id.layout_posts);
        layout_contacts = (LinearLayout)findViewById(R.id.layout_contacts);
        layout_notifications = (LinearLayout)findViewById(R.id.layout_notifications);
        layout_more = (LinearLayout)findViewById(R.id.layout_more);

        imageButton_posts = (ImageButton)layout_posts.findViewById(R.id.imageButton_posts);
        imageButton_contacts = (ImageButton)layout_contacts.findViewById(R.id.imageButton_contacts);
        imageButton_notifications = (ImageButton)layout_notifications.findViewById(R.id.imageButton_notifications);
        imageButton_more = (ImageButton)layout_more.findViewById(R.id.imageButton_more);

        textView_posts = (TextView)layout_posts.findViewById(R.id.textView_posts);
        textView_contacts = (TextView)layout_contacts.findViewById(R.id.textView_contacts);
        textView_notifications = (TextView)layout_notifications.findViewById(R.id.textView_notifications);
        textView_more = (TextView)layout_more.findViewById(R.id.textView_more);


        layout_posts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0, true);
            }
        });

        layout_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1, true);
            }
        });

        layout_notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2, true);
            }
        });

        layout_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3, true);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTabButtons(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
