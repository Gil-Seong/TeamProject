<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.2.0.min.js" ></script>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<input type="text" id="insert_text">
<button id="dbinsert">insert</button>

</body>

<script>

$(function(){
	$("#dbinsert").click(function(){
	var dbinsert_data = {"dbinsert_data":$("#insert_text").val()};
		console.log(dbinsert_data);
	$.ajax({
		type:"POST",
		url:"dbtest.data",
		data:dbinsert_data,
		success:function(data){
			alert("success_ajax");
		},
		error:function(){
			alert("error_ajax");
		}
	})
	});
});
</script>
</html>