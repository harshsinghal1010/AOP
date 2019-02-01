<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="reg" method="post">
<table width="497" height="121" border="1" align="center" cellpadding="2" cellspacing="2" bordercolor="#660000" bgcolor="#FFFFFF">
  <tr>
    <td width="117">Name</td>
    <td width="360"><input name="name" type="text" id="name" size="60" maxlength="50" /></td>
  </tr>
  <tr>
    <td>Email</td>
    <td><input name="email" type="text" id="email" size="60" /></td>
  </tr>
  <tr>
    <td>Password</td>
    <td><input name="password" type="password" id="password" size="60" maxlength="20" /></td>
  </tr>
  <tr>
    <td>Mobile Number </td>
    <td><input name="mobile" type="text" id="mobile" size="60" maxlength="10" /></td>
  </tr>
  <tr>
    <td width="100%" height="100%" align="center" valign="middle" bgcolor="#FFFFFF"><div align="center">
    
          <input type="submit" name="Submit" value="register" />

    </td>
  </tr>
</table>
</form>

</body>
</html>