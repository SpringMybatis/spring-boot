package com.cetc32.spring.boot.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cetc32.spring.boot.entity.Student;

public interface StudentDAO extends CrudRepository<Student, Integer> {

    @Transactional
    @Modifying
    @Query("")
    int updateScoreById(@Param("score") float score, @Param("id") int id);

    @Query("")
    List<Student> getList();

}
