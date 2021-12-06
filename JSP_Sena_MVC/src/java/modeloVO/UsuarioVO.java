package modeloVO;

public class UsuarioVO {

    //1. DEFINIR ATRIBUTOS QUE SE NECESITAN PARA EL MODULO
    private String usuId, usuLogin, usuPassword, idRol;

    public UsuarioVO() {
    }

    //Este constructor se utiliza en el asunto rol proximamente 
    public UsuarioVO(String usuId, String usuLogin, String usuPassword, String idRol) {
        this.usuId = usuId;
        this.usuLogin = usuLogin;
        this.usuPassword = usuPassword;
        this.idRol = idRol;
    }

    //Este constructor se usa estandar para los metodos del controlador
    public UsuarioVO(String usuId, String usuLogin, String usuPassword) {
        this.usuId = usuId;
        this.usuLogin = usuLogin;
        this.usuPassword = usuPassword;
    }

    //Este constructor se usa para traer el id del usuario en sesión
    public UsuarioVO(String usuId, String usuLogin) {
        this.usuId = usuId;
        this.usuLogin = usuLogin;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getUsuId() {
        return usuId;
    }

    public void setUsuId(String usuId) {
        this.usuId = usuId;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuPassword() {
        return usuPassword;
    }

    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }

}
