package xmu.sspo.service;

import java.util.List;

import xmu.sspo.model.User;
import xmu.sspo.model.UserTopic;

public interface UserService {
	/**
	 * 通过用户名获取用户
	 */
	User getUserByName(String username);
	
	//通过用户id获取用户
	User getUserById(int id);
	
	//向数据库插入用户关注的话题
	void insertUserTopic(int user_id, String topic_name, String keywords);
	
	//通过用户id获取该用户关注的所有话题
	List<UserTopic> getUserTopic(int user_id);
	
	//根据id删除用户关注的话题
	void deleteUserTopic(int id);

}
