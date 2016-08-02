package com.shellcoders.blog;

import java.util.*;
import org.springframework.data.annotation.Id;

public class BlogPost {
	@Id
	private String id;
	
	private String post;
	private String author;
	private Date date;
	private String title;
	private ArrayList<Comment> comments;
	public BlogPost() {
		comments = new ArrayList<Comment>();
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
	public String getPost() {
		return post;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public ArrayList<Comment> getComments() {
		return comments;
	}
}
