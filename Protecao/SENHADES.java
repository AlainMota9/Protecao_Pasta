

package PROTECAO;

import java.io.IOException;
import javax.swing.JOptionPane;

public class SENHADES extends javax.swing.JDialog {

    private char[] SENHA1 = new char[20];//ARMAZENA A PRIMEIRA SENHA DIGITADA
       
    private String SENHA;
 
    private String RASH;
    private String RASHARQUIVO;
 
    
    public SENHADES() {
       initComponents();
      }
    
       public void CONVERCAO (){
    //Passa todos os valores para char para poder fazer a conveção.
                Character C1 = SENHA1[0];
                Character C2 = SENHA1[1];
                Character C3 = SENHA1[2];
                Character C4 = SENHA1[3];
                Character C5 = SENHA1[4];
                Character C6 = SENHA1[5];
                Character C7 = SENHA1[6];
                Character C8 = SENHA1[7];
                Character C9 = SENHA1[8];
                Character C10 = SENHA1[9];
                Character C11 = SENHA1[10];
                Character C12 = SENHA1[11];
                Character C13 = SENHA1[12];
                Character C14 = SENHA1[13];
                Character C15 = SENHA1[14];
                Character C16 = SENHA1[15];
                Character C17 = SENHA1[16];
                Character C18 = SENHA1[17];
                Character C19 = SENHA1[18];
                Character C20 = SENHA1[19];


                String S1 = Character.toString(C1);
                String S2 = Character.toString(C2);
                String S3 = Character.toString(C3);
                String S4 = Character.toString(C4);
                String S5 = Character.toString(C5);
                String S6 = Character.toString(C6);
                String S7 = Character.toString(C7);
                String S8 = Character.toString(C8);
                String S9 = Character.toString(C9);
                String S10 = Character.toString(C10);
                String S11 = Character.toString(C11);
                String S12 = Character.toString(C12);
                String S13 = Character.toString(C13);
                String S14 = Character.toString(C14);
                String S15 = Character.toString(C15);
                String S16 = Character.toString(C16);
                String S17 = Character.toString(C17);
                String S18 = Character.toString(C18);
                String S19 = Character.toString(C19);
                String S20 = Character.toString(C20);
                
                String SenhaFinal = S1 + S2 + S3 + S4 + S5 + S6 + S7 + S8 + S9 + S10 + S11 + S12 + S13 + S14 + S15 + S16 + S17 + S18 + S19 + S20;
                
                SENHA = SenhaFinal;
                
                SENHACRIPTO CRIP = new SENHACRIPTO();
                RASH = CRIP.RetornoRash(SENHA);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROTEÇÃO DE PASTA");
        setIconImages(getIconImages());
        setLocationByPlatform(true);
        setModalityType(null);
        setName("INSTALAÇÃO"); // NOI18N
        setResizable(false);

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROTECAO/ico_password_manager_96.png"))); // NOI18N

        jLabel2.setText("INSIRA SUA SENHA");

        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jLabel3.setText("PROCESSO DE DESISTALAÇÃO INICIADO");

        jLabel4.setBackground(new java.awt.Color(51, 153, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("© 2014 Alain L. Mota. Todos os direitos reservados. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel2))
                                .addGap(36, 36, 36)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
       SENHA1 = jPasswordField1.getPassword();
     
    }//GEN-LAST:event_jPasswordField1ActionPerformed

           
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
              
        int clickCount = evt.getClickCount();
        
        if(clickCount != 0 ){
           SENHACRIPTO CRIP = new SENHACRIPTO();
           RASHARQUIVO = CRIP.RetornoRashtxt();
     
           SENHA1 = jPasswordField1.getPassword();
           
           SENHADES DES = new SENHADES();
           DES.CONVERCAO();
                       
            if(!RASH.equals(RASHARQUIVO)){
            JOptionPane.showMessageDialog(null, "Senha diferentes, porfavor digite novamente a senha!");
            
            }else if(RASH.equals(RASHARQUIVO)){
            String Cmd1 = "START deskttop.ini\\DESISTALADOR.exe";
 
             try {   
             Runtime.getRuntime().exec("cmd /c "+ Cmd1);
             } catch (IOException ex) {   
              ex.printStackTrace();    
             } 
                
             dispose();
            }
           
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
         SENHA1 = jPasswordField1.getPassword();
    }//GEN-LAST:event_jPasswordField1KeyPressed

    
    
    public void SENHA1() {
       
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SENHADES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SENHADES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SENHADES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SENHADES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
