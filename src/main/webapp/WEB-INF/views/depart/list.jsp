<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
	<link rel="stylesheet" type="text/css" href="${resPath}/dhtmlx/skins/skyblue/dhtmlx.css"/>
<script>
	var jpGrid;
	window.addEventListener('load',function(){
		jpGrid = new dhtmlXGridObject('divGrid');
		jpGrid.setImagePath('${resPath}/dhtmlx/skins/skyblue/imgs/dhxgrid_skyblue/');
		jpGrid.setHeader('부서번호,부서명,부서설명,인원수');
		jpGrid.setColumnIds('dino,diname,didesc,dicnt');
		jpGrid.setColAlign('center,center,center,center');
		jpGrid.setColTypes('ro,ed,ed,ed');
		jpGrid.setColSorting('int,str,str,int');
		jpGrid.init();
		au.send({url:'/departs',success:function(res){
			res= JSON.parse(res);
			jpGrid.parse(res,'js');
		}});
		
	});
</script>
</head>
<body>
<div id="divGrid" style="width:500px; height:350px; background-color:white;"></div>
</body>
</html>