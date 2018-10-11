package com.bdi.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdi.sp.dao.JapanDAO;
import com.bdi.sp.vo.Japan;

@Controller
public class JapanController {
	
	@Autowired
	private JapanDAO jdao;
	
	@RequestMapping(value="/japans" ,method=RequestMethod.GET)
	public String getjapanList(Model m){
		return "japan/list";
	}
	
	@RequestMapping(value="/japans/{jpnum}" ,method=RequestMethod.GET)
	public @ResponseBody Japan japan(@PathVariable int jpnum) {
		return jdao.getJapan(jpnum);
	}

	

}
