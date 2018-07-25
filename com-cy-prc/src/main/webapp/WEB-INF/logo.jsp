<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>二维码</title>
    <%
    String path = request.getContextPath();
    String bathPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
    pageContext.setAttribute("path", path);
    pageContext.setAttribute("bathPath", bathPath);
    %>
    <script type="text/javascript" src="${path }/js/jquery.min.js"></script>
    <script type="text/javascript" src="${path }/js/jquery.qrcode.min.js"></script>
</head>
<body>
生成的二维码： <br/>
<div id="qrcode"></div>
<script type="text/javascript">
    $('#qrcode').qrcode("www.shuai.cn");
</script>
</body>

</html>