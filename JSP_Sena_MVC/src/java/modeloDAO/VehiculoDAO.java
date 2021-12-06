/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloVO.VehiculoVO;
import util.Conexion;
import util.InterfaceCrud;

/**
 *
 * @author PC-Vargas
 */
public class VehiculoDAO extends Conexion implements InterfaceCrud { 

    //1. Declarar elementos para conexión
    private Connection conexion = null;
    //2. El puente Bifrost
    private PreparedStatement puente = null;
    //3. El mensajero
    private ResultSet mensajero = null;

    public boolean operacion = false;

    public String sql;

    private String vehPlaca = "", datId = "",
            catId = "", vehModelo = "", vehMarca = "",
            vehEstado = "", vehPrecio = "";

    public VehiculoDAO() {
    }

    public VehiculoDAO(VehiculoVO vehVO) {
        //Cuando utilizamos el super se hace una sobrecarga de metodos
        //Una sobrecarga es cuando se llaman 
        //Es un metodo para llamar otros metodos
        super();

        try {

            conexion = this.obtener_conexion();

            vehPlaca = vehVO.getVehPlaca();
            datId = vehVO.getDatId();
            catId = vehVO.getCatId();
            vehModelo = vehVO.getVehModelo();
            vehMarca = vehVO.getVehMarca();
            vehEstado = vehVO.getVehEstado();
            vehPrecio = vehVO.getVehPrecio();

        } catch (Exception e) {
            //
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        }

    }

    @Override
    public boolean agregarRegistro() {   // Crear Vehiculo
        try {
            //NO PONER LA VARIABLE ENVES DE LOS ?
            sql = "INSERT INTO vehiculo VALUES(?,?,?,?,?,?,?)";

            //CREAMOS EL PUENTE con la llave de la puerta(sql) y  la puerta(conexion)
            puente = conexion.prepareStatement(sql);

            //Asignar las variables a la consulta
            puente.setString(1, vehPlaca);
            puente.setString(2, datId);
            puente.setString(3, catId);
            puente.setString(4, vehModelo);
            puente.setString(5, vehMarca);
            puente.setString(6, vehEstado);
            puente.setString(7, vehPrecio);

            //Se actualiza la BD por eso es UPDATE
            puente.executeUpdate();

            operacion = true;

        } catch (SQLException e) {

            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {

                this.cerrar_conexion();

            } catch (SQLException e) {

                Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {   // Actualizar vehiculo
        try {
            //NO PONER LA VARIABLE ENVES DE LOS ?
            sql = "UPDATE vehiculo SET datId=?, catId=?,vehModelo=?, vehMarca=?,vehEstado=?, vehPrecio=? where VEHPLACA=?";

            //CREAMOS EL PUENTE con la llave de la puerta(sql) y  la puerta(conexion)
            puente = conexion.prepareStatement(sql);

            //Asignar las variables a la consulta            
            puente.setString(1, datId);
            puente.setString(2, catId);
            puente.setString(3, vehModelo);
            puente.setString(4, vehMarca);
            puente.setString(5, vehEstado);
            puente.setString(6, vehPrecio);
            puente.setString(7, vehPlaca);
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

    public static VehiculoVO consultarPlaca(String placa) {  //Consultar vehiculo por Placa -> metodo estatico -> mayor seguridad por ingreso de datos

        VehiculoVO vehVO = null;

        try {
            Conexion conexionBd = new Conexion();
            Connection conexion = conexionBd.obtener_conexion();
            String sql = "SELECT * FROM vehiculo WHERE VEHPLACA=?";
            PreparedStatement puente = conexion.prepareStatement(sql);
            puente.setString(1, placa);
            ResultSet mensajero = puente.executeQuery();
            while (mensajero.next()) //Si el recorrido encuentra algo -> un solo registro
            {
                vehVO = new VehiculoVO(placa,
                        mensajero.getString(2),
                        mensajero.getString(3),
                        mensajero.getString(4),
                        mensajero.getString(5),
                        mensajero.getString(6),
                        mensajero.getString(7));
            }

        } catch (SQLException e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                Conexion conexionBd = new Conexion();
                conexionBd.cerrar_conexion();

            } catch (SQLException e) {

                Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return vehVO;
    }

    public ArrayList<VehiculoVO> listar() {      //Mostrar o listar los vehiculos -> retorna un arreglo
        ArrayList<VehiculoVO> listaVehiculos = new ArrayList<VehiculoVO>(); //objeto arraylist de tipo VO

        try {
            conexion = this.obtener_conexion();
            /*
            sql = "SELECT *"
                    + "FROM vehiculo v "
                    + "INNER JOIN categoria c ON v.catid = c.catid "
                    + "INNER JOIN datospersonales d ON v.datid = d.datid";*/
            sql = "SELECT v.*,d.datnumeroid as datid,c.catipo as catid FROM vehiculo v INNER JOIN categoria c ON c.catid=v.catid INNER JOIN datospersonales d ON d.datid=v.datid;";
            puente = conexion.prepareStatement(sql); //preparar consulta
            mensajero = puente.executeQuery(); // ejecutar o traer consulta

            while (mensajero.next()) //Si en el recorrido encuentra algo
            {
                VehiculoVO vehVO = new VehiculoVO(mensajero.getString(1),
                        mensajero.getString(8), mensajero.getString(9),
                        mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7));

                listaVehiculos.add(vehVO); //agregar los datos al arreglo
            }

        } catch (SQLException e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return listaVehiculos;

    }
    /*
    //DEMAS METODOS
    @Override
    public boolean eliminarRegistro() {
        try {
            //NO PONER LA VARIABLE ENVES DE LOS ?
            sql = "DELETE FROM vehiculo where VEHPLACA=?";

            //CREAMOS EL PUENTE con la llave de la puerta(sql) y  la puerta(conexion)
            puente = conexion.prepareStatement(sql);

            //Asignar las variables a la consulta
            puente.setString(1, vehPlaca);
            puente.setString(2, datId);
            puente.setString(3, catId);
            puente.setString(4, vehModelo);
            puente.setString(5, vehMarca);
            puente.setString(6, vehEstado);
            puente.setString(7, vehPrecio);

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
            sql = "SELECT * FROM VDC_datos_venta";

            //CREAMOS EL PUENTE con la llave de la puerta(sql) y  la puerta(conexion)
            puente = conexion.prepareStatement(sql);

            //Asignar las variables a la consulta
            puente.setString(1, vehPlaca);
            puente.setString(6, vehModelo);
            puente.setString(7, vehMarca);
            puente.setString(8, vehEstado);
            puente.setString(9, vehPrecio);

            //Se actualiza la BD por eso es UPDATE
            puente.executeQuery();

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
    }*/

}
