
package colors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class ColorsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ColorsJFrame
     */
    ImageIcon i;
    ImageIcon j;
    Boolean cek = true;
    
    public ColorsJFrame() {
        initComponents();
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("11.jpg")));
        Image img1=myimage.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        i=new ImageIcon(img2);

        ImageIcon myimage1=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("agus kotak.jpg")));
        Image img3=myimage1.getImage();
        Image img4=img3.getScaledInstance(jLabel2.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        j=new ImageIcon(img4);
        jLabel1.setIcon(i);
        jLabel2.setIcon(j);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        colors21 = new colors2.Colors2();
        colors31 = new colors3.Colors3();
        colors1 = new colors.Colors();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colors/11.jpg"))); // NOI18N
        jLabel1.setText("Ade");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(274, 274));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 270, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colors/agus kotak.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 490, 270, 270);
        jLabel2.getAccessibleContext().setAccessibleName("Agus");

        jPanel1.add(colors21);
        colors21.setBounds(200, 350, 99, 99);
        jPanel1.add(colors31);
        colors31.setBounds(550, 350, 99, 99);
        jPanel1.add(colors1);
        colors1.setBounds(380, 360, 100, 100);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Pencet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                jButton1ActionPerformed1(evt);
                jButton1ActionPerformed2(evt);
                jButton1ActionPerformed3(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 800, 71, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colors/ariel.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -10, 720, 860);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       jLabel1.setVisible(isVisible());
       colors1.change();
       colors21.change();
       colors31.change();
        if (cek){
            jLabel1.setIcon(i);
            jLabel2.setIcon(j);
            cek = false;
        }
        else {
            jLabel1.setIcon(j);
            jLabel2.setIcon(i);
            cek = true;
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed1
        jLabel2.setVisible(isVisible());
    }//GEN-LAST:event_jButton1ActionPerformed1

    private void jButton1ActionPerformed2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed2
        colors21.change();
    }//GEN-LAST:event_jButton1ActionPerformed2

    private void jButton1ActionPerformed3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed3
        colors31.change();
    }//GEN-LAST:event_jButton1ActionPerformed3

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
            java.util.logging.Logger.getLogger(ColorsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private colors.Colors colors1;
    private colors2.Colors2 colors21;
    private colors3.Colors3 colors31;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
