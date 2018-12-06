package xmu.sspo.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xmu.sspo.dao.NewsDao;
import xmu.sspo.dao.TopicDao;
import xmu.sspo.model.News;
import xmu.sspo.model.Topic;
import xmu.sspo.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsDao newsDao;
	
	@Autowired
	private TopicDao topicDao;

	@Override
	public News get(Long id) {
		
		return newsDao.get(id);
	}

	@Override
	public List<News> listNews(int page) {
		
		return newsDao.listNews(page);
	}
	
	@Override
	public ArrayList<News> getNewsListByIdList(ArrayList<Integer> newsList){
		return newsDao.getNewsListByIdList(newsList);
	}
	
	@Override
	public BigInteger getNewsCount() {
		return newsDao.getNewsCount();
	}

	@Override
	public ArrayList<Topic> listTopicCyclely(Map<String, String> cycle) {
		return topicDao.listTopicCyclely(cycle);
	}
}
