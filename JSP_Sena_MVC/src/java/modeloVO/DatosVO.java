/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloVO;

/**
 *
 * @author PC-Vargas
 */
public class DatosVO {
    
    String datId,usuId,datNombre,datApellido,daTipoid,datNumeroid,daTelefono,daTcorreo;

    public DatosVO() {
    }

    public DatosVO(String datId, String usuId, String datNombre, String datApellido, String daTipoid, String datNumeroid, String daTelefono, String daTcorreo) {
        this.datId = datId;
        this.usuId = usuId;
        this.datNombre = datNombre;
        this.datApellido = datApellido;
        this.daTipoid = daTipoid;
        this.datNumeroid = datNumeroid;
        this.daTelefono = daTelefono;
        this.daTcorreo = daTcorreo;
    }

    public String getDatId() {
        return datId;
    }

    public void setDatId(String datId) {
        this.datId = datId;
    }

    public String getUsuId() {
        return usuId;
    }

    public void setUsuId(String usuId) {
        this.usuId = usuId;
    }

    public String getDatNombre() {
        return datNombre;
    }

    public void setDatNombre(String datNombre) {
        this.datNombre = datNombre;
    }

    public String getDatApellido() {
        return datApellido;
    }

    public void setDatApellido(String datApellido) {
        this.datApellido = datApellido;
    }

    public String getDaTipoid() {
        return daTipoid;
    }

    public void setDaTipoid(String daTipoid) {
        this.daTipoid = daTipoid;
    }

    public String getDatNumeroid() {
        return datNumeroid;
    }

    public void setDatNumeroid(String datNumeroid) {
        this.datNumeroid = datNumeroid;
    }

    public String getDaTelefono() {
        return daTelefono;
    }

    public void setDaTelefono(String daTelefono) {
        this.daTelefono = daTelefono;
    }

    public String getDaTcorreo() {
        return daTcorreo;
    }

    public void setDaTcorreo(String daTcorreo) {
        this.daTcorreo = daTcorreo;
    }
    
    

}
