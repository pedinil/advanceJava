package com.questionner.adak.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "online_quiz_answer", schema = "adaktech_adakq", catalog = "")
public class OnlineQuizAnswerEntity {
    private Integer id;
    private Integer answerNum;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "answer_num")
    public Integer getAnswerNum() {
        return answerNum;
    }

    public void setAnswerNum(Integer answerNum) {
        this.answerNum = answerNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineQuizAnswerEntity that = (OnlineQuizAnswerEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(answerNum, that.answerNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, answerNum);
    }
}
