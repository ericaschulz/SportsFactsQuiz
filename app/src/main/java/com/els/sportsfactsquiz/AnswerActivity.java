package com.els.sportsfactsquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AnswerActivity extends AppCompatActivity {

    ImageView mGretzky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);


        mGretzky = (ImageView)findViewById(R.id.mGretzky);



        Picasso.with(this)
                .load(R.drawable.gretzky_rookie)
                .into(mGretzky);
    }
}
