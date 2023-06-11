package PROTECAO;

import java.io.IOException;
import javax.swing.JOptionPane;

class ACESSO implements Runnable {

        private static int cont = 0;
        
        @Override
        public void run() {
            
        EXTENCAOPROT EXT = new EXTENCAOPROT();
            
     
               cont++;
            
                          
               if (cont == 1){
                   try { 
                       Thread.sleep(500);
                       EXT.ACES1();
                       }
                catch(InterruptedException e) {}
               }
               else if (cont == 2){
                   try { 
                       Thread.sleep(2000);
                       EXT.ACES2();
                       }
                catch(InterruptedException e) {}
               }
               else if (cont == 3){
                   try { 
                       Thread.sleep(6000);//1000 milisegundos = 1 segundos
                       EXT.ACES3();
                       }
                catch(InterruptedException e) {}
                   cont = 0;
               }
                          
            
        }

        public ACESSO() {
            
            
              
        }

}

