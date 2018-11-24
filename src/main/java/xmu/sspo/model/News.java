package xmu.sspo.model;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.apache.solr.client.solrj.beans.Field;

@Alias("news")
public class News {
	
	/**
	 * 新闻ID
	 */
	@Field
	private Long id;
	
	/**
	 * 数据来源
	 */
	@Field
	private String data_from;
	
	/**
	 * 新闻原网址
	 */
	@Field
	private String url;
	
	/**
	 * 新闻标题
	 */
	@Field
	private String title;
	
	/**
	 * 新闻内容
	 */
	@Field
	private String content;
	/**
	 * 新闻日期和时间
	 */
	@Field
	private Date time;
	
	/**
	 * 作者
	 */
	@Field
	private String author;
	
	/**
	 * 浏览量
	 */
	@Field
	private Long browse;
	
	/**
	 * 评论数
	 */
	@Field
	private Long comment;
	
	
	/**
	 * 点击次数
	 */
	@Field
	private Long click;
	
	public News() {
		super();
	}

	public News(Long id, String data_from, String url, String title, String content, Date time, String author,
			Long browse, Long comment, Long click) {
		super();
		this.id = id;
		this.data_from = data_from;
		this.url = url;
		this.title = title;
		this.content = content;
		this.time = time;
		this.author = author;
		this.browse = browse;
		this.comment = comment;
		this.click = click;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData_from() {
		return data_from;
	}

	public void setData_from(String data_from) {
		this.data_from = data_from;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getBrowse() {
		return browse;
	}

	public void setBrowse(Long browse) {
		this.browse = browse;
	}

	public Long getComment() {
		return comment;
	}

	public void setComment(Long comment) {
		this.comment = comment;
	}

	public Long getClick() {
		return click;
	}

	public void setClick(Long click) {
		this.click = click;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", data_from=" + data_from + ", url=" + url + ", title=" + title + ", content="
				+ content + ", time=" + time + ", author=" + author + ", browse=" + browse + ", comment=" + comment
				+ ", click=" + click + "]";
	}


}
