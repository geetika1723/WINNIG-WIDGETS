package com.example.winningwidgets;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FragmentScholarPreparation extends Fragment {



    public FragmentScholarPreparation() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.fragment_scholar_preparation, container, false);
        LinearLayout l=(LinearLayout)rootView.findViewById(R.id.linear);
        TextView link1 = rootView.findViewById(R.id.link1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link2 = rootView.findViewById(R.id.link2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link3 = rootView.findViewById(R.id.link3);
        link3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link4 = rootView.findViewById(R.id.link4);
        link4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link5 = rootView.findViewById(R.id.link5);
        link5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link6 = rootView.findViewById(R.id.link6);
        link6.setMovementMethod(LinkMovementMethod.getInstance());

        return rootView;

    }

}