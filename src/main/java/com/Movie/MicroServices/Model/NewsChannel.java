package com.Movie.MicroServices.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsChannel {
	private String id; 
	private String name;
    private  String url;
	private String category;
	private String language;
	private String country;
	
	
	public NewsChannel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsChannel(String id, String name, String url, String category, String language, String country) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.category = category;
		this.language = language;
		this.country = country;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "NewsChannel [id=" + id + ", name=" + name + ", url=" + url + ", category=" + category + ", language="
				+ language + ", country=" + country + "]";
	}
}
