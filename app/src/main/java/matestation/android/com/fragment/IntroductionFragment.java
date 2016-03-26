package matestation.android.com.fragment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import matestation.android.com.activity.R;
import matestation.android.com.activity.RegistrationActivity;

/**
 * Created by mgupta on 20-03-2016.
 */
public class IntroductionFragment extends Fragment {

    String text;
    Drawable background;
    int skipVisibility;
    int doneVisibility;

    public void setText(String text)
    {
        this.text = text;
    }
    public void setBackground(Drawable background){ this.background = background;}
    public void setSkipVisible(int visibility) {
        skipVisibility = visibility;
    }
    public void setDoneVisible(int visibility) {
        doneVisibility = visibility;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_introduction, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.tv_intro_fragment_title);
        textView.setText(text);

        View backView = rootView.findViewById(R.id.backView);
        backView.setBackground(background);

        Button button = (Button) rootView.findViewById(R.id.button_intro_skip);
        button.setVisibility(skipVisibility);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegistrationActivity.class);
                startActivity(intent);
            }
        });

        button = (Button) rootView.findViewById(R.id.button_intro_done);
        button.setVisibility(doneVisibility);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
