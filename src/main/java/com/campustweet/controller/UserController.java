package com.campustweet.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.campustweet.model.User;
import com.campustweet.repository.UserRepository;


@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {


private final UserRepository repo;


public UserController(UserRepository repo){

    this.repo = repo;

}


// REGISTER API

@PostMapping("/register")
public User register(@RequestBody User user){

	if(
			!user.getEmail()
			.endsWith("@rbu.edu.in")
			){

			return null;

			}

			return repo.save(user);

}

@GetMapping("/search/{keyword}")
public List<User> search(
@PathVariable String keyword){

return repo
.findByUsernameContaining(keyword);

}

// LOGIN API

@PostMapping("/login")
public String login(@RequestBody User user){


    User existing =
    repo.findByEmail(user.getEmail());


    if(existing != null &&
       existing.getPassword().equals(user.getPassword())){

        return "Login Success";

    }


    return "Invalid User";


}


}