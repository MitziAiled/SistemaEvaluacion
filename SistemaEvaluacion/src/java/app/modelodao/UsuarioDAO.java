/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modelodao;

import app.configuracion.ConexionBD;
import app.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    Connection con;
    ConexionBD cn = new ConexionBD();
    PreparedStatement ps;
    ResultSet rs;
    Usuario u = new Usuario();
    
      public String Logear(String us, String pass) {

        String tipo = "";
        String sql = "select tipo from usuario where usuario='" + us + "'and pass='" + pass + "'";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipo = rs.getString("tipo");
            }

        } catch (SQLException e) {

        }
        return tipo;

    }

    
}
