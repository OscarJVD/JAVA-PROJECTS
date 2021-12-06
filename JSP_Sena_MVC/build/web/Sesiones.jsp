<%-- 
    Document   : Sesiones
    Created on : 25/06/2020, 02:21:41 PM
    Author     : PC-Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //que no puedan darle retroceder store ->
    response.setDateHeader("Expires", 0);
%>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" lang="es" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <meta name="Author" lang="es" content="Óscar Javier Vargas Diaz, oscarjaviervargas@hotmail.com"> 
        <meta name="DC.identifier" lang="es" content=""><!--Aqui va la pagina SOLUMOBIL.............................-->
        <META http-equiv="Expires" lang="es" content="0"><!--ESTA NOSE PARA QUE ES.-->
        <meta name="Keywords" lang="es" content="Engativa,Colombia, Bogota,
              app venta de carros, administración de venta de carros, proyecto de software hecho como trabajo del Sena, aplicación para poder comprar autos">
        <META http-equiv="PICS-Label" content='
              (PICS-1.1 "http://www.gcf.org/v2.5"
              labels on "1994.11.05T08:15-0500"
              until "1995.12.31T23:59-0000"
              for "http://w3.org/PICS/Overview.html"
              ratings (suds 0.5 density 0 color/hue 1)) 
              '>
        <META name="copyright" content="&copy; 2020 Solupelís Company.">
        <meta name="Description" lang="es" content="Software de administracíon de autos 
              Desarrollar una aplicación WEB en lenguaje de programación JAVA utilizando
              MVC, que implemente un módulo para un sistema de información de
              comercialización de vehículos, realice el diseño de la base de datos que
              considere pertinente para la prueba. El modulo debe contar obligatoriamente con
              las siguientes funcionalidades:
              ">
        <META name="date" content="19:05:09, sábado 29, febrero 2020 -05">
        <meta name="generator" content="HTML-KIT 2.9"/>
        <meta name="language" content="es"/>
        <meta name="revisit-after" content="1 month"/>
        <meta name="robots" content="index, follow"/>
        <meta name="application-name" content="Solupelís" />
        <meta name="encoding" charset="utf-8" />
        <meta http-equiv="refresh" content="300" />
        <meta http-equiv=»X-UA-Compatible». />
        <meta name="apple-mobile-web-app-capable" content="yes" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
        <meta name="organization" content="Solumotors Company" />
        <meta name="revisit" content="7" />

        <!----------------------------------------------------------------------------------->
        <!----------------------------------------------------------------------------------->
        <!--TERMINA AQUI --------------------------------------------------------------META-->
        <!----------------------------------------------------------------------------------->
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/bootstrapSimplex.min.css">

        <!-- Favicon -->
        <link rel="Shortcut Icon" href="assets/img/2.1.ico"/>

        <!-- FONTAWESOME -->
        <link rel="stylesheet" href="assets/font/css/all.css">

        <title>Solumotors</title>
    </head>

    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="#">
                    <li class="fas fa-car"></li>
                    Solumotors

                </a>
                <a class="navbar-brand text-light mx-5" href="menu.jsp">Inicio</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">

                        <!-- que vaya al controlador user cuando le demos clic -->
                        <!-- el index verifica y convierte a camel -->

                        <li class="nav-item btn-group mx-5 dropdown">
                            <a href="consultarVehiculo.jsp" class="navbar-brand text-light">
                                Vehículo
                            </a>
                            <button type="button" class="btn btn-lg btn-dark dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="sr-only"></span>
                            </button>
                            <div class="dropdown-menu">
                                <a href="consultarVehiculo.jsp" class="nav-link text-dark">Consultar vehículo</a>
                                <a href="registrarVehiculo.jsp" class="nav-link text-dark" >Registrar vehículo</a>
                            </div>
                        </li>

                        <li class="nav-item ml-5">
                            <a href="index.jsp" class="navbar-brand text-light mx-5">Cerrar Sesión</a>
                        </li>
                    </ul>
                    </form>
                </div>
            </nav>
        </header>

        <script src="assets/datatable/js/jquery-3.5.1.js"></script>

        <script src="assets/js/bootstrap.min.js"></script>

        <script src="assets/js/popper.min.js"></script>

        <script>
            /*EFECTO HOVER DEL DROPDOWN*/
            $(function () {
                $(".dropdown").hover(
                        function () {
                            $('.dropdown-menu', this).stop(true, true).fadeIn("fast");
                            $(this).toggleClass('open');
                            $('b', this).toggleClass("caret caret-up");
                        },
                        function () {
                            $('.dropdown-menu', this).stop(true, true).fadeOut("fast");
                            $(this).toggleClass('open');
                            $('b', this).toggleClass("caret caret-up");
                        });
            });
        </script>


