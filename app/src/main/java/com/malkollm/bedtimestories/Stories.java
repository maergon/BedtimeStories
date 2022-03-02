package com.malkollm.bedtimestories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Stories extends AppCompatActivity {
    private final String[] brands = {"Все", "Избранное", "Веселые", "Добрые",
            "Пираты", "Фантастика"};
    private final int[] images = {R.color.white, R.color.purple_200,
            R.color.purple_500, R.color.black, R.color.purple_700,
            R.color.teal_200, R.color.teal_700, R.color.white};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

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