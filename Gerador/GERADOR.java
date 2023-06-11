   

package PROTECAO;

import java.io.*;
import javax.swing.JOptionPane;


public class GERADOR{
    
        
   public GERADOR(){//Construtor 
            
}
   

public void INSTF(){//Instala o programa
    GERADOR.INSTALADORF();
    
}

public void INSTG(){//Instala o programa
    GERADOR.INSTALADORG();
    
}

public void INSTH(){//Instala o programa
    GERADOR.INSTALADORH();
    
}

public void INSTE(){//Instala o programa
    GERADOR.INSTALADORE();
    
}

public void DESISTF(){//Acesso da pasta
    GERADOR.DESISTALADORF();
   
}

public void DESISTG(){//Acesso da pasta
    GERADOR.DESISTALADORG();
   
}

public void DESISTH(){//Acesso da pasta
    GERADOR.DESISTALADORH();
   
}

public void DESISTE(){//Acesso da pasta
    GERADOR.DESISTALADORE();
   
}


private static void INSTALADORF (){
    
    
String Cmd1 = "md F:\\PROTOCOLO";

String Cmd11 = "copy  \"D:\\DOCUMENTOS\\2.ESTUDOS E PROJETOS\\PROJETOS\\PROJETOS NETBEANS\\ARQUIVOCHAVE\" \"F:\\PROTOCOLO\\ARQUIVOCHAVE\"";

String Cmd12 = "copy  \"D:\\DOCUMENTOS\\2.ESTUDOS E PROJETOS\\PROJETOS\\PROJETOS NETBEANS\\Protecao.pem\" \"F:\\PROTOCOLO\\Protecao.pem\"";

String Cmd2 = "/E /B /H \"F:\\PROTOCOLO\"";//Criptografa a Pasta

String Cmd3 = "attrib +R +h +s \"F:\\PROTOCOLO\"";

String Cmd33 = "/ADDUSER /CERTFILE:F:\\PROTOCOLO\\Protecao.pem /B /H \"F:\\PROTOCOLO\"";//Adciona um certificado

String Cmd4 = "\"F:\\PROTOCOLO\" /setowner \"Certificado desta Organização\" /c /l /q";//Mudança de Proprietário (Modo Administrador)

String Cmd5 = "\"F:\\PROTOCOLO\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String Cmd6 = "\"F:\\PROTOCOLO\" /deny \"Administradores\":(NP)F";//Nega o Controle ao Administrador

try {   
Runtime.getRuntime().exec("cmd /c"+ Cmd1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd11);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd12);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd33);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 
GERADOR.ACESSOBLOQUEARF();

}//FIM DO BLOCO INTALAÇÃO

private static void ACESSOBLOQUEARF (){

String Cmd2 = "/E /B /H \"F:\\PROTOCOLO\"";//Criptografa a Pasta

String Cmd3 = "attrib +R +h +s \"F:\\PROTOCOLO\"";

String Cmd4 = "/ADDUSER /CERTFILE:F:\\PROTOCOLO\\Protecao.pem /B /H \"deskktop.ini\"";//Adciona um certificado

String Cmd5 = "\"F:\\PROTOCOLO\" /setowner \"Certificado desta Organização\" /c /l /q";//Mudança de Proprietário (Modo Administrador)

String Cmd6 = "\"F:\\PROTOCOLO\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String Cmd7 = "\"F:\\PROTOCOLO\" /deny \"Administradores\":(OI)(CI)F";//Nega o Controle ao Administrador
String Cmd8 = "\"F:\\PROTOCOLO\" /deny \"SISTEMA\":(OI)(CI)F";//Nega o Controle ao SISTEMA
String Cmd9 = "\"F:\\PROTOCOLO\" /deny \"Usuários autenticados\":(OI)(CI)F";//Nega o Controle ao Usuários autenticados
String Cmd10 = "\"F:\\PROTOCOLO\" /deny \"Usuários\":(OI)(CI)F";//Nega o Controle ao Usuários
String Cmd11 = "\"F:\\PROTOCOLO\" /deny \"Todos\":(OI)(CI)F";//Nega o Controle ao Todos


try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd7);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd8);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd9);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd10);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd11);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "INSTALAÇÃO REALIZADA!");
System.exit(0);
}//FIM DO MÉTODO ACESSOBLOQUEAR


