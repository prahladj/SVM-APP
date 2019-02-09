package com.svmapp.services;

import java.util.List;

import com.svmapp.model.RegisteredUser;

public interface RegistrationService extends EntityService<RegisteredUser> {

	List<RegisteredUser> getRegisteredUser(String contactNumber);
}
