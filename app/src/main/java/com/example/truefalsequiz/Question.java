package com.example.truefalsequiz;

import java.util.List;

public class Question extends MainActivity{
    private String question;
    private boolean answer;

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }

    public Question() {
        super();
    }

    public void checkAnswer(){

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}


