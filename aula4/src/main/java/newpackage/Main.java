//FEITO POR WEMERSON HENRIQUE EM 06/02/2021
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
        // TODO code application logic here
        System.out.println("Escreva o Modelo, o ano, a Marca e o chacci de um carro");
        Carro carro1=new Carro("fusca", 1999, "forty", "azul", "0000-00000");
        Carro carro2=new Carro("picape", 2005, "forty", "preto", "1111-1111");
        Carro carro3=new Carro("brasilia", 1978, "forty", "amarela", "1001-1010");
        carro1.mostrar();
        carro1.ligar();
        carro1.acelerar();
        carro2.mostrar();
        carro2.freia();
        carro2.desligar();
        carro3.mostrar();
        carro3.ligar();
        carro3.desligar();
    }
    
}
