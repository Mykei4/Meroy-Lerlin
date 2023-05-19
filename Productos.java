/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class Productos extends javax.swing.JFrame {
    Connection conBD = null;
    Statement stm = null;
    String servidor = "jdbc:mysql://localhost:3306/";
    String basedatos = "jardineria";
    String DBuser = "root";
    String DBpass = "123456";
    
    /**
     * Creates new form Productos
     */
    public Productos() {
        initComponents();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conBD = DriverManager.getConnection(servidor + basedatos, DBuser, DBpass);
        } catch (SQLException error) {
            System.out.println("Error al conectar a BD: " + error.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jFileChooser = new javax.swing.JFileChooser();
        jLabelTittle = new javax.swing.JLabel();
        jButtonPrincipal = new javax.swing.JButton();
        jButtonListado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldGama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDimensiones = new javax.swing.JTextField();
        jTextFieldProveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPrecioProveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldVenta = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioNombre = new javax.swing.JRadioButton();
        jRadioGama = new javax.swing.JRadioButton();
        jRadioProveedor = new javax.swing.JRadioButton();
        jRadioCodigo = new javax.swing.JRadioButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonInforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTittle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelTittle.setText("Productos");

        jButtonPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonPrincipal.setText("Página Principal");
        jButtonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrincipalActionPerformed(evt);
            }
        });

        jButtonListado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonListado.setText("Listado Productos");
        jButtonListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListadoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Gama:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Dimensiones:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Proveedor:");

        jButtonNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonNuevo.setText("Nuevo Producto");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonBorrar.setText("Borrar Producto");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar Producto");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Precio de proveedor:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Precio de venta:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Descripción:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Stock:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jTextFieldGama)
                            .addComponent(jTextFieldDimensiones)
                            .addComponent(jTextFieldCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPrecioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8)))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonNuevo)
                .addGap(63, 63, 63)
                .addComponent(jButtonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButtonModificar)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldGama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDimensiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldPrecioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonModificar))
                .addGap(14, 14, 14))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup.add(jRadioNombre);
        jRadioNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioNombre.setText("Nombre");

        buttonGroup.add(jRadioGama);
        jRadioGama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioGama.setText("Gama");

        buttonGroup.add(jRadioProveedor);
        jRadioProveedor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioProveedor.setText("Proveedor");

        buttonGroup.add(jRadioCodigo);
        jRadioCodigo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioCodigo.setText("Codigo");

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar Producto");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonBuscar)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioProveedor)
                                .addComponent(jRadioGama)
                                .addComponent(jRadioCodigo)
                                .addComponent(jRadioNombre)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jRadioCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioGama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBuscar)
                .addGap(15, 15, 15))
        );

        jButtonInforme.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonInforme.setText("Informe de beneficios");
        jButtonInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTittle)
                        .addGap(428, 428, 428))))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonInforme)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButtonPrincipal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonListado)
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTittle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(jButtonListado)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonPrincipal)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
         
        try{
                String cola = "INSERT INTO productos VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement sentencia = conBD.prepareStatement(cola);
               
                sentencia.setString(1, (jTextFieldCodigo.getText()));
                sentencia.setString(2, (jTextFieldNombre.getText()));
                sentencia.setString(3, (jTextFieldGama.getText()));
                sentencia.setString(4, (jTextFieldDimensiones.getText()));
                sentencia.setString(5, (jTextFieldProveedor.getText()));
                sentencia.setString(6, (jTextFieldDescripcion.getText()));
                sentencia.setString(7, (jTextFieldStock.getText()));
                sentencia.setString(8, (jTextFieldVenta.getText()));
                sentencia.setString(9, (jTextFieldPrecioProveedor.getText()));
                
                sentencia.executeUpdate();
                sentencia.close();
                JOptionPane.showMessageDialog(this, "Datos guardados");
            }catch (SQLException sentenciaex){
                JOptionPane.showMessageDialog(this, "Los datos no se han podido guardar") ;
            }
        
        jTextFieldCodigo.setText("");
        jTextFieldNombre.setText("");
        jTextFieldGama.setText("");
        jTextFieldDimensiones.setText("");
        jTextFieldProveedor.setText("");
        jTextFieldDescripcion.setText("");
        jTextFieldStock.setText("");
        jTextFieldVenta.setText("");
        jTextFieldPrecioProveedor.setText("");
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        String codigo = JOptionPane.showInputDialog("Introduce el codigo del producto a eliminar") ;
        try{
            String sql = "DELETE FROM productos WHERE codigo_producto LIKE ?";
            PreparedStatement sentencia = conBD.prepareStatement(sql);
               
            sentencia.setString(1, codigo) ;
                
            sentencia.executeUpdate();
            sentencia.close();
            JOptionPane.showMessageDialog(this, "Producto eliminado");
        }catch (SQLException sentenciaex){
            JOptionPane.showMessageDialog(this, "El producto no se ha podido eliminar") ;
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            String sql = null ;
            if (jRadioCodigo.isSelected())
                sql = "SELECT * FROM producto WHERE codigo_producto LIKE ?";
            if (jRadioNombre.isSelected())
                sql = "SELECT * FROM producto WHERE nombre LIKE ?";
            if (jRadioProveedor.isSelected())
                sql = "SELECT * FROM producto WHERE proveedor LIKE ?";
            if (jRadioGama.isSelected())
                sql = "SELECT * FROM producto WHERE gama LIKE ?";

            PreparedStatement sentencia = conBD.prepareStatement(sql);
            sentencia.setString(1, String.valueOf(jTextFieldBuscar.getText()));
            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {
                jTextFieldCodigo.setText(rs.getString(1));
                jTextFieldNombre.setText(String.valueOf(rs.getString(2)));
                jTextFieldGama.setText(String.valueOf(rs.getString(3)));
                jTextFieldDimensiones.setText(String.valueOf(rs.getString(4)));
                jTextFieldProveedor.setText(String.valueOf(rs.getString(5)));
                jTextFieldDescripcion.setText(String.valueOf(rs.getString(6)));
                jTextFieldStock.setText(String.valueOf(rs.getString(7)));
                jTextFieldVenta.setText(String.valueOf(rs.getString(8)));
                jTextFieldPrecioProveedor.setText(String.valueOf(rs.getString(9)));
            }
            rs.close();
            sentencia.close();         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        jTextFieldBuscar.setText("");
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed

        try{
            String sql = "UPDATE producto SET (nombre = ?, gama = ?, dimensiones = ?, proveedor = ?, descripcion = ?, cantidad_de_stock = ?, precio_venta = ?, precio_proveedor = ?) WHERE codigo_producto LIKE ?" ;
            PreparedStatement sentencia = conBD.prepareStatement(sql);
               
            sentencia.setString(1, jTextFieldNombre.getText()) ;
            sentencia.setString(2, jTextFieldGama.getText()) ;
            sentencia.setString(3, jTextFieldDimensiones.getText()) ;
            sentencia.setString(4, jTextFieldProveedor.getText()) ;
            sentencia.setString(5, jTextFieldDescripcion.getText()) ;
            sentencia.setString(6, jTextFieldStock.getText()) ;
            sentencia.setString(7, jTextFieldVenta.getText()) ;
            sentencia.setString(8, jTextFieldPrecioProveedor.getText()) ;
            sentencia.setString(9, jTextFieldCodigo.getText()) ;
                
            sentencia.executeUpdate();
            sentencia.close();
            JOptionPane.showMessageDialog(this, "Producto modificado");
        }catch (SQLException sentenciaex){
            JOptionPane.showMessageDialog(this, "El producto no se ha podido modificar") ;
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrincipalActionPerformed
        Principal abrir = new Principal() ;
        abrir.setVisible(true) ;
        this.setVisible(false) ;
    }//GEN-LAST:event_jButtonPrincipalActionPerformed

    private void jButtonListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListadoActionPerformed
        Listado abrir = new Listado() ;
        abrir.setVisible(true) ;   
    }//GEN-LAST:event_jButtonListadoActionPerformed

    private void jButtonInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformeActionPerformed
        String nombre = "";
        float stock, venta, prove, margen, totalv, totalp;
        stock = venta = prove = margen = 0 ;
        try {
            String sql = "SELECT nombre, cantidad_en_stock, precio_venta, precio_proveedor FROM producto WHERE codigo_producto LIKE ?" ;

            PreparedStatement stmt;
            stmt = conBD.prepareStatement(sql);
            
            stmt.setString(1, String.valueOf(JOptionPane.showInputDialog("Introduce el codigo del producto")));
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                nombre = rs.getString(1);
                stock = rs.getFloat(2);
                venta = rs.getFloat(3);
                prove = rs.getFloat(4);
            }
            
            totalp = stock * prove ;
            totalv = stock * venta ;
            margen = totalv - totalp ;
            
            rs.close();
            stmt.close();
            conBD.close();
                  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(this, "El margen de beneficio del producto " + nombre + " es: " + margen);
        int option = JOptionPane.showConfirmDialog(this, "¿Deseas guardar el contenido en un archivo txt?");
        if (option == 0) {
            try {
                String informe = "El margen de beneficio es de: " + margen ;
                int result = jFileChooser.showOpenDialog(null);
                if (result == jFileChooser.APPROVE_OPTION){
                    String archivo = jFileChooser.getSelectedFile().getAbsolutePath();
                    File carpeta = new File(archivo + ".txt") ;    
                    BufferedWriter bw = new BufferedWriter(new FileWriter(carpeta));
                    bw.write(informe);
                    bw.close() ;
                }
                JOptionPane.showMessageDialog(this, "Informe generado exitosamente");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "No se ha podido generar el informe", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else 
            JOptionPane.showMessageDialog(this, "Archivo no creado");
    }//GEN-LAST:event_jButtonInformeActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonInforme;
    private javax.swing.JButton jButtonListado;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonPrincipal;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTittle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioCodigo;
    private javax.swing.JRadioButton jRadioGama;
    private javax.swing.JRadioButton jRadioNombre;
    private javax.swing.JRadioButton jRadioProveedor;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldDimensiones;
    private javax.swing.JTextField jTextFieldGama;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecioProveedor;
    private javax.swing.JTextField jTextFieldProveedor;
    private javax.swing.JTextField jTextFieldStock;
    private javax.swing.JTextField jTextFieldVenta;
    // End of variables declaration//GEN-END:variables
}
