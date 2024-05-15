/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.r2d2.ui;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import mx.itson.r2d2.bussines.Operation;
import mx.itson.r2d2.entities.Product;
import mx.itson.r2d2.entities.Ticket;
/**
 *
 * @author compu
 */
public class Jr2d2 extends javax.swing.JFrame {

    /**
     * Creates new form Jr2d2
     */
    public Jr2d2() {
        initComponents();
    }
    double subtotal = 0;
    double iva = 0;
    double discount = 50;
    double shippingCost = 0;
    double tip = 0;
    double total = 0;
    
    String[] coupons = {"programacion", "java", "ternary", "boolean"};

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        buttonSelectFile = new javax.swing.JButton();
        labelStore = new javax.swing.JLabel();
        labelAdress = new javax.swing.JLabel();
        labelPaymentMethod = new javax.swing.JLabel();
        boxPaymentMethod = new javax.swing.JComboBox<>();
        labelCupon = new javax.swing.JLabel();
        textFieldCupon = new javax.swing.JTextField();
        labelSubtotal = new javax.swing.JLabel();
        labelServiceCost = new javax.swing.JLabel();
        labelShippingCost = new javax.swing.JLabel();
        labelDiscount = new javax.swing.JLabel();
        labelIva = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPhoneNumber = new javax.swing.JLabel();
        checkBoxPhoneNumber = new javax.swing.JCheckBox();
        buttonTip1 = new javax.swing.JButton();
        buttonTip2 = new javax.swing.JButton();
        buttonTip3 = new javax.swing.JButton();
        buttonTip4 = new javax.swing.JButton();
        labelTipTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", " Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tableProducts);

        buttonSelectFile.setText("Seleccionar archivo...");
        buttonSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelectFileActionPerformed(evt);
            }
        });

        labelStore.setText("Tienda: ");

        labelAdress.setText("Direccion de entrega:");
        labelAdress.setToolTipText("");

        labelPaymentMethod.setText("Metodo de pago:");

        boxPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa 5487", "PayPal", "Efectivo" }));

        labelCupon.setText("Cupón");

        textFieldCupon.setEditable(false);
        textFieldCupon.setText("no hay cupones disponibles en esta sucursal");
        textFieldCupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCuponActionPerformed(evt);
            }
        });

        labelSubtotal.setText("Subtotal:");

        labelServiceCost.setText("Costo de servicio:");

        labelShippingCost.setText("Costo de envío:");

        labelDiscount.setText("Descuento:");

        labelIva.setText("IVA:");

        labelTotal.setText("Total:");

        labelUsername.setText("Entregar a:");

        labelPhoneNumber.setText("Confirmar número de teléfono:");

        checkBoxPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPhoneNumberActionPerformed(evt);
            }
        });

        buttonTip1.setText("5%");

        buttonTip2.setText("10%");
        buttonTip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTip2ActionPerformed(evt);
            }
        });

        buttonTip3.setText("15%");

        buttonTip4.setText("20%");

        labelTipTotal.setText("Propina:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPhoneNumber)
                                    .addComponent(labelUsername)
                                    .addComponent(labelSubtotal)
                                    .addComponent(boxPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPaymentMethod)
                                    .addComponent(labelAdress)
                                    .addComponent(labelStore)
                                    .addComponent(buttonSelectFile)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(checkBoxPhoneNumber)
                                            .addGap(151, 151, 151))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(labelCupon)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textFieldCupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(labelTotal)
                                    .addComponent(labelIva)
                                    .addComponent(labelDiscount)
                                    .addComponent(labelShippingCost)
                                    .addComponent(labelServiceCost))
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTipTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonTip1)
                        .addGap(38, 38, 38)
                        .addComponent(buttonTip2)
                        .addGap(41, 41, 41)
                        .addComponent(buttonTip3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonTip4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSelectFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAdress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhoneNumber)
                    .addComponent(checkBoxPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPaymentMethod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCupon)
                    .addComponent(textFieldCupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTip1)
                    .addComponent(buttonTip2)
                    .addComponent(buttonTip3)
                    .addComponent(buttonTip4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSubtotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTipTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelServiceCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelShippingCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDiscount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCuponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCuponActionPerformed

    private void checkBoxPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxPhoneNumberActionPerformed

    private void buttonSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelectFileActionPerformed
        try{JFileChooser fileChooser = new JFileChooser();
           fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
           
           if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
               File file = fileChooser.getSelectedFile();
               
               byte fileBytes[] = Files.readAllBytes(file.toPath());
               String contenido = new String(fileBytes, StandardCharsets.UTF_8);
               
               
                Ticket ticket = new Ticket().deserializar(contenido);
                
                labelStore.setText("Tienda: " + ticket.getStore());
                labelUsername.setText("Entregar a: " + ticket.getClient().getName());
                labelAdress.setText("Direccion de Entega: " + ticket.getClient().getAddress());
                checkBoxPhoneNumber.setText (ticket.getClient().getPhoneNumber());
                
                
                
               DefaultTableModel model = (DefaultTableModel) tableProducts.getModel();
                model.setRowCount(0);
                for(Product c : ticket.getProduct()){
                    subtotal += (c.getPrice()*c.getAmount());
                    model.addRow(new Object[] {
                        c.getName(),
                        c.getPrice(),
                        c.getAmount()
                    });
           }
                Operation calc = new Operation();
                labelSubtotal.setText("Subtotal: $" + subtotal);
                iva = calc.calcIva(subtotal, ticket.getIva());
                labelIva.setText("IVA: $" + iva);
                shippingCost = calc.calcShipping(subtotal, .05);
                labelShippingCost.setText("Costo de envío: $" + (shippingCost));
                total = subtotal + shippingCost + iva;
                labelTotal.setText("Total: $" + total);
           }
       }catch (Exception ex){
           System.err.println(ex.getMessage());
       }
        }                                                

    private void buttonTip1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            try{tip = subtotal * .05;
            labelTipTotal.setText("Propina: $" + tip);
            double totalTip = (total + tip);
            labelTotal.setText("Total: $" + totalTip);}
            catch(Exception ex){
            System.err.println(ex.getMessage());}
    }                                          

    private void buttonTip2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            try{tip = subtotal * .1;
            labelTipTotal.setText("Propina: $" + tip);
            double totalTip = (total + tip);
            labelTotal.setText("Total: $" + totalTip);}
            catch(Exception ex){
            System.err.println(ex.getMessage());}
    }                                          

    private void buttonTip4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            try{tip = subtotal * .2;
            labelTipTotal.setText("Propina: $" + tip);
            double totalTip = (total + tip);
            labelTotal.setText("Total: $" + totalTip);}
            catch(Exception ex){
            System.err.println(ex.getMessage());}
    }                                          

    private void buttonTip3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            try{tip = subtotal * .15;
            labelTipTotal.setText("Propina: $" + tip);
            double totalTip = (total + tip);
            labelTotal.setText("Total: $" + totalTip);}
            catch(Exception ex){
            System.err.println(ex.getMessage());}
                            
    }//GEN-LAST:event_buttonSelectFileActionPerformed

    private void buttonTip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTip2ActionPerformed

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
            java.util.logging.Logger.getLogger(Jr2d2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jr2d2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jr2d2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jr2d2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jr2d2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPaymentMethod;
    private javax.swing.JButton buttonSelectFile;
    private javax.swing.JButton buttonTip1;
    private javax.swing.JButton buttonTip2;
    private javax.swing.JButton buttonTip3;
    private javax.swing.JButton buttonTip4;
    private javax.swing.JCheckBox checkBoxPhoneNumber;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAdress;
    private javax.swing.JLabel labelCupon;
    private javax.swing.JLabel labelDiscount;
    private javax.swing.JLabel labelIva;
    private javax.swing.JLabel labelPaymentMethod;
    private javax.swing.JLabel labelPhoneNumber;
    private javax.swing.JLabel labelServiceCost;
    private javax.swing.JLabel labelShippingCost;
    private javax.swing.JLabel labelStore;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTipTotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTextField textFieldCupon;
    // End of variables declaration//GEN-END:variables
}
