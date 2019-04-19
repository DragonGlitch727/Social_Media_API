package com.promineotech.SocialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.SocialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>  {

}
