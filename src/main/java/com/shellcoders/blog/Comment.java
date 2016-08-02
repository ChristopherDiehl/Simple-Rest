package com.shellcoders.blog;

import org.springframework.data.annotation.Id;

public class Comment {
	
	@Id
	private String id;
	
	private String author;
	private String text;
	private String authorIp;
	private String blogId;
	
	public Comment() {
		
	}
	public Comment(String blogId, String author,String text,String authorIp) {
		this.blogId = blogId;
		this.author = author;
		this.text = text;
		this.authorIp = authorIp;
	}
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}
	public String getBlogId() {
		return blogId;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public void setAuthorIp(String authorIp) {
		this.authorIp = authorIp;
	}
	
	public String getAuthorIp() {
		return authorIp;
	}
	
}
