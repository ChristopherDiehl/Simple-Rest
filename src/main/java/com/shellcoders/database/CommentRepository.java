package com.shellcoders.database;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.shellcoders.blog.Comment;


public interface CommentRepository extends MongoRepository<Comment, String> {
	public ArrayList<Comment> findByBlogId(String blogId);
	public ArrayList<Comment> findByAuthor(String author);
}
