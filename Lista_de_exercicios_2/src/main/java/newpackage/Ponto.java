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
public class Ponto {
    private int x;
    private int y;
    
    public Ponto(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
    public void Mostrar(){
        System.out.println("Ponto: ("+getX()+","+getY()+")");
    }
    public double Distancia(Ponto ponto1, Ponto ponto2){
        double distancia=Math.sqrt((ponto1.getX()-ponto2.getX())*2+(ponto1.getY()-ponto2.getY())*2);
        return distancia;
    }
}
