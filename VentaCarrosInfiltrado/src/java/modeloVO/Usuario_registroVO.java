
package modeloVO;

/**
 *
 * @author PC-Vargas
 */
public class Usuario_registroVO {
    
    String usuId, usuLogin, usuPass;

    public Usuario_registroVO(String usuId, String usuLogin, String usuPass) {
        this.usuId = usuId;
        this.usuLogin = usuLogin;
        this.usuPass = usuPass;
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

    public String getUsuPass() {
        return usuPass;
    }

    public void setUsuPass(String usuPass) {
        this.usuPass = usuPass;
    }

    
    
    
}
