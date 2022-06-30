<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>추가된 학생</title>
</head>
<body>
	<div class="container">
		<h1>${subject}</h1>
		<table class="table table-striped">
			<tr>
				<th>번호</th>
				<td>${result.id}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${result.name}</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>${result.phoneNumber}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${result.email}</td>
			</tr>
			<tr>
				<th>장래희망</th>
				<td>${result.dreamJob}</td>
			</tr>
			<tr>
				<th>생성일</th>
				<td>${result.createdAt}</td>
			</tr>
			<tr>
				<th>수정일</th>
				<td>${result.updatedAt}</td>
			</tr>
		</table>

	</div>

</body>
</html>