package Aula;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Funcionario funcionario = getGerente();
        funcionario.setNome(" Marcelo");
        funcionario.setCpf("214.896.333-00");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());

        Gerente gerente = getGerente();
        gerente.setNome("Marcelo");


        System.out.println(gerente.autentica(123456));

    }

    private static Gerente getGerente() {
        return new Gerente();
    }
}
