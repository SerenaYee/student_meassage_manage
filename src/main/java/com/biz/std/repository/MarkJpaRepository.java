package com.biz.std.repository;

import com.biz.std.model.MarkPO;
import com.biz.std.model.StudentPO;
import com.biz.std.model.SubjectPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author serena
 * @date 2017/12/12
 */
@Repository
public interface MarkJpaRepository extends JpaRepository<MarkPO, Integer> {
    List<MarkPO> findAllByStudentPO(StudentPO studentPO);

    MarkPO findByStudentPOAndAndSubjectPO(StudentPO studentPO, SubjectPO subjectPO);
}