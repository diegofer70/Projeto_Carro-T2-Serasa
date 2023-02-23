/*
 * Variáveis: marca, modelo, ano de fabricação e velocidade atual
 * Métodos: acelera: aumenta a velocidade do carro, frear: diminui a velocidade do carro
 * imprime na tela as informações do carro
 */

import java.util.Scanner;

public class Carro {
    //Variáveis//
    String Marca, Modelo;
    int AnoDeFabricacao, VelocidadeAtual;
    public static void main(String[] args) {
        //Mensagem//
        Scanner scanner = new Scanner(System.in);
        System.out.println("A marca do seu carro: ");
        String Marca = scanner.next();

        System.out.println("Qual o modelo: ");
        String Modelo = scanner.next();

        System.out.println("O ano de fabricação: ");
        int AnoDeFabricacao = scanner.nextInt();

        System.out.println("Escreva um programa em Km/h: ");
        int VelocidadeAtual = scanner.nextInt();

        //Métodos//
        if (VelocidadeAtual >= 10) {
            System.out.println("Aumenta a velocidade!");
        }
        if (VelocidadeAtual < 10) {
            System.out.println("Diminuir a velocidade!");
        }
        
        //imprimir informações//
        System.out.println("Me informe o seu carro " + Marca + ", " + Modelo + ", " + AnoDeFabricacao + " e " + VelocidadeAtual + " Km/h");

        scanner.close();
    }
}
