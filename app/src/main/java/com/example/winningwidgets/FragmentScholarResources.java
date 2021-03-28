package com.example.winningwidgets;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class FragmentScholarResources extends Fragment {
    Button submit;
    public FragmentScholarResources() {
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
        View rootView= inflater.inflate(R.layout.fragment_scholar_resources, container, false);
        LinearLayout l =(LinearLayout)rootView.findViewById(R.id.scholarResource);
        submit=rootView.findViewById(R.id.btn_sugg);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Submitted",Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}