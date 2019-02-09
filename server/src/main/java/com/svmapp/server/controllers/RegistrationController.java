package com.svmapp.server.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.svmapp.model.ApiResponse;
import com.svmapp.model.RegisteredUser;
import com.svmapp.repo.db.RegisterServiceImpl;
import com.svmapp.services.RegistrationService;

@RestController
@RequestMapping("/register")
public class RegistrationController implements RegistrationService {
	
	@Autowired 
	RegistrationService service;
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

	@PostMapping(path={"/getBookletsbyPhno/"},produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@Override
	public Collection<RegisteredUser> get(@RequestBody Map<String, String> query) {
		// TODO Auto-generated method stub
		service = new RegisterServiceImpl();
		List<RegisteredUser> users = service.getRegisteredUser(query.get("contact_number"));
		return users;
	}

	@GetMapping(path={"/getUserbyPhno/{phno}"},produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@Override
	public RegisteredUser get(@PathVariable String phno) {
		// make a call to service implementation provided in svmapp-repo
		service = new RegisterServiceImpl();
		List<RegisteredUser> users = service.getRegisteredUser(phno);
		return users.get(0);
	}

	@Override
	public List<RegisteredUser> getRegisteredUser(String contactNumber) {
		// TODO Auto-generated method stub
		return null;
	}
}
