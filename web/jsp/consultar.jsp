
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP PERSONA</title>
    </head>
    <body>
        
        <style>
                  ul{
                          list-style-type:none;
                          margin: 0%;
                          padding: 0;
                          display: flex;
                          flex-direction: row; flex-direction: column;
                            }
                         li{
                                    display: inline-block;          
                                }
                      a{
                          display:block;
                          padding: 0.5cm;
                          background-color: lightsalmon;
                          text-align: center;
                          margin-right: 1cm; margin-bottom: 1cm;
                          text-decoration: none;
                          color: black;
                          left: 0%;
                          
                      }    
        </style>
        
        <style type="text/css">
            .cajaD{ 
                  background-color:lightblue ;
                  height:100%;
                  width: 100%;
                  }
                  .cajaD .encd{
                      margin-top: 0;
                      height: 15%; 
                      width:  100%;
                      position: absolute;
                      left: 80%; 
                    
                  }
                  .cajaD .enci{
                      margin-top: 0;
                      height: 15%; 
                      width:  100%;
                      position: absolute;
                      left: 1%;
                     
                  }
                  .cajaD .med{
                      margin-top: 5%;
                      height: 20%; 
                      width:  100%;
                      position: absolute;
                      left: 0px;
                      
                
                  }
                  .cajaD .fin{
                      margin-top: 20%;
                      height: 40%; 
                      width:  100%;
                      position: absolute;
                      left: 0px;
                  }
                  .cajaD .o{
                      margin-top: 45%;
                      height: 2%;
                      width: 10%;
                      position: absolute;
                      left:150px;      
                  }
                 
                  .cajaD .s{
                      margin-top: 45%;
                      height: 2%;
                      width: 10%;
                      position: absolute;
                      left:1000px;
                  }
                  
                  .cajaD .dat{
                      margin-top: 45%;
                      height: 2%;
                      widht: 10%; 
                      position: absolute; 
                      left: 600px;
                  }
                 
        </style>
       
    </head>
    <body style="background-color: plum">
        <link href="https://fonts.googleapis.com/css?family=Indie+Flower&display=swap" rel="stylesheet">
        <div class="cajaD">
           
            <div class="encd"><font  size="5" face ="Indie Flower">PREESCOLAR A LA WEB</font>
            </div>
            
            <div class="enci" align="left">
                <img src="./jsp/graduado.png" width="5%" height="60%">
                <img src="./jsp/mundo.png" width="5%" height="60%">
            </div>
            
            <div class="med"><CENTER> <font  size="40" face ="Indie Flower">Consultar Datos De Usuario</font></CENTER></div>
            
            <div class="fin">
            <center>
                    <nav>
                        <ul> <center>
                                <form action="../PersonaControlador" method="post">
                                    <p>
                                    <label for="id_empleado">Identificacion del Empleado:</label>
                                    <input type="text" name="id_empleado" value=""/>
                                    </p>
                                    <p>
                                    <input type="submit" value="Consultar"/>
                                    </p>
            <p>
            
        </form> </center>                            
                        </ul>
                    </nav>
                </center>
        </div>
            
            
            <div class="o" align="left">
                <a href="contrInc.do"><font size="5" face="Indie Flower"> INICIO</a>
            </div>
            
            <div class="s">
                <a href="javascript:window.close();"><font size="5" face="Indie Flower"> SALIR</a>
            </div>
            
            <div class="dat">
                <a href="controladordoc.do"><font size="5" face="Indie Flower"> VOLVER</a>
            </div>
            
    </body>
    
    
</html>
