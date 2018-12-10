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

//排序
$(function() {
	table = $('#topic_list').DataTable({
		'bPaginate' : false,
		'bLengthChange': false,
		'bInfo' : false,
		'bFilter' : false,
//		'bSortable':false,
		"order": [],
		'ajax': {
			'url':'/cycle_topic',
			'type': 'POST',
			'asyn':false,
			'data':
				function(){
					cycle_name = $('#tabs .on').prop('class').split(' ')[0];
					cycle = {'cycle_name': cycle_name};//这里可以调用一个方法，动态获取周期
	                return cycle;
	            },
		  },
		'columns': [
		    { 
		    	data: 'id',
		    },
		    { 
		    	'sortable': false,
		    	'data':  null,
	    	    'render': function ( data, type, full, meta ) {
	    	      return '<a style=\"cursor:pointer\" onclick=\"moredetails(\'' + data.news_list + '\')\">' + data.title + '</a>';
	    	    }
		    },
		    { 
		    	data: 'news_num',
		    },
		    {
		    	data: null,
		    	sortable:false,
		    	render: function(data, type, full, meta) {
		    		cycle_name = $('#tabs .on').prop('class').split(' ')[0];
		    		str = '<a onclick=\"timeHot(\'' + data.news_list + '\',\'' + cycle_name + '\')\"><i class="fa fa-arrow-right"></i></a>';
		    		return str;		    		
		    	}	
		    },
		    {
		    	data: 'news_list',
		    	sortable: false,
		    	render: function(data, type, full, meta) {
		    		str = '<a onclick=\"platform(\'' + data + '\')\"><i class="fa fa-arrow-right"></i></a>';
		    		return str;		    		
		    	}	
		    }
		    
	      ]
	});

});

$('#tabs li').on('click', function(){
	$('#tabs li').removeClass('on');			
	cycle_name = $(this).prop('class');
	$(this).addClass('on');			
	table.ajax.reload();
});

//查看某个话题中包含的具体新闻
function moredetails(newsList){
	window.location.href="/search_result?newsList="+newsList;
}
//话题热度分析
function timeHot(list, cycle_name){
//	window.location.href="/search_result?newsList="+newsList;
}
//话题发布平台分析
function platform(newsList){
//	window.location.href="/search_result?newsList="+newsList;
}