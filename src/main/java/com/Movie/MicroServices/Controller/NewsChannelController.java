package com.Movie.MicroServices.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Movie.MicroServices.Model.AllNewChannels;
import com.Movie.MicroServices.Model.Article;
import com.Movie.MicroServices.Model.NewsChannel;
import com.Movie.MicroServices.Model.TopHeadLine;

@RestController
@RequestMapping("/news-channels") 
public class NewsChannelController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getAllchannels")
	public List<NewsChannel> getChannels(){
		String url="https://newsapi.org/v2/sources?apiKey=9c2de00a77774a728e397e83d739ae63";
		AllNewChannels allnewsChannels=restTemplate.getForObject(url,AllNewChannels.class );
		allnewsChannels.getSources().forEach(System.out::println);
		return allnewsChannels.getSources();	
	}
	@GetMapping("/getenglish-channels/{len}")
	public List<NewsChannel> getLangauageChannels(@PathVariable String len){
		String url="https://newsapi.org/v2/sources?apiKey=9c2de00a77774a728e397e83d739ae63";
		AllNewChannels allnewsChannels=restTemplate.getForObject(url,AllNewChannels.class );
		
		List<NewsChannel> allnewchannelsbyLanguage=allnewsChannels.getSources().stream().
		             filter(newschannel->newschannel.getLanguage().equals(len))
		             .collect(Collectors.toList());
		
		return 	allnewchannelsbyLanguage;
	}
	@GetMapping("/getchannelsbylangaugeandcountry")
	public List<NewsChannel> getLangauageandCountryChannels(@RequestParam String len, @RequestParam String country){
		
		System.out.println("Params "+len+" "+country);
		String url="https://newsapi.org/v2/sources?apiKey=9c2de00a77774a728e397e83d739ae63";
		AllNewChannels allnewsChannels=restTemplate.getForObject(url,AllNewChannels.class );
		
		List<NewsChannel> allnewchannelsbyLanguage=allnewsChannels.getSources().stream().
		             filter(newschannel->newschannel.getLanguage().equals(len) && newschannel.getCountry().equals(country) )
		             .collect(Collectors.toList());
		
		return 	allnewchannelsbyLanguage;
	}

	@GetMapping("/getchannelsbycountry")
	public List<NewsChannel> getCountryChannels( @RequestParam String country){
		
		String url="https://newsapi.org/v2/sources?apiKey=9c2de00a77774a728e397e83d739ae63";
		AllNewChannels allnewsChannels=restTemplate.getForObject(url,AllNewChannels.class );
		
		List<NewsChannel> allnewchannelsbyLanguage=allnewsChannels.getSources().stream().
		             filter(newschannel-> newschannel.getCountry().equals(country) )
		             .collect(Collectors.toList());
		
		return 	allnewchannelsbyLanguage;
	}
	
	@GetMapping("/gettophadlineallcoutries")
	public List<List<Article>> gettophadlineallcoutries(){
		String []arr= {"ae", "ar", "at", "au", "be","bg", "br", "ca", "ch", "cn", 
				"co", "cu", "cz" ,"de" ,"eg", "fr", "gb", "gr", "hk", "hu", "id", "ie", "il", "in", "it", "jp", 
				"kr", "lt", "lv", "ma", "mx", "my", "ng", 
				"nl", "no", "nz", "ph", "pl", "pt", "ro", "rs", "ru", "sa", 
				"se", "sg", "si", "sk" ,"th", "tr", "tw", "ua", "us", "ve", "za"};
		String url;
		List<List<Article>> allTopHeadLineNews=new ArrayList<>();
		for(String cn:arr){
			System.out.println(cn);
		//url="https://newsapi.org/v2/top-headlines?+country="+cn+"&apiKey=9c2de00a77774a728e397e83d739ae63";
		url="https://newsapi.org/v2/top-headlines?country="+cn+"&language=en&apiKey=9c2de00a77774a728e397e83d739ae63";
		TopHeadLine allnewsChannels=restTemplate.getForObject(url,TopHeadLine.class );
		System.out.println(allnewsChannels.getArticles());
		//for(Article ar:allnewsChannels.getArticles())
		//{
			//System.out.println(ar.toString());		}
		//allTopHeadLineNews.add(allnewsChannels.getArticles());
		//}
		List<Article> art= allnewsChannels.getArticles();
	    allTopHeadLineNews.add(art);
		}
		return allTopHeadLineNews;
	}
	
	

}
