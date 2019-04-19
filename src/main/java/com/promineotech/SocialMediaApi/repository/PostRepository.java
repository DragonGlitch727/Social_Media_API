package com.promineotech.SocialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.SocialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
