package mx.edu.itroque.authentication;

import mx.edu.itroque.domain.User;

public interface SentenciasDao {

    public User AutentificacionUser(String pUsuario, String pPassword) throws Exception;

    public int registrarUser(User user) throws Exception;

}
