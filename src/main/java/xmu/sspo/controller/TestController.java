package xmu.sspo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.jdbc.StringUtils;

import xmu.sspo.model.NewsList;
import xmu.sspo.service.NewsService;
import xmu.sspo.service.SolrService;
import xmu.sspo.service.UserService;

@RestController
public class TestController {
	
	@Autowired
	private NewsService newsService;
	@Autowired
	private UserService userService;
	@Autowired
	private SolrService solrService;
	
	@RequestMapping("/home")
	public ModelAndView homePage(){
		ModelAndView newView = new ModelAndView("home");
		return newView;
	}
	
	@RequestMapping("/search_result")
	public ModelAndView getSearch(String keywords) {
		ModelAndView newView = new ModelAndView("search_result");
		
		if(!StringUtils.isNullOrEmpty(keywords)) { //检索
			NewsList tmpLists = solrService.getSolrNews(keywords);
			newView.addObject("news", tmpLists);
		} else {
			NewsList newsList = new NewsList();
	    	newsList.setNewsList(newsService.listNews(1));
	    	newsList.setTotal(newsService.getNewsCount());
	    	newView.addObject("news", newsList);
		}		
		return newView;
	}

	@RequestMapping("/index")
	public ModelAndView getIndex() {
		ModelAndView newView = new ModelAndView("index");
		return newView;
	}
	
	@RequestMapping("/topic_list")
	public ModelAndView getTable_basic() {
		ModelAndView newView = new ModelAndView("topic_list");
		return newView;
	}
 	
	@RequestMapping("/chart_line")
	public ModelAndView getChart_line() {
		ModelAndView newView = new ModelAndView("chart_line");
		return newView;
	}
	
	@RequestMapping("/chart_pie")
	public ModelAndView getChart_pie() {
		ModelAndView newView = new ModelAndView("chart_pie");
		return newView;
	}
	
	@RequestMapping("/topic_customization")
	public ModelAndView getForm_validate() {
		ModelAndView newView = new ModelAndView("topic_customization");
		return newView;
	}
	
	@RequestMapping("/topic_of_concern")
	public ModelAndView getForm_basic(){
		ModelAndView newView = new ModelAndView("topic_of_concern");
		return newView;
	}
	
	@RequestMapping("/content")
	public ModelAndView getContent() {
		ModelAndView newView = new ModelAndView("content");
		return newView;
	}
	@RequestMapping("/login")
	public ModelAndView getLogin() {
		ModelAndView newView = new ModelAndView("login");
		return newView;
	}
}
