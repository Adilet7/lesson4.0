package com.example.lesson40.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.lesson40.R;
import com.example.lesson40.adapter.AdapterBook;
import com.example.lesson40.adapter.RecyclerViewClickListener;
import com.example.lesson40.data.BookClient;
import com.example.lesson40.model.BookModel;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements RecyclerViewClickListener {
    RecyclerView recyclerView;
    AdapterBook adapterBook;
    ArrayList<BookModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
    }

    private void initialization() {
        recyclerView = findViewById(R.id.recycler_view);
        list = BookClient.getBook();
        adapterBook = new AdapterBook(list, this);
        recyclerView.setAdapter(adapterBook);
    }

    @Override
    public void onNoteClick(int position) {
        list.get(position);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Player's Name", list.get(position).getName());
        intent.putExtra("Player's desc", list.get(position).getDescription());
        startActivity(intent);
    }
}