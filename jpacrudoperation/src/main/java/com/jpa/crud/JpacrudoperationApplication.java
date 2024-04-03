package com.jpa.crud;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.processing.Find;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.crud.entities.User;
import com.jpa.crud.userrepository.UserRepository;


@SpringBootApplication
public class JpacrudoperationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpacrudoperationApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		//create
//		User user1 = new User("Akash","Java Developer");
//		User user2 = new User("rakesh","Python Developer");
//		User user3 = new User("pooja","NodeJs Developer");
//		User user4 = new User("kriti","React Developer");
//		
//		List<User> list = Arrays.asList(user1,user2,user3,user4);
//		
//		Iterable<User> getAllUser =  userRepository.saveAll(list);
//		
//		getAllUser.forEach(user -> System.out.println(user));
		
		
		//read single user
//		Optional<User> optional = userRepository.findById(4);
//		
//		User user = optional.get();
//		
//		System.out.println(user);
		
		//Find all user
//		Iterable<User> list = userRepository.findAll();
//		list.forEach(user -> System.out.println(user));
		
		//Update Single User
		
//		Optional<User> optional = userRepository.findById(1);
//		User user = optional.get();
//		
//		user.setJobrole("java + react");
//		User userr = userRepository.save(user);
//		System.out.println(userr);
		
		//Update 
		
//		Iterable<User> list = userRepository.findAll();
//		list.forEach(user -> {
//			if(user.getId() == 1) {
//				user.setJobrole("Java Developer");
//				userRepository.save(user);
//			}
//		});
		
		//Delete
//		userRepository.deleteById(4);
//		
//		Iterable<User> list = userRepository.findAll();
//    	list.forEach(user -> System.out.println(user));
		
		//Delete All User
		
//		userRepository.deleteAll();
		
	}
}
