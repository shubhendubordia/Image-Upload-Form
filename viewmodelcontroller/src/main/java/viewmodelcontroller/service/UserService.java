package viewmodelcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import viewmodelcontroller.dao.UserDao;
import viewmodelcontroller.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
}
