<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First JSP</title>
</head>
<body>
My First JSP!!
<br>
<br>
<p>${error}</p>
<form action="/modelviewproject/webReq/login" method="POST">
  UserName:<input type="text" name="userName">
  Password:<input type="password" name="password">
  <input type="submit"/>
</form>
</body>
</html>