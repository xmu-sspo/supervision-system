package xmu.sspo.service;

import xmu.sspo.model.User;

public interface UserService {
	/**
	 * 通过用户名获取用户
	 */
	User getUserByName(String username);
	
	User getUserById(int id);
}
