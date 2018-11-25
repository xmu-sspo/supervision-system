package xmu.sspo.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时爬虫.
 * @author qinlingyun
 * @date 2018-11-18 17:16:37
 */
@Component
public class Crawler {
	
//	@Scheduled(fixedDelay=3000)//每三分钟跑一次
	public void doCrawler() {
		// 定时器测试
		SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Object startTime = System.currentTimeMillis();
		System.out.println(formatTime.format(startTime));
		
		// 爬取当日新闻
//		String commands[] = {"GuanchaSpider", "SinaSpider", "HuanqiuSpider", "BjnewsSpider"};		
//		for(String exp: commands) {
//			String command = "scrapy crawl " + exp;//cmd命令
//	    	File scrapyPath = new File("D:\\work\\myScrapy\\myScrapy");
//	    	try { 
//	    		SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//	    		Object startTime = System.currentTimeMillis();
//	    		System.out.println(formatTime.format(startTime));
//	    		System.out.println("start:"+exp);
//				
//	    		Process process = Runtime.getRuntime().exec(command,null,scrapyPath);
//	    		InputStream buffer = process.getInputStream();
//	    		while(buffer.read()!=-1) {
//	    			System.out.print("");
//	    		}
//	    		if(!process.isAlive()) {
//	        		Object finishTime = System.currentTimeMillis();
//	        		System.out.println(formatTime.format(finishTime));    			
//	    			System.out.println("finished:");
//	    		}
//			} catch (IOException e) {			
//				e.printStackTrace();
//			}
//		}
		
		
		//方案二 跑main方法
//    	String command = "python main.py";
//    	File scrapyPath = new File("C:/Users/admin/Desktop/sspo/myScrapy/MyScrapy/MyScrapy");
  	
	}

}
