package modelo;
import java.sql.SQLException;

public class Curso {
    private String titulo;
    private String nFoto;
    private String resumen;

    public Curso() {
    }

    public Curso(String titulo, String nFoto, String resumen) {
        this.titulo = titulo;
        this.nFoto = nFoto;
        this.resumen = resumen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getnFoto() {
        return nFoto;
    }

    public void setnFoto(String nFoto) {
        this.nFoto = nFoto;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    public void insertar() throws SQLException {
        DAOCursos.getInstance().insertar(this);
    }
}
