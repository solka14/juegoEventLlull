
package juegoevent;

import java.util.Scanner;

/**
 *
 * @author karen
 */
public class compuAdivina extends javax.swing.JFrame {

  
    public compuAdivina() {
        initComponents();
        this.setSize(582,350);
    }
     int numAleatorio=(int)(1+(Math.random()*100));
     int minimo=1;
     int maximo=100;
     int contador=0;
public int adivinaVos(){
   txtNum.setText("El numero que pensaste es "+numAleatorio+"??");
    

   
    return 0;
}
public void EsMayor (){
        
              
        if (minimo <= numAleatorio && contador<=5){
            minimo=numAleatorio;}
        
               
        numAleatorio=(int) (Math.random()*(maximo-minimo)+(minimo));
        this.txtNum.setText("mm si es mayor entonces es"+numAleatorio+"?");
       contador++;
        if(contador>5)
           {
            this.txtNum.setText("Perdi, ya realice muchos intentos, bien pensado:((");
            }
        }

public void EsMenor(){
    if(maximo>=numAleatorio && contador<=5){
        maximo=numAleatorio;
    }
    numAleatorio=(int)(Math.random()*(maximo-minimo)+(minimo));
    this.txtNum.setText("amm es menor... entonces es"+numAleatorio+"??");
    contador++;
    if(contador>5)
           {
            this.txtNum.setText("Perdi, ya realice muchos intentos, bien pensado:((");
            }
        
    
            
    
}

public void EseEs(){
    
         this.txtNum.setText("Ganee!! en "+contador+" intentos");
         
    
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenor = new javax.swing.JButton();
        btnMayor = new javax.swing.JButton();
        txtNum = new javax.swing.JLabel();
        btnEs = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnMenor.setBackground(new java.awt.Color(255, 153, 255));
        btnMenor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMenor.setText("Es mayor");
        btnMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenor);
        btnMenor.setBounds(405, 160, 100, 23);

        btnMayor.setBackground(new java.awt.Color(255, 153, 255));
        btnMayor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMayor.setText("Es menor");
        btnMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayorActionPerformed(evt);
            }
        });
        getContentPane().add(btnMayor);
        btnMayor.setBounds(57, 160, 90, 23);

        txtNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNum.setForeground(new java.awt.Color(255, 51, 153));
        txtNum.setText("El numero es:");
        getContentPane().add(txtNum);
        txtNum.setBounds(50, 60, 465, 25);

        btnEs.setBackground(new java.awt.Color(255, 153, 255));
        btnEs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEs.setText("Ese es!");
        btnEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsActionPerformed(evt);
            }
        });
        getContentPane().add(btnEs);
        btnEs.setBounds(250, 160, 90, 23);

        btnSalir.setBackground(new java.awt.Color(204, 255, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(420, 260, 70, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegoevent/fondos/fondo-de-cubos-negros-3D.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayorActionPerformed
this.EsMenor();        // TODO add your handling code here:
    }//GEN-LAST:event_btnMayorActionPerformed

    private void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorActionPerformed
       this.EsMayor();
    }//GEN-LAST:event_btnMenorActionPerformed

    private void btnEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsActionPerformed
this.EseEs();        // TODO add your handling code here:
    }//GEN-LAST:event_btnEsActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
this.setVisible(false);


    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(compuAdivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compuAdivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compuAdivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compuAdivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compuAdivina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEs;
    private javax.swing.JButton btnMayor;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtNum;
    // End of variables declaration//GEN-END:variables
}
