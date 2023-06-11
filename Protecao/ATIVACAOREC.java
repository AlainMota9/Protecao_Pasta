/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PROTECAO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ALAIN
 */
public class ATIVACAOREC {

    private String pendrive = "";
    private String Ativacao;
    private String VAtivador;
    
    
        
   public ATIVACAOREC(){//Construtor 
   Ativacao = "A9L8A1I9N9M8O1T9A";
}
   
   
   public void PEN1 (){
    pendrive = "F";
    String nome = pendrive + ":\\PROTOCOLO\\ARQUIVOCHAVE";
       
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
      VAtivador = linha;
      
      SENHACOMP SEN = new SENHACOMP();
      
      
      if(Ativacao.equals(VAtivador)){
      SEN.setVisible(true);//Faz a chamada a interface
      SEN.setLocationRelativeTo(null); //Centraliza a interface
      SEN.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                    }
                }); //Finaliza o programa ao fechar interface.
      
      } else if(!Ativacao.equals(VAtivador)){
         JOptionPane.showMessageDialog(null, "Chave de ativação inconpatível!");
         System.exit(0);
      }
      // a variável "linha" recebe o valor "null" quando o processo
      // de repetição atingir o final do arquivo texto
      while (linha != null) {
        linha = lerArq.readLine();
      }
          
      arq.close();
    } 
    catch (IOException e) {
       System.err.printf("%s.\n",e.getMessage());
       ATIVACAOREC AT = new ATIVACAOREC();
       AT.PEN2();
    }

 }//Fim do método PEN1
 
   public void PEN2 (){
    pendrive = "E";
    String nome = pendrive + ":\\PROTOCOLO\\ARQUIVOCHAVE";
       
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
      VAtivador = linha;
      
      SENHACOMP SEN = new SENHACOMP();
      
      
      if(Ativacao.equals(VAtivador)){
      SEN.setVisible(true);//Faz a chamada a interface
      SEN.setLocationRelativeTo(null); //Centraliza a interface
      SEN.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                    }
                }); //Finaliza o programa ao fechar interface.
      
      } else if(!Ativacao.equals(VAtivador)){
         JOptionPane.showMessageDialog(null, "Chave de ativação inconpatível!");
         System.exit(0);
      }
      // a variável "linha" recebe o valor "null" quando o processo
      // de repetição atingir o final do arquivo texto
      while (linha != null) {
        linha = lerArq.readLine();
      }
          
      arq.close();
    } 
    catch (IOException e) {
       System.err.printf("%s.\n",e.getMessage());
       ATIVACAOREC AT = new ATIVACAOREC();
       AT.PEN3();
    }

 }//Fim do método PEN2
 
   
   public void PEN3 (){
    pendrive = "H";
     String nome = pendrive + ":\\PROTOCOLO\\ARQUIVOCHAVE";
       
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
     VAtivador = linha;
      
     SENHACOMP SEN = new SENHACOMP();
                     
      if(Ativacao.equals(VAtivador)){
      SEN.setVisible(true);//Faz a chamada a interface
      SEN.setLocationRelativeTo(null); //Centraliza a interface
      SEN.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                    }
                }); //Finaliza o programa ao fechar interface.
      
      } else if(!Ativacao.equals(VAtivador)){
         JOptionPane.showMessageDialog(null, "Chave de ativação inconpatível!");
         System.exit(0);
      }
      // a variável "linha" recebe o valor "null" quando o processo
      // de repetição atingir o final do arquivo texto
      while (linha != null) {
        linha = lerArq.readLine();
      }
                              
      arq.close();
    } 
    catch (IOException e) {
     System.err.printf("%s.\n",e.getMessage()); 
     ATIVACAOREC AT = new ATIVACAOREC();
     AT.PEN4();
     
    }

 }//Fim do método PEN3

   public void PEN4 (){
     pendrive = "G";
     String nome = pendrive + ":\\PROTOCOLO\\ARQUIVOCHAVE";
       
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
      VAtivador = linha;
      
     SENHACOMP SEN = new SENHACOMP();
                     
      if(Ativacao.equals(VAtivador)){
        SEN.setVisible(true);//Faz a chamada a interface
        SEN.setLocationRelativeTo(null); //Centraliza a interface
        SEN.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                    }
                }); //Finaliza o programa ao fechar interface.
      
      } else if(!Ativacao.equals(VAtivador)){
         JOptionPane.showMessageDialog(null, Ativacao +"\n"+ VAtivador);
         System.exit(0);
      } 
      // a variável "linha" recebe o valor "null" quando o processo
      // de repetição atingir o final do arquivo texto
      while (linha != null) {
        linha = lerArq.readLine();
      }
                
      arq.close();
    } 
    catch (IOException e) {
     ERRO ER = new ERRO();//Cria o objeto ERRO
      
     ER.setVisible(true);//Faz a chamada a interface
     ER.setLocationRelativeTo(null); //Centraliza a interface
     System.err.printf("%s.\n",e.getMessage());
    }

    
}//Fim do método PEN4

}//Fim da Classe ATIVAÇÃO