package xmu.sspo.model;

import org.apache.solr.client.solrj.beans.Field;

public class Text {
	@Field
	private Integer id;
	@Field
	private String content;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Text(Integer id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public Text() {
		super();
	}
	@Override
	public String toString() {
		return "Text [id=" + id + ", content=" + content + "]";
	}

}
