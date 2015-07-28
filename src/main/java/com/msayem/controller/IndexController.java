package com.msayem.controller;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msayem.entity.User;
import com.msayem.service.UserService;

/**
 * Handles requests for the application.
 * 
 * @author MSAYEM
 * 
 */
@Controller
@RequestMapping(value = { "/", "user"})
public class IndexController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/", "/listUser" }, method = RequestMethod.GET)
	public String indexController(Map<String, Object> map) {

		map.put("user", new User());
		map.put("userList", userService.listUser());

		logger.info("spring-maven-hibernate-crud: Loading listUser.jsp page.");
		return "listUser";
	}

	@RequestMapping("/get/{userId}")
	public String getUser(@PathVariable Long userId, Map<String, Object> map) {

		User user = userService.getUser(userId);

		map.put("user", user);

		logger.info("spring-maven-hibernate-crud: Loading userForm.jsp page.");
		return "userForm";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user, BindingResult result) {

		userService.saveUser(user);

		logger.info("spring-maven-hibernate-crud: Saved Successfully!");
		return "redirect:listUser";
	}

	@RequestMapping("/delete/{userId}")
	public String deleteUser(@PathVariable("userId") Long id) {

		userService.deleteUser(id);

		logger.info("spring-maven-hibernate-crud: Deleted Successfully!");
		return "redirect:/listUser";
	}
}