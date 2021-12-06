
package Modelo;


public class Tecnico {
    int id_tecnico_PK;
    int id_tipo_documento_FK;
    int id_revision_servicio_FK;
    String nombres;
    String apellidos;
    String rol;
    String telefono;
    String correo_electronico;
    String contraseña;
    String numero_documento;

    public Tecnico() {
    }

    public Tecnico(int id_tecnico_PK, int id_tipo_documento_FK, int id_revision_servicio_FK, String nombres, String apellidos, String rol, String telefono, String correo_electronico, String contraseña, String numero_documento) {
        this.id_tecnico_PK = id_tecnico_PK;
        this.id_tipo_documento_FK = id_tipo_documento_FK;
        this.id_revision_servicio_FK = id_revision_servicio_FK;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rol = rol;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.contraseña = contraseña;
        this.numero_documento = numero_documento;
    }

    public int getId_tecnico_PK() {
        return id_tecnico_PK;
    }

    public void setId_tecnico_PK(int id_tecnico_PK) {
        this.id_tecnico_PK = id_tecnico_PK;
    }

    public int getId_tipo_documento_FK() {
        return id_tipo_documento_FK;
    }

    public void setId_tipo_documento_FK(int id_tipo_documento_FK) {
        this.id_tipo_documento_FK = id_tipo_documento_FK;
    }

    public int getId_revision_servicio_FK() {
        return id_revision_servicio_FK;
    }

    public void setId_revision_servicio_FK(int id_revision_servicio_FK) {
        this.id_revision_servicio_FK = id_revision_servicio_FK;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }
    
    
    

}