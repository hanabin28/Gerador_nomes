package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerador {
    Scanner scanner = new Scanner(System.in);
    String nome;
    List<Gerador> listGerador = new ArrayList<>();
    public void inserirNomes(){
        System.out.println("Bem-vindo ao gerador de nomes de cachorros!!");
        System.out.println("Insira os nomes que deseja sortear: ");
        scanner.nextLine();

    }

    public void adicionarNomes(){

    }



}
