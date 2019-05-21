<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!-- JSTL이 디폴트로 들어감 -->
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<h3><a href="hello.action">Spring 환영 메세지</a></h3>

<h3><a href="test/param.action?name=suzi&phone=010-1234-1234&email=suzi@naver.com">
1. GET방식 테스트</a></h3>
<h3>2. POST방식 테스트</h3>
<form action="test/param.action" method="post">
이름:<input type="text" name="name"/><br>
전화:<input type="text" name="phone"/><br>
메일:<input type="text" name="email"/><br>
<input type="submit" value="전송"/><br> 
</form>

<br>

<h3><a href="test/mav.action?name=shin&phone=010-2222-2222&email=shin@naver.com">
3. ModelAndView GET방식 테스트</a></h3>
<h3>4. ModelAndView POST방식 테스트</h3>
<form action="test/mav.action" method="post">
이름:<input type="text" name="name"/><br>
전화:<input type="text" name="phone"/><br>
메일:<input type="text" name="email"/><br>
<input type="submit" value="전송"/><br> 
</form>

<br>
<h3>5. <a href="test/redirect.action">리다이렉트 테스트</a></h3>

</body>
</html>
