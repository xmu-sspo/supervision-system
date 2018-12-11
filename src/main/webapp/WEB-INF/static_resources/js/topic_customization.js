window.onload=function(){
    $("#h4").html("话题定制");
}


function add_new_topic(){
	var topic_name = $("#topic_name").val();
	var keywords = $("#keywords").val();
	$.ajax({
		url:"/add_user_topic",
		data:{topic_name:topic_name,keywords:keywords},
		success:function(data){
			alert("创建成功");
			$("#topic_name").val("");
			$("#keywords").val("");
		},error:function(){
			alert("创建失败，请联系管理员！");
		}
	})
}