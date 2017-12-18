package com.biz.std.service;

import com.biz.std.vo.GradeVO;

import java.util.List;

/**
 * @author serena
 * @date 2017/12/12
 */
public interface GradeService {
    void saveGrade(String name);

    List<GradeVO> getAllGrade();

    GradeVO getGrade(int id);

    void deleteGrade(int id);

    void updateName(int id, String name);
}
