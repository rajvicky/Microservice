package com.Movie.MicroServices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Movie.MicroServices.Model.User;
import com.Movie.MicroServices.Repository.UserReporistory;
import com.Movie.MicroServices.Repository.UsersRepository;

@RestController
@RequestMapping("/user") 
public class UserController {
	@Autowired
	UserReporistory userRepository;
	
	@GetMapping("/get_user")
	public List<User> GetAllUser()
	{
			return userRepository.findAll();
	}
	
	@PostMapping("/add_user")
	public List<User> AddUser( @RequestBody User user)
	{
		userRepository.save(user);
		return userRepository.findAll();
	}

}
