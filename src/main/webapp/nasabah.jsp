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
        Nomor Register  : <c:out value="${noRegister}"/>
        <br/>
        Nama Lengkap    : <c:out value="${nama}"/>
        <br/>
        Gender          : <c:out value="${gender}"/>

</body>
</html>