<%-- 
    Document   : teste
    Created on : 27/11/2015, 13:51:37
    Author     : Hallessandro
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.edu.ifrn.semadec.dao.SemadecDAO"%>
<%@page import="br.edu.ifrn.semadec.modelo.Inscricao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! Inscricao i = new Inscricao(); %>

<% 

String op = request.getParameter("op");
i.setNome(request.getParameter("nome"));
i.setMatricula(request.getParameter("matricula"));
i.setModalidade(request.getParameter("esporte"));
SemadecDAO dao = new SemadecDAO();
if(op.equals("1")){
    ArrayList<Inscricao> inscricoes = (ArrayList<Inscricao>)dao.getInscricao();
    request.setAttribute("inscricoes", inscricoes);
}else{
    dao.inserirInscricao(i);
%>
<script>alert("Inscrição realizada com sucesso");</script>
<%    
    response.sendRedirect("index.html");
    }    
%>

