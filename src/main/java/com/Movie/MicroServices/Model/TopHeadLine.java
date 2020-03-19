package com.Movie.MicroServices.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopHeadLine {
	private List<Article> articles;
	

	public TopHeadLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TopHeadLine(List<Article> articles) {
		super();
		this.articles = articles;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
