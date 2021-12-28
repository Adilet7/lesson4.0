package com.example.lesson40.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson40.R;
import com.example.lesson40.adapter.RecyclerViewClickListener;

public class SecondActivity extends AppCompatActivity implements RecyclerViewClickListener {
    private static final String TAG = "g";
    TextView playersNick, playersDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        playersNick = findViewById(R.id.players_nick);
        playersDesc = findViewById(R.id.players_desc);
        String name = getIntent().getStringExtra("Player's Name");
        String description = getIntent().getStringExtra("Player's desc");

        playersNick.setText(name);
        playersDesc.setText(description);
    }


    @Override
    public void onNoteClick(int position) {
        Log.d(TAG, "onNoteClick: ");

    }
}
