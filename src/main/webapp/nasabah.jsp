<%-- 
    Document   : belajar
    Created on : May 7, 2018, 2:47:38 PM
    Author     : arrai
--%>

<%@page contentType="text/html" pageEncoding="windows-1252" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>DATA NASABAH</title>
    </head>
    <body>
        <h1>NASABAH</h1>
        <table border="1">
    <tr>
        <td>     No Register    </td>
        <td>     Nama Nasabah   </td>
        <td>    Jenis Kelamin   </td>
    </tr>
    <tr>
        <td><c:out value="${noRegister}"/></td>
        <td><c:out value="${nama}"/></td>
        <td><c:out value="${gender}"/></td>
    </tr>
    
</table>
        

</body>
</html>