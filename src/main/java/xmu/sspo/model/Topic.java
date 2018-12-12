package xmu.sspo.model;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	
	int id;              //话题id
	int center_index;               // 聚类中心索引
	String title;            //话题标题
	String news_list;     //该话题包含的新闻
	String news_number;           //各个时段新闻条数列表，长度为24
	String platform_number; //平台分布
	int news_num;  // 相关新闻数量

	public Topic() {
		this.news_num = 0;
	}

	public Topic(int id, int center_index, String title, String news_list, String news_number, String platform_number) {
		super();
		this.id = id;
		this.center_index = center_index;
		this.title = title;
		this.news_list = news_list;
		this.news_number = news_number;
		this.platform_number = platform_number;
		this.news_num = 0;
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

	public String getPlatform_number() {
		return platform_number;
	}

	public void setPlatform_number(String platform_number) {
		this.platform_number = platform_number;
	}

	public int getNews_num() {
		return news_num;
	}

	public void setNews_num(int news_num) {
		this.news_num = news_num;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", center_index=" + center_index + ", title=" + title + ", news_list=" + news_list
				+ ", news_number=" + news_number + ", platform_number=" + platform_number + ", news_num=" + news_num
				+ "]\n";
	}
		
}
