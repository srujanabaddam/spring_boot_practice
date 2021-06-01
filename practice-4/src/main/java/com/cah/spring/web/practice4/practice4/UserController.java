package com.cah.spring.web.practice4.practice4;


import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	

	@GetMapping
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId){
			
		User user = userRepository.findById(userId)
				  .orElseThrow(() -> new NoSuchElementException("User not availbele for Id :"+userId));
				
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		
		System.out.println(user); // Just to inspect values for demo
		return userRepository.save(user);
	}

}
