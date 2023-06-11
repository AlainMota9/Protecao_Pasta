

package PROTECAO;

import java.util.Arrays;
import javax.swing.JOptionPane;
public class ENTRADA extends javax.swing.JDialog {

 
 private char[] SENHA1 = new char[20];//ARMAZENA A PRIMEIRA SENHA DIGITADA
 
 private String SENHA;
 
 private String RASH;
 private String RASHARQUIVO;
 
 private char[] SENHA3 = {'R','E','C','U','P','E','R','A','R'};//ARMAZENA A PALAVRA CHAVE PARA RECUPERAR SENHA
 private char[] SENHA4 = {'D','E','S','I','S','T','A','L','A','R'};//ARMAZENA A PALAVRA CHAVE PARA DESISTALAR   
 
    public ENTRADA() {
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
        jLabel18 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROTEÇÃO DE PASTA");
        setIconImages(getIconImages());
        setLocationByPlatform(true);
        setModalityType(null);
        setName("INSTALAÇÃO"); // NOI18N
        setPreferredSize(new java.awt.Dimension(314, 316));
        setResizable(false);

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("© 2014 Alain L. Mota. Todos os direitos reservados. ");

        jLabel18.setText("INSIRA SUA SENHA");

        jPasswordField3.setColumns(20);
        jPasswordField3.setToolTipText("");
        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyPressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROTECAO/ico_password_manager_96.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18)
                        .addGap(31, 31, 31)
                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 @SuppressWarnings("empty-statement")
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
     SENHACRIPTO CRIP = new SENHACRIPTO();
     RASHARQUIVO = CRIP.RetornoRashtxt();
     
     
       int clickCount = evt.getClickCount();
       
        if(clickCount != 0 ){
           SENHA1 = jPasswordField3.getPassword();
           
           ENTRADA ENT = new ENTRADA();
           ENT.CONVERCAO();
           
            if(Arrays.equals(SENHA1, SENHA4)){//Inicia o processo de Desistalação.
              JOptionPane.showMessageDialog(null, "Seu processo de Desistalação irá iniciar. "
               + "Digite sua senha e click no botão \"Desistalar\".");
                    SENHADES SEN = new SENHADES();
                    SEN.setVisible(true);//Faz a chamada a interface
                    SEN.setLocationRelativeTo(null); //Centraliza a interface
                    SEN.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                    }
                }); //Finaliza o programa ao fechar interface.
            dispose();  
            
            }else if(Arrays.equals(SENHA1, SENHA3)){//Inicia o processo de recuperação de senha.
              ATIVACAOREC AT = new ATIVACAOREC();
              AT.PEN1();
              dispose();
              
            }else if(!RASH.equals(RASHARQUIVO)){
            JOptionPane.showMessageDialog(null, "Senha Incorreta Redigite a senha novamente!");
            
            }else if(RASH.equals(RASHARQUIVO)){//Inicia o processo de entrada a pasta.
             
             new Thread(new ACESSO()).start();//Dá acesso a pasta
             new Thread(new ACESSO()).start();
             new Thread(new ACESSO()).start();
             dispose();
            }
             
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
       SENHA1 = jPasswordField3.getPassword();
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void jPasswordField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyPressed
       SENHA1 = jPasswordField3.getPassword();
    }//GEN-LAST:event_jPasswordField3KeyPressed

    
    public void ENTRADA1() {
       
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ENTRADA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ENTRADA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ENTRADA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ENTRADA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
