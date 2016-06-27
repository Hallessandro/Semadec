<%-- 
    Document   : listar
    Created on : 26/06/2016, 20:38:44
    Author     : Hallessandro
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.edu.ifrn.semadec.modelo.Inscricao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Inscricao> inscricoes = (ArrayList<Inscricao>) request.getAttribute("inscricoes");
%>
<table>
    <tr>
        <th>Nome</th>
        <th>Matricula</th>
        <th>Modalidade</th>
    </tr>
    <% for (Inscricao i : inscricoes){ %>
    <tr>
        <td><%= i.getNome() %></td>
        <td><%= i.getMatricula() %></td>
        <td><%= i.getModalidade() %></td>
    </tr>
    <% } %>
</table>
