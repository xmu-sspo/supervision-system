package xmu.sspo.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import xmu.sspo.model.News;
import xmu.sspo.model.Topic;

public interface NewsService {
	
	/**
	 *  根据news id获取一条新闻
	 * @param id
	 * @return News
	 */
	News get(Long id);
	
	/**
	 *   获取所有的新闻
	 * @return List<News>
	 */
	List<News> listNews(int page);
	
	/**
	 *   按照list获取新闻
	 * @return List<News>
	 */
	ArrayList<News> getNewsListByIdList(ArrayList<Integer> newsList);
	
	/**
	 *   计数
	 * @return long
	 */
	BigInteger getNewsCount();
		
	/**
	 * 获取周期性的话题列表
	 * @param cycle
	 * @return
	 */
	List<Topic> listTopicCyclely(Map<String, String> cycle);
	
	Topic getTopicImg(int id, String cycle);

}