private static void INSTALADORG (){
    
    
String Cmd1 = "md G:\\PROTOCOLO";

String Cmd11 = "copy  \"D:\\DOCUMENTOS\\2.ESTUDOS E PROJETOS\\PROJETOS\\PROJETOS NETBEANS\\ARQUIVOCHAVE\" \"G:\\PROTOCOLO\\ARQUIVOCHAVE\"";

String Cmd12 = "copy  \"D:\\DOCUMENTOS\\2.ESTUDOS E PROJETOS\\PROJETOS\\PROJETOS NETBEANS\\Protecao.pem\" \"G:\\PROTOCOLO\\Protecao.pem\"";

String Cmd2 = "/E /B /H \"G:\\PROTOCOLO\"";//Criptografa a Pasta

String Cmd3 = "attrib +R +h +s \"G:\\PROTOCOLO\"";

String Cmd33 = "/ADDUSER /CERTFILE:G:\\PROTOCOLO\\Protecao.pem /B /H \"G:\\PROTOCOLO\"";//Adciona um certificado

String Cmd4 = "\"G:\\PROTOCOLO\" /setowner \"Certificado desta Organização\" /c /l /q";//Mudança de Proprietário (Modo Administrador)

String Cmd5 = "\"G:\\PROTOCOLO\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String Cmd6 = "\"G:\\PROTOCOLO\" /deny \"Administradores\":(NP)F";//Nega o Controle ao Administrador

try {   
Runtime.getRuntime().exec("cmd /c"+ Cmd1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd11);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd12);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd33);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 
GERADOR.ACESSOBLOQUEARG();

}//FIM DO BLOCO INTALAÇÃO

private static void ACESSOBLOQUEARG (){

String Cmd2 = "/E /B /H \"G:\\PROTOCOLO\"";//Criptografa a Pasta

String Cmd3 = "attrib +R +h +s \"G:\\PROTOCOLO\"";

String Cmd4 = "/ADDUSER /CERTFILE:G:\\PROTOCOLO\\Protecao.pem /B /H \"deskktop.ini\"";//Adciona um certificado

String Cmd5 = "\"G:\\PROTOCOLO\" /setowner \"Certificado desta Organização\" /c /l /q";//Mudança de Proprietário (Modo Administrador)

String Cmd6 = "\"G:\\PROTOCOLO\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String Cmd7 = "\"G:\\PROTOCOLO\" /deny \"Administradores\":(OI)(CI)F";//Nega o Controle ao Administrador
String Cmd8 = "\"G:\\PROTOCOLO\" /deny \"SISTEMA\":(OI)(CI)F";//Nega o Controle ao SISTEMA
String Cmd9 = "\"G:\\PROTOCOLO\" /deny \"Usuários autenticados\":(OI)(CI)F";//Nega o Controle ao Usuários autenticados
String Cmd10 = "\"G:\\PROTOCOLO\" /deny \"Usuários\":(OI)(CI)F";//Nega o Controle ao Usuários
String Cmd11 = "\"G:\\PROTOCOLO\" /deny \"Todos\":(OI)(CI)F";//Nega o Controle ao Todos


try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd7);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd8);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd9);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd10);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd11);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "INSTALAÇÃO REALIZADA!");
System.exit(0);
}//FIM DO MÉTODO ACESSOBLOQUEAR


