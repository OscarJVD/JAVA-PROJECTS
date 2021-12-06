<%-- 
    Document   : login
    Created on : 12-20-2019, 10:31:59 AM
    Author     : jose.hernandezusam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Resoruces/css/materialize.css" />
    </head>
    <body>
        <div class="container">
            <form method="post" action="control?action=validar" style="margin:  auto; width: 50%">
                <div class="card red z-depth-3 center-align" style="border-radius: 2em">
                    <div class="row">
                        <div class="col m3"></div>
                        <div class="col m3">Usuario</div>
                        <div class="col m3">
                            <input type="text" name="txtUser" placeholder="usuario" required="" />
                            ${msjU}
                        </div>
                        <div class="col m3"></div>
                    </div>
                    <div class="row">
                        <div class="col m3"></div>
                        <div class="col m3">Contraseña</div>
                        <div class="col m3">
                            <input type="password" name="txtPass" required="" />
                            ${msjP}
                        </div>
                        <div class="col m3"></div>
                    </div>
                    <div class="row">
                        <div class="col m3"></div>
                        <div class="col m6">
                            ${msjT}
                            <input type="submit" name="btnUser" value="Ingresar" class="btn btn-flat black white-text z-depth-3" />
                        </div>
                        <div class="col m3"></div>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
