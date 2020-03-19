package com.Movie.MicroServices.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown =true)
public class NewsContents{
	
	private Sources source;
	private String author;
	private String title;
	private String description; 
	private Date publishedAt;
	private String content;
	public NewsContents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsContents(Sources source, String author, String title, String description, Date publishedAt,
			String content) {
		super();
		this.source = source;
		this.author = author;
		this.title = title;
		this.description = description;
		this.publishedAt = publishedAt;
		this.content = content;
	}
	public Sources getSource() {
		return source;
	}
	public void setSource(Sources source) {
		this.source = source;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "NewsContents [source=" + source + ", author=" + author + ", title=" + title + ", description="
				+ description + ", publishedAt=" + publishedAt + ", content=" + content + "]";
	}
	
}