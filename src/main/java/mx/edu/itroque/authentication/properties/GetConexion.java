package mx.edu.itroque.authentication.properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static com.vaadin.flow.server.VaadinService.getCurrentRequest;

public class GetConexion {

    private static final String CURRENT_CONEXDB_KEY = ConexionBD.class.getCanonicalName();
    private static ConexionBD conexion;

    public GetConexion(){
    }
   /* public static ConexionBD getConexionDB(ConexionBD con) {
        ConexionBD conneccion = (ConexionBD) getCurrentRequest().getWrappedSession()
                .getAttribute(CURRENT_CONEXDB_KEY);

        return conneccion;
    }*/

    /*public static Connection getConnection(ConexionBD con) throws SQLException {
        return DriverManager.getConnection(con.get("JDBC_URL").toString(),con.get("JDBC_USER").toString(),
                con.get("JDBC_PASS").toString());
    }*/

    public static Connection getConexionDB() throws SQLException {
        return DriverManager.getConnection(conexion.get("JDBC_URL").toString(),conexion.get("JDBC_USER").toString(),
                conexion.get("JDBC_PASS").toString());
    }
    public static void setConexionDB(ConexionBD con){
        conexion = con;
    }
}
