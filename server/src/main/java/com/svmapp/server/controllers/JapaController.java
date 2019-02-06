package com.svmapp.server.controllers;


import java.util.Collection;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svmapp.model.ApiResponse;
import com.svmapp.model.Japaflow;
import com.svmapp.services.JapaService;

@RestController
@RequestMapping("/japa")
public class JapaController  implements JapaService{

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
	public Collection<Japaflow> get(Map<String, String> query, int pageNo, int pageSize) {
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

	@PostMapping(consumes={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Japaflow insertJapadetails(@RequestBody Japaflow japadetails) {
		// TODO Auto-generated method stub
		// make a call to service implementation provided in svmapp-repo
		System.out.println(japadetails.getName());
		return japadetails;
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

}
