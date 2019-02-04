package com.svmapp.services;

import com.svmapp.model.RegisteredUser;

public interface RegistrationService extends EntityService<RegisteredUser> {

	RegisteredUser getRegisteredUser(String contactNumber);
}
