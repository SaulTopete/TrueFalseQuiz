package com.example.truefalsequiz;

import java.util.List;

public class Question extends MainActivity{
    private String question;
    private boolean answer;

//    @Override
//    public String toString() {
//        return "Question{" +
//                "question='" + question + '\'' +
//                ", answer=" + answer +
//                '}';
//    }

    public Question(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String q) {
        this.question = q;
    }

    public boolean isAnswer() {
        return this.answer;
    }

    public void setAnswer(boolean a) {
        this.answer = a;
    }

    public boolean checkAnswer(boolean userAnswer){
        if(userAnswer == isAnswer()){
            return true;
        }
        else {
            return false;
        }
    }
}


