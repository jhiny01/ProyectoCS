<%@page contentType="text/html" pageEncoding="UTF-8"
      
import="java.sql.DriverManager"
import="java.sql.Statement"
import="java.sql.Connection"
import="java.sql.Resultst"
import="java.sql.SQLException"
%>
<%
    Connection con = null;
    Statement sql = null;
    try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/prueba1","root","jhindy1989");
             sql= con.createStatement();
            out.print("Conexion exitosa");
        }catch(Exception e){
            out.print("Conexion exitosa"+e);
        }
 %>
    

