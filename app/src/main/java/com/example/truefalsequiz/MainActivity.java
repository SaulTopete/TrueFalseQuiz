package com.example.truefalsequiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import org.w3c.dom.Text;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private Button trueButton;
    private Button falseButton;
    private TextView questionDisplay;
    private TextView scoreDisplay;
    private Quiz quiz;

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeQuiz();
        setListeners();
        wireWidgets();
        displayFirstQuestion(quiz);
        Log.d("Quiz", "onCreate: " + "Quiz");
        scoreDisplay.setText(String.valueOf(+quiz.getScore()));
    }

    private void displayFirstQuestion() {
        quiz.setCurrentQ(quiz.getCurrentQ());

    }

    private void setListeners() {
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_main_true:
                        answerQuestion(true);
                }

            }
        });
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_main_false:
                        answerQuestion(false);
                }
            }
        });
    }

    private void answerQuestion(Object p0) {
        if()
    }


    public void initializeQuiz() {
        InputStream XmlFileInputStream = getResources().openRawResource(R.raw.questions); // getting XML

        String jsonString = readTextFile(XmlFileInputStream);

        //create a gson object
        Gson gson = new Gson();
        //read your json file into an array of questions
        Question[] questions =  gson.fromJson(jsonString, Question[].class);
        //convert your array to a list using the Arrays utility class
        List<Question> questionList = Arrays.asList(questions);
        //verify that it read everything properly
        Log.d(TAG, "onCreate: " + questionList.toString());
        quiz = new Quiz();
    }


    private void wireWidgets() {
        trueButton = findViewById(R.id.button_main_true);
        falseButton = findViewById(R.id.button_main_false);
        questionDisplay = findViewById(R.id.textview_main_questions);
        scoreDisplay = findViewById(R.id.textview_main_score);
    }


    public String readTextFile(InputStream inputStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
        }
        return outputStream.toString();
    }



}
