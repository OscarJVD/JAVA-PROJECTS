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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloVO.DatosVO;
import modeloVO.DatosVO;
import util.Conexion;

/**
 *
 * @author PC-Vargas
 */
public class DatosDAO extends Conexion{
    //1. Declarar elementos para conexión
    private Connection conexion = null;
    //2. El puente Bifrost
    private PreparedStatement puente = null;
    //3. El mensajero
    private ResultSet mensajero = null;

    public String sql;
    
    public ArrayList<DatosVO> listar() {      //Mostrar o listar los vehiculos -> retorna un arreglo
        ArrayList<DatosVO> listaDatos = new ArrayList<DatosVO>(); //objeto arraylist de tipo VO

        try {
            conexion = this.obtener_conexion();
            sql = "SELECT * FROM datospersonales";
            puente = conexion.prepareStatement(sql); //preparar consulta
            mensajero = puente.executeQuery(); // ejecutar o traer consulta

            while (mensajero.next()) //Si en el recorrido encuentra algo
            {
                DatosVO datVO = new DatosVO(mensajero.getString(1),mensajero.getString(2),
                        mensajero.getString(3),mensajero.getString(4),mensajero.getString(5),
                        mensajero.getString(6),mensajero.getString(7),mensajero.getString(8));

                listaDatos.add(datVO); //agregar los datos al arreglo
            }

        } catch (SQLException e) {
            Logger.getLogger(DatosDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return listaDatos;

    }
}
