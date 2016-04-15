/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author dindhino
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        lblNama = new javax.swing.JLabel();
        lblTipe = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        cbTipe = new javax.swing.JComboBox<>();
        btnSignup = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNama.setText("Nama");

        lblTipe.setText("Tipe");

        lblId.setText("ID");

        lblPassword.setText("Password");

        cbTipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mahasiswa", "Dosen" }));
        cbTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipeActionPerformed(evt);
            }
        });

        btnSignup.setText("Sign Up");

        btnCancel.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNama)
                            .addComponent(lblTipe)
                            .addComponent(lblId)
                            .addComponent(lblPassword))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNama)
                            .addComponent(tfID)
                            .addComponent(tfPassword)
                            .addComponent(cbTipe, 0, 165, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 158, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(153, 153, 153))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipe)
                    .addComponent(cbTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnSignup)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipeActionPerformed

    public JButton getBtnSignup() {
        return btnSignup;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public String getNama() {
        return tfNama.getText();
    }

    public void setNama(String s) {
        tfNama.setText(s);
    }

    public String getPassword() {
        return tfPassword.getText();
    }

    public void setPassword(String s) {
        tfPassword.setText(s);
    }

    public JTextField getID() {
        return tfID;
    }

    public void setID(JTextField tfID) {
        this.tfID = tfID;
    }
    
    public JComboBox getTipe() {
        return cbTipe;
    }
    
    public void setTipe(JComboBox cbTipe) {
        this.cbTipe = cbTipe;
    }
    
    public void addListener(ActionListener e) {
        btnSignup.addActionListener(e);
        btnCancel.addActionListener(e);
    }

    public JTextField getTfNama() {
        return tfNama;
    }

    public JTextField getTfPassword() {
        return tfPassword;
    }
    
    public JTextField getTfId() {
        return tfID;
    }
    
    public JComboBox getCbTipe() {
        return cbTipe;
    }

    public void showMessage(Component c, String s) {
        JOptionPane.showMessageDialog(c, s);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> cbTipe;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTipe;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables
}
