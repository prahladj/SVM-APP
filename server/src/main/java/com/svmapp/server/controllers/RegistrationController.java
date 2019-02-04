package com.svmapp.server.controllers;

import java.util.Collection;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svmapp.model.ApiResponse;
import com.svmapp.model.RegisteredUser;
import com.svmapp.services.RegistrationService;

@RestController
@RequestMapping("/register")
@Repository
public class RegistrationController implements RegistrationService {

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
	public RegisteredUser insert(RegisteredUser entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisteredUser update(RegisteredUser entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse delete(RegisteredUser entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse delete(Collection<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PostMapping(consumes={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Collection<RegisteredUser> get(Map<String, String> query, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		// make a call to service implementation provided in svmapp-repo
		System.out.println("Collection<RegisteredUser> get(Map<String, String> query, int pageNo, int pageSize)");
		return null;
	}

	@Override
	public RegisteredUser get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisteredUser getRegisteredUser(String contactNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
