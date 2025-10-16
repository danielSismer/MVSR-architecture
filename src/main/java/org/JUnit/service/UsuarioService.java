package org.JUnit.service;

import org.JUnit.repository.UsuarioRepository;
import org.JUnit.view.UserIF;
import java.sql.SQLException;

public class UsuarioService {

    public static void saveUser() throws SQLException {
       var user = UserIF.registerUser();
        UsuarioRepository.saveUser(user);
    }
}
