package com.example.websocketdemo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "live_quiz_question", schema = "adaktech_adakq", catalog = "")
public class LiveQuizQuestionEntity {
    private int id;
    private String question;
    private String level;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private int correctAns;
    private Timestamp createdAt;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "question")
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "option_one")
    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    @Basic
    @Column(name = "option_two")
    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    @Basic
    @Column(name = "option_three")
    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    @Basic
    @Column(name = "correct_ans")
    public int getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(int correctAns) {
        this.correctAns = correctAns;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiveQuizQuestionEntity that = (LiveQuizQuestionEntity) o;
        return id == that.id &&
                correctAns == that.correctAns &&
                Objects.equals(question, that.question) &&
                Objects.equals(level, that.level) &&
                Objects.equals(optionOne, that.optionOne) &&
                Objects.equals(optionTwo, that.optionTwo) &&
                Objects.equals(optionThree, that.optionThree) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, level, optionOne, optionTwo, optionThree, correctAns, createdAt);
    }
}
