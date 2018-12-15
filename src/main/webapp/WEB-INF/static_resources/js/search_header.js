function search_header_a(){
	var keywords = $("#search_header").val();
	window.location.href = '/search_result?keywords=' + keywords; 
}