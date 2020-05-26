package mx.edu.itroque.authentication.properties;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import mx.edu.itroque.utilerias.Notifications;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class GetProperties extends Properties {

    public GetProperties(){}

    public void getConexionProperties(String pArchivo, HashMap Param,String TipoCon) throws IOException {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(pArchivo + ".properties");
            load(inputStream);
            if(TipoCon.equals("mysql")){
                Param.put("JDBC_URL", getProperty("JDBC_URL", "jdbc:mysql://localhost/escuela?useSSL=false&serverTimezone=UTC"));
                Param.put("JDBC_USER", getProperty("JDBC_USER", "root"));
                Param.put("JDBC_PASS", getProperty("JDBC_PASS", ""));
            }else if (TipoCon.equals("postgresql")){
                Param.put("JDBC_URLP", getProperty("JDBC_URLP", "jdbc:postgresql://localhost:5432/bdname"));
                Param.put("JDBC_USERP", getProperty("JDBC_USERP", "postgres"));
                Param.put("JDBC_PASSP", getProperty("JDBC_PASSP", ""));
            }else{
                Param.put("JDBC_URLS", getProperty("JDBC_URLS", "jdbc:sqlserver://localhost:1433"));
                Param.put("JDBC_USERS", getProperty("JDBC_USERS", "sa"));
                Param.put("JDBC_PASSS", getProperty("JDBC_PASSS", ""));
            }

        } catch (Exception e) {
            Notifications ntfException = new Notifications("No se encontró la configuración [ " + pArchivo + " ].. Revisa por favor.",
                    Notification.Position.MIDDLE, NotificationVariant.LUMO_ERROR, 3000);
            ntfException.open();
        }
    }
}
