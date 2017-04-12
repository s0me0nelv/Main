package com.example.android.balancedrelationshipsquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * It counts the scores.
     */
    public void checkScore(View view) {
        //Question Nr. 1 radio button
        RadioButton true1AnswerOne = (RadioButton) findViewById(R.id.q1a1);
        Boolean is1OneTrue = true1AnswerOne.isChecked();
        if (is1OneTrue) {

        }

        RadioButton true1AnswerTwo = (RadioButton) findViewById(R.id.q1a2);
        Boolean is1TwoTrue = true1AnswerTwo.isChecked();
        if (is1TwoTrue) {

        }

        RadioButton true1AnswerThree = (RadioButton) findViewById(R.id.q1a3);
        Boolean is1ThreeTrue = true1AnswerThree.isChecked();
        if (is1ThreeTrue) {
            score = score + 2;
        }

        RadioButton true1AnswerFour = (RadioButton) findViewById(R.id.q1a4);
        Boolean is1FourTrue = true1AnswerFour.isChecked();
        if (is1FourTrue) {
            score++;
        }

        //Question Nr. 2 radio button
        RadioButton true2AnswerOne = (RadioButton) findViewById(R.id.q2a1);
        Boolean is2OneTrue = true2AnswerOne.isChecked();
        if (is2OneTrue) {

        }

        RadioButton true2AnswerTwo = (RadioButton) findViewById(R.id.q2a2);
        Boolean is2TwoTrue = true2AnswerTwo.isChecked();
        if (is2TwoTrue) {

        }

        RadioButton true2AnswerThree = (RadioButton) findViewById(R.id.q2a3);
        Boolean is2ThreeTrue = true2AnswerThree.isChecked();
        if (is2ThreeTrue) {
            score++;
        }

        RadioButton true2AnswerFour = (RadioButton) findViewById(R.id.q2a4);
        Boolean is2FourTrue = true2AnswerFour.isChecked();
        if (is2FourTrue) {
            score = score + 2;
        }

        //Question Nr. 3 radio button
        RadioButton true3AnswerOne = (RadioButton) findViewById(R.id.q3a1);
        Boolean is3OneTrue = true3AnswerOne.isChecked();
        if (is3OneTrue) {

        }

        RadioButton true3AnswerTwo = (RadioButton) findViewById(R.id.q3a2);
        Boolean is3TwoTrue = true3AnswerTwo.isChecked();
        if (is3TwoTrue) {

        }

        RadioButton true3AnswerThree = (RadioButton) findViewById(R.id.q3a3);
        Boolean is3ThreeTrue = true3AnswerThree.isChecked();
        if (is3ThreeTrue) {
            score++;
        }

        RadioButton true3AnswerFour = (RadioButton) findViewById(R.id.q3a4);
        Boolean is3FourTrue = true3AnswerFour.isChecked();
        if (is3FourTrue) {
            score = score + 2;
        }

        //Question Nr. 4 radio button
        RadioButton true4AnswerOne = (RadioButton) findViewById(R.id.q4a1);
        Boolean is4OneTrue = true4AnswerOne.isChecked();
        if (is4OneTrue) {

        }

        RadioButton true4AnswerTwo = (RadioButton) findViewById(R.id.q4a2);
        Boolean is4TwoTrue = true4AnswerTwo.isChecked();
        if (is4TwoTrue) {

        }

        RadioButton true4AnswerThree = (RadioButton) findViewById(R.id.q4a3);
        Boolean is4ThreeTrue = true4AnswerThree.isChecked();
        if (is4ThreeTrue) {
            score++;
        }

        RadioButton true4AnswerFour = (RadioButton) findViewById(R.id.q4a4);
        Boolean is4FourTrue = true4AnswerFour.isChecked();
        if (is4FourTrue) {
            score = score + 2;
        }

        //Question Nr. 5 radio button
        RadioButton true5AnswerOne = (RadioButton) findViewById(R.id.q5a1);
        Boolean is5OneTrue = true5AnswerOne.isChecked();
        if (is5OneTrue) {

        }

        RadioButton true5AnswerTwo = (RadioButton) findViewById(R.id.q5a2);
        Boolean is5TwoTrue = true5AnswerTwo.isChecked();
        if (is5TwoTrue) {
            score = score + 2;
        }

        RadioButton true5AnswerThree = (RadioButton) findViewById(R.id.q5a3);
        Boolean is5ThreeTrue = true5AnswerThree.isChecked();
        if (is5ThreeTrue) {
            score++;
        }

        RadioButton true5AnswerFour = (RadioButton) findViewById(R.id.q5a4);
        Boolean is5FourTrue = true5AnswerFour.isChecked();
        if (is5FourTrue) {

        }

        //Question Nr. 6 radio button
        RadioButton true6AnswerOne = (RadioButton) findViewById(R.id.q6a1);
        Boolean is6OneTrue = true6AnswerOne.isChecked();
        if (is6OneTrue) {
            score = score + 2;
        }

        RadioButton true6AnswerTwo = (RadioButton) findViewById(R.id.q6a2);
        Boolean is6TwoTrue = true6AnswerTwo.isChecked();
        if (is6TwoTrue) {
            score++;
        }

        RadioButton true6AnswerThree = (RadioButton) findViewById(R.id.q6a3);
        Boolean is6ThreeTrue = true6AnswerThree.isChecked();
        if (is6ThreeTrue) {

        }

        RadioButton true6AnswerFour = (RadioButton) findViewById(R.id.q6a4);
        Boolean is6FourTrue = true6AnswerFour.isChecked();
        if (is6FourTrue) {

        }

        //Question Nr. 7 check box
        CheckBox trueAnswerSeven1 = (CheckBox) findViewById(R.id.trueq7a1);
        Boolean isSeven1True = trueAnswerSeven1.isChecked();
        CheckBox trueAnswerSeven2 = (CheckBox) findViewById(R.id.trueq7a2);
        Boolean isSeven2True = trueAnswerSeven2.isChecked();
        CheckBox trueAnswerSeven3 = (CheckBox) findViewById(R.id.trueq7a3);
        Boolean isSeven3True = trueAnswerSeven3.isChecked();
        CheckBox trueAnswerSeven4 = (CheckBox) findViewById(R.id.trueq7a4);
        Boolean isSeven4True = trueAnswerSeven4.isChecked();
        if (isSeven1True) {
            score++;
        }

        if (isSeven2True) {
            score++;
        }

        if (isSeven3True) {
            score++;
        }

        if (isSeven4True) {
            score++;
        }

        //Question Nr. 8 edit text
        EditText trueAnswerEight = (EditText) findViewById(R.id.q8a1);
        String isEightTrue = trueAnswerEight.getText().toString();
        if (isEightTrue.equals("Love You")) {
            score++;
        }

        //Text of the message after the Check your score button is clicked.
        if (score < 6) {
            Toast.makeText(this, "You scored " + score + " points out of 17. One of you might be caught in so called \"Passion trap\" (search for it in the internet). You both need to work on your relationships to improve the balance.", Toast.LENGTH_LONG).show();
        } else if (score < 12) {
            Toast.makeText(this, "Good!  You scored " + score + " points out of 17! Your relationship probably needs a bit of work to take it from good to great. Search for \"Relationship balance or Passion trap in the internet.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Congratulations!  You scored " + score + " points out of 17! You seem to have a good and balanced relationship with your partner.", Toast.LENGTH_LONG).show();
        }
        score = 0;
    }

}
