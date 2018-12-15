window.onload=function(){
    $("#h4").html("已关注话题");
    getUserTopicList();
}

function getUserTopicList(){
	$.ajax({
		url:"/getUserTopic",
		success:function(data){
			var userTopicList = data;
			//如果返回的列表为空
			if(userTopicList.length==0){
				 $("#table_tbody").append("The result is empty.");
			}else{
				$("#table_tbody").html("");
				for(var i=0; i<userTopicList.length; i++){
				   var item = userTopicList[i];    //其中一个关注话题
				   $("#table_tbody").append(
						   "<tr>" 
							+
							"<td>" + item.id + "</td>"
							+
							"<td class='am-hide-sm-only'>" + item.topic_name + "</td>"
							+
							"<td class='am-hide-sm-only'>" + item.keywords + "</td>"
							+
							"<td class='am-hide-sm-only'>" + item.news_list + "</td>"
							+
							"<td><div class='am-btn-toolbar'><div class='am-btn-group am-btn-group-xs'>" 
							+
			                "<button class='am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only' onclick='delete_click(" + item.id + ")'>"
							+
							"<span class='am-icon-trash-o'></span> 删除</button>" 
							+
			                "</div></div></td>"
							+
							"</tr>"	   
				   );
				}//end for
				$("#total_records").html("共" + data.length + "条记录");
			}
		},error:function(){
			alert("Something about the system went wrong . Please contact the administrator.");
		}
	})
}


function delete_click(id){
//	alert(id);
	$.ajax({
		url:"/delete_userTopic",
		data:{id:id},
		success:function(data){
			alert("删除成功");
			getUserTopicList();
		},error:function(){
			alert("Something about the system went wrong . Please contact the administrator.");
		}
		
	})
}