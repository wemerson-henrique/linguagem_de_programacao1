
package newpackage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*3. Crie as três classes, usando os conceitos de herança, possuindo as seguintes características:
        Atributos
        Atributos da classe privados
        Construtor
        O Construtor da classe deve possuir como parâmetro todos os
        atributos da classe.
        Métodos
        Retorno de todos os atributos (get)
        Inserção de todos os atributos (set)
        Crie um objeto para Música e outro para Livro. Imprima todas as
        informações de cada objeto.*/
        /*System.out.println("\n__________________________________Musica1__________________________________\n");
        AlbumMusica musica1= new newpackage.AlbumMusica("Mc Livinho","Na Ponta do Pé","feixa1",0,"Minha lista de musica",2.5);
        musica1.Inforcacoes();
        System.out.println("\n__________________________________Livro1__________________________________\n");
        Livro livro1=new Livro("Jorge Amado", "Cpitões da area", "123-456-789-123", 0, "Livro que retrata o drama de criaçãsmoradoras de rua", 25.70);
        livro1.Inforcacoes();*/
        
        
        /*4. Crie uma tela semelhante à apresentada a seguir usando os
        comandos de interface gráfica do Java. Acrescentar um botão
        “Resultado” que quando clicado calcula a média dos três
        números. Mostre o resultado em uma segunda janela.*/
        //Janela
        JFrame janela1= new JFrame("Média");
        janela1.setSize(600,300);
        janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Painel
        JPanel painel= new JPanel();
        janela1.setContentPane(painel);
        painel.setLayout(new GridLayout(0,2));
        janela1.setVisible(true);
        //Numro1
        JLabel labelNumero1=new JLabel();
        labelNumero1.setText("Number: ");
        painel.add(labelNumero1);
        
        JTextField imputNumero1= new JTextField(40);
        painel.add(imputNumero1);
        //Numro1
        JLabel labelNumero2=new JLabel();
        labelNumero2.setText("Number: ");
        painel.add(labelNumero2);
        JTextField imputNumero2= new JTextField(40);
        painel.add(imputNumero2);
        //Numro3
        JLabel labelNumero3=new JLabel();
        labelNumero3.setText("Number: ");
        painel.add(labelNumero3);
        JTextField imputNumero3= new JTextField(40);
        painel.add(imputNumero3);
        //Botão1 Result
        JButton botao1=new JButton("Result");
        painel.add(botao1);
        botao1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame janela2=new JFrame("Resultado da Média");
                janela2.setVisible(true);
                janela2.setSize(200,200);
                double num1=Double.parseDouble(imputNumero1.getText());
                double num2=Double.parseDouble(imputNumero2.getText());
                double num3=Double.parseDouble(imputNumero3.getText());
                double media=(num1+num2+num3)/3;
                JLabel labelMedia = new JLabel("Resultado: "+media);
                janela2.add(labelMedia);
            }
        });
        //Botão2 Clear
        JButton botao2=new JButton("Clear");
        painel.add(botao2);
        botao2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                imputNumero1.setText("");
                imputNumero2.setText("");
                imputNumero3.setText("");
            }
        });
    }
    
}
