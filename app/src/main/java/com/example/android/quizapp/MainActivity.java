package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final int MAX_COUNT = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        int correctCount = 0;

        correctCount += checkAnswer1();
        correctCount += checkAnswer2();
        correctCount += checkAnswer3();
        correctCount += checkAnswer4();
        correctCount += checkAnswer5();
        correctCount += checkAnswer6();
        correctCount += checkAnswer7();
        correctCount += checkAnswer8();

        Toast.makeText(this, "Correct Answers: " + correctCount + "/" + MAX_COUNT,
                Toast.LENGTH_LONG).show();
    }

    public void reset(View view) {
        // question 1
        ((RadioButton) findViewById(R.id.question_1_rb1)).setChecked(false);
        ((RadioButton) findViewById(R.id.question_1_rb2)).setChecked(false);
        ((RadioButton) findViewById(R.id.question_1_rb3)).setChecked(false);

        // question 2
        ((CheckBox) findViewById(R.id.question_2_chb1)).setChecked(false);
        ((CheckBox) findViewById(R.id.question_2_chb2)).setChecked(false);
        ((CheckBox) findViewById(R.id.question_2_chb3)).setChecked(false);

        // question 3
        ((EditText) findViewById(R.id.question_3_edit)).setText("");

        // question 4
        ((RadioButton) findViewById(R.id.question_4_rb1)).setChecked(false);
        ((RadioButton) findViewById(R.id.question_4_rb2)).setChecked(false);
        ((RadioButton) findViewById(R.id.question_4_rb3)).setChecked(false);

        // question 5
        ((EditText) findViewById(R.id.question_5_edit)).setText("");

        // question 6
        ((CheckBox) findViewById(R.id.question_6_chb1)).setChecked(false);
        ((CheckBox) findViewById(R.id.question_6_chb2)).setChecked(false);
        ((CheckBox) findViewById(R.id.question_6_chb3)).setChecked(false);

        // question 7
        ((RadioButton) findViewById(R.id.question_7_rb1)).setChecked(false);
        ((RadioButton) findViewById(R.id.question_7_rb2)).setChecked(false);
        ((RadioButton) findViewById(R.id.question_7_rb3)).setChecked(false);

        // question 8
        ((CheckBox) findViewById(R.id.question_8_chb1)).setChecked(false);
        ((CheckBox) findViewById(R.id.question_8_chb2)).setChecked(false);
        ((CheckBox) findViewById(R.id.question_8_chb3)).setChecked(false);

    }

    // *****************************************
    // Methods - Answers Checks
    // *****************************************

    private int checkAnswer1() {
        RadioButton rb = findViewById(R.id.question_1_rb3);

        // if/else used because of Control Statements - rubric step
        // other function use ? : operator
        if (rb.isChecked())
            return 1;
        else
            return 0;
    }

    private int checkAnswer2() {
        CheckBox chb1 = findViewById(R.id.question_2_chb1);
        CheckBox chb2 = findViewById(R.id.question_2_chb2);
        CheckBox chb3 = findViewById(R.id.question_2_chb3);

        return !chb1.isChecked() && chb2.isChecked() && chb3.isChecked() ? 1 : 0;
    }

    private int checkAnswer3() {
        EditText editText = findViewById(R.id.question_3_edit);

        return "Paris".equals(editText.getText().toString()) ? 1 : 0;
    }

    private int checkAnswer4() {
        RadioButton rb = findViewById(R.id.question_4_rb2);
        return rb.isChecked() ? 1 : 0;
    }

    private int checkAnswer5() {
        EditText editText = findViewById(R.id.question_5_edit);

        return "Russia".equals(editText.getText().toString()) ? 1 : 0;
    }

    private int checkAnswer6() {
        CheckBox chb1 = findViewById(R.id.question_6_chb1);
        CheckBox chb2 = findViewById(R.id.question_6_chb2);
        CheckBox chb3 = findViewById(R.id.question_6_chb3);

        return chb1.isChecked() && chb2.isChecked() && chb3.isChecked() ? 1 : 0;
    }

    private int checkAnswer7() {
        RadioButton rb = findViewById(R.id.question_7_rb2);
        return rb.isChecked() ? 1 : 0;
    }

    private int checkAnswer8() {
        CheckBox chb1 = findViewById(R.id.question_8_chb1);
        CheckBox chb2 = findViewById(R.id.question_8_chb2);
        CheckBox chb3 = findViewById(R.id.question_8_chb3);

        return chb1.isChecked() && !chb2.isChecked() && chb3.isChecked() ? 1 : 0;
    }

}