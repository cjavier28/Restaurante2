/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurante2;

import Datos.ObjetoCompartido;
import Datos.Reserva;
import Modelo.KeyValuePair;
import Negocio.ServicioConsulta;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author cjavi
 */
public class Restaurante extends javax.swing.JFrame {
    public ObjetoCompartido obj = new ObjetoCompartido();
    public  Object[] obja;
    public  DefaultTableModel model = new DefaultTableModel();
     public  ServicioConsulta servicio = new ServicioConsulta();  
    /**
     * Creates new form Restaurante
     */
    public Restaurante() {
        initComponents();
        
        List<KeyValuePair> lista = new ArrayList<>();
        lista.add(new KeyValuePair(1, "Confirmada"));
        lista.add(new KeyValuePair(2, "Cancelada"));
 
       for (KeyValuePair item : lista) {
         jComboBox1.insertItemAt(item.getValor(),item.getId());        
      }        
             
         obj.setSharedVariable(servicio.ObtenerRegistrosRestaurante());
         List<Reserva> lstReserva = new ArrayList<>();
         lstReserva = obj.getSharedVariable();
           for (Reserva reserva : lstReserva) {
               String valor = reserva.getNombreCliente();
              
           }  
         
         Llenartabla(lstReserva);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtNumeroDocumentoCliente1 = new javax.swing.JTextField();
        jtxtBuscador = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbuttonLimpiar = new javax.swing.JButton();
        jtxtNumeroContactoCliente = new javax.swing.JTextField();
        jcodigoreserva = new javax.swing.JTextField();
        jtxtNombreCliente = new javax.swing.JTextField();
        jtxtCorreoCliente = new javax.swing.JTextField();
        jtxtCantidadPersonas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtNumeroDocumentoCliente1.setToolTipText("");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jbuttonLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        jbuttonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonLimpiar.setText("Limpiar");
        jbuttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonLimpiarActionPerformed(evt);
            }
        });

        jtxtNumeroContactoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumeroContactoClienteActionPerformed(evt);
            }
        });

        jcodigoreserva.setEditable(false);
        jcodigoreserva.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Crear reserva");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar Reserva");

        jLabel1.setBackground(new java.awt.Color(51, 0, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Reserva");

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("GUARDAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtxtNumeroDocumentoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtNumeroContactoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jcodigoreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbuttonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jtxtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel3)))
                    .addGap(134, 134, 134)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jLabel1)
                    .addContainerGap(370, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jButton6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1))
                            .addGap(80, 80, 80))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbuttonLimpiar)
                                .addComponent(jButton1))
                            .addGap(29, 29, 29)
                            .addComponent(jcodigoreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(jtxtNumeroDocumentoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jtxtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jtxtNumeroContactoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jtxtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jtxtCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton5))
                            .addGap(15, 15, 15)
                            .addComponent(jButton4)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbuttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonLimpiarActionPerformed
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);
        jTable1.repaint();
        jtxtBuscador.setText("");
    }//GEN-LAST:event_jbuttonLimpiarActionPerformed

    private void jtxtNumeroContactoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumeroContactoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNumeroContactoClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);

        // Crear un RowFilter para filtrar por ID
        RowFilter<Object, Object> rowFilter = RowFilter.regexFilter(jtxtBuscador.getText(), 0); // 0 indica la columna del ID
        sorter.setRowFilter(rowFilter);
        jTable1.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        List<Reserva> lstReserva = new ArrayList<>();
        lstReserva = obj.getSharedVariable();
        Date fecha= jDateChooser1.getDate();

        jcodigoreserva.setText("");
        jtxtNombreCliente.setText("");
        jtxtNumeroContactoCliente.setText("");
        jtxtNumeroDocumentoCliente1.setText("");
        jtxtCorreoCliente.setText("");
        jComboBox1.setSelectedItem("");
        jComboBox1.setSelectedIndex(0);
        jtxtCantidadPersonas.setText("");
        LocalDate fechaActual = LocalDate.now();
        jDateChooser1.setDate(java.sql.Date.valueOf(fechaActual));

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        JComboBox<String> comboBox = (JComboBox<String>) evt.getSource();
        String valorSeleccionado = (String) comboBox.getSelectedItem();
        int indexSeleccionado = comboBox.getSelectedIndex();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        // Convertir la fecha a un String
        String fechaString = formato.format(jDateChooser1.getDate());
        LocalDate localDate = LocalDate.parse(fechaString);
        Reserva reserva = new Reserva();

        reserva.setNombreCliente(jtxtNombreCliente.getText());
        reserva.setNumeroContactoCliente(jtxtNumeroContactoCliente.getText());
        reserva.setNumeroDocumentoCliente(jtxtNumeroDocumentoCliente1.getText());

        reserva.setFechaReserva(java.sql.Date.valueOf(localDate));
        reserva.setCorreoCliente(jtxtCorreoCliente.getText());
        reserva.setEstadoReserva((String) jComboBox1.getSelectedItem());
        reserva.setCantidadPersonas(Integer.parseInt(jtxtCantidadPersonas.getText()));

        boolean respuesta = servicio.InsertarReserva(reserva);
        obj.setSharedVariable(servicio.ObtenerRegistrosRestaurante());
        List<Reserva> lstReserva = new ArrayList<>();
        lstReserva = obj.getSharedVariable();
        Llenartabla(lstReserva);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          // Obtener la fila en la que se hizo clic
    int rowIndex = jTable1.getSelectedRow();
    
    // Verificar si se seleccionó una fila válida
    if (rowIndex != -1) {
        // Obtener los valores de todas las celdas en la fila seleccionada
        Object[] valoresFila = new Object[jTable1.getColumnCount()]; // Array para almacenar los valores de la fila
        for (int column = 0; column < jTable1.getColumnCount(); column++) {
            valoresFila[column] = jTable1.getValueAt(rowIndex, column);
        }
        jcodigoreserva.setText(valoresFila[0].toString());
        jtxtNombreCliente.setText(valoresFila[1].toString());
        jtxtNumeroContactoCliente.setText(valoresFila[2].toString());
        jtxtNumeroDocumentoCliente1.setText(valoresFila[3].toString());
        jtxtCorreoCliente.setText(valoresFila[4].toString());       
        String fecha = valoresFila[5].toString();
        LocalDate localDate = LocalDate.parse(fecha);
        Date date = java.sql.Date.valueOf(localDate);
        jDateChooser1.setDate(date);
        jComboBox1.setSelectedItem(valoresFila[6].toString());
        jtxtCantidadPersonas.setText(valoresFila[7].toString());
    }//GEN-LAST:event_jTable1MouseClicked
}
    
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        // Convertir la fecha a un String
        String fechaString = formato.format(jDateChooser1.getDate());
        LocalDate localDate = LocalDate.parse(fechaString);   
        Reserva reserva = new Reserva();
        reserva.setCodigo(   Integer.parseInt(jcodigoreserva.getText()));
     
        reserva.setNombreCliente(jtxtNombreCliente.getText());
        reserva.setNumeroContactoCliente(jtxtNumeroContactoCliente.getText());
        reserva.setNumeroDocumentoCliente(jtxtNumeroDocumentoCliente1.getText());

        reserva.setFechaReserva(java.sql.Date.valueOf(localDate));
        reserva.setCorreoCliente(jtxtCorreoCliente.getText());
        reserva.setEstadoReserva((String) jComboBox1.getSelectedItem());
        reserva.setCantidadPersonas(Integer.parseInt(jtxtCantidadPersonas.getText()));  
    
         boolean respuesta = servicio.actualizarReserva(reserva);
         obj.setSharedVariable(servicio.ObtenerRegistrosRestaurante());
         List<Reserva> lstReserva = new ArrayList<>();
         lstReserva = obj.getSharedVariable();
         Llenartabla(lstReserva);
    }//GEN-LAST:event_jButton6ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
    
      private void Llenartabla( List<Reserva> lstReserva){    
       limpiarTabla(model);
       
       model.addColumn("Codigo");
       model.addColumn("Nombre del cliente");
       model.addColumn("Número de contacto del cliente");
       model.addColumn("Identificación Cliente");
       model.addColumn("Correo");
       model.addColumn("Fecha de la reserva");
       model.addColumn("Estado de la reserva");
       model.addColumn("Cantidad de Personas");
  
        
         for (Reserva reserva : lstReserva) {
              obja = new Object[]{
                reserva.getCodigo(),
                reserva.getNombreCliente(),
                reserva.getNumeroContactoCliente(),
                reserva.getNumeroDocumentoCliente(),   
                reserva.getCorreoCliente(), 
                reserva.getFechaReserva(),
                reserva.getEstadoReserva(),
                reserva.getCantidadPersonas()  
            };
             model.addRow(obja);
        }
  
        jTable1.setModel(model);
      
    }
     
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
            java.util.logging.Logger.getLogger(Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurante().setVisible(true);
            }
        });
    }
       public static void limpiarTabla(DefaultTableModel modeloTabla) {
           // Eliminar todas las filas del modelo de la tabla
           while (modeloTabla.getRowCount() > 0) {
               modeloTabla.removeRow(0);
           }
            modeloTabla.setColumnCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbuttonLimpiar;
    private javax.swing.JTextField jcodigoreserva;
    private javax.swing.JTextField jtxtBuscador;
    private javax.swing.JTextField jtxtCantidadPersonas;
    private javax.swing.JTextField jtxtCorreoCliente;
    private javax.swing.JTextField jtxtNombreCliente;
    private javax.swing.JTextField jtxtNumeroContactoCliente;
    private javax.swing.JTextField jtxtNumeroDocumentoCliente1;
    // End of variables declaration//GEN-END:variables
}
