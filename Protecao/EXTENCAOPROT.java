   

package PROTECAO;

import java.io.*;
import javax.swing.JOptionPane;


public class EXTENCAOPROT{
    
        
   public EXTENCAOPROT(){//Construtor 
            
}
   


public void INSTCERT(){//Instala Certificado
    EXTENCAOPROT.INSTALCERTIFICADO();
}

public void INST(){//Instala o programa
    EXTENCAOPROT.INSTALADOR();
}

public void ACES1(){//Acesso da pasta
    EXTENCAOPROT.ACESSODESBLOQUEAR();
}

public void ACES2(){
    EXTENCAOPROT.ACESSOABRIR();
    }

public void ACES3(){
    EXTENCAOPROT.ACESSOBLOQUEAR();
}

private static void INSTALCERTIFICADO(){

    String START = "START Protecao.pfx";
    
try {   
Runtime.getRuntime().exec("cmd /c "+ START);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

    
}

public void GRAVARtxt(){  
    String conteudo = "INSTALADO";  
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
   
} 

private static void INSTALADOR (){
    
    
String MD1 = "md deskktop.ini";
String MD2 = "md deskttop.ini";

String COPY1 = "copy  \"protegido.ini\" \"deskktop.ini\\desktop.ini\"";
String COPY2 = "copy  \"protegido.ini\" \"deskttop.ini\\desktop.ini\"";

String MOVE1 = "MOVE /Y \"desprotegido.ini\" \"deskttop.ini\"";
String MOVE2 = "MOVE /Y \"Protecao.pfx\" \"deskttop.ini\"";
String MOVE3 = "MOVE /Y \"Protecao.pem\" \"deskttop.ini\"";
String MOVE4 = "MOVE /Y \"protegido.ini\" \"deskttop.ini\"";
String MOVE5 = "MOVE /Y \"protegido.ini\" \"deskttop.ini\"";
String MOVE6 = "MOVE /Y \"DESISTALADOR.exe\" \"deskttop.ini\"";

EXTENCAOPROT EXT = new EXTENCAOPROT();
EXT.GRAVARtxt();
       
String CIPHER1 = "/E /B /H \"deskktop.ini\"";//Criptografa a Pasta

String ATTRIB1 = "attrib +R +h +s \"deskktop.ini\\desktop.ini\"";
String ATTRIB2 = "attrib +R +h +s \"deskktop.ini\"";
String ATTRIB3 = "attrib +R +h +s \"deskttop.ini\\desktop.ini\"";
String ATTRIB4 = "attrib +R +h +s \"deskttop.ini\"";
String ATTRIB5 = "attrib +R +h +s \"PROTECAO.exe\"";

String CIPHER2 = "/ADDUSER /CERTFILE:deskttop.ini\\Protecao.pem /B /H \"deskktop.ini\"";//Adciona um certificado
String CIPHER3 = "/ADDUSER /CERTFILE:deskttop.ini\\Protecao.pem /B /H \"deskttop.ini\"";//Adciona um certificado

String ICACLS1 = "\"deskktop.ini\" /setowner \"Certificado desta Organização\" /t /c /l /q";//Mudança de Proprietário (Modo Administrador)
String ICACLS2 = "\"deskttop.ini\" /setowner \"Certificado desta Organização\" /c /l /q";//Mudança de Proprietário (Modo Administrador)

String ICACLS3 = "\"deskktop.ini\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String ICACLS4 = "\"deskktop.ini\" /deny \"Administradores\":(OI)(CI)F";//Nega o Controle ao Administrador

String ICACLS5 = "\"deskttop.ini\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String ICACLS6 = "\"deskttop.ini\" /deny \"Administradores\":(NP)F";//Nega o Controle ao Administrador

String ICACLS7 = "\"PROTECAO.exe\" /grant:r \"Administradores\":(OI)(CI)RX";//Concede o Controle Total ao Certificado

try {   
Runtime.getRuntime().exec("cmd /c"+ MD1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ MD2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 
 
try {   
Runtime.getRuntime().exec("cmd /c "+ COPY1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ COPY2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE6);
} catch (IOException ex) {   
 ex.printStackTrace();    
}


try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ CIPHER1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ CIPHER2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ CIPHER3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS1);
} catch (IOException ex) {   
 ex.printStackTrace(); 
 JOptionPane.showMessageDialog(null, "Execute o programa em modo administrativo");
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
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS7);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 
 
}//FIM DO BLOCO INTALAÇÃO

private static void ACESSODESBLOQUEAR (){

String TAKEOWN1 = "/f \"deskktop.ini\"";//Concede como Proprietário o Administrador (Administrador)
String TAKEOWN2 = "/f \"deskktop.ini\\*.*\"";

//Volta a conceder o Controle total a todos os usuários
String ICACLS1 = "\"deskktop.ini\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLS2 = "\"deskktop.ini\" /grant \"Administradores\":(OI)(CI)F";
String ICACLS3 = "\"deskktop.ini\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLS4 = "\"deskktop.ini\" /grant \"Usuários\":(OI)(CI)F";
String ICACLS5 = "\"deskktop.ini\" /grant \"Todos\":(OI)(CI)F";

String ATTRIB = "attrib -R +h -s \"deskktop.ini\"";

String CIPHER1 = "/D \"deskktop.ini\"";//Descriptografa a pasta

String CIPHER2 = "/REMOVEUSER /CERTHASH:04cae947fd9f9b5f1b5a1682c47a3e9a502f8e94 /B /H \"deskktop.ini\""; //Remove o Certificado
  
try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN2);
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

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ CIPHER1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ CIPHER2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

}//FIM DO MÉTODO ACESSODESBLOQUEAR

private static void ACESSOABRIR (){

String START = "START deskktop.ini";
 
try {   
Runtime.getRuntime().exec("cmd /c "+ START);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

}//FIM DO MÉTODO ACESSOABRIR

private static void ACESSOBLOQUEAR (){

String CIPHER1 = "/E /B /H \"deskktop.ini\"";//Criptografa a Pasta

String ATTRIB = "attrib +R +h +s \"deskktop.ini\"";

String CIPHER2 = "/ADDUSER /CERTFILE:deskttop.ini\\Protecao.pem /B /H \"deskktop.ini\"";//Adciona um certificado

String ICACLS1 = "\"deskktop.ini\" /setowner \"Certificado desta Organização\" /t /c /l /q";//Mudança de Proprietário (Modo Administrador)

String ICACLS2 = "\"deskktop.ini\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String ICACLS3 = "\"deskktop.ini\" /deny \"Administradores\":(OI)(CI)F";//Nega o Controle ao Administrador
String ICACLS4 = "\"deskktop.ini\" /deny \"SISTEMA\":(OI)(CI)F";//Nega o Controle ao SISTEMA
String ICACLS5 = "\"deskktop.ini\" /deny \"Usuários autenticados\":(OI)(CI)F";//Nega o Controle ao Usuários autenticados
String ICACLS6 = "\"deskktop.ini\" /deny \"Usuários\":(OI)(CI)F";//Nega o Controle ao Usuários
String ICACLS7 = "\"deskktop.ini\" /deny \"Todos\":(OI)(CI)F";//Nega o Controle ao Todos


try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ CIPHER1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ CIPHER2);
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
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLS7);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
System.exit(0);
}//FIM DO MÉTODO ACESSOBLOQUEAR

}



