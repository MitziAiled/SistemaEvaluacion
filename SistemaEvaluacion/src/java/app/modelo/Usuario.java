
package app.modelo;

public class Usuario {
    private int id_usuario;
    private String usuario;
    private String pass;
    private String tipo;

    public Usuario() {
    }

    public Usuario(int id_usuario, String usuario, String pass, String tipo) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.pass = pass;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
