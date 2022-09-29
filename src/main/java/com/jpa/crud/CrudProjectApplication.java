package com.jpa.crud;

//import java.rmi.AccessException;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.crud.dao.UserRepository;
import com.jpa.crud.entities.User;

@SpringBootApplication
public class CrudProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(CrudProjectApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user=new User();
		// Create the Employee detail
		user.setId(2);
		user.setEmpName("Anish kumar");
		
		user.setEmpCity("Patna");
		
		user.setEmpStatus("He is a Java Programmer");
		
		User user1=userRepository.save(user);
		System.out.println(user1);
		
		// get the Employee detail
		
		try {
			Optional<User> u1=userRepository.findById(2);
			System.out.println(u1);
		}catch(Exception e) {
			System.out.println("Id not Found ");
		}
		
		//Update the Employee detail
		try {
		Optional<User> optional=userRepository.findById(2);
		User us4=optional.get();
		us4.setEmpName("Anish Kumar sharma");
		User result=userRepository.save(us4);
		System.out.println(result);
		}catch(Exception e) {
			System.out.println("Id not found");
		}
		
		
		//Delete the Employee detail
		try {
			userRepository.deleteById(1);
			System.out.println("Deleted");
			
		}catch(Exception e){
			System.out.println("Id not found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
