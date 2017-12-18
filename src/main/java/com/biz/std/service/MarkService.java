package com.biz.std.service;

import com.biz.std.vo.MarkVO;

/**
 * @author serena
 * @date 2017/12/12
 */
public interface MarkService {
    void addScore(int[] subjectId, float[] scores, int studentId);

    void studentAddSubject(MarkVO markVO);

   /* void addSubject(MarkVO markVO);*/
}