package com.svmapp.server.controllers;


import java.sql.Date;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svmapp.model.ApiResponse;
import com.svmapp.model.Japaflow;
import com.svmapp.model.ResponseModel;
import com.svmapp.repo.db.JapaServiceImpl;
import com.svmapp.services.JapaService;

@RestController
@RequestMapping("/japa")
public class JapaController implements JapaService{

	@Autowired
	JapaService japaService;
	
	@Override
	public ApiResponse setState(String entityId, String state, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse activate(String entityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse deActivate(String entityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Japaflow insert(Japaflow entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Japaflow update(Japaflow entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse delete(Japaflow entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse delete(Collection<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Japaflow> get(Map<String, String> query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Japaflow get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Japaflow getCount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping(path={"/updateJapaCount/"},produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@Override
	public ResponseModel insertJapadetails(@RequestBody Japaflow japadetails) {
		// TODO Auto-generated method stub
		// make a call to service implementation provided in svmapp-repo
//		System.out.println(japadetails.getName());
		japaService = new JapaServiceImpl();
		ResponseModel model = japaService.insertJapadetails(japadetails);
		return model;
	}

	@Override
	public Japaflow updateJapadetails(Japaflow japadetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse deleteJapadetails(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Japaflow getJapaDetails(Date date, String booklet_language, String booklet_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
