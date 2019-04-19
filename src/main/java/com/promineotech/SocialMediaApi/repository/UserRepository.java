package com.promineotech.SocialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.SocialMediaApi.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
public User findByUsername(String username);
}
