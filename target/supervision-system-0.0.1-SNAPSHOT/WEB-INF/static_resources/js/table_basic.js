/**
 * Created by 朱何莹 on 2018/8/12.
 */
//用window的onload事件，窗体加载完毕的时候
window.onload=function()
{
    $.ajax({
	   url:"/getTopicList",
	   success:function(data){
		   var topic_list = data;    //话题列表
		   //如果列表为空
		   if(topic_list.length == 0){
			   $("#table_tbody").append("The result is empty.");
			   alert("empty")
		   }else{
			   for(var i=0; i<topic_list.length; i++){
				   var item = topic_list[i];    //其中一个话题
				   var j=i+1;
				   $("#table_tbody").append(
						   "<tr>" 
							+
							"<td>" + j + "</td>"
							+
							"<td>" + "<a style='cursor:pointer' onclick=\"moredetails("+item.newsList+")\">" + item.title + "</a>" + "</td>"
							+
							"<td>" + item.index +"</td>"
							+
							"</tr>"	   
				   );
			   }//end for
		   }//end else	   
	   },error:function(){
		   alert("Something about the system went wrong . Please contact the administrator.");
	   }
   });
}

function moredetails(newsList){
	$.ajax({
		url:"/getNewsList",
		data:{newsList:newsList},
		success:function(data){
			var news_list = data;    //该话题中包含的新闻列表
			alert("success!");
			//如果列表为空
//			if(news_list.length==0){
//				
//			}
		}
		
	});
	
}