package me.dio.santander_api.service;

import me.dio.santander_api.domain.model.User;


public interface UserService {
	User findById(Long id);
	User create(User userToCreate);
}
