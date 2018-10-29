package xmu.sspo.dao;

import xmu.sspo.model.User;

public interface UserDao {
	/**
	 *通过用户名获取用户信息
	 */
	User getUserByName(String username);
	
	//通过用户id获取用户信息
	User getUserById(int id);
}
