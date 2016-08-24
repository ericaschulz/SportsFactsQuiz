package com.els.sportsfactsquiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Athlete[] mAthlete = new Athlete[5];
    Button mBtnTrue;
    Button mBtnFalse;
    TextView mTxtName;
    TextView mTxtSport;
    TextView mTxtAward;
    View.OnClickListener submitAnswer;




    int currentQuestion = 0;
    boolean isTrue;
    boolean isRight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mAthlete[0] = new Athlete("Wayne Gretzky, in his first season, won", "NHL's", " Rookie of the Year Award.", false);
        mAthlete[1] = new Athlete("Dale Earnhardt, ", "a 7-time NASCAR champion", " won multiple Daytona 500 races.", false);
        mAthlete[2] = new Athlete("Nolan Ryan, ", "MLB's all-time strikeout leader, ", "only has 4 Cy Young Awards.", false);
        mAthlete[3] = new Athlete("Michael Jordan", "considered the NBA's 'greatest player', ", " failed to make his high school varsity team.", isTrue);
        mAthlete[4] = new Athlete("Walter Payton, ", "the NFL's leading rusher from 1984-2002, ", "had only one Rushing Title in his career.", isTrue);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        mBtnTrue = (Button) findViewById(R.id.btn_true);
        mBtnFalse = (Button) findViewById(R.id.btn_false);
        mTxtName = (TextView) findViewById(R.id.athlete_name);
//        mTxtSport = (TextView) findViewById(R.id.athlete_sport);
        mTxtAward = (TextView) findViewById(R.id.athlete_award);


        updateQuestionText(mAthlete[currentQuestion]);


        mBtnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer(true, mAthlete[currentQuestion].isTrue);
            }
        });

        mBtnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer(false, mAthlete[currentQuestion].isTrue);
            }
        });
    }

    public void submitAnswer(boolean answer, boolean isTrue) {

        if (isTrue == false && answer == true) {
            // correct answer
            isRight = true;
            changeQuestion();
        } else if (isTrue == true && answer == false) {
            // incorrect answer
            isRight = false;
            changeQuestion();
        }

    }


    public void changeQuestion() {
        if(currentQuestion<mAthlete.length) {
            updateQuestionText(mAthlete[currentQuestion]);
            currentQuestion++;
        }
    }

    public void updateQuestionText(Athlete Athlete) {
        mTxtName.setText(Athlete.getmName());
        mTxtSport.setText(Athlete.getmSport());
        mTxtAward.setText(Athlete.getmAward());


    }
}
