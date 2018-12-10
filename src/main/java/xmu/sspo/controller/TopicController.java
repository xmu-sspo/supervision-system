package xmu.sspo.controller;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.NestedCheckedException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import xmu.sspo.model.News;
import xmu.sspo.model.NewsList;
import xmu.sspo.model.Topic;
import xmu.sspo.service.NewsService;


@RestController
public class TopicController {
	
	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/getNewsList")
	@ResponseBody
	public List<News> getNewsList(String str)throws IOException{
		String[] strarr = str.split(",");
		List<String> newsList_Str = Arrays.asList(strarr);
		ArrayList<Integer> newsList = new ArrayList<Integer>() ;
    	for(int j=0; j<newsList_Str.size(); j++) {
    		newsList.add(new Integer(newsList_Str.get(j)));
    	}  	
		return newsService.getNewsListByIdList(newsList);		
	}
	
	@RequestMapping("/getAllNews")
    @ResponseBody
    private NewsList listNews(int page) {
		NewsList newsList = new NewsList();
    	newsList.setNewsList(newsService.listNews(page));
    	newsList.setTotal(newsService.getNewsCount());
    	return newsList;
    	
    }
	
	@RequestMapping("/getOneNews")
	@ResponseBody
	private News getOneNews(Long id) {
		News news = newsService.get(id);
		return news;	
	}
	
	@RequestMapping("/add_user_topic")
	private void addUserTopic(@RequestParam String topic_name, String keywords) {
		System.out.println(topic_name);
		System.out.println(keywords);
	}
	
	@RequestMapping("/cycle_topic")
	private Map<String, Object> listTopicCyclely(@RequestParam String cycle_name) {
		Map<String, String> cycle = new HashMap<String, String>();
		cycle.put("cycle", cycle_name);
		List<Topic> topicList = newsService.listTopicCyclely(cycle);
		Map<String, Object> aaData = new HashMap<String, Object>();//dataTable动态更新ajax的数据格式
		aaData.put("aaData", topicList);
		return aaData;
	}
	
}
