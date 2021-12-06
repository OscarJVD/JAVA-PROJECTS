package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloVO.UsuarioVO;
import util.Conexion;
import util.InterfaceCrud;

/**
 * CTRL+SHIFT = SELECCIONA VARIAS LINEAS
 *
 * @author PC-Vargas
 */
public class UsuarioDAO extends Conexion implements InterfaceCrud {

    //1. Declarar elementos para conexión
    private Connection conexion = null;
    //2. El puente Bifrost
    private PreparedStatement puente = null;
    //3. El mensajero
    private ResultSet mensajero = null;

    public boolean operacion = false;

    public String sql;

    public String usuId = "", usuLogin = "", usuPassword = "";
    
    //constructor vacio para el case 3 del controlador
    public UsuarioDAO() {}
    
    public UsuarioDAO(UsuarioVO usuVO) {
        //Cuando utilizamos el super se hace una sobrecarga de metodos
        //Una sobrecarga es cuando se llaman 
        //Es un metodo para llamar otros metodos
        super(); //siempre va de primero

        try {

            conexion = this.obtener_conexion();
            usuId = usuVO.getUsuId();  //Almacen por doble seguridad posición 1
            usuLogin = usuVO.getUsuLogin();
            usuPassword = usuVO.getUsuPassword();

        } catch (Exception e) {
            //trato de errores, el log es la secuencia, el segumiento Ej: console.log(), 
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        }

    }

    @Override
    public boolean agregarRegistro() { //Crear usuario - Registrarse

        try {

            sql = "INSERT INTO usuario(usuid,usulogin,usupassword)VALUES(?,?,?)"; //? reemplaza a las variables por seguridad, para evitar la inyección sql

            puente = conexion.prepareStatement(sql); //por el puente pasa la consulta

            //Asignar las variables set
            puente.setString(1, usuId);
            puente.setString(2, usuLogin);
            puente.setString(3, usuPassword);

            //Actualización de BD UPDATE, enviar las variables con get
            puente.executeUpdate();

            operacion = true;

        } catch (SQLException e) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {

                this.cerrar_conexion();

            } catch (SQLException e) {

                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() { //Actualizar un usuario
        try {

            sql = "UPDATE usuario SET usulogin=?, usupassword=? WHERE usuid=?;";

            //CREAMOS EL PUENTE con la llave de la puerta(sql) y  la puerta(conexion)
            puente = conexion.prepareStatement(sql);

            //Asignar las variables a la consulta
            puente.setString(1, usuLogin);
            puente.setString(2, usuPassword);
            puente.setString(3, usuId); //usuid se manda en el boton de la vista

            //Se actualiza la BD por eso es UPDATE
            puente.executeUpdate();

            operacion = true;

        } catch (SQLException e) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {

                this.cerrar_conexion();

            } catch (SQLException e) {

                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }

        return operacion;
    }

    public boolean inicioSesion(String usuario, String clave) { //Logueo //ES PORQUE EL METODO RETORNA UN BOOLEAN

        try {

            conexion = this.obtener_conexion();
            sql = "SELECT * FROM usuario WHERE USULOGIN=? AND USUPASSWORD=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuario);
            puente.setString(2, clave);

            mensajero = puente.executeQuery();

            //next es un metodo booleano que indica si encontro o no
            //RECORRE toda la tabla Y SI LO ENCUENTRA ES TRUE
            if (mensajero.next()) {

                operacion = true;

            }

        } catch (SQLException e) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {

                this.cerrar_conexion();

            } catch (SQLException e) {

                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }

        return operacion;
    }

    
    public String obtIdUsuario(String usuario, String clave) { 
        String idUsuario = null; //variable afuera por si no se llega a llenar con el id qu retorne null
        try {

            conexion = this.obtener_conexion();
            sql = "SELECT * FROM usuario WHERE USULOGIN=? AND USUPASSWORD=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuario);
            puente.setString(2, clave);
            mensajero = puente.executeQuery();

            //next es un metodo booleano que indica si encontro o no
            //RECORRE toda la tabla Y SI LO ENCUENTRA ES TRUE
            if (mensajero.next()) {
                idUsuario = mensajero.getString(1);  //EL ID ESTA EN LA PRIMERA POSICION EN el constructor
            }

        } catch (SQLException e) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {

                this.cerrar_conexion();

            } catch (SQLException e) {//vuelvo en 2 horas :) analizen

                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }

        return idUsuario; // Retorna la variable con el id del usuario Ej: 1
    }
     
    
    
    
    /*
    public String traerIRol(String idusuario) { //Logueo
        String drol = null;
        try {

            conexion = this.obtener_conexion();
            sql = "SELECT * FROM usuario_rol WHERE usuid=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idusuario);
  
            mensajero = puente.executeQuery();

            //next es un metodo booleano que indica si encontro o no
            //RECORRE toda la tabla Y SI LO ENCUENTRA ES TRUE
            if (mensajero.next()) {
                drol = mensajero.getString(1);
            }

        } catch (SQLException e) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {

                this.cerrar_conexion();

            } catch (SQLException e) {

                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }

        return drol;
    }
    
    */
     
 /*    @Override
    public boolean eliminarRegistro() {
       try {
            //NO PONER LA VARIABLE ENVES DE LOS ?
            sql = "DELETE FROM usuario where USUID=?";

            //CREAMOS EL PUENTE con la llave de la puerta(sql) y  la puerta(conexion)
            puente = conexion.prepareStatement(sql);

            //Asignar las variables a la consulta
            puente.setString(1, usuLogin);
            puente.setString(2, usuPassword);
            puente.setString(3, usuId);

            //Se actualiza la BD por eso es UPDATE
            puente.executeUpdate();

            operacion = true;

        } catch (SQLException e) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {

                this.cerrar_conexion();

            } catch (SQLException e) {

                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }

        return operacion; 
    }

    @Override
    public boolean mostrarRegistro() {
        try {
            //NO PONER LA VARIABLE ENVES DE LOS ?
            sql = "SELECT * FROM usuario";

            //CREAMOS EL PUENTE con la llave de la puerta(sql) y  la puerta(conexion)
            puente = conexion.prepareStatement(sql);

            //Asignar las variables a la consulta
            puente.setString(1, usuLogin);
            puente.setString(2, usuPassword);
            puente.setString(3, usuId);

            //Se actualiza la BD por eso es UPDATE
            puente.executeUpdate();

            operacion = true;

        } catch (SQLException e) {

            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {

                this.cerrar_conexion();

            } catch (SQLException e) {

                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }

        return operacion;
        
    }
     */
}
