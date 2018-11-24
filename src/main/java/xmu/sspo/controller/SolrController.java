package xmu.sspo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.FacetParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import xmu.sspo.dao.NewsDao;
import xmu.sspo.model.News;
import xmu.sspo.model.Topic;
import xmu.sspo.service.SolrService;

@RestController
public class SolrController {
	
	@Autowired
	private SolrService solrService;
	
	@Autowired
	private NewsDao dao;
	
//	@RequestMapping("/test")
//	@ResponseBody
//	public List<News> getNewsList() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("month", "201811");
//		long month = 201811;
//		List<News> topic_list = dao.listNewsPerMonth(map);
//		return topic_list;
//	}
	
	@RequestMapping("/query")
	public ModelAndView querySolr() {
		
//		try {
//			solrService.addIndex();
//			System.out.println("添加索引成功");//动态索引
//		} catch (SolrServerException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		ModelAndView newsView = new ModelAndView("news-list");	
		List<News> tmpLists = solrService.getSolrNews();
		newsView.addObject("news", tmpLists);
		return newsView;
	}
	
}
