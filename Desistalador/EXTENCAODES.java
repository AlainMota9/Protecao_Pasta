
package PROTECAO;

import java.io.*;

public class EXTENCAODES{
    
    
        
   public EXTENCAODES(){//Construtor 
            
}
   

public void DESIT(){
    EXTENCAODES.DESISTALADOR();
}

private static void DESISTALADOR (){

String TAKEOWN1 = "/f \"deskktop.ini\"";//Concede como Proprietário o Administrador (Administrador)
String TAKEOWN2 = "/f \"deskktop.ini\\*.*\"";//Concede como Proprietário o Administrador (Administrador)
String TAKEOWN3 = "/f \"deskttop.ini\"";//Concede como Proprietário o Administrador (Administrador)
String TAKEOWN4 = "/f \"deskttop.ini\\*.*\"";//Concede como Proprietário o Administrador (Administrador)

   
//Volta a conceder o Controle total a todos os usuários
String ICACLSA1 = "\"deskktop.ini\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSA2 = "\"deskktop.ini\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSA3 = "\"deskktop.ini\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSA4 = "\"deskktop.ini\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSA5 = "\"deskktop.ini\" /grant \"Todos\":(OI)(CI)F";

String ICACLSB1 = "\"deskttop.ini\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSB2 = "\"deskttop.ini\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSB3 = "\"deskttop.ini\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSB4 = "\"deskttop.ini\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSB5 = "\"deskttop.ini\" /grant \"Todos\":(OI)(CI)F";

String ICACLSC1 = "\"deskttop.ini\\*.*\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSC2 = "\"deskttop.ini\\*.*\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSC3 = "\"deskttop.ini\\*.*\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSC4 = "\"deskttop.ini\\*.*\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSC5 = "\"deskttop.ini\\*.*\" /grant \"Todos\":(OI)(CI)F";

String ICACLSD1 = "\"PROTECAO.exe\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSD2 = "\"PROTECAO.exe\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSD3 = "\"PROTECAO.exe\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSD4 = "\"PROTECAO.exe\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSD5 = "\"PROTECAO.exe\" /grant \"Todos\":(OI)(CI)F";

String ATTRIB1 = "attrib -R -h -s \"deskktop.ini\\desktop.ini\"";
String ATTRIB2 = "attrib -R -h -s \"deskktop.ini\"";
String ATTRIB3 = "attrib -R -h -s \"deskttop.ini\\desktop.ini\"";
String ATTRIB4 = "attrib -R -h -s \"deskttop.ini\"";
String ATTRIB5 = "attrib -R -h -s \"PROTECAO.exe\"";

String CIPHER1 = "/D \"deskktop.ini\"";//Descriptografa a pasta

String CIPHER2 = "/REMOVEUSER /CERTHASH:04cae947fd9f9b5f1b5a1682c47a3e9a502f8e94 /B /H \"deskktop.ini\""; //Remove o Certificado
String CIPHER3 = "/REMOVEUSER /CERTHASH:04cae947fd9f9b5f1b5a1682c47a3e9a502f8e94 /B /H \"deskttop.ini\""; //Remove o Certificado
           
String DEL1 = "del /Q \"deskktop.ini\\desktop.ini\"";
String DEL2 = "del /Q \"deskttop.ini\\desktop.ini\"";

String COPY1 = "copy  \"deskttop.ini\\desprotegido.ini\" \"deskktop.ini\\desktop.ini\"";
String COPY2 = "copy  \"deskttop.ini\\desprotegido.ini\" \"deskttop.ini\\desktop.ini\"";

String ATTRIB6 = "attrib +R +h +s \"deskktop.ini\\desktop.ini\"";

String REN1 = "ren deskktop.ini \"SEUS ARQUIVOS\"";
String REN2 = "ren deskttop.ini \"DELETADOS\"";

String MOVE1 = "MOVE /Y \"PROTECAO.exe\" \"DELETADOS\""; 
String RD1 = "rd /S /Q \"DELETADOS\"";
String MD = "md DEL";
String MOVE2 = "MOVE /Y \"DELETADOS\" \"DEL\""; 
String RD2 = "rd /S /Q \"DEL\"";           

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
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSB1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSB2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSB3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSB4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSB5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSC1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSC2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSC3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSC4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSC5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSD1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSD2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSD3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSD4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSD5);
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
Runtime.getRuntime().exec("C:\\Windows\\system32\\cipher.exe "+ CIPHER1);
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
Runtime.getRuntime().exec("cmd /c "+ DEL1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL2);
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
Runtime.getRuntime().exec("cmd /c "+ ATTRIB6);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ REN1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ REN2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MD);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ RD2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

}//FIM DO MÉTODO DESISTALAÇÃO


}



