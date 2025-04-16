
package com.mycompany.gui;

import com.mycompany.logica.Controladora;
import com.mycompany.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
    
    Controladora control = null; // Cuando usas una clase como variable global, inicializala siempre

    
    public VerDatos() {
        control = new Controladora(); // Creamos la controladora de la lógica
        //Posteriormente mandará a llamar a la controladora de persistencia.
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMascotas);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Datos de mascotas");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar32x32.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar32x32.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       // Debemos controlar que por lo menos exista una fila (que la tabla no esté vacía)
       
       if(tblMascotas.getRowCount() > 0)
       {
           // -1 significa que no tenga una fila seleccionada
           // Luego, debemos ver si tenemos alguna fila seleccionada.
           if(tblMascotas.getSelectedRow() != -1)
           {
               // Queremos traer el ID del cliente para eliminarlo
               int num_cliente = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(),0)));
               // Llamamos a la controladora de la lógica para hacer el proceso.
               control.borrarMascota(num_cliente);
               // Y mostramos un mensaje que se concretó el proceso
               mostrarMensaje("¡Cliente borrado con éxito!", "Info", "Eliminación exitosa");
               cargarTabla(); // Recuerda que siempre debes volver a cargar el modelo
           
           }
           else{
           
               mostrarMensaje("No ha seleccionado ninguna fila", "Error", "Error");
           }
       }
       
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Aplicamos la misma lógica que en el botón de eliminar:
        
        if(tblMascotas.getRowCount() > 0)
        {
            if(tblMascotas.getSelectedRow()!=-1)
            {
                int num_cliente = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));
                
                // Llamamos a la controladora para editar:
                control.editarMascota(num_cliente);
                
                ModificarDatos modifPantalla = new ModificarDatos();
                modifPantalla.setVisible(true);
                modifPantalla.setLocationRelativeTo(null);
                
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void mostrarMensaje(String mensaje, String tipo, String titulo)
    {
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if(tipo.equals("Info"))
        {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(tipo.equals("Error"))
        {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE); // Debes poner ERROR_MESSAGE, de lo contrario, entenderá que es como un tipo de dato
            
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        // Debemos definir el modelo que queremos que tenga la tabla:
        
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            // Con este método, hacemos que la tabla no sea editable
            // isCellEditable es un método propio de las tablas, por lo que hay que poner el annotation de sobreescritura
            // Entonces, siempre llevará el override
            @Override
            public boolean isCellEditable(int row, int column)
            {
                
                return false;
            }
           
        }; //Instanciamos un modelo de tabla
        
        // Establecemos los nombres de las columnas:
        String[] titulos ={"No.Cliente", "Nombre", "Color", "Raza", "Alergico","At.Esp", "Dueño", "Cel."};
        
        // Hacemos que esos títulos de columna se seteen en la tabla:
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Carga de datos desde la base de datos:
        List<Mascota> listaMascotas=control.traerMascotas();
        
        // Recorrer la lista y mostrar cada uno de los elementos en la tabla:
        // Si la lista no está vacía, entonces hacemos esto:
        if(listaMascotas != null)
        {
            // Por cada mascota en la lista de mascotas
            for(Mascota masco : listaMascotas)
            {
                // Usas un array de tipo Object, porque cada columna es un tipo
                // de dato u objeto diferente.
                // Object es la clase madre de todas las clases
                Object[] objetos = {masco.getNum_Cliente(),
                    masco.getNombre_perro(), masco.getColor(), masco.getRaza(),
                    masco.isAlergico(),masco.isAtencion_especial(),masco.getUnDuenio().getNombre(),
                    masco.getUnDuenio().getCelular()}; // Los doble get, es porque ese atributo lo necesitas por separado y está en otra tabla
                
                modeloTabla.addRow(objetos);
                
            }
        }
        
        tblMascotas.setModel(modeloTabla); // Aplicas el modelo a la tabla
        
        
    }
}
