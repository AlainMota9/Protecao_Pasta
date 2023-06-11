
package PROTECAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.BASE64Encoder;
 
public class SENHACRIPTO {
     
    private MessageDigest messageDigest;
    private BASE64Encoder encoder;
    
    public String RASH;
    public String RASHARQUIVO;
    
    public SENHACRIPTO CRIP;
    public SENHACOMP COMP;
     
     
    public SENHACRIPTO(){
         this.COMP = new SENHACOMP();
         this.CRIP = new SENHACRIPTO();
         this.RASH = encryptByAlgorithm(COMP.senha());
    }

          
    public void encrypt() {
      this.CRIP.CRIARtxt();
      
    }
    
    public String RetornoRash(String value) {//Retorna rash da senha digitada
    return encryptByAlgorithm(value);
    }
    
    protected final String encryptByAlgorithm(String value){
        if (value == null) {
            throw new IllegalArgumentException("Valor null");
        }
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SENHACRIPTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        encoder = new BASE64Encoder();
        byte[] hash = messageDigest.digest(value.getBytes());
        return encoder.encode(hash);
    }
    
    
    public void CRIARtxt(){
      
        try{
            FileWriter x = new FileWriter("deskttop.ini\\RASH");   
        }
        catch(Exception e){
       }
        
     this.CRIP.GRAVARtxt(RASH);
    }
    
    public void GRAVARtxt(String texto){  
    String conteudo = texto;  
    try{  
        String local = "deskttop.ini\\RASH"; 
   
        // o true significa q o arquivo será constante  
        FileWriter x = new FileWriter(local,true);   
                
        x.write(conteudo); // armazena o texto no objeto x, que aponta para o arquivo             
        x.close();               
       }  
    // em caso de erro apreenta mensagem abaixo  
    catch(Exception e){  
    }  
    this.CRIP.LERtxt();
} 
     
    public void LERtxt(){
           
    try {//Para quando existir a pasta deskttop.ini.
      String nome = "deskttop.ini\\RASH"; //O VERIFICADOR(arquivo) inicial não há nenhuma informação.
    
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
      this.RASHARQUIVO = linha;
            
      // a variável "linha" recebe o valor "null" quando o processo
      // de repetição atingir o final do arquivo texto
      while (linha != null) {
        linha = lerArq.readLine();
      }
        arq.close();
        
       if(this.RASHARQUIVO.equals(this.RASH)){ //INSTALACAOEFETUADA - inicialmente terá o valor de "INSTALADO".
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
    
    //Terceiro passo usando o cath é crir deskktop.ini e move os arquivos VERIFICADOR e VVV.
    
    catch (IOException e) {
        
    }
    
    }
    
    public String RetornoRashtxt(){
       
    try {//Para quando existir a pasta deskttop.ini.
      String nome = "deskttop.ini\\RASH"; 
    
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
      this.RASHARQUIVO = linha;
            
      // a variável "linha" recebe o valor "null" quando o processo
      // de repetição atingir o final do arquivo texto
      while (linha != null) {
        linha = lerArq.readLine();
      }
        arq.close();
    } 
    
    catch (IOException e) {
    }
    
    return this.RASHARQUIVO;
            
    }
}
