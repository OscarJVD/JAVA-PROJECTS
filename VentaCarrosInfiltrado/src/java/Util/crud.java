/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author PC-Vargas
 */
public interface crud {
    
    //METODOS GENERICOS DEL SISTEMA
    public abstract boolean agregarRegistro();
    public abstract boolean actualizarRegistro();
    
    //ESTO LO HAGO SOLO
    public abstract boolean eliminarRegistro();
    public abstract boolean mostrarRegistro();
    
}
