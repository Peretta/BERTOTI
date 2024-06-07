package org.conversorSql;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Model Conversor = new Model();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o texto que será convertido para SQL");
        String texto_natural = scanner.nextLine();

        Conversor.setContent(texto_natural);

        String prompt = Conversor.converterSql();
        System.out.println(prompt);

    }
}