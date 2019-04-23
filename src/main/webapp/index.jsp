<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>展示页面</title>
	</head>
	<table width="40%" align="center">
		<tbody>
		<tr>
			<td>id</td><td>姓名</td><td>生日</td><td>性别</td><td>年龄</td><td>工资</td><td>操作</td>
		</tr>
		<c:forEach var="i" items="${sessionScope.list}">
		<tr>
			<td>${i.id}</td>
			<td>${i.name}</td>
			<td>${i.birthday}</td>
			<td>${i.sex}</td>
			<td>${i.age}</td>
			<td>${i.salary}</td>
			<td><a href="${pageContext.request.contextPath}/Emp/DeleteAction?id=${i.id}">DELETE</a></td>
		</tr>
		</c:forEach>
		<th  align="center"><a href="${pageContext.request.contextPath}/emp/AddEmp.jsp">增加一名雇员</a></th>
		</tbody>
	</table>
</html>