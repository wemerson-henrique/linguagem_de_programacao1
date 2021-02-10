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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto prod1=new Produto(1,"Sabão empó",12,13.75,"veja");
        prod1.ver();
        Produto prod2=new Produto(2,"colacha",100,2.5,"Que delicia");
        prod2.ver();
        
        Cliente clien1= new Cliente("Algusto", "Rua bom fim 23, Janas", "123.456.67-02", "(37) 95673-2532");
        clien1.ver();
        Cliente clien2= new Cliente("Artur", "Avenida Centra 41, Porto Alegre", "456.783.45-79", "(38) 98364-2754");
        clien2.ver();
    }
    
}
