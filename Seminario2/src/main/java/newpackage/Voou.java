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
public class Voou {
    String numVoou;
    String data;
    String hora;
    String destino;
    
    public Voou(String numVoou, String data, String hora, String destino){
        this.numVoou=numVoou;
        this.data=data;
        this.hora=hora;
        this.destino=destino;
    }
    public void Mostrar(){
        System.out.println("Numero do Voou: "+numVoou);
        System.out.println("Data do Voou: "+data);
        System.out.println("Hora do Voou: "+hora);
        System.out.println("Destino do Voou: "+destino);
    }
}
