<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample jsp</title>
</head>
<body>
${errorMessage}
<form method="POST">
	NAME<input type="text" name="name">
	Password<input type="password" name="password">
	<input type="submit">
	</form>
<a href="/todo">This leads to something new</a>
</body>
</html>