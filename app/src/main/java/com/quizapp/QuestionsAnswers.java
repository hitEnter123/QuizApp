package com.quizapp;

public class QuestionsAnswers {
    private int mQuestionId;
    private int mAnswerSelection;
    private String mCorrectAnswer;
    private int mLayoutId;

    public QuestionsAnswers(int questionResourceId, int answerGroup, String correctAnswer, int layoutDisplayed){
        mQuestionId = questionResourceId;
        mAnswerSelection = answerGroup;
        mCorrectAnswer = correctAnswer;
        mLayoutId = layoutDisplayed;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public int getAnswerSelection() {
        return mAnswerSelection;
    }

    public void setAnswerSelection(int answerSelection) {
        mAnswerSelection = answerSelection;
    }

    public String getCorrectAnswer() {
        return mCorrectAnswer;
    }

    public void setCorrectAnswer(String answer) {
        mCorrectAnswer = answer;
    }

    public int getLayoutId() {
        return mLayoutId;
    }

    public void setLayoutId(int layoutId) {
        mLayoutId = layoutId;
    }
}
