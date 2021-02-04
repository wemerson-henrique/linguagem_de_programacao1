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
        int A[] = new int[10];
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
        }
        
    }
    
}
