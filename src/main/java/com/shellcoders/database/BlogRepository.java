package com.shellcoders.database;
import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.shellcoders.blog.BlogPost;

public interface BlogRepository extends MongoRepository<BlogPost, String> {

	public BlogPost findByTitle(String title);
	public BlogPost findById(String id);
	public List<BlogPost> findByAuthor(String author);

}

