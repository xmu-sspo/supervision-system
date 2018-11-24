package xmu.sspo.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import xmu.sspo.model.News;

@Repository
public interface NewsDao {
	
	/**
	 *  ˵��������id��ȡ����
	 * @param id
	 * @return News
	 */
	News get(Long id);
	
	/**
	 * 获取所有的新闻
	 * @return List<News>
	 */
	List<News> listNewsPerMonth(Map<String, Object> month);
	
	/**
	 *   ˵������ȡ�����б�
	 * @return List<News>
	 */
	List<News> listNews(int page);
	
	/**
	 *  ˵��������id�б��ȡ����
	 * @param id
	 * @return News
	 */
	ArrayList<News> getNewsListByIdList(ArrayList<Integer> newsList);
	
	/**
	 *  ˵������ȡ����������
	 * @return Long
	 */
	BigInteger getNewsCount();
}
