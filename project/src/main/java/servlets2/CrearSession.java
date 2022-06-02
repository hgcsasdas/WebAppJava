package servlets2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CrearSession")
public class CrearSession extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession misession= request.getSession(true);
        Producto miproducto= new Producto(1,"telefono",300);
        misession.setAttribute("producto",miproducto);
        PrintWriter pw= response.getWriter();
        pw.println("<html><body>Producto en session</body></html>");
        pw.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw= resp.getWriter();
        pw.println("<html><body>Producto en session</body></html>");
        pw.println("<html><h1>"+req+"</body></html>");
        pw.close();
    }
}