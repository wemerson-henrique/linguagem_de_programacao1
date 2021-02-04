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
public class string_questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Faça um programa que, a partir de uma string digitada pelo usuário, imprima: 
	a) O número de caracteres da string. 
	b) A string com todas suas letras em minúsculo e em seguida, maiúsculo. 
	c) O número de vogais da string. 
	d) Se a string digitada começa com “INS” (ignorando maiúsculas/minúsculas). 
	e) Se a string digitada termina com “NAS” (ignorando maiúsculas/minúsculas). 
	f) O número de dígitos (0 a 9) da string.
	g) O número de letras da string.*/
        System.out.println("Escreva algo:");
        Scanner string=new Scanner(System.in);
        String frase=string.nextLine();
        //a) O número de caracteres da string. 
        System.out.println("O numero de carctere é: "+frase.length());
        //b) A string com todas suas letras em minúsculo e em seguida, maiúsculo.
        System.out.println("Em minúsculo: "+frase.toUpperCase());
        System.out.println("Em MAIÚSCULO: "+frase.toLowerCase());
        //c) O número de vogais da string.
        int vagais=0;
        if(true){}
        System.out.println();
    }
    
}
