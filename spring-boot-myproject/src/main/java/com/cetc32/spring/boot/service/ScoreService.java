package com.cetc32.spring.boot.service;

import java.util.List;

import com.cetc32.spring.boot.entity.Score;

public interface ScoreService {

	void delete(int i);

	List<Score> getList();

}
