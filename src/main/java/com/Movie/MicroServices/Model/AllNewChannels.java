package com.Movie.MicroServices.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllNewChannels {
	
	public AllNewChannels() {
		super();
		// TODO Auto-generated constructor stub
	}

	private List<NewsChannel> sources;

	public List<NewsChannel> getSources() {
		return sources;
	}

	public void setSources(List<NewsChannel> sources) {
		this.sources = sources;
	}

}
