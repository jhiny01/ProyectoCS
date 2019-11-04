
package modelo.dao;

import conexion.mysql.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.DataSource;
import modelos.dtos.personadto;

public class PersonaDAO {
   
    public ArrayList<personadto> consultarPersona(personadto persona)
    {
        ArrayList<personadto> personas = new ArrayList();
        
        try {
            DataSource ds = ConexionBD.getMySQLDataSource(); 
            
            Connection con = null;
            Statement stmt = null;
            String query = "SELECT id_persona, num_persona, nombre, apellido, telefono, direccion, correo,ocupacion"
                    + " FROM tabla1";
            con = ds.getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next())
            {
                personadto p = new personadto();
                
                p.setId_empleado(rs.getInt("id_persona"));
                p.setNum_empleado(rs.getInt("num_persona"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setTelefono(rs.getString("telefono"));
                p.setDireccion(rs.getString("direccion"));
                p.setCorreo(rs.getString("correo"));
                p.setOcupacion(rs.getString("ocupacion"));
                
                personas.add(p);
            }            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return personas;
    }
    
    public boolean crearPersona(personadto persona)
    {
        return false;
    }
}
