package xmu.sspo.service.impl;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xmu.sspo.dao.UserDao;
import xmu.sspo.model.User;
import xmu.sspo.service.UserService;

@Service
public class UserServicempl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(username);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}
}
