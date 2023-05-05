
package vistas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import practicoobligatorio7.Alumno;
import practicoobligatorio7.Materia;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenualtaalumnos = new javax.swing.JMenuItem();
        jMenualtamaterias = new javax.swing.JMenuItem();
        jMenuinscripcion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        jMenualtaalumnos.setText("Alta Alumnos");
        jMenualtaalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenualtaalumnosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenualtaalumnos);

        jMenualtamaterias.setText("Alta Materia");
        jMenualtamaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenualtamateriasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenualtamaterias);

        jMenuinscripcion.setText("Formulario de inscripcion");
        jMenuinscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuinscripcionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuinscripcion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenualtamateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenualtamateriasActionPerformed
        altaMateria vent = new altaMateria();
        Escritorio.add(vent);
        vent.show();
    }//GEN-LAST:event_jMenualtamateriasActionPerformed

    private void jMenualtaalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenualtaalumnosActionPerformed
        altaAlumnos vent = new altaAlumnos();
        Escritorio.add(vent);
        vent.show();
    }//GEN-LAST:event_jMenualtaalumnosActionPerformed

    private void jMenuinscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuinscripcionActionPerformed
        formularioInscripcion vent = new formularioInscripcion();
        Escritorio.add(vent);
        vent.show();
    }//GEN-LAST:event_jMenuinscripcionActionPerformed

    public static void main(String args[]) {
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenualtaalumnos;
    private javax.swing.JMenuItem jMenualtamaterias;
    private javax.swing.JMenuItem jMenuinscripcion;
    // End of variables declaration//GEN-END:variables
}
