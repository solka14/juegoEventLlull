/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoevent;

import java.util.Scanner;
import javax.swing.JButton;

/**
 *
 * @author karen
 */
public class personaAdivina extends javax.swing.JFrame {

    /**
     * Creates new form personaAdivina
     */
    public personaAdivina() {
        initComponents();
      this.setSize(597,345);
    }
   int numero=1+(int)(Math.random()*100);
   int contador=0;
  
public int adivinoyo(int valor){
 
  boolean ganar=false;
  System.out.println("Tenes que adivinar el numero que pensé en un rango del 1 al 100");
   
     contador++;
     
      if(valor==numero){
          txtNumero.setText("Felicidades crack!! Ganaste en "+contador+" intentos");
     
      this.setVisible(true);
      
      ganar=true;
      }else{
         String resul="";
         if(numero>valor){
          resul="mayor";
          txtNumero.setText("mi numero no es "+valor+" mi numero es mayor");
         }else{
          resul="menor";
          txtNumero.setText("mi numero no es"+valor+" mi numero es menorrr");
         }
        
      }
   
if(contador==20 && ganar==false) {
   //'contador==20' representa el numero de oportunidades del jugador
  txtNumero.setText("Ups, no has adivinado, el numero era el "+numero+ " ,suerte para la proxima!!");
    
    btnAceptar.setEnabled(false);
   }
        return 0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnNumero = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        txtNumero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setText("Elegi un numero:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 37, 182, 22);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(275, 37, 90, 23);

        btnNumero.setText("0");
        btnNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(btnNumero);
        btnNumero.setBounds(217, 38, 48, 20);

        btnSalir.setBackground(new java.awt.Color(255, 0, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(263, 230, 100, 23);

        txtNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(102, 255, 153));
        txtNumero.setText("Holi!");
        getContentPane().add(txtNumero);
        txtNumero.setBounds(31, 103, 324, 35);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegoevent/fondos/fondo-de-cubos-negros-3D.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       //en estas lineas lo que hago es convertir el numero en un entero(porque sino lo tomas como String), y en caso
       //que se escriba una letra o palabra o negativos, saldra la excepcion
        String texto = btnNumero.getText(); 
       int numIngre;
      try{
       numIngre =  Integer.parseInt(texto);
       this.adivinoyo(numIngre);
      }
       catch(Exception ex){
           System.out.println("que haces?????, solo numeros y posotivos :D !");
    }
    
       
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroActionPerformed
               
    }//GEN-LAST:event_btnNumeroActionPerformed

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
            java.util.logging.Logger.getLogger(personaAdivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personaAdivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personaAdivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personaAdivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personaAdivina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JTextField btnNumero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtNumero;
    // End of variables declaration//GEN-END:variables
}
