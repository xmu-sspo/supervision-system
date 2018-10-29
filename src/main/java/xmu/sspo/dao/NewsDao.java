package xmu.sspo.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import xmu.sspo.model.News;

@Repository
public interface NewsDao {
	
	/**
	 *  说明：根据id获取详情
	 * @param id
	 * @return News
	 */
	News get(Long id);
	
	/**
	 *   说明：获取新闻列表
	 * @return List<News>
	 */
	List<News> listNews(int page);
	
	/**
	 *  说明：根据id列表获取详情
	 * @param id
	 * @return News
	 */
	ArrayList<News> getNewsListByIdList(ArrayList<Integer> newsList);
	
	/**
	 *  说明：获取新闻总条数
	 * @return Long
	 */
	BigInteger getNewsCount();
}
