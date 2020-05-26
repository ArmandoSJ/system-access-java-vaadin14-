package mx.edu.itroque.authentication.properties;

import java.util.HashMap;

public class ConexionBD extends HashMap {

    public ConexionBD(){
        this.put("JDBC_URL", "");
        this.put("JDBC_USER", "");
        this.put("JDBC_PASS", "");
    }

}
