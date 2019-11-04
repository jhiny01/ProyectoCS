
<%@page import="java.util.ArrayList"%>
<%@page import="modelos.dtos.personadto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persona Respuesta</title>
    </head>
    <body>
        <h1>Respuesta</h1>   
        <%
            ArrayList<personadto> listaP = (ArrayList<personadto>) request.getSession().getAttribute("listaP");
            for (int i = 0; i < listaP.size(); i++)
            {
        %>
            <%=listaP.get(i).getNombre()%>
            <br>
        <%
            }
        %>
             
            <p>
            <a href="../index.jsp">Inicio</a>
            </p>
        
    </body>
</html>


