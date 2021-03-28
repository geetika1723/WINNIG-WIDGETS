package com.example.winningwidgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ScholarInfoActivity extends AppCompatActivity {

    public static final String TAG="DataBase";
    public String title;
    private TextView t1,t2,t3,t4,t5,t6,t7,t8;
    Button more;
    DatabaseReference myref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholar_info);

        Bundle bundle =getIntent().getExtras();
        title=bundle.getString("key_scholar");
        Toast.makeText(this, title, Toast.LENGTH_SHORT).show();

        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference ref =database.getReference("subject");
        myref = ref.child("engineering").child("scholarships").child(title);

        t1=findViewById(R.id.name);
        t2=findViewById(R.id.organizations);
        t3=findViewById(R.id.eligibility);
        t4=findViewById(R.id.stream);
        t5=findViewById(R.id.grades);
        t6=findViewById(R.id.Description);
        t7=findViewById(R.id.website);
        t8=findViewById(R.id.applications);

        more=findViewById(R.id.btn_more);


        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                DetailScholar temp= snapshot.getValue(DetailScholar.class);

                t1.setText(temp.title);
                t2.setText(temp.organisations);
                t3.setText(temp.eligibility);
                t4.setText(temp.stream);
                t5.setText(temp.grades);
                t6.setText(temp.description);
                t7.setText(temp.website);
                t8.setText(temp.application);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG,"Failed to read the value",error.toException());
                Toast.makeText(ScholarInfoActivity.this, "Failed To load post", Toast.LENGTH_SHORT).show();
            }
        });
        t7.setMovementMethod(LinkMovementMethod.getInstance());
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScholarInfoActivity.this,Scholar_More_Details.class));
                finish();
            }
        });
    }
}