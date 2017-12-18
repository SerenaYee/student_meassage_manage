package com.biz.std.service;

import com.biz.std.vo.StudentVO;
import com.biz.std.vo.SubjectVO;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * @author serena
 * @date 2017/12/12
 */
public interface StudentService {
    void saveStudent(StudentVO studentVO, Integer gradeId, MultipartFile[] myfiles, HttpServletRequest request) throws IOException;

    void updateStudent(StudentVO studentVO, Integer gradeId, Integer oldGradeId, MultipartFile[] myfiles, HttpServletRequest request) throws IOException;

    Page<StudentVO> getOnePage(int curPage, int pageSize);

    void deleteStudent(int id);

    StudentVO getStudentById(int id);

    boolean existsStudent(int id);

    List<SubjectVO> uncheckedSubject(int id);

    int getTotalPage(int pageSize);
}
