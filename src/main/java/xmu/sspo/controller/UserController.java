package xmu.sspo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import xmu.sspo.model.User;
import xmu.sspo.model.UserTopic;
import xmu.sspo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userlogin")
	@ResponseBody
	public User getUserByName(String username, HttpServletRequest request, HttpSession httpSession) {
		User user = userService.getUserByName(username);
		if (user != null) {     
			request.getSession().setAttribute("username",user.getUsername());     //用Session保存用户名
			request.getSession().setAttribute("userId",user.getId());        //保存用户id
			System.out.println(user.getUsername());
	     } 
		return user;
	}
	
	@RequestMapping("/getCurrentUserById")
	@ResponseBody
	public User getUserById(int id) {
		User user = userService.getUserById(id);
		return user;
	}
	
	@RequestMapping("/getUserTopic")
	@ResponseBody
	public List<UserTopic> getUserTopic(HttpServletRequest request){
		int user_id = (int) request.getSession().getAttribute("userId");
		System.out.println(user_id);
		List<UserTopic> userTopics = userService.getUserTopic(user_id);
		for(int i=0;i<userTopics.size();i++)
			System.out.println(userTopics.get(i));
		return userTopics;
	}


}
