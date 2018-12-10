package xmu.sspo.service.impl;

import java.util.List;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xmu.sspo.dao.UserDao;
import xmu.sspo.model.User;
import xmu.sspo.model.UserTopic;
import xmu.sspo.service.UserService;

@Service
public class UserServicempl implements UserService{
	@Autowired
	private UserDao userDao;

	//通过用户名获取用户
	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserByName(username);
	}
	
	//通过用户id获取用户
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

	//向数据库中插入用户关注的话题
	@Override
	public void insertUserTopic(int user_id, String topic_name, String keywords) {
		// TODO Auto-generated method stub
		userDao.insertUserTopic(user_id, topic_name, keywords);
	}
	
	//通过用户id获取该用户关注的所有话题
	public List<UserTopic> getUserTopic(int user_id){
		return userDao.getUserTopic(user_id);
	}
}
