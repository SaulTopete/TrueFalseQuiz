package com.example.truefalsequiz;

import android.widget.Button;

import java.util.List;

public class Quiz extends MainActivity{
    private List<Question> questions;
    private int score;
    private int currentQ;

    public Quiz(List<Question> questionList){
        score = 0;
        currentQ = 0;
        questions = questionList;
    }

    public Question getQuestions(){
        return questions.get(currentQ);
    }

    public int getQuizSize(){
        return questions.size();
    }

    public void setQuestions(List<Question> questionList){
        questions = questionList;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCurrentQ() {
        return currentQ;
    }

    public void setCurrentQ(int currentQ) {
        this.currentQ = currentQ;
    }

    public void nextQuestion(){
        currentQ++;
    }

    public boolean isThereAnotherQuestion(){
        if(getCurrentQ() == 10){
            return false;
        }
        else{
            return true;
        }
    }
}
