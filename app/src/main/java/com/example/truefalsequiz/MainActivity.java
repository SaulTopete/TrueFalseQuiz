package com.example.truefalsequiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   private List<Question> questions;

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeQuiz();
    }

    private void initializeQuiz() {
        InputStream XmlFileInputStream = getResources().openRawResource(R.raw.questions); // getting XML

        String jsonString = readTextFile(XmlFileInputStream);

        //create a gson object
        Gson gson = new Gson();
        //read your json file into an array of questions
        Question[] questions =  gson.fromJson(jsonString, Question[].class);
        //convert your array to a list using the Arrays utility class
        List<Question> questionList = Arrays.asList(questions);
        //verify that it read everything properly
        Log.d("WORKING", "onCreate: " + questionList.toString());
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
