package xmu.sspo.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ���涨ʱ��.
 * @author qinlingyun
 * @date 2018-11-18 17:16:37
 */
@Component
public class Crawler {
	
	@Scheduled(fixedDelay=3000)//ÿ������һ��
	public void doCrawler() {
		// ��ʱ������
		SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Object startTime = System.currentTimeMillis();
		System.out.println(formatTime.format(startTime));
		
		// ��ʽ����
//		String commands[] = {"GuanchaSpider", "SinaSpider", "HuanqiuSpider", "BjnewsSpider"};		
//		for(String exp: commands) {
//			String command = "scrapy crawl " + exp;//cmd����   	
//	    	File scrapyPath = new File("D:\\sspo\\myScrapy\\MyScrapy");
//	    	try { 
//	    		SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//	    		Object startTime = System.currentTimeMillis();
//	    		System.out.println(formatTime.format(startTime));
//	    		System.out.println("��ʼ��ȡ"+exp);
//				
//	    		Process process = Runtime.getRuntime().exec(command,null,scrapyPath);
//	    		InputStream buffer = process.getInputStream();
//	    		while(buffer.read()!=-1) {
//	    			System.out.print("");
//	    		}
//	    		if(!process.isAlive()) {
//	        		Object finishTime = System.currentTimeMillis();
//	        		System.out.println(formatTime.format(finishTime));    			
//	    			System.out.println("���н���");
//	    		}
//			} catch (IOException e) {			
//				e.printStackTrace();
//			}
//		}
		
		
		//�������� ��main����
//    	String command = "python main.py";
//    	File scrapyPath = new File("C:/Users/admin/Desktop/sspo/myScrapy/MyScrapy/MyScrapy");
  	
	}

}
