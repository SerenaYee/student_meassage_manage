package com.biz.std.repository;

import com.biz.std.model.GradePO;
import com.biz.std.model.StudentPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author serena
 * @date 2017/12/12
 */
@Repository
public interface StudentJpaRepository extends JpaRepository<StudentPO, Integer> {
    List<StudentPO> findAllByGradePO(GradePO gradePO);

    @Query(nativeQuery = true, value = "select count(1) from student")
    int getCount();
}