package xmu.sspo.service;

import java.io.IOException;
import java.util.List;

import org.apache.solr.client.solrj.SolrServerException;

import xmu.sspo.model.News;
import xmu.sspo.model.NewsList;

public interface SolrService {
	
	//获取月份
	public List<String> getMonth();
	
	//添加索引
	public void addIndex() throws SolrServerException, IOException;
	
	//检索
	public NewsList getSolrNews(String params);
}
