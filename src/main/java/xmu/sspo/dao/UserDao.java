package xmu.sspo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xmu.sspo.model.User;
import xmu.sspo.model.UserTopic;

public interface UserDao {
	/**
	 *通过用户名获取用户信息
	 */
	User getUserByName(String username);
	
	//通过用户id获取用户信息
	User getUserById(int id);
	
	//向数据库中插入用户关注的话题
	void insertUserTopic(@Param("user_id")int user_id, @Param("topic_name")String topic_name, @Param("keywords")String keywords);
	
	//通过用户id获取该用户关注的所有话题
	List<UserTopic> getUserTopic(int user_id);
		
	//获取所有用户定制话题
	List<UserTopic> getAllUserTopic();
	
	//根据id删除用户关注的话题
	void deleteUserTopic(int id);
	
	// 更新用户话题相关的新闻
	void updateUserTopic(@Param("id") int id, @Param("news_list") String news_list);
}
