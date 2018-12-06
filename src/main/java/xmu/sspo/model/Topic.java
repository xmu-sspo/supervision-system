package xmu.sspo.model;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	
	int id;              //话题id
	int center_index;               // 聚类中心索引
	String title;            //话题标题
	String news_list;     //该话题包含的新闻
	String news_number;           //各个时段新闻条数列表，长度为24

	public Topic() {}

	public Topic(int id, int center_index, String title, String news_list, String news_number) {
		super();
		this.id = id;
		this.center_index = center_index;
		this.title = title;
		this.news_list = news_list;
		this.news_number = news_number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCenter_index() {
		return center_index;
	}

	public void setCenter_index(int center_index) {
		this.center_index = center_index;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNews_list() {
		return news_list;
	}

	public void setNews_list(String news_list) {
		this.news_list = news_list;
	}

	public String getNews_number() {
		return news_number;
	}

	public void setNews_number(String news_number) {
		this.news_number = news_number;
	}
		
}
