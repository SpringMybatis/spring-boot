package com.cetc32.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetc32.spring.boot.dao.ScoreDAO;
import com.cetc32.spring.boot.entity.Score;

@Service
public class ScoreServiceImpl implements ScoreService{

	@Autowired(required=false)
	private ScoreDAO scoreDAO;

	@Override
	public void delete(int id) {
		scoreDAO.delete(id);
	}

	@Override
	public List<Score> getList() {
		return scoreDAO.getList();
	}
	
}
