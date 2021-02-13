//___________________________________CLASS  VOOU______________________________________________
//FEITO POR WEMERSON HENRIQUE EM 10/02/2021

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
