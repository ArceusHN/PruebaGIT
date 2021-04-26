<%-- 
    Document   : listar.jsp
    Created on : 04-23-2021, 11:31:25 AM
    Author     : Omar Fer
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.EstadosCiviles"%>
<%@page import="modelDAO.EstadosCivilesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>La alcancia feliz</h1>
        
        <a href="EstadoCivilController?accion=add">NUEVO</a>
        <table border="1">
            <thead>
                <tr>
                    <th></th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <% 
                EstadosCivilesDAO dao = new EstadosCivilesDAO();    
                List<EstadosCiviles> list = dao.listar();
                Iterator<EstadosCiviles> iter = list.iterator();
                EstadosCiviles ec = null;
                while(iter.hasNext()){
                    ec = iter.next();
                
            %>
            <tbody>
                <tr>
                    <td><%=ec.getEsCiv_Id() %></td>
                    <td><%=ec.getEsCiv_Descripcion() %></td>
                    <td></td>
                </tr>
                <%} %>
            </tbody>
        </table>

    </body>
</html>
