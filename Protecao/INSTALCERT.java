package PROTECAO;

class INSTALCERT implements Runnable {

         private static int cont = 0;
         
        @Override
        public void run() {
            
        EXTENCAOPROT EXT = new EXTENCAOPROT();
            
                cont++;
            
               if (cont == 1){
                  try { 
                       Thread.sleep(500);
                       EXT.INSTCERT();
                       }
                catch(InterruptedException e) {} 
                }
               else if (cont == 2){
                   try { 
                       Thread.sleep(500);
                       EXT.INST();
                       }
                catch(InterruptedException e) {}
                   cont = 0;
             }
                               
        }
                                         
              
        public INSTALCERT() {
                          
        }

}

