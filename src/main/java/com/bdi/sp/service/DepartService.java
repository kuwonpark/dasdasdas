package com.bdi.sp.service;

import java.util.List;

import com.bdi.sp.vo.Depart;

public interface DepartService {
	public List<Depart> DepartList(Depart d);
	public Depart Depart(int dino);
	public int insertDepart(Depart d);
	public int deleteDepart(int dino);
	public int updateDepart(Depart d);
}
