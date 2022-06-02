package modelo;

public class Usuario {

    private int id;
    private String nombre;
    private String apellido;
    private String nickname;
    private String mail;
    private int edad;
    private String contrasenia;
    private boolean docente = true;

    public Usuario() {
    }

    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param nickname
     * @param mail
     * @param edad
     * @param contrasenia
     * @param docente
     */
    public Usuario(int id, String nombre, String apellido, String nickname, String mail, int edad, String contrasenia, boolean docente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.mail = mail;
        this.edad = edad;
        this.contrasenia = contrasenia;
        this.docente = docente;
    }

    /**
     *
     * @param nombre
     * @param apellido
     * @param nickname
     * @param mail
     * @param edad
     * @param contrasenia
     * @param docente
     */
    public Usuario(String nombre, String apellido, String nickname, String mail, int edad, String contrasenia, boolean docente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.mail = mail;
        this.edad = edad;
        this.contrasenia = contrasenia;
        this.docente = docente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isDocente() {
        return docente;
    }

    public void setDocente(boolean docente) {
        this.docente = docente;
    }
}