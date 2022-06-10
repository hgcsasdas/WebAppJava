package servlets;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "CrearCurso", value = "/CrearCurso")
@MultipartConfig
public class CrearCurso extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private String pathFiles = "C:\\Users\\hgc\\Desktop\\Decargar\\project\\src\\main\\webapp\\Imgs\\modulos";
    private File uploads = new File(pathFiles);




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        //Así obtnego el archivo que se inserte en foto
        Part part = request.getPart("foto");
        String resumen = request.getParameter("resumen");

        Path path = Paths.get(part.getSubmittedFileName());
        String fileName = path.getFileName().toString();
        //preparo el buffer para el guardado
        InputStream input = part.getInputStream();


        String ruta ="";
        if(input != null) {
            //creo el archivo
            File file = new File(uploads, fileName);
            //obtengo la ruta para la bd
            ruta = file.getAbsolutePath();
            System.out.println("La ruta de la foto es: " + ruta);
            //Copio la foto
            try {
                Files.copy(input, file.toPath());

            } catch (Exception e) {
                // TODO: handle exception
                PrintWriter respuesta = response.getWriter();
                respuesta.print("Error al copiar la foto");
                System.out.println("Error al copiar la foto");
            }
        }


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + titulo + "</h1>");
        out.println("<h1>" + fileName + "</h1>");
        out.println("<h1>" + resumen + "</h1>");
        out.println("</body></html>");
    }
}
