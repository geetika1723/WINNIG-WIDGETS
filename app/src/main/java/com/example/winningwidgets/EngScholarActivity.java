package com.example.winningwidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class EngScholarActivity extends AppCompatActivity {

    ListView list;
    CustomListScholar adapter;
    String scholarship[] = {
            "WE program",
            "DE Shaw ",
            "Adobe India Women in Technology Scholarship",
            " WE program",
            " Grace Hopper Celebration India(GHCI)India Students Scholarship ",
            " Wahid Biryani",
            "Dastarkhwan",
            "Urban Terrace,",
            "The Urban Dhaba",
            "Spice Caves",
            "Vintage Machine",
            "Barbeque Nation",
            "L-14"
    };
    String apply_dates[] = {
            "OPEN :Opens in the month of February",
            "OPEN: Opens in the month of October (5th Semester)",
            "OPEN: Opens in the month of August",
            "OPEN: Opens in the month of February",
            "OPEN: Opens in the month of April",
            " Wahid Biryani",
            "Dastarkhwan",
            "Urban Terrace",
            "The Urban Dhaba",
            "Spice Caves",
            "Vintage Machine",
            "Barbeque Nation",
            "L-14"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_scholar);

        adapter=new CustomListScholar(EngScholarActivity.this,scholarship,apply_dates);

        list=findViewById(R.id.list);
        list.setAdapter(adapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }
}