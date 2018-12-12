package xmu.sspo.dao;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xmu.sspo.model.News;
import xmu.sspo.model.Topic;


public interface TopicDao {
	ArrayList<News> getNewsList(ArrayList<Integer> newsList);
	
//	ArrayList<Topic> getTopicList();
	
	/**
	 * 获取周期性的话题列表
	 * @param cycle
	 * @return
	 */
	ArrayList<Topic> listTopicCyclely(Map<String, String> cycle);
	
	Topic getTopicImg(@Param("id") int id, @Param("cycle") String cycle);
}
