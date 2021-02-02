/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author kiran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Faça um programa em java que leia o lado de um quadrado e mostre seu perímetro e área. A=L2 P=L*4
        /*System.out.println("Escreva o lado do quadrado:");
        Scanner ler=new Scanner(System.in);
        double l=ler.nextDouble();
        double p=l*4;
        double a=l*l;
        System.out.println("O perimetro do quadrado é: "+p+"\nA área é: "+a);*/
        
        //2. Faça um programa em java que leia os dois lados do retangunlo e mostre o perímetro e área. A=B*H P=2*B+2*H
        /*System.out.println("Escreva os dois lados do retangulo:");
        Scanner ler=new Scanner(System.in);
        double l1=ler.nextDouble();
        double l2=ler.nextDouble();
        double p=l1*2+l2*2;
        double a=l1*l2;
        System.out.println("O perimetro do quadrado é: "+p+"\nA área é: "+a);*/
        
        //3. Leia um valor inteiro em horas, e imprima-o em minutos.
        /*System.out.println("Escreva as horas:");
        Scanner ler=new Scanner(System.in);
        int hora= ler.nextInt();
        int min=hora*60;
        System.out.println("As horas em minutos são: "+min);*/
        
        //4. Faça um algoritmo que leia quatro idades e calcule a média das mesmas. 
        /*System.out.println("Escreva 4 idades:");
        Scanner idade= new Scanner(System.in);
        int idade1= idade.nextInt();
        int idade2= idade.nextInt();
        int idade3= idade.nextInt();
        int idade4= idade.nextInt();
        double media=(idade1+idade2+idade3+idade4)/4;
        System.out.println("A média das idades são: "+media);*/
        
        //5. Faça um programa em java que leia dois números  e mostre o maior.
        /*System.out.println("Escreva dois numeros:");
        Scanner ler=new Scanner(System.in);
        double num1=ler.nextDouble();
        double num2=ler.nextDouble();
        if(num1>num2){
            System.out.println("O numero maior é: "+num1);
        }else{
            System.out.println("O numero maior é: "+num2);
        }*/
        
        //7. Faça um programa em java que descubra se um número é par ou impar
        System.out.println("Escreva um número:");
        Scanner ler= new Scanner(System.in);
        int num=ler.nextInt();
        if(0==num%2){
            System.out.println("O numero "+num+" é par");
        }else{
            System.out.println("O numero "+num+" não é par");
        }
    }
    
}
