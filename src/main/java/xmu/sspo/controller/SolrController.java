package xmu.sspo.controller;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.FacetParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import xmu.sspo.model.News;
import xmu.sspo.model.Text;
import xmu.sspo.service.impl.SolrTest;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class SolrController {
	
	private final static String SOLR_URL = "http://localhost:8080/solr/";  
	 
    private String solrCore="articles";
    
//    @RequestMapping("/query")
//    private ModelAndView querySolr() throws Exception {
//    	HttpSolrClient solrServer = new HttpSolrClient(SOLR_URL+solrCore);  
//        SolrQuery query = new SolrQuery();
//        query.setQuery("content:*����* OR content:*�Ϻ�* ");
//        query.setFacet(true);
//        query.addFacetField("content","id");
//        query.setFacetSort(FacetParams.FACET_SORT_COUNT);
//        query.setFacetMinCount(1);
//     //   query.setFacetMissing(false);ֵ
//        
//        QueryResponse response = solrServer.query(query);
//        System.out.println(response.getFacetFields());
//        SolrDocumentList solrDocumentList = response.getResults();  
//        System.out.println("ͨsolrDocumentList:"+solrDocumentList.getNumFound()); 
//        //
//        for (SolrDocument doc : solrDocumentList) {
//            System.out.println("id:"+doc.get("id")+"   title:"+doc.get("title")+"   content:"+doc.get("content"));
//        } 
//        List<News> tmpLists = response.getBeans(News.class);
//        if(tmpLists!=null && tmpLists.size()>0){
//            System.out.println("....."); 
//            for(News per:tmpLists){
//                System.out.println(per.toString());
//            }
//        }      
//        ModelAndView newsView = new ModelAndView("news-list");	
//		newsView.addObject("news", tmpLists);
//		return newsView;
//    }
}
