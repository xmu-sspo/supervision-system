package xmu.sspo.model;

import java.math.BigInteger;
import java.util.List;

/**
 * 新闻列表List<News>
 * @author 朱何莹
 *
 */

public class NewsList {
	
	List<News> newsList;
	BigInteger total;
	
	public List<News> getNewsList() {
		return newsList;
	}
	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}
	public BigInteger getTotal() {
		return total;
	}
	public void setTotal(BigInteger total) {
		this.total = total;
	}
	
	
}
