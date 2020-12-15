/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Alumnos;

/**
 *
 * @author Perla
 */
public class InterfazRegistro extends javax.swing.JFrame {
    Alumnos malumno;

    /**
     * Creates new form InterfazRegistro
     */
    public InterfazRegistro() {
        initComponents();
        this.BtnGuardar.setVisible(true);
    }
        public void HabilitarModificar(){
        this.BtnGuardar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblRegistro = new javax.swing.JLabel();
        LblNC = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        LblCarrera = new javax.swing.JLabel();
        LblSemestre = new javax.swing.JLabel();
        LblNivel = new javax.swing.JLabel();
        TxtNC = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtCarrera = new javax.swing.JTextField();
        TxtSemestre = new javax.swing.JTextField();
        TxtNivel = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LblRegistro.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        LblRegistro.setText("Registro de Alumnos");

        LblNC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblNC.setText("Número de Control:");

        LblNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblNombre.setText("Nombre:");

        LblCarrera.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblCarrera.setText("Carrera:");

        LblSemestre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblSemestre.setText("Semestre:");

        LblNivel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblNivel.setText("Nivel:");

        TxtNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNivelActionPerformed(evt);
            }
        });

        BtnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        BtnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblNivel)
                    .addComponent(LblSemestre)
                    .addComponent(LblCarrera)
                    .addComponent(LblNombre)
                    .addComponent(LblNC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtNC)
                    .addComponent(TxtNombre)
                    .addComponent(TxtCarrera)
                    .addComponent(TxtSemestre)
                    .addComponent(TxtNivel, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LblRegistro)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnGuardar)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LblRegistro)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LblNC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(TxtNC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNombre)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblCarrera)
                    .addComponent(TxtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblSemestre)
                    .addComponent(TxtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNivel)
                    .addComponent(TxtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BtnGuardar)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        this.GuardarAlumno();
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TxtNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNivelActionPerformed

     public void GuardarAlumno(){ 
        malumno= new Alumnos();
        malumno.setNombre(TxtNombre.getText());
        malumno.setCarrera(TxtCarrera.getText());
        malumno.setSemestre(TxtSemestre.getText());
        malumno.setNivel(TxtNivel.getText());
        
        if (validar())
        {
            BDAlumno mBDA = new BDAlumno();
            if(mBDA.GuardarAlumno(malumno))
                JOptionPane.showMessageDialog(null, "Alumno Registrado!");
            else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Alumno");
            }
                
        }
        else{
            JOptionPane.showMessageDialog(null, "Faltan llenar datos en el Formulario");
        }
     }
     
     public boolean validar (){
      return !("".equals(TxtNombre.getText()) || "".equals(TxtCarrera.getText()) || "".equals(TxtSemestre.getText()) || "".equals(TxtNivel.getText()));
    }
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
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JLabel LblCarrera;
    private javax.swing.JLabel LblNC;
    private javax.swing.JLabel LblNivel;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblRegistro;
    private javax.swing.JLabel LblSemestre;
    private javax.swing.JTextField TxtCarrera;
    private javax.swing.JTextField TxtNC;
    private javax.swing.JTextField TxtNivel;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtSemestre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
