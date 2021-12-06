package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PC-Vargas
 */
public class TecnicoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    //Que valide el telefono tambien?
    public Tecnico validar(String correo_electronico, String contraseña) {

        Tecnico tec = new Tecnico();

        String sql = "select * from Tecnico where correo_electronico=? and contraseña=?";

        try {

            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo_electronico);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();

            while (rs.next()) {

                tec.setCorreo_electronico(rs.getString(correo_electronico));
                tec.setCorreo_electronico(rs.getString(correo_electronico));
                tec.setContraseña(rs.getString(contraseña));

            }

        } catch (Exception e) {

        }

        return tec;
    }

}
