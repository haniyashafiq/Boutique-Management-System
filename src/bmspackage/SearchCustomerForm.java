/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bmspackage;

/**
 *
 * @author fm
 */
public class SearchCustomerForm extends javax.swing.JFrame {

    /**
     * Creates new form SearchCustomerForm
     */
    public SearchCustomerForm() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        customerINametxtfield = new javax.swing.JTextField();
        customerPNOtxtfield = new javax.swing.JTextField();
        customerEmailtxtfield = new javax.swing.JTextField();
        customerAddresstxtfield = new javax.swing.JTextField();
        customerCitytxtfield = new javax.swing.JTextField();
        customerProvincetxtfield = new javax.swing.JTextField();
        customerZipCodetxtfield = new javax.swing.JTextField();
        customerIDtfield = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        back = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloom's Boutique");

        jPanel1.setBackground(new java.awt.Color(225, 204, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(196,164,132,80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter the ID to search the customer:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Number:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Province:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Zip Code:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        customerINametxtfield.setBackground(new java.awt.Color(196, 164, 132));
        customerINametxtfield.setForeground(new java.awt.Color(255, 255, 255));
        customerINametxtfield.setText(" ");
        customerINametxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerINametxtfieldActionPerformed(evt);
            }
        });
        jPanel2.add(customerINametxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 154, -1));

        customerPNOtxtfield.setBackground(new java.awt.Color(196, 164, 132));
        customerPNOtxtfield.setForeground(new java.awt.Color(255, 255, 255));
        customerPNOtxtfield.setText(" ");
        jPanel2.add(customerPNOtxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 150, -1));

        customerEmailtxtfield.setBackground(new java.awt.Color(196, 164, 132));
        customerEmailtxtfield.setForeground(new java.awt.Color(255, 255, 255));
        customerEmailtxtfield.setText(" ");
        jPanel2.add(customerEmailtxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 154, -1));

        customerAddresstxtfield.setBackground(new java.awt.Color(196, 164, 132));
        customerAddresstxtfield.setForeground(new java.awt.Color(255, 255, 255));
        customerAddresstxtfield.setText(" ");
        jPanel2.add(customerAddresstxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 150, -1));

        customerCitytxtfield.setBackground(new java.awt.Color(196, 164, 132));
        customerCitytxtfield.setForeground(new java.awt.Color(255, 255, 255));
        customerCitytxtfield.setText(" ");
        jPanel2.add(customerCitytxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 150, -1));

        customerProvincetxtfield.setBackground(new java.awt.Color(196, 164, 132));
        customerProvincetxtfield.setForeground(new java.awt.Color(255, 255, 255));
        customerProvincetxtfield.setText(" ");
        jPanel2.add(customerProvincetxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 154, -1));

        customerZipCodetxtfield.setBackground(new java.awt.Color(196, 164, 132));
        customerZipCodetxtfield.setText(" ");
        jPanel2.add(customerZipCodetxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 154, -1));

        customerIDtfield.setBackground(new java.awt.Color(196, 164, 132));
        customerIDtfield.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerIDtfield.setForeground(new java.awt.Color(255, 255, 255));
        customerIDtfield.setText(" ");
        customerIDtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDtfieldActionPerformed(evt);
            }
        });
        jPanel2.add(customerIDtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 107, -1));

        search.setBackground(new java.awt.Color(196, 164, 132));
        search.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CUSTOMER");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Customer ID:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmspackage/WhatsApp Image 2024-06-10 at 1.01.30 AM.jpeg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 620, 440));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 740, 580));

        jMenu2.setText("Back");

        back.setText("Back to customer");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jMenu2.add(back);

        jMenuItem1.setText("Dashboard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerIDtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDtfieldActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
CustomerForm form=new CustomerForm();
        form.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
// Retrieve data from text field
int customerId = Integer.parseInt(customerIDtfield.getText().trim());

        // Create a new Customer object
        Customer customer = new Customer();

        // Call searchCustomer method to find customer information
        customer.search(customerId);

        // Populate text fields with retrieved customer information
        customerINametxtfield.setText(customer.getPersonName());
        customerPNOtxtfield.setText(customer.getContactInfo());
        customerEmailtxtfield.setText(customer.getCustomerEmail());
        customerAddresstxtfield.setText(customer.getPersonAddress());
        customerCitytxtfield.setText(customer.getCustomerCity());
        customerProvincetxtfield.setText(customer.getCustomerProvince());
        customerZipCodetxtfield.setText(customer.getCustomerZipCode());
            // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void customerINametxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerINametxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerINametxtfieldActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Dashboard db = new Dashboard();
        db.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem back;
    private javax.swing.JTextField customerAddresstxtfield;
    private javax.swing.JTextField customerCitytxtfield;
    private javax.swing.JTextField customerEmailtxtfield;
    private javax.swing.JTextField customerIDtfield;
    private javax.swing.JTextField customerINametxtfield;
    private javax.swing.JTextField customerPNOtxtfield;
    private javax.swing.JTextField customerProvincetxtfield;
    private javax.swing.JTextField customerZipCodetxtfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
