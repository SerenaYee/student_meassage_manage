package com.biz.std.service;

import com.biz.std.vo.SubjectVO;

import java.util.List;

/**
 * @author serena
 * @date 2017/12/12
 */
public interface SubjectService {
    void saveSubject(String name);

    List<SubjectVO> getAllSubject();

    void deleteSubject(int id);

    List<SubjectVO> getAllSubjectById(List<Integer> idList);

    void updateSubjectName(int id, String name);

    void addSubject(int studentId, String subjects, String scores);
}