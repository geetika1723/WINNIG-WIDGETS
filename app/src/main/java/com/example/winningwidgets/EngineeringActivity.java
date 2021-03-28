package com.example.winningwidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

public class EngineeringActivity extends AppCompatActivity {

    Button scholar,internships,placements,mentorships,comp_prgm,open_source,hackthons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
        scholar=findViewById(R.id.btn_scholar);
        scholar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EngineeringActivity.this,com.example.winningwidgets.EngScholarActivity.class));
                finish();
            }
        });
        internships=findViewById(R.id.Intenship);
        internships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EngineeringActivity.this,com.example.winningwidgets.EngInternActivity.class));
                finish();
            }
        });
        placements=findViewById(R.id.Placements);
        placements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EngineeringActivity.this,com.example.winningwidgets.EngPlacementActivity.class));
                finish();
            }
        });
       comp_prgm=findViewById(R.id.CompPrgm);
       comp_prgm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EngineeringActivity.this,com.example.winningwidgets.EngCompPrgmActivity.class));
                finish();
            }
        });
       mentorships=findViewById(R.id.Mentorship);
        mentorships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EngineeringActivity.this,com.example.winningwidgets.EngMentorActivity.class));
                finish();
            }
        });
       open_source=findViewById(R.id.open_source);
        open_source.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EngineeringActivity.this,com.example.winningwidgets.EngOpenSourceActivity.class));
                finish();
            }
        });
        hackthons=findViewById(R.id.Hackthons);
        hackthons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EngineeringActivity.this,com.example.winningwidgets.EngHackhtonsActivity.class));
                finish();
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }
}