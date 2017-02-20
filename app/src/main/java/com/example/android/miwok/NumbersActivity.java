package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create an arrayList
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


        LinearLayout nunberlayout = (LinearLayout) findViewById(R.id.activity_numbers);


        for(int index = 0;index < words.size();index++ ){
            TextView wordstext = new TextView(this);


            wordstext.setText(words.get(index));

            nunberlayout.addView(wordstext);
        }



    }
}
