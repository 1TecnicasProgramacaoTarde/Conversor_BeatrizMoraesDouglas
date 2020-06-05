/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Scanner;

/**
 *
 * @author dsevi
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    //Declaracão de Variaveis
    double cel, fah; int op;
    //Declaracao e instância de objeto de entrada
    Scanner entrada = new Scanner(System.in); 
    //Apresentacão
    System.out.println("\n\t\t\t |Conversor| \n\t\t\t ");
    //Menu
    System.out.println("[1] Celsius --> Fahrenheit");
    System.out.println("[2] Fahrenheit --> Celsius");
    //Opção do usuário
    System.out.print("\nOpção: ");
    op = entrada.nextInt();
if (op == 1){
//Fah --> Cel

//Entrada
System.out.println("Insira o valor em fahrenheit");
fah = entrada.nextDouble();

//Processamento
cel = fah - 32 * 5 / 9;

//Saída
System.out.printf("\nA temperatura é \n" + cel );}
    

    }
    
}
