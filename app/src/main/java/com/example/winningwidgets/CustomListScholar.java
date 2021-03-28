package com.example.winningwidgets;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListScholar extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] scholarship;
    private final String[] apply_dates;

    public CustomListScholar(Activity context,String[] scholarship,String[] apply_dates)
    {
        super(context, R.layout.custom_list_scholar, scholarship);
        this.context=context;
        this.scholarship=scholarship;
        this.apply_dates=apply_dates;
    }
    @Override
    public View getView(final int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_list_scholar, null, true);
        TextView txtTitle = rowView.findViewById(R.id.txt);
        TextView txt2Title = rowView.findViewById(R.id.txt1);
        txtTitle.setText(scholarship[position]);
        txt2Title.setText(apply_dates[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ScholarInfoActivity.class);
                intent.putExtra("key_scholar", scholarship[position]);
                context.startActivity(intent);
            }
        });
        return rowView;
    }
}