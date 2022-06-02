package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/VerSession")
public class VerSession extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession misession= (HttpSession) request.getSession();

        Producto miproducto= (Producto) misession.getAttribute("producto");

        PrintWriter pw= response.getWriter();
        pw.println("<html><body>"+ miproducto.getId()+ "," +miproducto.getConcepto()+","+ miproducto.getImporte());
        pw.close();
    }
}