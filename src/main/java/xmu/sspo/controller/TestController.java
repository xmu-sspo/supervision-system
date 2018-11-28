package xmu.sspo.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import xmu.sspo.model.NewsList;
import xmu.sspo.model.Topic;
import xmu.sspo.service.NewsService;

@RestController
public class TestController {
	
	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/home")
	public ModelAndView homePage(){
		ModelAndView newView = new ModelAndView("home");
		return newView;
	}
	
	@RequestMapping("/search_result")
	public ModelAndView getSearch() {
		ModelAndView newView = new ModelAndView("search_result");
		NewsList newsList = new NewsList();
    	newsList.setNewsList(newsService.listNews(1));
    	newsList.setTotal(newsService.getNewsCount());
    	newView.addObject("news", newsList);
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
		ArrayList<Topic> topic_list = newsService.getTopicList();
		newView.addObject("topic_list", topic_list);
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
	
	@RequestMapping("/form_validate")
	public ModelAndView getForm_validate() {
		ModelAndView newView = new ModelAndView("form_validate");
		return newView;
	}
	
	@RequestMapping("/form_basic")
	public ModelAndView getForm_basic() {
		ModelAndView newView = new ModelAndView("form_basic");
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
