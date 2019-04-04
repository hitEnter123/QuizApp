package com.quizapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //TODO 11: Declare constants for progress bar, and member variable for score, also create a dialog when finish

    //TODO 1: Declare member variables for all layouts and link to XML
    //TODO 4: Add an index and question variable to access arraylist's questions
    View mAnswersView;

    CheckBox mCheckBox1;
    CheckBox mCheckBox2;
    CheckBox mCheckBox3;
    CheckBox mCheckBox4;

    RadioButton mRadioButton1;
    RadioButton mRadioButton2;
    RadioButton mRadioButton3;
    RadioButton mRadioButton4;

    Spinner mSpinner;

    Switch mSwitch;

    ToggleButton mToggleButton;

    //TODO 3: Create question bank by uncommenting
//    private QuestionsAnswers[] mQuestionArray = new QuestionsAnswers[]{
//            new QuestionsAnswers(R.string.question_1, R.array.answer_1_array, getApplicationContext().getString(R.string.answer_1_c), R.layout.radio_group_layout),
//            new QuestionsAnswers(R.string.question_2, R.array.answer_2_array, getApplicationContext().getString(R.string.answer_2_a), R.layout.radio_group_layout),
//            new QuestionsAnswers(R.string.question_3, R.array.answer_3_array, getApplicationContext().getString(R.string.answer_3_b), R.layout.toggle_button_layout),
//            new QuestionsAnswers(R.string.question_4, R.array.answer_4_array, getApplicationContext().getString(R.string.answer_4_a), R.layout.toggle_button_layout),
//            new QuestionsAnswers(R.string.question_5, R.array.answer_5_array, getApplicationContext().getString(R.string.answer_5_b), R.layout.toggle_button_layout),
//            new QuestionsAnswers(R.string.question_6, R.array.answer_6_array, getApplicationContext().getString(R.string.answer_6_b), R.layout.check_box_layout),
//            new QuestionsAnswers(R.string.question_7, R.array.answer_7_array, getApplicationContext().getString(R.string.answer_7_a), R.layout.check_box_layout),
//            new QuestionsAnswers(R.string.question_8, R.array.answer_8_array, getApplicationContext().getString(R.string.answer_8_d), R.layout.spinner_layout),
//            new QuestionsAnswers(R.string.question_9, R.array.answer_9_array, getApplicationContext().getString(R.string.answer_9_c), R.layout.spinner_layout),
//            new QuestionsAnswers(R.string.question_10, R.array.answer_10_array, getApplicationContext().getString(R.string.answer_10_a), R.layout.switch_layout),
//            new QuestionsAnswers(R.string.question_11, R.array.answer_11_array, getApplicationContext().getString(R.string.answer_11_b), R.layout.switch_layout),
//            new QuestionsAnswers(R.string.question_12, R.array.answer_12_array, getApplicationContext().getString(R.string.answer_12_a), R.layout.switch_layout),
//            new QuestionsAnswers(R.string.question_13, R.array.answer_13_array, getApplicationContext().getString(R.string.answer_13_a), R.layout.switch_layout)
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1: Link all member variables to XML
//        bindViews();

        //TODO 2: Create constructor and call it here to give all questions an answer
        //TODO 5: Use index to fetch questions and store it in a question and set text, also add onclicklistener

    }

//    private void bindViews() {
//
//        mCheckBox1 = (CheckBox) findViewById(R.id.check_box_1);
//        mCheckBox2 = (CheckBox) findViewById(R.id.check_box_2);
//        mCheckBox3 = (CheckBox) findViewById(R.id.check_box_3);
//        mCheckBox4 = (CheckBox) findViewById(R.id.check_box_4);
//
//        mRadioButton1 = (RadioButton) findViewById(R.id.radio_button_1);
//        mRadioButton2 = (RadioButton) findViewById(R.id.radio_button_2);
//        mRadioButton3 = (RadioButton) findViewById(R.id.radio_button_3);
//        mRadioButton4 = (RadioButton) findViewById(R.id.radio_button_4);
//
//        mSpinner = (Spinner) findViewById(R.id.spinner);
//
//        mSwitch = (Switch) findViewById(R.id.switch_button);
//
//        mToggleButton = (ToggleButton) findViewById(R.id.toggle_button);
//
//    }

    //TODO 6: Create and update question method


    //TODO 7: Uncomment to get updateAnswerView() logic to replce answer view
//    private void updateAnswersView() {
//        ViewGroup parent = (ViewGroup) mAnswersView.getParent();
//        int index = parent.indexOfChild(mAnswersView);
//        parent.removeView(mAnswersView);
//        mAnswersView = getLayoutInflater().inflate(mQuestionsAnswers.getLayoutId(), parent, false);
//        parent.addView(mAnswersView, index);
//        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        params.addRule(RelativeLayout.ABOVE, mSubmitButton.getId());
//        if (mQuestionsAnswers.getLayoutId() == R.layout.toggle_button_layout || mQuestionsAnswers.getLayoutId() == R.layout.switch_layout) {
//            params.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        }
//        mAnswersView.setLayoutParams(params);
//        updateAnswers();
//    }

    //TODO 8: Update answer texts

    //TODO 10: Accessing user selection

    //TODO 9: Check answers

}
