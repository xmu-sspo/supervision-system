/**
 * Created by 朱何莹 on 2018/8/12.
 * 话题列表
 */
var id;
//用window的onload事件，窗体加载完毕的时候
window.onload=function()
{
	$("#h4").html("话题列表");
	//获取从URL中传过来的用户id
//	var thisURL = document.URL; 
//	if(thisURL.indexOf("?")>=0){
//		var getval =thisURL.split('?')[1]; 
//		id = getval.split("=")[1]; 
//	}
//	getUser();
//    getTopicList();
	
}

//获取用户信息
function getUser(){
	if(id){
		$.ajax({
		   url:"/getCurrentUserById",
		   data:{id:id},
		   success:function(data){
			   $("#user_img").attr({title:data.username});
			   $("#user_name_a").html(data.username);
		   },error:function(){
			   alert("获取用户信息失败！");
		   }
	   });
	}
}
	
	

//获取话题列表
function getList(cycle_name) {
	$.ajax({ 
		type: 'GET',
		url: '/cycle_topic',
		dataType: 'json',
		async:true,
		data: {cycle_name: cycle_name},
		success: function(data) {
			topicList = data;
			var str = '';
			for(var i = 0; i < topicList.length; i ++) {
				str += '<tr>' + 
							'<td>' + topicList[i].id + '</td>' +
							'<td>' + '<a style=\"cursor:pointer\" onclick=\"moredetails(\'' +topicList[i].news_list + '\')\">' + topicList[i].title + '</a></td> ' +				
							'<td>' + topicList[i].center_index + '</td>' +
						'</tr>';
			}
			$('#table_tbody').html(str)
		}
	})
}
getList('topic_this_day');//默认取当天热点话题

$('#tabs li').on('click', function(){
	$('#tabs li').removeClass('on');			
	cycle_name = $(this).prop('class');
	$(this).addClass('on');			
	getList(cycle_name);			
});


//查看某个话题中包含的具体新闻
function moredetails(newsList){
	window.location.href="/search_result?newsList="+newsList;
}