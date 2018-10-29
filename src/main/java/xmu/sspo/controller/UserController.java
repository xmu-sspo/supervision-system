package xmu.sspo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import xmu.sspo.model.User;
import xmu.sspo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userlogin")
	@ResponseBody
	public User getUserByName(String username) {
		User user = userService.getUserByName(username);
		return user;
	}
	
	@RequestMapping("/getCurrentUserById")
	@ResponseBody
	public User getUserById(int id) {
		User user = userService.getUserById(id);
		return user;
	}
	


}
