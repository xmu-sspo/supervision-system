package xmu.sspo.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

import xmu.sspo.model.Topic;

@Component
public class Cluster {
	//聚类产生话题，每天两次，6点和13点
	@Scheduled(cron="0 0 6,13 * * ?")
	public void TaskJob() {
		System.out.println("cluster");
		
//		Process proc;
//		String python_root_path = "D:\\莹\\大创\\舆情监督\\中文分词\\";
//		String python_result_path = "C:\\Users\\lenovo\\Desktop\\";
//		
//		String[] indexs = new String[] {};
//    	ArrayList<String> news_list = new ArrayList<String>();
//    	ArrayList<String> topic_list = new ArrayList<String>(); 
//    	
//        try {
//            proc = Runtime.getRuntime().exec("python " + python_root_path + "new_kmeans.py");//运行python程序
//            //读取python运行结果
//            String line="";
//            System.out.println("-------------python begin---------------");
//            InputStreamReader isr = new InputStreamReader(new FileInputStream(python_result_path + "pyResult.txt"), "UTF-8");   //C:\\Users\\lenovo\\Desktop\\
//            BufferedReader in = new BufferedReader(isr);
//        	line=in.readLine();
//        	System.out.println("-------------python end-----------------");
//        	while (line!=null){
////        		System.out.println(line);
//        		if(line.startsWith("center_index:")){
//        			line = in.readLine();
//        			indexs = line.split(", ");
//        			line = in.readLine();     			
//        		}
//        		if(line.startsWith("topic:")||line.startsWith("new_list:")){
//					line = in.readLine();
//				}else if (line.startsWith("[")) {
//					news_list.add(line);
//					line = in.readLine();
//				}else {
//					topic_list.add(line);
//					line = in.readLine();
//				}
//        	}//end while
//            in.close();
//            proc.waitFor();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } 
//        
//        //各种输出
//        System.out.println("index:" + indexs.length);
//        for(int i=0; i<indexs.length; i++) {
//        	System.out.println(indexs[i]);
//        }
//        System.out.println("news_list:" + news_list.size());
//        for(int i=0; i<indexs.length; i++) {
//        	System.out.println(news_list.get(i));
//        }
//        System.out.println("topic:" + topic_list.size());
//        for(int i=0; i<indexs.length; i++) {
//        	System.out.println(topic_list.get(i));
//        }
//		
//        //存储话题相关内容
//        ArrayList<Topic> topicList = new ArrayList<Topic>();
//        for(int i=0; i<indexs.length; i++) {
//        	int index = Integer.parseInt(indexs[i].replaceAll("\\[|\\]| ", ""));
//        	String title = topic_list.get(i);
//        	String newsList = news_list.get(i).replaceAll("\\[|\\]| ", "");       	       		
//        	Topic topic = new Topic(newsList, index, title); 
//        	topicList.add(topic);
//        }
//        return topicList;
	}
	
	
	
}
