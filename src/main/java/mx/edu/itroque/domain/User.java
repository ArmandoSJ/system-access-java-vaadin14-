package mx.edu.itroque.domain;

import java.io.Serializable;

public class User implements Serializable {

    private String vUserID;
    private String vEmail;
    private String vPwd;
    private String vName;
    private String vStatus;

    //Metodo para crear un usuario
    public User(String vUserID,String vEmail,String vPwd,String vName){
        this.vUserID = vUserID;
        this.vEmail = vEmail;
        this.vPwd = vPwd;
        this.vName = vName;
    }

    //Metodo para autenticar un usuario
    public User(String vUserID,String vEmail,String vPwd,String vName,String vStatus){
        this.vUserID = vUserID;
        this.vEmail = vEmail;
        this.vPwd = vPwd;
        this.vName = vName;
        this.vStatus = vStatus;
    }

    public String getvUserID() {
        return vUserID;
    }

    public String getvEmail() {
        return vEmail;
    }

    public String getvPwd() {
        return vPwd;
    }

    public String getvName() {
        return vName;
    }

    public String getvStatus() {
        return vStatus;
    }
}
