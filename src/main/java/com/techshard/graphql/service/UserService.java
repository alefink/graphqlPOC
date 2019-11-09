package com.techshard.graphql.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.techshard.graphql.dao.entity.User;
import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.dao.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository ;

	public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository ;
    }	

    @Transactional
    public User createUser(final String name,final String lastName, 
    		final String nickName, final String pass) {
        final User user  = new User();
        user.setLastName(lastName);
        user.setName(name);
        user.setNickname(nickName);
        user.setPassword(pass);
       
        return this.userRepository.save(user);
    }
    
    
    @Transactional(readOnly = true)
    public Optional<User> getUser(final int id) {
        return this.userRepository.findById(id);
    }
    
    @Transactional(readOnly = true)
    public List<User> getAllUsers(final int count) {
        return this.userRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    
}
