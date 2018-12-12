window.onload=function(){
    $("#h4").html("发布平台分布");
    var id = getParam('id'),
	cycle = getParam('cycle');
	$.ajax({
		type: 'POST',
		data: {
			'id': id,
			'cycle': cycle
		},
		url: '/getLineImg',
		dataType: 'json',
		success: function(data) {
			console.log(data)
			console.log(data.platform_number)
			topic_title = data.title;
			data_y = data.platform_number.split(',').map((value)=>{ return  parseInt(value); });
			data_x = ['新浪网', '腾讯新闻', '搜狐网', '网易', '凤凰网', '新华网', '人民网','中青在线', '北青网', '新京报', '澎湃网', '参考消息网', '环球网', '观察者网']
			data_json = []		
			for(var i = 0; i < data_x.length; i++) {
				data_json_demo = {}
				data_json_demo.value = data_y[i];
				data_json_demo.name = data_x[i];
				data_json.push(data_json_demo);
			}
			console.log(data_json)
			var pie = echarts.init(document.getElementById("pie"));
			option = {
					title : {
				        text: topic_title,
//				        subtext: '话题发布平台统计',
				        x:'center'
				    },
				    tooltip : {
				        trigger: 'item',
				        formatter: "{a} <br/>{b} : {c} 条({d}%)"
				    },
				    legend: {
				        orient : 'vertical',
				        x : 'left',
				        data: data_x
				    },
				    toolbox: {
				        show : true,
				        feature : {
				            mark : {show: true},
				            dataView : {show: true, readOnly: false},
				            magicType : {
				                show: true, 
				                type: ['pie', 'funnel'],
				                option: {
				                    funnel: {
				                        x: '25%',
				                        width: '50%',
				                        funnelAlign: 'left',
				                        max: 1548
				                    }
				                }
				            },
				            restore : {show: true},
				            saveAsImage : {show: true}
				        }
				    },
				    calculable : true,
				    series : [
				        {
				            name:'新闻来源',
				            type:'pie',
				            radius : '55%',
				            center: ['50%', '60%'],
				            data: data_json
				        }
				    ]
				};				                    
			pie.setOption(option);						
		} 
	})
}

//获取url?后的参数
function getParam(paramName) { 
    paramValue = "", isFound = !1; 
    if (this.location.search.indexOf("?") == 0 && this.location.search.indexOf("=") > 1) { 
    	str = decodeURI(this.location.search).substring(1, this.location.search.length)
    	for(var i = 0, arrSource = str.split("&"); i < arrSource.length; i++) {
    		if(arrSource[i].indexOf("=") == -1 && arrSource[i-1].indexOf("=") > -1) {
    			arrSource[i-1] = arrSource[i-1] + arrSource[i];
    			arrSource[i] = '';
    		} else if(arrSource[i].indexOf("=") == -1 && arrSource[i-2].indexOf("=") > -1) {
    			arrSource[i-2] = arrSource[i-2] + arrSource[i];
    			arrSource[i] = '';
    		}
    	}
    	i = 0; 
        while (i < arrSource.length && !isFound) 
        		arrSource[i].indexOf("=") > 0  && arrSource[i].split("=")[0].toLowerCase() == paramName.toLowerCase() && (paramValue = arrSource[i].split("=")[1], isFound = !0), i++ 
    } else {
    	alert("请选择话题！");
    	window.location.href="/topic_list";
    }
    return paramValue == "" && (paramValue = null), paramValue;
}

//(function(){
//	var pie = echarts.init(document.getElementById("pie"));
//	var option2 = {
//			title : {
//		        text: '"国产原创综艺《一本好书》评分9.3，我实名吹爆！"',
//		        subtext: '话题发布平台统计',
//		        x:'center'
//		    },
//		    tooltip : {
//		        trigger: 'item',
//		        formatter: "{a} <br/>{b} : {c} ({d}%)"
//		    },
//		    legend: {
//		        orient : 'vertical',
//		        x : 'left',
//		        data:['新浪网','环球网','观察者网','新京报']
//		    },
//		    toolbox: {
//		        show : true,
//		        feature : {
//		            mark : {show: true},
//		            dataView : {show: true, readOnly: false},
//		            magicType : {
//		                show: true, 
//		                type: ['pie', 'funnel'],
//		                option: {
//		                    funnel: {
//		                        x: '25%',
//		                        width: '50%',
//		                        funnelAlign: 'left',
//		                        max: 1548
//		                    }
//		                }
//		            },
//		            restore : {show: true},
//		            saveAsImage : {show: true}
//		        }
//		    },
//		    calculable : true,
//		    series : [
//		        {
//		            name:'新闻来源',
//		            type:'pie',
//		            radius : '55%',
//		            center: ['50%', '60%'],
//		            data:[
//		                {value:72, name:'新浪网'},
//		                {value:46, name:'环球网'},
//		                {value:34, name:'观察者网'},
//		                {value:4, name:'新京报'}
//		            ]
//		        }
//		    ]
//		};
//		                    
//	pie.setOption(option2);
//})();