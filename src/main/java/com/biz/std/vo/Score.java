package com.biz.std.vo;

/**
 * @author serena
 * @date 2017/12/15
 */
public class Score {
    private int subjectId;
    private float score;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Score{");
        sb.append("subjectId=").append(subjectId);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }
}