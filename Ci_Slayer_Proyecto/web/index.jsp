<%-- 
    Document   : index
    Created on : 30/06/2015, 03:23:43 PM
    Author     : JuanPablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
    </head>
    <body>
        <h1>Registro Usuario</h1>
        <form align="center" action="ServletInstrumento" action="Guardar" method="Post"><br/>
            id: <input type="text" name="id"><br/><br/>
            Codigo: <input type="text" name="codigo"><br/><br/>
            Nombre: <input type="text" name="nombre"><br/><br/>
            Email: <input type="text" name="email"><br/><br/>
            <input type="submit" value="Guardar" 
        </form>
    </body>
</html>
