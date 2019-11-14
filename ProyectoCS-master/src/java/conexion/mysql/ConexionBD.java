package conexion.mysql;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;

public class ConexionBD {
    
    public static DataSource getMySQLDataSource() {
		MysqlDataSource mysqlDS = null;
		try {
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL("jdbc:mysql://localhost/prueba1");
			mysqlDS.setUser("root");
			mysqlDS.setPassword("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mysqlDS;
	}             
    
}
    
    
    
    