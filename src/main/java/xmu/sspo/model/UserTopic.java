package xmu.sspo.model;

public class UserTopic {
	int id;
	int user_id;
	String topic_name;
	String keywords;
	String news_list;
	
	public UserTopic() {}
	
	public UserTopic(int id, int user_id, String topic_name, String keywords, String news_list) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.topic_name = topic_name;
		this.keywords = keywords;
		this.news_list = news_list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getNews_list() {
		return news_list;
	}

	public void setNews_list(String news_list) {
		this.news_list = news_list;
	}

	@Override
	public String toString() {
		return "UserTopic [id=" + id + ", user_id=" + user_id + ", topic_name=" + topic_name + ", keywords=" + keywords
				+ ", news_list=" + news_list + "]";
	}
	
	
	
}
