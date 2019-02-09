package com.svmapp.repo.db;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import com.svmapp.model.RegisteredUser;
import com.svmapp.services.RegistrationService;

@Repository
@Service
@Transactional
public class RegisterServiceImpl extends EntityServiceImpl<RegisteredUser> implements RegistrationService {
	
	@Resource(name="converters")
	List<RegisteredUser> users = null;

	@Override
	public List<RegisteredUser> getRegisteredUser(String contactNumber) {
		System.out.println(contactNumber+" Contact");
		String sql = "SELECT * FROM registrations where contact_number=:contact_number";
		try (Connection con = sql2o.open()) {
			users = con.createQuery(sql).addParameter("contact_number", "9480861850")
					.executeAndFetch(RegisteredUser.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

}
