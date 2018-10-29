package xmu.sspo.model;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	
	int id;              //话题id
	int center_index;               // 聚类中心索引
	String title;            //话题标题
	String date;         //话题产生的日期
	String news_list;     //该话题包含的新闻
	int label;           //标签（当天，三天，一周，一月）

	public Topic() {}

	public Topic(int id, int center_index, String title, String date, String news_list, int label) {
		super();
		this.id = id;
		this.center_index = center_index;
		this.title = title;
		this.date = date;
		this.news_list = news_list;
		this.label = label;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNews_list() {
		return news_list;
	}

	public void setNews_list(String news_list) {
		this.news_list = news_list;
	}

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	

		
}
