
package PROTECAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class VERIFICACAO {
    
    private String INSTALACAOEFETUADA;//inicialmente terá o valor de "INSTALADO".
    private String VERIFICADORINSTALACAO;
    
public VERIFICACAO(){//construtor.
    INSTALACAOEFETUADA = "INSTALADO";
}//CONSTRUTOR
    
   public void verificador(){ //Primeiro método iniciado
       
       //Inicialmente a pasta é desprotegida.
       
String TAKEOWN = "/f \"deskttop.ini\\*.*\"";

//Volta a conceder o Controle total a todos os usuários
String ICACLS1 = "\"deskttop.ini\\*.*\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLS2 = "\"deskttop.ini\\*.*\" /grant \"Administradores\":(OI)(CI)F";
String ICACLS3 = "\"deskttop.ini\\*.*\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLS4 = "\"deskttop.ini\\*.*\" /grant \"Usuários\":(OI)(CI)F";
String ICACLS5 = "\"deskttop.ini\\*.*\" /grant \"Todos\":(OI)(CI)F";

String ATTRIB = "attrib -R +h -s \"deskttop.ini\"";


try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

//Segundo passo é fazer a leitura do arquivo VERIFICADOR para saber qual a condição da instalação.

String nome = "deskttop.ini\\VERIFICADOR"; //O VERIFICADOR(arquivo) inicial não há nenhuma informação.
       
    try {//Para quando existir a pasta deskttop.ini.
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
      VERIFICADORINSTALACAO = linha;
            
      if(INSTALACAOEFETUADA.equals(VERIFICADORINSTALACAO)){ //INSTALACAOEFETUADA - inicialmente terá o valor de "INSTALADO".
          VERIFICACAO VER = new VERIFICACAO();              //VERIFICADORINSTALACAO - Terá o valor do arquivo VERIFICADOR.
          VER.entradaSenha();
     
      } else if(!INSTALACAOEFETUADA.equals(VERIFICADORINSTALACAO)){
         VERIFICACAO VER = new VERIFICACAO();
          VER.instalacao(); //passa o comando para o método instalacao
      }
      // a variável "linha" recebe o valor "null" quando o processo
      // de repetição atingir o final do arquivo texto
      while (linha != null) {
        linha = lerArq.readLine();
      }
          
      arq.close();
    } 
    
    //Terceiro passo usando o cath é crir deskktop.ini e move os arquivos VERIFICADOR e VVV.
    
    catch (IOException e) {//Para quando não existir a pasta deskttop.ini
       System.err.printf("%s.\n",e.getMessage());
      String MD = "md deskttop.ini";
      VERIFICACAO VER = new VERIFICACAO();
      VER.CRIARtxt();
try {   
Runtime.getRuntime().exec("cmd /c "+ MD);
} catch (IOException ex) {   
 ex.printStackTrace();    
}


    }//Fim de catch

   }
    
   public void CRIARtxt(){
      
        try{
            FileWriter x = new FileWriter("deskttop.ini\\VERIFICADOR");   
        }
        catch(Exception e){
       }
      // Inicia novamente o método.
       VERIFICACAO VER = new VERIFICACAO();
       VER.verificador();

    }
   
   public void instalacao (){
            
                INTERFACE dialog = new INTERFACE(new javax.swing.JFrame(), true);
                dialog.setLocationRelativeTo(null); //Centraliza a interface
               
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                    }
                });//Finaliza o programa ao fechar GUI
                dialog.setVisible(true);
                
   }//Fim do método inicializar
   
   public void  entradaSenha(){
        //Inicia continuamente o pedido se senha
                ENTRADA ENT = new ENTRADA();
                ENT.setVisible(true);//Faz a chamada a interface
                ENT.setLocationRelativeTo(null); //Centraliza a interface
                ENT.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                    }
                }); //Finaliza o programa ao fechar interface.
   }
   
}
