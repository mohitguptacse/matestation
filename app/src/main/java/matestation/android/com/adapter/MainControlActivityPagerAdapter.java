package matestation.android.com.adapter;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;

import matestation.android.com.activity.R;
import matestation.android.com.fragment.ContactsViewFragment;
import matestation.android.com.fragment.MoreViewFragment;
import matestation.android.com.fragment.NotificationsViewFragment;
import matestation.android.com.fragment.PostsViewFragment;

/**
 * Created by mgupta on 20-03-2016.
 */
public class MainControlActivityPagerAdapter extends FragmentPagerAdapter {

    private static final int POSTS_VIEW_FRAGMENT = 0;
    private static final int CONTACTS_VIEW_FRAGMENT = 1;
    Activity activity;

    public MainControlActivityPagerAdapter(FragmentManager fm, Activity activity) {
        super(fm); this.activity = activity;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case POSTS_VIEW_FRAGMENT: return new PostsViewFragment();
            case CONTACTS_VIEW_FRAGMENT: return new ContactsViewFragment();
            case 2: return new NotificationsViewFragment();
            case 3: return new MoreViewFragment();
        }
        return null;
    }

   /* @Override
    public CharSequence getPageTitle(int position) {
        SpannableStringBuilder sb = new SpannableStringBuilder(" Page #"+ position); // space added before text for convenience

        Drawable myDrawable=null;

        switch (position) {
            case 0:
                myDrawable = activity.getResources().getDrawable(R.drawable.ic_message_black_18dp);
                break;
            case 1:
                myDrawable = activity.getResources().getDrawable(R.drawable.ic_contacts_black_18dp);
                break;
            case 2:
                myDrawable = activity.getResources().getDrawable(R.drawable.ic_event_note_black_18dp);
                break;
            case 3:
                myDrawable = activity.getResources().getDrawable(R.drawable.ic_more_black_18dp);
                break;
        }
        myDrawable.setBounds(0, 0, myDrawable.getIntrinsicWidth(), myDrawable.getIntrinsicHeight());
        ImageSpan span = new ImageSpan(myDrawable, ImageSpan.ALIGN_BASELINE);
        sb.setSpan(span, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sb;
    }*/

    @Override
    public int getCount() {
        return 4;
    }
}