private static void INSTALADORH (){
    
    
String Cmd1 = "md H:\\PROTOCOLO";

String Cmd11 = "copy  \"D:\\DOCUMENTOS\\2.ESTUDOS E PROJETOS\\PROJETOS\\PROJETOS NETBEANS\\ARQUIVOCHAVE\" \"H:\\PROTOCOLO\\ARQUIVOCHAVE\"";

String Cmd12 = "copy  \"D:\\DOCUMENTOS\\2.ESTUDOS E PROJETOS\\PROJETOS\\PROJETOS NETBEANS\\Protecao.pem\" \"H:\\PROTOCOLO\\Protecao.pem\"";

String Cmd2 = "/E /B /H \"H:\\PROTOCOLO\"";//Criptografa a Pasta

String Cmd3 = "attrib +R +h +s \"H:\\PROTOCOLO\"";

String Cmd33 = "/ADDUSER /CERTFILE:H:\\PROTOCOLO\\Protecao.pem /B /H \"H:\\PROTOCOLO\"";//Adciona um certificado

String Cmd4 = "\"H:\\PROTOCOLO\" /setowner \"Certificado desta Organização\" /c /l /q";//Mudança de Proprietário (Modo Administrador)

String Cmd5 = "\"H:\\PROTOCOLO\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String Cmd6 = "\"H:\\PROTOCOLO\" /deny \"Administradores\":(NP)F";//Nega o Controle ao Administrador

try {   
Runtime.getRuntime().exec("cmd /c"+ Cmd1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd11);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd12);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd33);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 
GERADOR.ACESSOBLOQUEARH();

}//FIM DO BLOCO INTALAÇÃO

private static void ACESSOBLOQUEARH (){

String Cmd2 = "/E /B /H \"G:\\PROTOCOLO\"";//Criptografa a Pasta

String Cmd3 = "attrib +R +h +s \"G:\\PROTOCOLO\"";

String Cmd4 = "/ADDUSER /CERTFILE:G:\\PROTOCOLO\\Protecao.pem /B /H \"deskktop.ini\"";//Adciona um certificado

String Cmd5 = "\"G:\\PROTOCOLO\" /setowner \"Certificado desta Organização\" /c /l /q";//Mudança de Proprietário (Modo Administrador)

String Cmd6 = "\"G:\\PROTOCOLO\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String Cmd7 = "\"G:\\PROTOCOLO\" /deny \"Administradores\":(OI)(CI)F";//Nega o Controle ao Administrador
String Cmd8 = "\"G:\\PROTOCOLO\" /deny \"SISTEMA\":(OI)(CI)F";//Nega o Controle ao SISTEMA
String Cmd9 = "\"G:\\PROTOCOLO\" /deny \"Usuários autenticados\":(OI)(CI)F";//Nega o Controle ao Usuários autenticados
String Cmd10 = "\"G:\\PROTOCOLO\" /deny \"Usuários\":(OI)(CI)F";//Nega o Controle ao Usuários
String Cmd11 = "\"G:\\PROTOCOLO\" /deny \"Todos\":(OI)(CI)F";//Nega o Controle ao Todos


try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd7);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd8);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd9);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd10);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd11);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "INSTALAÇÃO REALIZADA!");
System.exit(0);
}//FIM DO MÉTODO ACESSOBLOQUEAR


private static void INSTALADORE (){
    
    
String Cmd1 = "md E:\\PROTOCOLO";

String Cmd11 = "copy  \"D:\\DOCUMENTOS\\2.ESTUDOS E PROJETOS\\PROJETOS\\PROJETOS NETBEANS\\ARQUIVOCHAVE\" \"E:\\PROTOCOLO\\ARQUIVOCHAVE\"";

String Cmd12 = "copy  \"D:\\DOCUMENTOS\\2.ESTUDOS E PROJETOS\\PROJETOS\\PROJETOS NETBEANS\\Protecao.pem\" \"E:\\PROTOCOLO\\Protecao.pem\"";

String Cmd2 = "/E /B /H \"E:\\PROTOCOLO\"";//Criptografa a Pasta

String Cmd3 = "attrib +R +h +s \"E:\\PROTOCOLO\"";

String Cmd33 = "/ADDUSER /CERTFILE:E:\\PROTOCOLO\\Protecao.pem /B /H \"E:\\PROTOCOLO\"";//Adciona um certificado

String Cmd4 = "\"E:\\PROTOCOLO\" /setowner \"Certificado desta Organização\" /c /l /q";//Mudança de Proprietário (Modo Administrador)

String Cmd5 = "\"E:\\PROTOCOLO\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String Cmd6 = "\"E:\\PROTOCOLO\" /deny \"Administradores\":(NP)F";//Nega o Controle ao Administrador

try {   
Runtime.getRuntime().exec("cmd /c"+ Cmd1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd11);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd12);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd33);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 
GERADOR.ACESSOBLOQUEARE();

}//FIM DO BLOCO INTALAÇÃO

