package com.Movie.MicroServices.Model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
	
	private Sources source;
	private String author;
	private String title;
	private String description;
	private String url;
	private String urlToImage;
	private String publishedAt;
	private String content;
	

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(Sources source, String author, String title, String description, String url, String urlToImage,
			String publishedAt, String content) {
		super();
		this.source = source;
		this.author = author;
		this.title = title;
		this.description = description;
		this.url = url;
		this.urlToImage = urlToImage;
		this.publishedAt = publishedAt;
		this.content = content;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Sources getSource() {
		return source;
	}

	public void setSource(Sources source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "Article [source=" + source + ", author=" + author + ", title=" + title + ", description=" + description
				+ ", url=" + url + ", urlToImage=" + urlToImage + ", publishedAt=" + publishedAt + ", content="
				+ content + "]";
	}

	
}
