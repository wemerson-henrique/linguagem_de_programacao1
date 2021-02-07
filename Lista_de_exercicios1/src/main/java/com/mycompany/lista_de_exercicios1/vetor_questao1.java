//FEITO POR WEMERSON HENRIQUE EM 06/02/2021
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista_de_exercicios1;

import java.util.Scanner;

/**
 *
 * @author kiran
 */
public class vetor_questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Elabore um programa que preencha um vetor com os valores 8 valores 
        digitados pelo usuário. Imprima o vetor. Em seguida imprima o vetor ao contrário.*/
        /*int numero[]=new int[8];
        Scanner ler= new Scanner(System.in);
        for(int i=0;i<numero.length;i++){
            System.out.println("Escreva um número:");
            numero[i]=ler.nextInt();
        }
        for(int i=0;i<numero.length;i++){
            System.out.println(numero[i]);
        }
        System.out.println("-------------------------------------------------");
        for(int i=numero.length-1;i>=0;i--){
            System.out.println(numero[i]);
        }*/
        
        /*2. Leia 6 números e armazene-os em um vetor. 
        Em seguida percorrer o vetor e mostrar se tem o 10 número no vetor e em qual posição.*/
        /*int numeros[] = new int[6];
        Scanner ler=new Scanner(System.in);
        for(int i=0;i<numeros.length;i++){
            System.out.println("Escreva um numero");
            numeros[i]=ler.nextInt();
        }
        System.out.println("O número 10 foi encontrado em:\n-------------------------------");
        System.out.println("Indixe    Valor\n");
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==10){
                System.out.println("   "+i+"        "+numeros[i]);
            }
        }*/
        
        /*3. Criar um programa para ler 10 números inteiros em um vetor A, 
        criar um vetor B que  deverá  receber  os  valores  multiplicados  por  3.  
        Apresentar  os  valores  dos  2 vetores.*/
        /*int A[] = new int[10];
        int B[] = new int[10];
        Scanner ler=new Scanner(System.in);
        for(int i=0;i<A.length;i++){
            System.out.println("Escreva um número:");
            A[i]=ler.nextInt();
            B[i]=A[i]*3;
        }
        System.out.println("Vetor A   Vetor B\n");
        for(int i=0;i<B.length;i++){
           System.out.println("   "+A[i]+"         "+B[i]);
        }*/
        
        /*1. Faça um programa que, a partir de uma string digitada pelo usuário, imprima: 
	a) O número de caracteres da string. 
	b) A string com todas suas letras em minúsculo e em seguida, maiúsculo. 
	c) O número de vogais da string. 
	d) Se a string digitada começa com “INS” (ignorando maiúsculas/minúsculas). 
	e) Se a string digitada termina com “NAS” (ignorando maiúsculas/minúsculas). 
	f) O número de dígitos (0 a 9) da string.
	g) O número de letras da string.*/
        System.out.println("Escreva algo:");
        Scanner ler=new Scanner(System.in);
        String frase=ler.nextLine();
        //a) O número de caracteres da string. 
        System.out.println("O numero de carctere é: "+frase.length());
        //b) A string com todas suas letras em minúsculo e em seguida, maiúsculo.
        System.out.println("Em minúsculo: "+frase.toUpperCase());
        System.out.println("Em MAIÚSCULO: "+frase.toLowerCase());
        //c) O número de vogais da string.
        int vogais=0;
        for(int i=0;i<frase.length();i++){
            char letra=frase.charAt(i);
            if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U'){
                vogais++;
            }
        }
        System.out.println("O número de vogais é: "+vogais);
        //d) Se a string digitada começa com “INS” (ignorando maiúsculas/minúsculas).
        String comessa = frase.substring(0,3);
        if(comessa.equalsIgnoreCase("INS")){
            System.out.println("A estrigue digitada comesma com INS");
        }
        else{
            System.out.println("A estrigue digitada não comesma com INS");
        }
        //e) Se a string digitada termina com “NAS” (ignorando maiúsculas/minúsculas).
        int tamanho_frase=frase.length();
        String termina=frase.substring(tamanho_frase-3,tamanho_frase);
        if(termina.equalsIgnoreCase("NAS")){
            System.out.println("A estrigue digitada termina com NAS");
        }
        else{
            System.out.println("A estrigue digitada não termina com NAS");
        }
        //f) O número de dígitos (0 a 9) da string.
        String digitos=frase.substring(0,9);
        System.out.println("A string é: "+digitos+"     O número de dígitos (0 a 9) da string é: "+digitos.length());
        //g) O número de letras da string.
        int quant_letras=0;
        for(int i=0; i<frase.length();i++){
            char letras = frase.charAt(i);
            String alfabeto="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            for(int x=0;x<alfabeto.length();x++){
                if(letras==alfabeto.charAt(x)){
                    quant_letras++;
                }
            }
        }
        System.out.println("A quantidade de litras é: "+quant_letras);
        //2. Nome na vertical. Faça um programa que solicite o nome do usuário e imprima-o na vertical.
        /*System.out.println("Escreva um nome");
        Scanner ler=new Scanner(System.in);
        String nome=ler.nextLine();
        for(int i=0;i<nome.length();i++){
            System.out.println(nome.charAt(i));
        }*/
        
        /*3. Escreva um programa que dado um valor numérico digitado pelo usuário 
        (armazenado em uma variável inteira), imprima cada um dos seus dígitos por extenso. 
        Exemplo: Entre o número: 4571 Resultado: quatro, cinco, sete, um */
        //PRIMEIRO METODO DE RESOLUÇÃO
        /*System.out.println("Escreva um número");
        Scanner ler=new Scanner(System.in);
        int numero=ler.nextInt();
        String numero1=Integer.toString(numero);
        for(int i=0;i<numero1.length();i++){
            char num=numero1.charAt(i);
            switch (num) {
            case '1':
              System.out.println("um");
              break;
            case '2':
              System.out.println("dois");
              break;
            case '3':
              System.out.println("três");
              break;
            case '4':
              System.out.println("quatro");
              break;
            case '5':
              System.out.println("cinco");
              break;
            case '6':
              System.out.println("seis");
              break;
            case '7':
              System.out.println("sete");
              break;
            case '8':
              System.out.println("oito");
              break;
            case '9':
              System.out.println("nove");
              break;
            case '0':
              System.out.println("zero");
              break;
            default:
              System.out.println("Não é um número");
          }
        }*/
        //SEGUNDO METODO DE RESOLUÇÃO
        /*System.out.println("Escreva um número");
        Scanner ler=new Scanner(System.in);
        int numero=ler.nextInt();
        String numero1=Integer.toString(numero);
        String numeros="1234567890";
        String[][] matriz_numeros = {{"um","dois","três","quatro","cinco","seis","sete","oito","nove","zero"}};
        for(int i=0;i<numero1.length();i++){
            for(int x=0;x<numeros.length();x++){
                char num=numero1.charAt(i);
                char num1=numeros.charAt(x);
                if(num1==num){
                    String nome = matriz_numeros[0][x];
                    System.out.println(nome);
                }
            }
        }*/
    }
    
}