private static void ACESSOBLOQUEARE (){

String Cmd2 = "/E /B /H \"E:\\PROTOCOLO\"";//Criptografa a Pasta

String Cmd3 = "attrib +R +h +s \"E:\\PROTOCOLO\"";

String Cmd4 = "/ADDUSER /CERTFILE:E:\\PROTOCOLO\\Protecao.pem /B /H \"deskktop.ini\"";//Adciona um certificado

String Cmd5 = "\"E:\\PROTOCOLO\" /setowner \"Certificado desta Organização\" /c /l /q";//Mudança de Proprietário (Modo Administrador)

String Cmd6 = "\"E:\\PROTOCOLO\" /grant \"Certificado desta Organização\":(OI)(CI)F";//Concede o Controle Total ao Certificado

String Cmd7 = "\"E:\\PROTOCOLO\" /deny \"Administradores\":(OI)(CI)F";//Nega o Controle ao Administrador
String Cmd8 = "\"E:\\PROTOCOLO\" /deny \"SISTEMA\":(OI)(CI)F";//Nega o Controle ao SISTEMA
String Cmd9 = "\"E:\\PROTOCOLO\" /deny \"Usuários autenticados\":(OI)(CI)F";//Nega o Controle ao Usuários autenticados
String Cmd10 = "\"E:\\PROTOCOLO\" /deny \"Usuários\":(OI)(CI)F";//Nega o Controle ao Usuários
String Cmd11 = "\"E:\\PROTOCOLO\" /deny \"Todos\":(OI)(CI)F";//Nega o Controle ao Todos


try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd7);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd8);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd9);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd10);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd11);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "INSTALAÇÃO REALIZADA!");
System.exit(0);
}//FIM DO MÉTODO ACESSOBLOQUEAR


private static void DESISTALADORF (){

String Cmd1 = "/f \"F:\\PROTOCOLO\"";//Concede como Proprietário o Administrador (Administrador)

//Volta a conceder o Controle total a todos os usuários
String Cmd3 = "\"F:\\PROTOCOLO\" /grant \"SISTEMA\":(OI)(CI)F";
String Cmd4 = "\"F:\\PROTOCOLO\" /grant \"Administradores\":(OI)(CI)F";
String Cmd5 = "\"F:\\PROTOCOLO\" /grant \"Usuários autenticados\":(OI)(CI)F";
String Cmd6 = "\"F:\\PROTOCOLO\" /grant \"Usuários\":(OI)(CI)F";
String Cmd7 = "\"F:\\PROTOCOLO\" /grant \"Todos\":(OI)(CI)F";

String Cmd8 = "attrib -R -h -s \"F:\\PROTOCOLO\"";

String Cmd9 = "/D \"F:\\PROTOCOLO\"";//Descriptografa a pasta

String Cmd10 = "rd /S /Q \"F:\\PROTOCOLO\"";
 
try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ Cmd1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd7);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd8);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd9);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd10);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "DESISTALAÇÃO REALIZADA!");
System.exit(0);

}//FIM DO MÉTODO ACESSODESBLOQUEAR

