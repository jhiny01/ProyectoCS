<%-- 
    Document   : index
    Created on : 26/08/2019, 09:23:23 PM
    Author     : sala5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Preescolar a la web</title>
        <style type="text/css">
            .caja{ 
                  background-color: lightblue;
                  height:100%;
                  weight: 100%;
                  }
                  .caja .arriba {
                      margin-top: 8%;
                      height: 40%; 
                      width:  100%;
                      position: absolute;
                      left: 0px;                      
                  }
                  .caja .izq {
                      margin-top: 15%;
                      height: 70%;
                      width: 50%;
                      position:absolute;
                      left:0px;
                      
                  }
                  .caja .der {
                      margin-top: 15%;
                      height: 70%;
                      width: 50%;
                      position:absolute;
                      left:50%;
                      
                  }
                  
                  
                
                  .clear {
                      clear: both;
                  }
        </style>       
    </head>
    
    <body style="background-color: lightblue">
        <link href="https://fonts.googleapis.com/css?family=Indie+Flower&display=swap" rel="stylesheet">
        
        <div class ="caja">
            <div class="arriba" align="center">  
                <font size="20" face ="Indie Flower">
                PREESCOLAR A LA WEB
                </font>
            </div>
            <div class="abajo"></div>
            
            <div class="izq" align="center">
                <h1> <a href="controladordate.do"><font face="Indie Flower"</font>DOCENTES</a> </font>  </h1>
                <img src="./jsp/prof1.png" title="Ingreso de docentes" width="50%" height="80%">   
                
            </div>
            
            <div class="der"
                 align="center">                
                <h1><a href="controladorest.do"> <font face="Indie Flower"</font> ESTUDIANTES</a></h1>
                <img src="./jsp/est1.png" title="Ingreso de estudiantes" width="50%" height="80%"> 
            </div>
                
            <div class="clear"> </div>
        </div>
        <body>
        <h1>Ready</h1>
        <a href="./jsp/persona_crear.jsp">Crear Persona</a>
    </body>
    </body>
</html>
