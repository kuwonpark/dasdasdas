package com.bdi.sp.dao.daoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.DepartDAO;

@Repository
public class DepartDAOImpl implements DepartDAO {

	@Autowired
	public SqlSession ss;
	
	@Override
	public List<com.bdi.sp.vo.Depart> DepartList(com.bdi.sp.vo.Depart d) {
		// TODO Auto-generated method stub
		return ss.selectList("com.bdi.sp.DepartMapper.selectDepartList",d);
	}

	@Override
	public com.bdi.sp.vo.Depart Depart(int dino) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.bdi.sp.DepartMapper.selectDepart",dino);
	}

	@Override
	public int insertDepart(com.bdi.sp.vo.Depart d) {
		// TODO Auto-generated method stub
		return ss.insert("com.bdi.sp.DepartMapper.updateDepart",d);
	}

	@Override
	public int deleteDepart(int dino) {
		// TODO Auto-generated method stub
		return ss.delete("com.bdi.sp.DepartMapper.selectDepartList",dino);
	}

	@Override
	public int updateDepart(com.bdi.sp.vo.Depart d) {
		// TODO Auto-generated method stub
		return ss.update("com.bdi.sp.DepartMapper.selectDepartList",d);
	}

}
