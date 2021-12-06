<%-- 
    Document   : registrarUsuario
    Created on : 27/05/2020, 03:54:48 PM
    Author     : PC-Vargas
--%>

<%@page import="modeloVO.UsuarioVO"%>
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
        <link rel="stylesheet" href="assets/css/indexStyle.css">
        <link rel="stylesheet" href="assets/css/bootstrapSimplex.min.css">

        <!-- Favicon -->
        <link rel="Shortcut Icon" href="assets/img/2.1.ico"/>

        <!-- FONTAWESOME -->
        <link rel="stylesheet" href="assets/font/css/all.css">

        <title>Solumotors</title>
    </head>
    <body>
        <div class="row justify-content-center text-center navIndex w-100">
            <div class="w-100">
                <h1 class="text-light bg-dark p-2">Iniciar Sesión</h1>
            </div>
            <h6 class="w-100 text-light pt-3 mt-3">Es facíl y rapido.</h6> 
            <form action="Usuario" method="POST" class="col-12 mb-2 pb-2">
                <div>
                    <input type="text" placeholder="Ingrese Usuario" name="textUsuario" required="" autocomplete="">
                </div>
                <div class="my-2 mb-3 text-center">
                    <input type="password" placeholder="Ingrese Clave" name="textPassword" required="" autocomplete="">
                </div>
                <button class="btn btn-info btn-sm">Iniciar Sesión</button>
                <a href="registrarUsuario.jsp" class="btn btn-warning btn-sm">Crear cuenta</a>
                <input type="hidden" value="3" name="opcion">
                <div class="my-2 col-12">

                </div>

            </form>

            <%if (request.getAttribute("mensajeError") != null) { %>
            <div col-12><p class="texto-blanco">${mensajeError}</p></div>
            <% } else {%>
            <div col-12><p class="texto-blanco">${mensajeExito}</p></div>
            <% }%>

            <div class="slashed col-12 pt-2 mt-2 pb-5 mb-5">
                <div class="top" title="Solumotors"></div>
            </div>
        </div>



        <%@include file="Footer.jsp" %>

