<%-- 
    Document   : pagealumno
    Created on : 20-nov-2020, 10:38:53
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido Alumno</h1>
        <%
            HttpSession sesion = request.getSession();
            String usuario;
            String tipo;
            if (sesion.getAttribute("user") != null && sesion.getAttribute("tipo") != null) {
                usuario = sesion.getAttribute("user").toString();
                tipo = sesion.getAttribute("tipo").toString();

            } else {
                out.print("<script>location.replace('login.jsp');</script>");
            }
        %>
    </body>
</html>
