<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>CRUD using Spring, Maven and Hibernate</title>
		<link rel="stylesheet" href='<c:url value="/web-resources/css/pure-0.4.2.css"/>'>
		<link rel="stylesheet" href='<c:url value="/web-resources/css/font-awesome-4.0.3/css/font-awesome.css"/>'>
		<link rel="stylesheet" href='<c:url value="/web-resources/css/jquery-ui-1.10.4.custom.css"/>'>
		<style type="text/css">th {text-align: left}</style>
	</head>
	<body>	
		<div style="width: 95%; margin: 0 auto;">
			<div id="userDialog" style="display: none;">
				<%@ include file="/WEB-INF/views/userForm.jsp"%>
			</div>
			<h1>Implementing CRUD using Spring, Maven and Hibernate with MySQL database.</h1><br>
			<button class="pure-button pure-button-primary" onclick="addUser()">
				<i class="fa fa-plus"></i> Add User
			</button>
			<br>
			<table class="pure-table pure-table-bordered pure-table-striped">
				<thead>
					<tr>
						<th width="10%">S.N</th>
						<th width="15%">Userid</th>
						<th width="15%">Username</th>
						<th width="15%">Password</th>
						<th width="15%">Email</th>
						<th width="15%">Date of Birth</th>
						<th width="15%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${userList}" var="user" varStatus="loopCounter">
						<tr>
							<td><c:out value="${loopCounter.count}" /></td>
							<td><c:out value="${user.userid}" /></td>
							<td><c:out value="${user.username}" /></td>
							<td><c:out value="${user.password}" /></td>
							<td><c:out value="${user.email}" /></td>
							<td><c:out value="${user.dateofbirth}" /></td>
							<td>
								<nobr>
									<button class="pure-button pure-button-primary"
										onclick="editUser(${user.userid});">
										<i class="fa fa-pencil"></i> Edit
									</button>
									<a class="pure-button pure-button-primary"
										onclick="return confirm('Are you sure you want to delete this user?');"
										href="delete/${user.userid}"> <i class="fa fa-times"></i>Delete
									</a>
								</nobr>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<script type="text/javascript" src='<c:url value="/web-resources/js/lib/jquery-1.10.2.js"/>'></script>
		<script type="text/javascript" src='<c:url value="/web-resources/js/lib/jquery-ui-1.10.4.custom.js"/>'></script>
		<script type="text/javascript" src='<c:url value="/web-resources/js/lib/jquery.ui.datepicker.js"/>'></script>
		<script type="text/javascript" src='<c:url value="/web-resources/js/js-for-listUser.js"/>'></script>
	</body>
</html>