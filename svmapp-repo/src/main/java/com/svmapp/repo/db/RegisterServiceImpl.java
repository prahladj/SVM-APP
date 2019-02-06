package com.svmapp.repo.db;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import com.svmapp.model.RegisteredUser;
import com.svmapp.services.RegistrationService;

@Repository
@Service
@Transactional
public class RegisterServiceImpl extends EntityServiceImpl<RegisteredUser> implements RegistrationService {

	private Sql2o sql2o = new Sql2o("jdbc:mysql://localhost:3306/krishna_mantra", "root", "rootadmin");

	@Override
	public RegisteredUser getRegisteredUser(String contactNumber) {
		// TODO Auto-generated method stub
		// connection to database can be achieved from this repo
		String sql = "SELECT * FROM registrations where contact_number=:contact_number";
		RegisteredUser user = null;
		try (Connection con = sql2o.open()) {
			user = con.createQuery(sql).addParameter("contact_number", "9480861850")
					.executeAndFetchFirst(RegisteredUser.class);
		} catch (Exception e) {
		}
		return user;
	}

}
