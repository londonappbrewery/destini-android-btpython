package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mAnswerTopButton;
    Button mAnswerBottomButton;
    int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = findViewById(R.id.storyTextView);
        mAnswerTopButton = findViewById(R.id.buttonTop);
        mAnswerBottomButton = findViewById(R.id.buttonBottom);
        mStoryIndex = 1;

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswerTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mAnswerTopButton.setText(R.string.T3_Ans1);
                    mAnswerBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if(mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T6_End);
                    mAnswerBottomButton.setVisibility(View.INVISIBLE);
                    mAnswerTopButton.setVisibility(View.INVISIBLE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswerBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mAnswerTopButton.setText(R.string.T2_Ans1);
                    mAnswerBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if (mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    mAnswerBottomButton.setVisibility(View.INVISIBLE);
                    mAnswerTopButton.setVisibility(View.INVISIBLE);
                }
                else if(mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T5_End);
                    mAnswerBottomButton.setVisibility(View.INVISIBLE);
                    mAnswerTopButton.setVisibility(View.INVISIBLE);
                }
            }
        });


    }
}
