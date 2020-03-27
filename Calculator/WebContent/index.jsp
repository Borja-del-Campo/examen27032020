<%@ page import="calculator.Calculadora" %>

<!-- Documento HTML-->
<!DOCTYPE html>
<html lang = "es">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" /><!-- Etiqueta para adaptar a @media -->
  <LINK REL="stylesheet" TYPE="text/css" HREF="css/style.css"><!-- Enlace hoja estilos -->
</head>
<%
   Calculadora c=new Calculadora();
   String boton=request.getParameter("boton");
   if(boton==null)boton="";
   String acumulado=request.getParameter("acumulado");
   if(acumulado==null)acumulado="";
   if(!boton.equals("="))acumulado=acumulado+boton;
%>
<body>
<!-- Empieza codigo calculadora html-->
  <form name="calculator" action="index.jsp">
    <input type="textfield" name="resultado" value="<% out.print(c.acumulado(acumulado,boton)); acumulado=c.acumulado(acumulado,boton);%>">
    <input type="hidden" value="<% out.print(acumulado);%>" name="acumulado">
    <br>
    <input type="submit" value="1" name="boton">
    <input type="submit" value="2" name="boton">
    <input type="submit" value="3" name="boton">
    <input type="submit" value="+" name="boton">
    <br>
    <input type="submit" value="4" name="boton">
    <input type="submit" value="5" name="boton">
    <input type="submit" value="6" name="boton">
    <input type="submit" value="-" name="boton">
    <br>
    <input type="submit" value="7" name="boton">
    <input type="submit" value="8" name="boton">
    <input type="submit" value="9" name="boton">
    <input type="submit" value="*" name="boton">
    <br>
    <input type="submit" value="0" name="boton">
    <input type="submit" value="c" name="boton">
    <input type="submit" value="/" name="boton">
    <input type="submit" value="=" name="boton">
    </form>
</body>
</html>
<!-- Finaliza codigo calculadora html -->