/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Venta;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Ventas_Tabla extends javax.swing.JFrame {

    DefaultTableModel modelTable = new DefaultTableModel();
    
    public Ventas_Tabla() {
        initComponents();
        
        this.tblDatos.setModel(modelTable);
        
        modelTable.addColumn("ID");
        modelTable.addColumn("Nombre Cliente");
        modelTable.addColumn("Correo Cliente");
        modelTable.addColumn("Instrumento o Accesorio");
        modelTable.addColumn("Marca y Modelo");
        modelTable.addColumn("Cantidad");
        modelTable.addColumn("Valor Total");
        modelTable.addColumn("Fecha");
    }

    public void mostrarDatos(ArrayList<Venta> ventas){
            if(modelTable.getRowCount()>0){
                
            }
           for (Venta venta:ventas) {
            String[] data = {
                venta.getId() + "",
                venta.getNombre_cli(),
                venta.getCorreo_cli(),
                venta.getNombre(),
                venta.getMarca_modelo(),
                venta.getCantidad()+ "",
                venta.getValorTotal() + "",
                venta.getFecha()
      
            };
            modelTable.addRow(data);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");

        pnlFondo.setBackground(new java.awt.Color(204, 204, 204));
        pnlFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitulo.setBackground(new java.awt.Color(51, 153, 255));
        lblTitulo.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("VENTAS");
        lblTitulo.setOpaque(true);

        tblDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Cliente", "Correo Cliente", "Instrumento o Accesorio", "Marca y Modelo", "Valor Total", "Cantidad", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        btnCrear.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnCrear.setText("NUEVA VENTA");
        btnCrear.setBorder(new javax.swing.border.MatteBorder(null));

        btnRegresar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.setBorder(new javax.swing.border.MatteBorder(null));

        btnEliminar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR VENTA");
        btnEliminar.setBorder(new javax.swing.border.MatteBorder(null));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1219, Short.MAX_VALUE)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
    public void cambiarInventario(ActionListener listener) {
        btnRegresar.addActionListener(listener);
    }
    public void cambiarFormulario(ActionListener listener) {
        btnCrear.addActionListener(listener);
    }
    public void eliminarVenta(ActionListener listener) {
        btnEliminar.addActionListener(listener);
    }
    
    public void llenarTabla(Venta venta){
        Object[] a = new Object[8];
        a[0]=venta.getId();
        a[1]=venta.getNombre_cli();
        a[2]=venta.getCorreo_cli();
        a[3]=venta.getNombre();
        a[4]=venta.getMarca_modelo();
        a[5]=venta.getCantidad();
        a[6]=venta.getValorTotal();
        a[7]=venta.getFecha();
        modelTable.addRow(a);
    }
    public int leerRegistro(){
        
        int fila = tblDatos.getSelectedRow(); 
        int columna = tblDatos.getSelectedColumn();
        
        Object seleccionado = tblDatos.getValueAt(fila, columna).toString();
        int conv = Integer.parseInt(seleccionado.toString());
        
        return conv;
    }
    public void limpiarTabla(){
        
        for (int i = 0; i < tblDatos.getRowCount(); i++) {
        modelTable.removeRow(i);
        i-=1;
        }   
    }
    public void guardarRegistros() {
        try {
            BufferedWriter outStream = new BufferedWriter(new FileWriter("Ventas.csv"));
            
            tblDatos.getModel();
            int numFilas = tblDatos.getRowCount();
            int numColumnas = tblDatos.getColumnCount();

            for (int fila = 0; fila < numFilas; fila++) {
                for (int columna = 0; columna < numColumnas; columna++) {
                    Object valor = modelTable.getValueAt(fila, columna);
                    outStream.write(valor.toString() + ",");
                }
                outStream.write("\n");
            }

            outStream.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
