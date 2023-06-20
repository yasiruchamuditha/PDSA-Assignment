/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author yasiru
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        lblHeadline = new javax.swing.JLabel();
        lblLogOut = new javax.swing.JLabel();
        lblAddContact = new javax.swing.JLabel();
        lblSearchContact = new javax.swing.JLabel();
        lblDeleteContact = new javax.swing.JLabel();
        lblwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeadline.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblHeadline.setText("PHONE BOOK");
        getContentPane().add(lblHeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 340, 80));

        lblLogOut.setText("<html><body style=\"background-color:yellow;margin:5px 5px 5px 5px;\"><h1>LOG OUT</h1></body> </html>  ");
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 120, 90));

        lblAddContact.setText("<html><body style=\"background-color:yellow;margin:5px 5px 5px 5px;\"><h1>ADD CONTACT</h1></body> </html>  ");
        lblAddContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddContactMouseClicked(evt);
            }
        });
        getContentPane().add(lblAddContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 90));

        lblSearchContact.setText("<html><body style=\"background-color:yellow;margin:5px 5px 5px 5px;\"><h1>SEARCH CONTACT</h1></body> </html>  ");
        lblSearchContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchContactMouseClicked(evt);
            }
        });
        getContentPane().add(lblSearchContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 130, 90));

        lblDeleteContact.setText("<html><body style=\"background-color:yellow;margin:5px 5px 5px 5px;\"><h1>DELETE CONTACT</h1></body> </html>  ");
        lblDeleteContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteContactMouseClicked(evt);
            }
        });
        getContentPane().add(lblDeleteContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 140, 90));

        lblwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Home.jpg"))); // NOI18N
        getContentPane().add(lblwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddContactMouseClicked
        // TODO add your handling code here:
        AddContact a1 = new AddContact();
        a1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblAddContactMouseClicked

    private void lblSearchContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchContactMouseClicked
        // TODO add your handling code here:
        ViewContact v1=new ViewContact();
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblSearchContactMouseClicked

    private void lblDeleteContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteContactMouseClicked
        // TODO add your handling code here:
        DeleteContact d1=new DeleteContact();
        d1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblDeleteContactMouseClicked

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblLogOutMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAddContact;
    private javax.swing.JLabel lblDeleteContact;
    private javax.swing.JLabel lblHeadline;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblSearchContact;
    private javax.swing.JLabel lblwallpaper;
    // End of variables declaration//GEN-END:variables
}