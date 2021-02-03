/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
        
        //6. Faça um programa em java que leia dois números  e mostre o maior, no caso em que eles forem iguais informar a mensagem “Números iguais”
        /*System.out.println("Escreva dois numeros:");
        Scanner ler=new Scanner(System.in);
        double num1=ler.nextDouble();
        double num2=ler.nextDouble();
        if(num1>num2){
            System.out.println("O numero maior é: "+num1);
        }
        if(num1<num2){
            System.out.println("O numero maior é: "+num2);
        }else{
            System.out.println("Números iguais");
        }*/
        
        //7. Faça um programa em java que descubra se um número é par ou impar
        /*System.out.println("Escreva um número:");
        Scanner ler= new Scanner(System.in);
        int num=ler.nextInt();
        if(0==num%2){
            System.out.println("O numero "+num+" é par");
        }else{
            System.out.println("O numero "+num+" não é par");
        }*/
        
        /*8. Escreva um programa para ler o ano de nascimento de uma pessoa e
        escrever uma mensagem que diga se ela poderá ou não votar este ano 
        (não é necessário considerar o mês em que ela nasceu).*/
        /*Calendar cal = GregorianCalendar.getInstance();
        int ano_atual = cal.get(Calendar.YEAR);
        
        System.out.println("Escreva o ano se seu nascimento ");
        Scanner ler=new Scanner(System.in);
        int ano= ler.nextInt();
        int idade=ano_atual-ano;
        if(16<=idade){
            System.out.println("Você tem "+idade+" de idade então pode votar");
        }else{
            System.out.println("Você tem "+idade+" de idade então não pode votar");
        }*/
        
        /*9. Faça uma calculadora básica que tenha as funções de Soma, 
        Subtração, Divisão e Multiplicação. Peça ao usuário 2 números e qual operação deseja realizar.*/
        /*boolean acao = true;
        int opcao = 0;
        double num1,num2,resp;
        Scanner ler=new Scanner(System.in);
        do{
            System.out.println("---------------------------------------------------\n");
            System.out.print("Precione"+"           Operação"+"\n");
            System.out.println("    1     para     Sair\n"
                    + "    2     para     Soma\n"
                    + "    3     para     Subtração\n"
                    + "    4     para     Divisão\n"
                    + "    5     para     Multiplicação\n");
            opcao=ler.nextInt();
            if(opcao==1){
                acao = false;
            }
            if(opcao==2){
                System.out.println("Digite dois numeros\n");
                num1=ler.nextDouble();
                num2=ler.nextDouble();
                resp=num1+num2;
                System.out.println("O resoltado da operação é: "+resp);
            }
            if(opcao==3){
                System.out.println("Digite dois numeros\n");
                num1=ler.nextDouble();
                num2=ler.nextDouble();
                resp=num1-num2;
                System.out.println("O resoltado da operação é: "+resp);
            }
            if(opcao==4){
                System.out.println("Digite dois numeros\n");
                num1=ler.nextDouble();
                num2=ler.nextDouble();
                resp=num1/num2;
                System.out.println("O resoltado da operação é: "+resp);
            }
            if(opcao==5){
                System.out.println("Digite dois numeros\n");
                num1=ler.nextDouble();
                num2=ler.nextDouble();
                resp=num1*num2;
                System.out.println("O resoltado da operação é: "+resp);
            }
        }while(acao);*/
        
        //10. Faça um programa que leia um número (n) e imprima os números de 1 a n em ordem crescente (use o comando while).
        /*System.out.println("Escreva um número ate o qual deve ser contado");
        Scanner ler=new Scanner(System.in);
        int num=ler.nextInt();
        int i=1;
        while(i<=num){
            System.out.println(i);
            i++;
        }*/
        
        //11. Faça um programa para imprimir os números pares de 1 a 100 (use o comando for).
        /*System.out.println("Os números para de 1 a 100 são:");
        for(int i=1;i<=100;i++){
            if(0==i%2){
                System.out.println(i);
            }
        }*/
        
        //12. Elabore um programa que leia 10 números fornecidos pelo usuário e imprima todos os números maiores que 20.
        /*int num[]= new int[10];
        Scanner ler=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.println("Escreva um número");
            num[i]=ler.nextInt();
        }
        System.out.println("Os números maiores que 20 são:");
        for(int i=0;i<num.length;i++){
            if(num[i]>20){
                System.out.println(num[i]);
            }
        }*/
        
        //13. Faça um programa que peça ao usuário para digitar 15 valores e  mostre a soma.
        /*int num[]= new int[15];
        int soma=0;
        Scanner ler=new Scanner(System.in);
        for(int i=0;i<15;i++){
            System.err.println("Escreva um número");
            num[i]=ler.nextInt();
            soma=soma+num[i];
        }
        System.out.println("A soma total dos números é: "+soma);*/
        
        //14. Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
        System.out.println("OS números de 1000 a 1999 que quando divididos por 11 obtemos resto 5 são:");
        for(int i=1000;i<=1999;i++){
            if(5==i%11){
                System.out.println(i);
            }
        }
        
    }
    
}