private static void DESISTALADORG (){

String Cmd1 = "/f \"G:\\PROTOCOLO\"";//Concede como Proprietário o Administrador (Administrador)

//Volta a conceder o Controle total a todos os usuários
String Cmd3 = "\"G:\\PROTOCOLO\" /grant \"SISTEMA\":(OI)(CI)F";
String Cmd4 = "\"G:\\PROTOCOLO\" /grant \"Administradores\":(OI)(CI)F";
String Cmd5 = "\"G:\\PROTOCOLO\" /grant \"Usuários autenticados\":(OI)(CI)F";
String Cmd6 = "\"G:\\PROTOCOLO\" /grant \"Usuários\":(OI)(CI)F";
String Cmd7 = "\"G:\\PROTOCOLO\" /grant \"Todos\":(OI)(CI)F";

String Cmd8 = "attrib -R -h -s \"G:\\PROTOCOLO\"";

String Cmd9 = "/D \"G:\\PROTOCOLO\"";//Descriptografa a pasta

String Cmd10 = "rd /S /Q \"G:\\PROTOCOLO\"";
 
try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ Cmd1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd7);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd8);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd9);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd10);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "DESISTALAÇÃO REALIZADA!");
System.exit(0);

}//FIM DO MÉTODO ACESSODESBLOQUEAR

private static void DESISTALADORH (){

String Cmd1 = "/f \"H:\\PROTOCOLO\"";//Concede como Proprietário o Administrador (Administrador)

//Volta a conceder o Controle total a todos os usuários
String Cmd3 = "\"H:\\PROTOCOLO\" /grant \"SISTEMA\":(OI)(CI)F";
String Cmd4 = "\"H:\\PROTOCOLO\" /grant \"Administradores\":(OI)(CI)F";
String Cmd5 = "\"H:\\PROTOCOLO\" /grant \"Usuários autenticados\":(OI)(CI)F";
String Cmd6 = "\"H:\\PROTOCOLO\" /grant \"Usuários\":(OI)(CI)F";
String Cmd7 = "\"H:\\PROTOCOLO\" /grant \"Todos\":(OI)(CI)F";

String Cmd8 = "attrib -R -h -s \"H:\\PROTOCOLO\"";

String Cmd9 = "/D \"H:\\PROTOCOLO\"";//Descriptografa a pasta

String Cmd10 = "rd /S /Q \"H:\\PROTOCOLO\"";
 
try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ Cmd1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd7);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd8);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd9);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd10);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "DESISTALAÇÃO REALIZADA!");
System.exit(0);

}//FIM DO MÉTODO ACESSODESBLOQUEAR

private static void DESISTALADORE (){

String Cmd1 = "/f \"E:\\PROTOCOLO\"";//Concede como Proprietário o Administrador (Administrador)

//Volta a conceder o Controle total a todos os usuários
String Cmd3 = "\"E:\\PROTOCOLO\" /grant \"SISTEMA\":(OI)(CI)F";
String Cmd4 = "\"E:\\PROTOCOLO\" /grant \"Administradores\":(OI)(CI)F";
String Cmd5 = "\"E:\\PROTOCOLO\" /grant \"Usuários autenticados\":(OI)(CI)F";
String Cmd6 = "\"E:\\PROTOCOLO\" /grant \"Usuários\":(OI)(CI)F";
String Cmd7 = "\"E:\\PROTOCOLO\" /grant \"Todos\":(OI)(CI)F";

String Cmd8 = "attrib -R -h -s \"E:\\PROTOCOLO\"";

String Cmd9 = "/D \"E:\\PROTOCOLO\"";//Descriptografa a pasta

String Cmd10 = "rd /S /Q \"E:\\PROTOCOLO\"";
 
try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ Cmd1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd6);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ Cmd7);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd8);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ Cmd9);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ Cmd10);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
JOptionPane.showMessageDialog(null, "DESISTALAÇÃO REALIZADA!");
System.exit(0);

}//FIM DO MÉTODO ACESSODESBLOQUEAR

}



