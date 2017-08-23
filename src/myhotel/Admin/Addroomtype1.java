package myhotel.Admin;


import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import myhotel.FrontOffice.FOMain;
import myhotel.db.DBConnect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csaswchathuranga
 */
public class Addroomtype1 extends javax.swing.JFrame {
    
    Connection link=null;
    PreparedStatement pst=null;

   
    public Addroomtype1() {
        
        setTitle("Add Room");
        initComponents();
        link=DBConnect.connectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomno = new javax.swing.JTextField();
        roomtype = new javax.swing.JComboBox();
        run1 = new javax.swing.JButton();
        run = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 475));
        getContentPane().setLayout(null);

        roomno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        roomno.setPreferredSize(new java.awt.Dimension(6, 23));
        roomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomnoActionPerformed(evt);
            }
        });
        getContentPane().add(roomno);
        roomno.setBounds(210, 70, 80, 30);

        roomtype.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        roomtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Royal", "Presidential", "Deluxe" }));
        roomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeActionPerformed(evt);
            }
        });
        getContentPane().add(roomtype);
        roomtype.setBounds(210, 130, 80, 26);

        run1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        run1.setText("Back");
        run1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run1ActionPerformed(evt);
            }
        });
        getContentPane().add(run1);
        run1.setBounds(310, 280, 90, 29);

        run.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        run.setText("Add");
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });
        getContentPane().add(run);
        run.setBounds(210, 280, 90, 30);

        jLabel1.setBackground(new java.awt.Color(255, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText(" Room No");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 70, 100, 29);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText(" Room Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 130, 90, 29);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myhotel/images/0.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 410, 330);

        setSize(new java.awt.Dimension(427, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed
        // TODO add your handlin code here:
        String no=roomno.getText();
        String ty=roomtype.getSelectedItem().toString();
      
        try {
            String q ="INSERT INTO rooms values('"+no +"','"+ty+"',0)";
            pst=link.prepareStatement(q);
            pst.execute();
            System.out.println("Success");
            JOptionPane.showMessageDialog(this, "Successfully Added","Success",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException e) {
            if(e.getErrorCode() ==1062)
            {
              JOptionPane.showMessageDialog(this, "Room No Already Exists","Error",JOptionPane.ERROR_MESSAGE);  
            }
        }
        
    }//GEN-LAST:event_runActionPerformed

    private void roomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomnoActionPerformed

    private void roomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomtypeActionPerformed

    private void run1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run1ActionPerformed
        AdminMain s2 = new AdminMain();
        s2.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_run1ActionPerformed

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
            java.util.logging.Logger.getLogger(Addroomtype1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addroomtype1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addroomtype1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addroomtype1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Addroomtype1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField roomno;
    private javax.swing.JComboBox roomtype;
    private javax.swing.JButton run;
    private javax.swing.JButton run1;
    // End of variables declaration//GEN-END:variables
}