package com.example.truefalsequiz;

public class Questions {
    private String question;
    private boolean answer;

    @Override
    public String toString() {
        return "Questions{" +
                "question='" + question + '\'' +
                ", answer=" + answer +
                '}';
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
