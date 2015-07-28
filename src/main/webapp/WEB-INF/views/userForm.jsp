<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:url var="actionUrl" value="save" />
<form:form id="userForm" commandName="user" method="post"
	action="${actionUrl }" class="pure-form pure-form-aligned">
	<fieldset>
		<legend></legend>
		<div class="pure-control-group">
			<label for="userid">User Id</label>
			<form:input name = "userid" path="userid" placeholder="User Id" />
		</div>
		<div class="pure-control-group">
			<label for="username">User Name</label>
			<form:input name="username" id = "username" path="username" placeholder="username" maxlength="15" />
		</div>
		<div class="pure-control-group">
			<label for="password">Password</label>
			<form:input path="password" placeholder="password" maxlength="10" />
		</div>
		<div class="pure-control-group">
			<label for="email">Email</label>
			<form:input path="email" placeholder="email" />
		</div>
		<div class="pure-control-group">
			<label for="dateofbirth">Date of Birth</label>
			<form:input path="dateofbirth"
				placeholder="YYYY-MM-DD" class="datepicker" />
		</div>
		<form:input path="userid" type="hidden" />
	</fieldset>
</form:form>