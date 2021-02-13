//___________________________________MAIN______________________________________________
//FEITO POR WEMERSON HENRIQUE EM 10/02/2021

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
        /*
        System.out.println("Escreva Nome, RG,Passaporte e o Numero de Voou do passageriro");
        Scanner ler= new Scanner(System.in);
        String nome=ler.nextLine();
        String rg=ler.nextLine();
        String passaporte=ler.nextLine();
        int numVoou=ler.nextInt();
        Passageiro pass1=new Passageiro(nome,rg,passaporte,numVoou);
        */
        System.out.println("===============================================\n CLASSE PASSAGEIRO");
        Passageiro pass1=new Passageiro("jose","123.456.45-74","br1234",12);
        Passageiro pass2=new Passageiro("maria","793.256.42-79","br6789",2);
        System.out.println("PASS1");
        pass1.mostrar();
        pass1.checkin();
        System.out.println("PASS2");
        pass2.mostrar();
        pass2.checkin();
        
        System.out.println("===============================================\n CLASSE VOOU");
        Voou vo1=new Voou("2", "10/02/2021", "19:27", "Aula de PL1");
        Voou vo2=new Voou("12", "21/02/2021", "09:30", "Japão");
        System.out.println("vo1");
        vo1.Mostrar();
        System.out.println("vo2");
        vo2.Mostrar();
    }
    
}
/*jose
123.456.45-74
br1234
12*/