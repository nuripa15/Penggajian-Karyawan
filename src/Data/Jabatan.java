/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Map;
import java.util.HashMap;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import koneksi.koneksi;

/**
 *
 * @author Ahmad Nuripa
 */




public class Jabatan extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;

    /**
     * Creates new form Jabatan
     */
private void kosong(){
t1.setText("");
t2.setText("");
t3.setText("");
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
        Object[] Baris ={"ID Karyawan","Nama","Id Jabatan","Jabatan","Gaji Jabatan"};
        tabmode = new DefaultTableModel(null, Baris);
        tabel.setModel(tabmode);
        String sql = "select * from jabatan";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("Id_karyawan");
                String b = hasil.getString("nama");
                String c = hasil.getString("Id_jabatan");
                String d = hasil.getString("Nama_jabatan");
                String e = hasil.getString("gapok");
                
                String[] data={a,b,c,d,e};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }


   public Jabatan(java.awt.Frame parent, boolean modal) {
        ImageIcon ico = new ImageIcon("src/gambar/logo.png");
        setIconImage(ico.getImage());
        initComponents();
        tampilnih();
        datatable();
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        bersih = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        cb2 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama", "Id karyawan", "Id jabatan", "Jabatan", "Gaji Jabatan"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 640, 110));

        exit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Exit2.png"))); // NOI18N
        exit.setText("Keluar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 110, 30));

        bersih.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bersih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Clear.png"))); // NOI18N
        bersih.setText("Bersihkan");
        bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihActionPerformed(evt);
            }
        });
        getContentPane().add(bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 110, 30));

        delete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Delete.png"))); // NOI18N
        delete.setText("Hapus");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 110, 30));

        edit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Edit.png"))); // NOI18N
        edit.setText("Ubah");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 110, 30));

        simpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Save.png"))); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 110, 30));

        cb2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jabatan", "Designer", "Admin", "Marketing", "Supervisor", "Manager", " " }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 130, -1));

        t1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Jabatan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Id jabatan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Data Jabatan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Id karyawan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nama");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 40, -1));

        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Jabatan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Gaji Jabatan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, -1));

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 130, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/ic_home-removebg-preview.png"))); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 150, 60));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Cari Berdasarkan Id Jabatan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, 30));
        getContentPane().add(tcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 100, 30));

        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/cari.png"))); // NOI18N
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/jabatan.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 730, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    int ok=JOptionPane.showConfirmDialog(null,"Apakah Anda Yakin Ingin Keluar ?","",JOptionPane.YES_NO_OPTION);
            if(ok==JOptionPane.YES_OPTION){ 
                dispose();
            } 
             else if(ok==JOptionPane.NO_OPTION){                
            }   
    // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
   int bar = tabel.getSelectedRow();

   cb2.setSelectedItem(tabmode.getValueAt(bar,0).toString());
   t1.setText(tabmode.getValueAt(bar,1).toString());
   
   t2.setText(tabmode.getValueAt(bar,2).toString());
   cb2.setSelectedItem(tabmode.getValueAt(bar,3).toString());
   t3.setText(tabmode.getValueAt(bar,4).toString());
       // TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

    private void bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihActionPerformed
kosong();
    }//GEN-LAST:event_bersihActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int ok = JOptionPane.showConfirmDialog(null,"hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql ="delete from jabatan where Id_jabatan ='"+t2.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil disimpan");
                kosong();
                t2.requestFocus();
                datatable();
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal" +e);
            }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
try {
        String sql = "update jabatan set Id_karyawan=?,nama=?,Nama_jabatan=?,gapok=?  where Id_jabatan ='"+t2.getText()+"'";
                               PreparedStatement stat =  conn.prepareStatement(sql);
                               stat.setString (1, (String) cb1.getSelectedItem());
            stat.setString (2, (String) t1.getText());
            stat.setString (3, (String) cb2.getSelectedItem());
            stat.setString (4, t3.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil ubah");
            kosong();
            t2.requestFocus();
            datatable();
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
            
        
    }   
    }//GEN-LAST:event_editActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed

if (cb2.getSelectedItem().equals("Pilih Jabatan")){
    t3.setText("");
    }
    if (cb2.getSelectedItem().equals("Designer")){
    t3.setText("3000000");
    }
    if (cb2.getSelectedItem().equals("Admin")){
    t3.setText("2500000");
    }
    if (cb2.getSelectedItem().equals("Marketing")){
    t3.setText("1500000");
    }
    if (cb2.getSelectedItem().equals("Supervisor")){
    t3.setText("4000000");
    }
    if (cb2.getSelectedItem().equals("Manager")){
    t3.setText("8000000");
    }       // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
String sql = "insert into jabatan values (?,?,?,?,?)";
        try {
            PreparedStatement stat =  conn.prepareStatement(sql);
            stat.setString (1, (String) cb1.getSelectedItem());
            stat.setString (2, t1.getText());
            stat.setString (3, t2.getText());
            stat.setString (4, (String) cb2.getSelectedItem());
            stat.setString (5, t3.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            t1.requestFocus();
            datatable();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);   
        }   
    
  
    }//GEN-LAST:event_simpanActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

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
           
       }          // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menuutama mn = new Menuutama();
        dispose();
        mn.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
 Object[] Baris ={"id_karyawan","nama","id_jabatan","Nama_jabatan","gapok"};
       tabmode = new DefaultTableModel (null, Baris);
       tabel.setModel (tabmode);
       String sql = "select * from Jabatan where id_jabatan='"+tcari.getText()+"'";
       try {
           java.sql.Statement stat = conn.createStatement ();
           ResultSet hasil = stat.executeQuery(sql);
           while (hasil.next()) {
               String a = hasil.getString ("id_karyawan");
               String b = hasil.getString ("nama");
               String c = hasil.getString ("id_jabatan");
               String d = hasil.getString ("Nama_jabatan");
               String e = hasil.getString ("gapok");
               
               String[] data={a,b,c,d,e};
               tabmode.addRow (data);
           }
           } catch (Exception e) {
       }

        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

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
            java.util.logging.Logger.getLogger(Jabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Jabatan dialog = new Jabatan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bersih;
    private javax.swing.JButton cari;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tcari;
    // End of variables declaration//GEN-END:variables
}