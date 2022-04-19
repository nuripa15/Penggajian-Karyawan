/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author ACER
 */
public class Absensi extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;
DefaultTableModel model;
    /**
     * Creates new form Absensi
     */
protected void kosong(){
        t1.setText("");
        t2.setText("");
    } 
private void tampilnih (){
         cb1.addItem("-- pilih  disini --");
          try {
            
            String sql = "select Id_karyawan from karyawan";
            Statement stat = conn.createStatement();
            ResultSet res=stat.executeQuery(sql);
            while (res.next()) {
                cb1.addItem(res.getString(1));
            }

        } catch (Exception e) {
        }
     } 

protected void datatable(){
        Object[] Baris ={"Id Karyawan","nama","Id Absen","Waktu Masuk","Waktu Keluar"};
        tabmode = new DefaultTableModel(null, Baris);
        tabel.setModel(tabmode);
        String sql = "select * from absensi";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("Id_karyawan");
                String b = hasil.getString("nama");
                String c = hasil.getString("id_absensi");
                String d = hasil.getString("waktu_absen_masuk");
                String e = hasil.getString("waktu_absen_keluar");
                
                String[] data={a,b,c,d,e};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    public Absensi() {
        ImageIcon ico = new ImageIcon("src/gambar/logo.png");
        setIconImage(ico.getImage());
        initComponents();
        tampilnih();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        cb1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        tcari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, -1));

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Exit2.png"))); // NOI18N
        exit.setText("Keluar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 120, 40));

        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Clear.png"))); // NOI18N
        reset.setText("Bersihkan");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 120, 40));

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Delete.png"))); // NOI18N
        delete.setText("Hapus");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 120, 40));

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Edit.png"))); // NOI18N
        edit.setText("Ubah");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 120, 40));

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Save.png"))); // NOI18N
        save.setText("Simpan");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 120, 40));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Karyawan", "Nama", "Id absensi", "Jam masuk", "Jam keluar"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 670, 120));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nama");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Id Karyawan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Jam keluar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17.00" }));
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Jam masuk");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Id Absensi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Data Absensi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 220, -1));

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07.00", "08.00", "09.00" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/ic_home-removebg-preview.png"))); // NOI18N
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 130, 60));

        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cari.png"))); // NOI18N
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, 30));

        tcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcariActionPerformed(evt);
            }
        });
        getContentPane().add(tcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 90, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Cari Berdasarkan  Absensi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/absensi.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        setSize(new java.awt.Dimension(794, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
String sql = "insert into absensi values (?,?,?,?,?)";
        try {
            PreparedStatement stat =  conn.prepareStatement(sql);
            stat.setString (1, t1.getText());
            stat.setString (2, (String) cb1.getSelectedItem());
            stat.setString (3, t2.getText());
            stat.setString (4, (String) cb2.getSelectedItem());
            stat.setString (5, (String) cb3.getSelectedItem());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            t1.requestFocus();
            datatable();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
try {
        String sql = "update absensi set Id_karyawan=?,nama=?,waktu_absen_masuk=?,waktu_absen_keluar=?  where id_absensi ='"+t2.getText()+"'";
                               PreparedStatement stat =  conn.prepareStatement(sql);
                              stat.setString (1, t1.getText());
            stat.setString (2, (String) cb1.getSelectedItem());
            stat.setString (3, (String) cb2.getSelectedItem());
            stat.setString (4, (String) cb3.getSelectedItem());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil ubah");
            kosong();
            t1.requestFocus();
            datatable();
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
            
        
    }       // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
try {
             Statement s = conn.createStatement();
           
           String sql="select * from karyawan where Id_karyawan='"+cb1.getSelectedItem()+"'";
           ResultSet r=s.executeQuery(sql);       
           while(r.next()){ 
               t1.setText(r.getString("nama")); 
               
           }
         
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
           
       }         // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
   int bar = tabel.getSelectedRow();

   t1.setText(tabmode.getValueAt(bar,0).toString());
   cb1.setSelectedItem(tabmode.getValueAt(bar,1).toString());
   t2.setText(tabmode.getValueAt(bar,2).toString());
   cb2.setSelectedItem(tabmode.getValueAt(bar,3).toString());
   cb3.setSelectedItem(tabmode.getValueAt(bar,4).toString());
// TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
     int ok = JOptionPane.showConfirmDialog(null,"hapus","KOnfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql ="delete from absensi where id_absensi ='"+t2.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil di hapus");
                kosong();
                t1.requestFocus();
                datatable();
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal" +e);
            }
        }   // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
      kosong();  // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
  int ok=JOptionPane.showConfirmDialog(null,"Apakah Anda Yakin Ingin Keluar ?","",JOptionPane.YES_NO_OPTION);
            if(ok==JOptionPane.YES_OPTION){ 
                dispose();
            } 
             else if(ok==JOptionPane.NO_OPTION){                
            }        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
 Object[] Baris ={"Id Karyawan","nama","absensi","waktu_absen_masuk","waktu_absen_keluar"};
       tabmode = new DefaultTableModel (null, Baris);
       tabel.setModel (tabmode);
       String sql = "select * from Absensi where id_absensi='"+tcari.getText()+"'";
       try {
           java.sql.Statement stat = conn.createStatement ();
           ResultSet hasil = stat.executeQuery(sql);
           while (hasil.next()) {
               String a = hasil.getString ("id_karyawan");
               String b = hasil.getString ("nama");
               String c = hasil.getString ("id_absensi");
               String d = hasil.getString ("waktu_absen_masuk");
               String e = hasil.getString ("waktu_absen_keluar");
               
               String[] data={a,b,c,d,e};
               tabmode.addRow (data);
           }
           } catch (Exception e) {
       }       
    }//GEN-LAST:event_cariActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menuutama mn = new Menuutama();
        dispose();
        mn.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcariActionPerformed

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
            java.util.logging.Logger.getLogger(Absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Absensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Absensi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tcari;
    // End of variables declaration//GEN-END:variables
}