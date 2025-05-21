package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre x : ");
        float nombre_x = scanner.nextFloat();

        System.out.print("Entrez un nombre y : ");
        float nombre_y = scanner.nextFloat();

        System.out.print("Entrez un operateur : ");
        char operator = scanner.next().charAt(0);

        System.out.println("Résultat: " + Calculatrice.calcul(nombre_x, nombre_y, operator));

        scanner.close();
    }
}