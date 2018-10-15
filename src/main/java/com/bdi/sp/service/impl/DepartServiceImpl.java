package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.DepartDAO;
import com.bdi.sp.service.DepartService;

@Service
public class DepartServiceImpl implements DepartService {

	@Autowired
	private DepartDAO ddao;
	
	@Override
	public List<com.bdi.sp.vo.Depart> DepartList(com.bdi.sp.vo.Depart d) {
		// TODO Auto-generated method stub
		return ddao.DepartList(d);
	}

	@Override
	public com.bdi.sp.vo.Depart Depart(int dino) {
		// TODO Auto-generated method stub
		return ddao.Depart(dino);
	}

	@Override
	public int insertDepart(com.bdi.sp.vo.Depart d) {
		// TODO Auto-generated method stub
		return ddao.insertDepart(d);
	}

	@Override
	public int deleteDepart(int dino) {
		// TODO Auto-generated method stub
		return ddao.deleteDepart(dino);
	}

	@Override
	public int updateDepart(com.bdi.sp.vo.Depart d) {
		// TODO Auto-generated method stub
		return ddao.updateDepart(d);
	}

}
