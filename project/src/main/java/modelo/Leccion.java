package modelo;

public class Leccion {


    private int codigo_clase;
    private String nombre;
    private double duracion;
    private String contenido;
    private String video;
    private int codigo_examen;
    private int codigo_modulo;
    private int codigo_profesor;
    private int codigo_alumno = 1;
    private boolean examen = false;
    public Leccion() {
    }

    /**
     *
     * @param nombre
     * @param duracion
     * @param contenido
     * @param video
     * @param codigo_examen
     * @param codigo_modulo
     * @param codigo_profesor
     */
    public Leccion(String nombre, double duracion, String contenido, String video, int codigo_examen, int codigo_modulo, int codigo_profesor) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.contenido = contenido;
        this.video = video;
        this.codigo_examen = codigo_examen;
        this.codigo_modulo = codigo_modulo;
        this.codigo_profesor = codigo_profesor;
    }

    /**
     *
     * @param codigo_clase
     * @param nombre
     * @param duracion
     * @param contenido
     * @param video
     * @param codigo_examen
     * @param codigo_modulo
     * @param codigo_profesor
     */
    public Leccion(int codigo_clase, String nombre, double duracion, String contenido, String video, int codigo_examen, int codigo_modulo, int codigo_profesor) {
        this.codigo_clase = codigo_clase;
        this.nombre = nombre;
        this.duracion = duracion;
        this.contenido = contenido;
        this.video = video;
        this.codigo_examen = codigo_examen;
        this.codigo_modulo = codigo_modulo;
        this.codigo_profesor = codigo_profesor;
    }

    /**
     * Crear Examen
     * @param cod_examen
     * @param duracion
     * @param contenido
     * @param codigo_profesor
     */
    public Leccion(int cod_examen, double duracion, String contenido, int codigo_profesor) {

        this.duracion = duracion;
        this.contenido = contenido;
        this.codigo_profesor = codigo_profesor;
        this.examen = true;
    }

    public int getCodigo_clase() {
        return codigo_clase;
    }

    public void setCodigo_clase(int codigo_clase) {
        this.codigo_clase = codigo_clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getCodigo_examen() {
        return codigo_examen;
    }

    public void setCodigo_examen(int codigo_examen) {
        this.codigo_examen = codigo_examen;
    }

    public int getCodigo_modulo() {
        return codigo_modulo;
    }

    public void setCodigo_modulo(int codigo_modulo) {
        this.codigo_modulo = codigo_modulo;
    }

    public int getCodigo_profesor() {
        return codigo_profesor;
    }

    public void setCodigo_profesor(int codigo_profesor) {
        this.codigo_profesor = codigo_profesor;
    }

    public int getCodigo_alumno() {
        return codigo_alumno;
    }

    public void setCodigo_alumno(int codigo_alumno) {
        this.codigo_alumno = codigo_alumno;
    }

    public boolean isExamen() {
        return examen;
    }

    public void setExamen(boolean examen) {
        this.examen = examen;
    }
}