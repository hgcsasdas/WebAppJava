package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IniciarSesion", value = "/IniciarSesion")
public class IniciarSesionUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String mail = request.getParameter("mail");
        String contrasena = request.getParameter("contrasena");
        String hcaptchaResponse = request.getParameter("h-captcha-response");
        System.out.println(hcaptchaResponse);
        //boolean verificado = verificarReKaptcha.verificar(hcaptchaResponse);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + mail + "</h1>");
        out.println("<h1>" + contrasena + "</h1>");
        out.println("</body></html>");
    }
}
