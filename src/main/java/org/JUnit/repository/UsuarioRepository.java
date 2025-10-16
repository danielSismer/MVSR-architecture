package org.JUnit.repository;

import org.JUnit.model.Usuario;
import org.JUnit.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioRepository {

    public static void saveUser(Usuario u ) throws SQLException {
        String query = """
                INSERT INTO usuario (nome, endereco, cpf) VALUES (?, ?, ?);
                """;
        try (Connection conn = ConnectionDB.connection(); PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEndereco());
            stmt.setString(3, u.getCpf());
            stmt.executeUpdate();
            System.out.println("Usuário registrado com sucesso!!!");
        }
    }
}
