
package modelo.dao;

import conexion.mysql.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
         boolean aux = false; 
        
        try {
            DataSource ds = ConexionBD.getMySQLDataSource(); 
            
            Connection con = null;
            Statement stmt = null;
            String query = "INSERT INTO tabla1 (id_persona, num_persona, nombre, apellido, telefono, direccion, correo,ocupacion)  "
                    + " values (?,?,?,?,?,?,?,?)";
            
            con = ds.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            //ResultSet rs = stmt.executeQuery(query);
            
            ps.setInt(1, persona.getId_empleado());
            ps.setInt(2, persona.getNum_empleado());
            ps.setString(3, persona.getNombre());
            ps.setString(4, persona.getApellido());
            ps.setString(5, persona.getTelefono());
            ps.setString(6, persona.getDireccion());
            ps.setString(7, persona.getCorreo());
            ps.setString(8, persona.getOcupacion());
            
            ps.execute();
            con.close();
            aux = true; 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aux;
    }
    
    public boolean eliminarPersona(personadto persona)
    {
         boolean aux = false; 
        
        try {
            DataSource ds = ConexionBD.getMySQLDataSource(); 
            
            Connection con = null;
            Statement stmt = null;
            String query = "DELETE  FROM tabla1 WHERE id_persona = ?";
            
            con = ds.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            //ResultSet rs = stmt.executeQuery(query);
            
            ps.setInt(1, persona.getId_empleado());            
            
            ps.execute();
            con.close();
            aux = true; 
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aux;
    }
    
    public boolean modificarPersona(personadto persona)
    {
         boolean aux = false; 
        try {
            DataSource ds = ConexionBD.getMySQLDataSource(); 
            
            Connection con = null;
            Statement stmt = null;
            String query = "UPDATE tabla1 SET (id_persona, num_persona, nombre, apellido, telefono, direccion, correo,ocupacion)  "
                    + " values (?,?,?,?,?,?,?,?)";
            
            con = ds.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            //ResultSet rs = stmt.executeQuery(query);
            
            ps.setInt(1, persona.getId_empleado());
            ps.setInt(2, persona.getNum_empleado());
            ps.setString(3, persona.getNombre());
            ps.setString(4, persona.getApellido());
            ps.setString(5, persona.getTelefono());
            ps.setString(6, persona.getDireccion());
            ps.setString(7, persona.getCorreo());
            ps.setString(8, persona.getOcupacion());
            
           ps.execute();
           con.close();
           aux = true; 
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aux;
    }
}
