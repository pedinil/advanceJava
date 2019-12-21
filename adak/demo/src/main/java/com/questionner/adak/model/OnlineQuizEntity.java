package com.questionner.adak.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "online_quiz", schema = "adaktech_adakq", catalog = "")
public class OnlineQuizEntity {
    private Integer id;
    private String imageUrl;
    private String question;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
    @Column(name = "option_four")
    public String getOptionFour() {
        return optionFour;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineQuizEntity that = (OnlineQuizEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(question, that.question) &&
                Objects.equals(optionOne, that.optionOne) &&
                Objects.equals(optionTwo, that.optionTwo) &&
                Objects.equals(optionThree, that.optionThree) &&
                Objects.equals(optionFour, that.optionFour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageUrl, question, optionOne, optionTwo, optionThree, optionFour);
    }
}
