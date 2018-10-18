package com.example.truefalsequiz;

import java.util.List;

public class Quiz extends MainActivity{
    private List<Question> questions;
    private int score;
    private int currentQ;

    public Quiz(List<Question> questions, int score, int currentQ){
        this.questions = questions;
        this.score = score;
        this.currentQ = currentQ;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
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
}
