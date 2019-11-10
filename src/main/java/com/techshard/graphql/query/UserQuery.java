package com.techshard.graphql.query;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.dao.repository.UserRepository;

@Component
public class UserQuery implements GraphQLQueryResolver {
	
	//@Autowired
    //private UserService userService;
	@Autowired
	private final UserRepository userRepository;
	
	
	
	public UserQuery(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public Optional<User> getUser(final int id) {
        return this.userRepository.findById(id);
    }

    public List<User> getUsers(final int count) {
        return  this.userRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
}
