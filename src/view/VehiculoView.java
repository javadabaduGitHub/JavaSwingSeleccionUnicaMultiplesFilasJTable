package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import javax.swing.table.DefaultTableModel;
import model.dto.VehiculoDTO;

/**
 * Listado los atributos de un vehículo (placa, marca y color) dentro de un
 * JTable
 *
 * @author https://javadabadu.com - Curso práctico Java Swing MySQL
 *
 *
 */
public class VehiculoView extends javax.swing.JFrame {

    public VehiculoView() {
        initComponents();
        init(); // !importante¡
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTVehiculo = new javax.swing.JTable();
        jBListar = new javax.swing.JButton();
        jBImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTVehiculo.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTVehiculoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTVehiculo);

        jBListar.setText("Listar");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });

        jBImprimir.setText("Imprimir");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        listar();
    }//GEN-LAST:event_jBListarActionPerformed

    private void jTVehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVehiculoMousePressed
        // singleSelection();
    }//GEN-LAST:event_jTVehiculoMousePressed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        multipleSelection();
    }//GEN-LAST:event_jBImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTVehiculo;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel defalultTableModel;
    private Object[] head;
    private Object[] items;

    private void init() {
        setLocationRelativeTo(null);
        setTitle("Java Swing - JTable");

        loadTabla();
    }

    private void loadTabla() {
        // encabezado tabla
        head = new Object[]{"Objeto", "ID", "PLACA", "MARCA", "MODELO"};
        items = new Object[head.length];

        // modelo
        defalultTableModel = new DefaultTableModel(null, head);

        List<VehiculoDTO> vehiculos = new ArrayList<>();

        // adicionar vehiculo 1
        VehiculoDTO vehiculo1
                = new VehiculoDTO("HFG654", "MAZDA", "ROJO");
        vehiculos.add(vehiculo1);

        // adicionar vehiculo 2
        VehiculoDTO vehiculo2
                = new VehiculoDTO("EFG743", "RENAULT", "AZUL");
        vehiculos.add(vehiculo2);

        // adicionar vehiculo 3
        VehiculoDTO vehiculo3
                = new VehiculoDTO("JGU654", "AUDI", "NEGRO");
        vehiculos.add(vehiculo3);

        // adicionar vehiculo 4
        VehiculoDTO vehiculo4
                = new VehiculoDTO("XDR869", "CITROEN", "GRIS");
        vehiculos.add(vehiculo4);

        // adicionar vehiculo 5
        VehiculoDTO vehiculo5
                = new VehiculoDTO("XRR769", "MAZDA", "ROJO");
        vehiculos.add(vehiculo5);

        // adicionar vehiculo 6
        VehiculoDTO vehiculo6
                = new VehiculoDTO("FFF678", "RENAULT", "");
        vehiculos.add(vehiculo6);

        int contador = 0;
        for (VehiculoDTO vehiculo : vehiculos) {

            // guardamos todo el objeto vehículo en la columnas 0
            items[0] = vehiculo;

            items[1] = contador++;
            items[2] = vehiculo.getPlaca();// PLACA en primera columna
            items[3] = vehiculo.getMarca(); // MARCA en segunda columna
            items[4] = vehiculo.getColor(); // COLOR entercero caolumna

            defalultTableModel.addRow(items);
        }
        jTVehiculo.setModel(defalultTableModel);

        // ocultar la columnas número 0
        int COLUMNA_A_OCULTAR = 0;
        jTVehiculo.getColumnModel().getColumn(COLUMNA_A_OCULTAR).setMinWidth(0);
        jTVehiculo.getColumnModel().getColumn(COLUMNA_A_OCULTAR).setMaxWidth(0);
        jTVehiculo.getColumnModel().getColumn(COLUMNA_A_OCULTAR).setPreferredWidth(0);

    }

    private void listar() {
        loadTabla();
    }

    private int getSelectedRow() {
        int selectedRow = -1;
        try {
            selectedRow = jTVehiculo.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(
                        this, "Seleccione un registro de la tabla");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return selectedRow;
    }

    private void singleSelection() {

        int row = getSelectedRow();
        if (row != -1) {

            VehiculoDTO vehiculo
                    = (VehiculoDTO) jTVehiculo
                            .getModel().getValueAt(row, 0);

            // mostrar por consola las propiedades del vehículo
            System.out.println("Placa del vehículo seleccionado: "
                    + vehiculo.getPlaca());

            System.out.println("Marca del vehículo seleccionado: "
                    + vehiculo.getMarca());

            System.out.println("Color del vehículo seleccionado: "
                    + vehiculo.getColor());

        }
    }

    private void multipleSelection() {
        int[] selectedRows = jTVehiculo.getSelectedRows();

        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(null,
                    "Seleccione une o más registros de la tabla");
            return;
        }

        for (int i = 0; i < selectedRows.length; i++) {

            int row = selectedRows[i];

            VehiculoDTO vehiculo
                    = (VehiculoDTO) jTVehiculo
                            .getModel().getValueAt(row, 0);

            // mostrar por consola las propiedades del vehículo
            System.out.println("Placa del vehículo seleccionado: "
                    + vehiculo.getPlaca());

            System.out.println("Marca del vehículo seleccionado: "
                    + vehiculo.getMarca());

            System.out.println("Color del vehículo seleccionado: "
                    + vehiculo.getColor());

            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        try {
            for (LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {// ignored
        }
        VehiculoView vehiculoView = new VehiculoView();
        vehiculoView.setVisible(true);
    }

}
