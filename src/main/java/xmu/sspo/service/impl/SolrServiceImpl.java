package xmu.sspo.service.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
import org.apache.solr.common.params.ModifiableSolrParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import xmu.sspo.dao.NewsDao;
import xmu.sspo.model.News;
import xmu.sspo.model.NewsList;
import xmu.sspo.service.SolrService;

@Component
public class SolrServiceImpl implements SolrService{
	
	@Autowired
	private NewsDao newsDao;
	
	private final static String SOLR_URL = "http://localhost:8080/solr/";  
	 
//    private String solrCores[]= {"201809", "201811", "201810","201808"};

	@Override
	public List<String> getMonth() {
		List<String> months = new ArrayList<>();
    	Calendar calendar=Calendar.getInstance();       
        SimpleDateFormat formatTime = new SimpleDateFormat("yyyyMM");// 201811
        Date day = calendar.getTime();
        for(int i=0; i<12; i++) {  
        	String month = formatTime.format(day);
        	months.add(month);
        	day.setMonth(day.getMonth()-1);        	
        }
		return months;
	}
    
	@Override
	public void addIndex() throws SolrServerException, IOException {
		
		List<String> month = getMonth();
//		List<String> month = new ArrayList<>();
//		month.add("201802");
		for(String core:month)
			try {
				HttpSolrClient solrClient = new HttpSolrClient(SOLR_URL+core);
				List<News> newsPerMonth = new ArrayList<>();
				try {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("month", core);
					newsPerMonth = newsDao.listNewsPerMonth(map);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(newsPerMonth);
				//newsList.addAll(newsPerMonth);
			    solrClient.addBeans(newsPerMonth);
			    solrClient.commit(); 
				solrClient.close();
				System.out.println("添加"+core+"索引");
			} catch (Exception e) {
				e.printStackTrace();
			}	
	}

	@Override
	public NewsList getSolrNews(String s1) {
		List<String> solrCores = new ArrayList<>();
//		solrCores.addAll(getMonth());		
		solrCores.add("201811");
		NewsList newsList = new NewsList();
		long numbers = 0;
		
		for(String core:solrCores) {
			HttpSolrClient solrServer = new HttpSolrClient(SOLR_URL+core);  
			ModifiableSolrParams query = new ModifiableSolrParams();
			// 检索条件
//			String s1 = "总统国防访华习近平书记";
			String params = "content:"+s1+" OR title:"+s1;
//			String params = "*:*";
			query.set("q", params);
			// 结果排序： 按时间降序
			query.set("sort", "time desc");
			// 返回的字段
			query.set("fl", "*");
//			//过滤条件
//			query.set("fq","id<20");
			//默认搜索域
//			query.set("df", "content, title");			
			//分页参数
//			query.set("start", 0);
//			query.set("rows", 25);ֵ
	        
			// 开始检索
	        QueryResponse response = null;
			try {
				response = solrServer.query(query);
			} catch (SolrServerException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//检索到的文档集
	        SolrDocumentList solrDocumentList = response.getResults();
	        long num = solrDocumentList.getNumFound(); // 检索到的结果总数
	        System.out.println("soloCore:"+core+",number:"+num);
	        numbers = numbers+num;
	        // 转换成实体对象
	        List<News> tmpLists = response.getBeans(News.class);
	       	newsList.setNewsList(tmpLists);
	       	newsList.setTotal(BigInteger.valueOf(tmpLists.size()));
		}
//		System.out.println(numbers);
		return newsList;
	}

}
