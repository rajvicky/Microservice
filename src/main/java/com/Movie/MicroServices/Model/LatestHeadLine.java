package com.Movie.MicroServices.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class LatestHeadLine {
	private List<NewsContents> articles;

	public LatestHeadLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LatestHeadLine(List<NewsContents> articles) {
		super();
		this.articles = articles;
	}

	public List<NewsContents> getArticles() {
		return articles;
	}

	public void setArticles(List<NewsContents> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "LatestHeadLine [articles=" + articles + "]";
	}
	

}
