package org.JUnit;

import org.JUnit.service.UsuarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        while (true) {
            UsuarioService.saveUser();
        }

    }

}


// maybe it should be improved