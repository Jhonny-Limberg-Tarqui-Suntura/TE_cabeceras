/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
@WebServlet(name = "RespXML", urlPatterns = {"/RespXML"})
public class RespXML extends HttpServlet {
             
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");               
        PrintWriter out = response.getWriter();
        try {
            out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            out.println("<CATALOGO>");
            out.println("<CD>");
            out.print("<TITULO>Tinta roja</TITULO>");
            out.print("<ARTISTA>Andres Calamaro</ARTISTA>");
            out.print("<ORIGEN>AR</ORIGEN>");
            out.print("<PRECIO>5.90</PRECIO>");
            out.print("<AÑO>2006</AÑO>");
            out.print("</CD>");
            out.print("<CD>");
            out.print("<TITULO>La Lengua Popular</TITULO>");
            out.print("<ARTISTA>Andres Calamaro</ARTISTA>");
            out.print("<ORIGEN>AR</ORIGEN>");
            out.print("<PRECIO>9.90</PRECIO>");
            out.print("<AÑO>2007</AÑO>");
            out.print("</CD>");
            out.println("</CATALOGO>");

        }finally{
            out.close();
        }
    }
}
