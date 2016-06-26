<%-- 
    Document   : teste
    Created on : 27/11/2015, 13:51:37
    Author     : Hallessandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>


<% 
String [] esportes = request.getParameterValues("esporte");
%>

<% for (int i = 0; i < esportes.length; i++){%>
    <h1><%= esportes[i]  %></h1>
<% } %>
    </body>
</html>
