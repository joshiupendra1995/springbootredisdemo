package com.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.mapper.IsinMapper;
import com.springboot.app.repository.IsinRepository;
import com.springboot.app.vo.IsinVO;

@Service
public class IsinServiceImpl implements IsinService{

	@Autowired
	IsinRepository isinRepo;
	
	@Autowired
	IsinMapper isinMapper;
	
	@Override
	public List<IsinVO> getAllIsins() {
		return isinMapper.getBOList(isinRepo.findAll());
	}

}
