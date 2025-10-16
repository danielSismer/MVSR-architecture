package org.JUnit.view;

import org.JUnit.model.Usuario;
import org.JUnit.repository.UsuarioRepository;

import java.util.Scanner;

public class UserIF {

    static Scanner input = new Scanner(System.in);

    public static Usuario registerUser(){
        System.out.println("--------------------------------------");
        System.out.println("           Cadastrar Usuário          ");
        System.out.println("---------------------------------------");
        System.out.print(" -> Insira o Nome do Usuário: ");
        String nome = input.nextLine();
        System.out.print(" -> Insira o Endereço do Usuário: ");
        String endereco = input.nextLine();
        System.out.print(" -> Insira o CPF do Usuário: ");
        String cpf = input.nextLine();
        return new Usuario(nome, endereco, cpf);
    }
}
