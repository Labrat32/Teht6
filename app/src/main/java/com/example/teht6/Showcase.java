package com.example.teht6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Showcase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getIntent().getExtras();
        int i = b.getInt(MainActivity.EXTRA, 0);

        setContentView(R.layout.activity_showcase);
        TextView nameView = findViewById(R.id.Name);
        nameView.setText(Singleton.getInstance().getPresident(i).getName());
        TextView startView = findViewById(R.id.Start);
        startView.setText(Singleton.getInstance().getPresident(i).getStart());
        TextView endView = findViewById(R.id.End);
        endView.setText(Singleton.getInstance().getPresident(i).getEnd());
        TextView titleView = findViewById(R.id.Title);
        titleView.setText(Singleton.getInstance().getPresident(i).getTitle());
    }
}