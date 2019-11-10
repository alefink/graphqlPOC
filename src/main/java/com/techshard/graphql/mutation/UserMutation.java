package com.techshard.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.dao.repository.UserRepository;

@Component
public class UserMutation implements GraphQLMutationResolver {

	@Autowired
	private final UserRepository userRepository;
	//private UserService userService;

	public UserMutation(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	public User createUser(final String name, final String lastName, 
             			   final String nickName, String pass) {
		final User user  = new User();
        user.setLastName(lastName);
        user.setName(name);
        user.setNickname(nickName);
        user.setPassword(pass);
       
        return this.userRepository.save(user);
		// probar y si funciona bien eliminar abas lineas y eliminar la clase userService.java.
		//return this.userService.createUser(name, lastName, nickName, pass);
	}
	
	
	
}
