//FEITO POR WEMERSON HENRIQUE EM 06/02/2021
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author kiran
 */
public class Carro {
    String modelo;
    int ano;
    String marca;
    String cor;
    String chacci;
    
    public Carro(String modelo, int ano, String marca,
    String cor, String chacci){
        this.modelo=modelo;
        this.ano=ano;
        this.marca=marca;
        this.cor=cor;
        this.chacci=chacci;
    }//fazer carro e retangulo
    
    public void mostrar(){
        System.out.println("Modelo: "+modelo);
        System.out.println("ano: "+ano);
        System.out.println("marca: "+marca);
        System.out.println("cor: "+cor);
        System.out.println("chacci: "+chacci);
    }
    
    public void ligar(){
        System.out.println("Carro ligado");
    }
    public void acelerar(){
        System.out.println("Asselerando o carro");
    }
    public void freia(){
        System.out.println("Freiando o carro");
    }
    public void desligar(){
        System.out.println("Carro desligado");
    }
}
