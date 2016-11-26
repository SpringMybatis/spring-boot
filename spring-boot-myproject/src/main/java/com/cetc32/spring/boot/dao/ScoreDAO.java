package com.cetc32.spring.boot.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cetc32.spring.boot.entity.Score;

public interface ScoreDAO extends CrudRepository<Score, Integer>{
	
	@Transactional
    @Modifying
    @Query("update Score t set t.score = :score where t.id = :id")
    int updateScoreById(@Param("score") float score, @Param("id") int id);

    @Query("select t from Score t ")
    List<Score> getList();
}
