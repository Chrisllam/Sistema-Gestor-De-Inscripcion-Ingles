/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import BaseDatos.BDAlumno;
import Entidades.Alumnos;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Perla
 */
public class InterfazConsultas extends javax.swing.JFrame {
    BDAlumno mBDA=new BDAlumno();

    /**
     * Creates new form InterfazConsultas
     */
    public InterfazConsultas() {
        initComponents();
        this.ConsultarAlumnos();
    }
    
    public void ConsultarAlumnos(){
        DefaultTableModel model=new DefaultTableModel();
        this.jTable1.setModel(model);        
        model.addColumn("Mumero de Control");
        model.addColumn("Nombre");
        model.addColumn("Carrera");
        model.addColumn("Nivel");
        model.addColumn("Semestre");       
        ArrayList<Alumnos> ListaAlumnos;
        ListaAlumnos=mBDA.ConsultarAlumnos();
        for (Alumnos alumno : ListaAlumnos) {
               
                model.insertRow(0, new Object[]{alumno.getNumero_control(),alumno.getNombre(),alumno.getCarrera(), alumno.getNivel(), alumno.getSemestre()});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnEliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "No. Control", "Carrera", "Nivel Inglés", "Semestre"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnBuscar.setText("Buscar");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Búsqueda");

        BtnModificar.setBackground(new java.awt.Color(204, 204, 204));
        BtnModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        BtnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnEliminar1.setBackground(new java.awt.Color(204, 204, 204));
        BtnEliminar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnEliminar1.setText("Guardar");
        BtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnModificar)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar)
                .addGap(26, 26, 26)
                .addComponent(BtnEliminar1)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnEliminar1))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        EliminarAlumno();
        ConsultarAlumno();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminar1ActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
         ModificarAlumno(); 
    }//GEN-LAST:event_BtnModificarActionPerformed

    public void BuscarAlumnos(){
        DefaultTableModel model=new DefaultTableModel();
        this.jTable1.setModel(model);        
        model.addColumn("NC");
        model.addColumn("Nombre");
        model.addColumn("Carrera");
        model.addColumn("Nivel");
        model.addColumn("Semestre");       
        ArrayList<alumnos> ListaAlumnos;
        alumnos malumno=new Alumnos();
        malumno.setNombre(TxtNombre.getText());
        ListaAlumnos=mBDA.ConsultarAlumnos(malumno);
        for (Alumnos alumno : ListaAlumnos) {
               
                model.insertRow(0, new Object[]{alumno.getNumero_control(),alumno.getNombre(),alumno.getCarrera(), alumno.getNivel(), alumno.getSemestre()});
        }      
    }
    public void ModificarAlumno(){
        Alumnos malumno= new Usuarios();
        FrmAltaAlumno mAltaA= new FrmAltaAlumno();        
        int fila=jTable1.getSelectedRow();
        malumno.setNumero_control((String) jTable1.getValueAt(fila, 0));        
        malumno.setNombre((String) jTable1.getValueAt(fila, 1));
        malumno.setCarrera((String) jTable1.getValueAt(fila, 2));
        malumno.setNivel((int) jTable1.getValueAt(fila, 3));
        malumno.setSemestre((int) jTable1.getValueAt(fila, 4));
        mAltaA.HabilitarModificar();
        mAltaA.AlumnoAnterior(malumno);
        mAltaA.setVisible(true);        
    }

    public void EliminarAlumno(){
        Alumnos malumno= new Alumnos();        
        int fila=jTable1.getSelectedRow();
        malumno.setNumero_control((String) jTable1.getValueAt(fila, 0));        
        malumno.setNombre((String) jTable1.getValueAt(fila, 1));
        malumno.setCarrera((String) jTable1.getValueAt(fila, 2));
        malumno.setNivel((int) jTable1.getValueAt(fila, 3));
        malumno.setSemestre((int) jTable1.getValueAt(fila, 4));
       if( mBDA.EliminarAlumno(malumno))
           JOptionPane.showMessageDialog(null," Alumno Eliminado... ");
       else
           JOptionPane.showMessageDialog(null," No se encontro el Alumno. ");
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
            java.util.logging.Logger.getLogger(InterfazConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
