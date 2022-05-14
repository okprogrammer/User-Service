package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	//fake user list
	
	List<User> list = List.of(
			new User(1311L, "Om Kumar","9657777888"),
			new User(1312L, "Chhaya Tripathi","9765554444"),
			new User(1313L, "Ankit Tiwari","990099999"),
			new User(1314L, "Vishnu Tiwari","888888888")
			);

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
