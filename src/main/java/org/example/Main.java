package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escreva um aplicativo que receba informações do usuario
        // e IMPRIMAR o diamentro do círculo, circunferencia e área
        // UTILIZANDO o valor do ponto flutuante 3,14159 para pi
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o ráio do circulo? ");
        int raio = scanner.nextInt();

//        definir o valor de pi;
        double pi = 3.14159;

//        calcular o diamentro, circunferencia e área
        double diametro = 2 * raio;
        double circunferencia = 2 * pi * raio;
        double area = pi * raio * raio;

        System.out.printf("valor do diametro: %.2f%n" , diametro);

        System.out.printf("valor da circunferencia: %.2f%n" , circunferencia);

        System.out.printf("valor da area: %.2f%n" , area);
        
    }
}