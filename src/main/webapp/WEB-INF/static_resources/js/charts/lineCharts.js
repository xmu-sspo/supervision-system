/*热度分析图*/
window.onload=function(){
    $("#h4").html("热度变化趋势");
    
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
    		topic_title = data.title;
    		data = data.news_number;    		
    		//////////////////////////////////
    		var	data_y = data.split(',').map((value)=>{ return  parseInt(value); }),
				len = data_y.length;
			if(len == 24) {
				data_x = [].range(0, 24);//24小时
				subtitle = "当天热度走势"
			} else {
				data_x = getDateArr(len);//3、7、30天
				subtitle = len + "天内热度走势"
			}
			
			myChart = echarts.init(document.getElementById("main"));
			option = {
				    title : {
				        text: topic_title,
				        x: 'center',
				        subtext: subtitle
				    },
				    tooltip : {
				        trigger: 'axis',
				        formatter: "{b} : <br/> {c} 条"
				    },
				    toolbox: {
				        show : true,
				        feature : {
				            mark : {show: true},
				            dataView : {show: true, readOnly: false},
				            magicType : {show: true, type: ['line', 'bar']},
				            restore : {show: true},
				            saveAsImage : {show: true}
				        }
				    },
				    calculable : true,
				    xAxis : [
				        {
				            type : 'category',
				            boundaryGap : false,
				            data : data_x
				        }
				    ],
				    yAxis : [
				        {
				            type : 'value',
				            axisLabel : {
				                formatter: '{value}  '
				            },
				            name: '新闻数 /条',
				            nameGap: 25,
				            nameRotate: 0
				        }
				    ],
				    series : [
				        {
				            type:'line',
				            data:data_y,
				            markPoint : {
				                data : [
				                    {type : 'max', name: '最大值'},
				                    {type : 'min', name: '最小值'}
				                ]
				            },
				            markLine : {
				                data : [
				                    {type : 'average', name: '平均值'}
				                ],
				                label: {
				                	show:true,
				                	formatter: ' 平均值  {c} '
				                }
				                
				                
				            }
				        }
				    ]
				};    
			myChart.setOption(option);   		
    	}
    });
    
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

//生成 0-24小时
Array.prototype.range = function ( start,end ){
    var _self = this;
    var length = end - start +1;
    var step = start - 1;
    return Array.apply(null, {length:length}).map(function (v,i){
    													step++;
    													return step+'时';
    											});
}

//求几天以前的日期集合
function getDateArr(days) {
	var myDate = new Date(),
		dateArr = [],
		lastM,
		lastD;
	for(var i = days-1; i>= 0; i--) {
		newDate = new Date(myDate - 1000 * 60 * 60 * 24 * i);
		lastM = newDate.getMonth()+1;
		lastD = newDate.getDate();
		dateNum = (lastM<10 ? "0" + lastM : lastM)+"-"+(lastD<10 ? "0"+ lastD : lastD);
		dateArr.push(dateNum);
	}
	return dateArr;
}
