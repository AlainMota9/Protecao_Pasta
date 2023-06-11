

package PROTECAO;

import javax.swing.JOptionPane;


public class INTERFACE extends javax.swing.JDialog {

 
    public INTERFACE(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      }
    
   
       
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gerar = new javax.swing.JButton();
        desistegrar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROTEÇÃO DE PASTA");
        setModalityType(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(2, 145, 75));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GERAR ATIVAÇÃO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PROTECAO/ico_rescue_disk_96 (2).png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("© Alain L. Mota Todos os direitos reservados. ");

        gerar.setText("GERAR");
        gerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerarMouseClicked(evt);
            }
        });

        desistegrar.setText("DESINTEGRAR");
        desistegrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desistegrarMouseClicked(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "F", "G", "H", "E" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(desistegrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gerar)
                    .addComponent(desistegrar))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarMouseClicked
        
        GERADOR INT = new GERADOR();//OBJETO DA CLASSE EXTENÇÃO

        int clickCount = evt.getClickCount();

        if(clickCount != 0 ){
            int Pendrive = jComboBox1.getSelectedIndex();
           
            switch (Pendrive) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Selecione um pendrive!");
                    break;
                case 1:
                    INT.INSTF();
                    break;
                case 2:
                    INT.INSTG();
                    break;
                case 3:
                    INT.INSTH();
                    break;
                case 4:
                    INT.INSTE();
                    break;
            }
            }
    }//GEN-LAST:event_gerarMouseClicked

    private void desistegrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desistegrarMouseClicked
        
        GERADOR INT = new GERADOR();//OBJETO DA CLASSE EXTENÇÃO

        int clickCount = evt.getClickCount();

        if(clickCount != 0 ){
        
            int Pendrive = jComboBox1.getSelectedIndex();
           
            switch (Pendrive) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Selecione um pendrive!");
                    break;
                case 1:
                    INT.DESISTF();
                    break;
                case 2:
                    INT.DESISTG();
                    break;
                case 3:
                    INT.DESISTH();
                    break;
                case 4:
                    INT.DESISTE();
                    break;
            }
        }
    }//GEN-LAST:event_desistegrarMouseClicked

    
    public static void main(String args[]) {
       
       try {

           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                INTERFACE dialog = new INTERFACE(new javax.swing.JFrame(), true);
                dialog.setLocationRelativeTo(null); //Centraliza a janela na tela do computador
                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                
                dialog.setVisible(true);
                
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton desistegrar;
    private javax.swing.JButton gerar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
