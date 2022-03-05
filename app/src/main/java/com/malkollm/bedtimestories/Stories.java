package com.malkollm.bedtimestories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Stories extends AppCompatActivity {
    private final String[] brands = {"Все", "Избранное", "Веселые", "Добрые",
            "Пираты", "Фантастика"};
    private final int[] images = {R.color.white, R.color.purple_200,
            R.color.purple_500, R.color.black, R.color.purple_700,
            R.color.teal_200, R.color.teal_700, R.color.white};

    RecyclerView recyclerView;
    StoryAdapter storyAdapter;

    @Override
    protected void onStart() {
        super.onStart();
        storyAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        storyAdapter.stopListening();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        recyclerView = (RecyclerView) findViewById(R.id.rvStories);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<StoryModel> options =
                new FirebaseRecyclerOptions.Builder<StoryModel>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("stories"), StoryModel.class)
                .build();

        storyAdapter = new StoryAdapter(options);
        recyclerView.setAdapter(storyAdapter);




        LinearLayout linearLayout = findViewById(R.id.linear1);
        LayoutInflater layoutInflater = LayoutInflater.from(this);

        for (int i = 0; i < brands.length; i++) {
            View view = layoutInflater.inflate(R.layout.item_stories_filter, linearLayout, false);

            ImageButton button = view.findViewById(R.id.iv);
//            button.setBackgroundColor(getResources().getColor(R.color.white));

            TextView tv = view.findViewById(R.id.greeting_tv1);
            tv.setText(brands[i]);

            linearLayout.addView(view);

        }
    }
}