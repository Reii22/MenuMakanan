/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MenuMakanan extends javax.swing.JFrame {

    /**
     * Creates new form MenuMakanan
     */
    public MenuMakanan() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxsushicrabroll = new javax.swing.JCheckBox();
        cbxsushisalmonroll = new javax.swing.JCheckBox();
        cbxsushicaliforniaroll = new javax.swing.JCheckBox();
        cbxsweetpotatoroll = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtjumlah4 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtjumlah1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtjumlah2 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtjumlah3 = new javax.swing.JTextPane();
        cbxsushitunaroll = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtjumlah = new javax.swing.JTextPane();
        cbxocatea = new javax.swing.JCheckBox();
        cbxorangejuice = new javax.swing.JCheckBox();
        cbxsweettea = new javax.swing.JCheckBox();
        cbxcappucino = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtNomorMeja = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtjumlah6 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtjumlah7 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtjumlah8 = new javax.swing.JTextPane();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txapesan = new javax.swing.JTextArea();
        btnreset = new javax.swing.JButton();
        btnpesan = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtjumlah5 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        NomorMeja = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel2.setText("Restaurant Sushi");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 30, 270, 40);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel1.setText("Jumlah :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(740, 120, 50, 16);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setText("Menu Minuman :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 120, 110, 16);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel4.setText("Nomor Meja :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(630, 30, 90, 16);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel5.setText("Menu Yang Di Pesan :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 320, 140, 16);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel6.setText("Rp.20.000");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 250, 70, 16);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel7.setText("Jumlah :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 120, 50, 16);

        cbxsushicrabroll.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxsushicrabroll.setForeground(new java.awt.Color(51, 51, 0));
        cbxsushicrabroll.setText("Sushi Crab Roll");
        cbxsushicrabroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsushicrabrollActionPerformed(evt);
            }
        });
        jPanel1.add(cbxsushicrabroll);
        cbxsushicrabroll.setBounds(60, 280, 150, 20);

        cbxsushisalmonroll.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxsushisalmonroll.setForeground(new java.awt.Color(51, 51, 0));
        cbxsushisalmonroll.setText("Sushi Salmon Roll");
        cbxsushisalmonroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsushisalmonrollActionPerformed(evt);
            }
        });
        jPanel1.add(cbxsushisalmonroll);
        cbxsushisalmonroll.setBounds(60, 190, 126, 20);

        cbxsushicaliforniaroll.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxsushicaliforniaroll.setForeground(new java.awt.Color(51, 51, 0));
        cbxsushicaliforniaroll.setText("Sushi California Roll");
        cbxsushicaliforniaroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsushicaliforniarollActionPerformed(evt);
            }
        });
        jPanel1.add(cbxsushicaliforniaroll);
        cbxsushicaliforniaroll.setBounds(60, 220, 150, 20);

        cbxsweetpotatoroll.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxsweetpotatoroll.setForeground(new java.awt.Color(51, 51, 0));
        cbxsweetpotatoroll.setText("Sweet Potato Roll");
        cbxsweetpotatoroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsweetpotatorollActionPerformed(evt);
            }
        });
        jPanel1.add(cbxsweetpotatoroll);
        cbxsweetpotatoroll.setBounds(60, 250, 150, 20);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel8.setText("Harga :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 120, 50, 16);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel10.setText("Rp.30.000");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(240, 190, 70, 16);

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel11.setText("Rp.25.000");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(240, 280, 70, 16);

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel12.setText("Rp.25.000");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(240, 220, 70, 16);

        jScrollPane1.setViewportView(txtjumlah4);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(330, 280, 64, 22);

        jScrollPane3.setViewportView(txtjumlah1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(330, 190, 64, 22);

        jScrollPane4.setViewportView(txtjumlah2);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(330, 220, 64, 22);

        jScrollPane5.setViewportView(txtjumlah3);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(330, 250, 64, 22);

        cbxsushitunaroll.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxsushitunaroll.setForeground(new java.awt.Color(51, 51, 0));
        cbxsushitunaroll.setText("Sushi Tuna Roll");
        cbxsushitunaroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsushitunarollActionPerformed(evt);
            }
        });
        jPanel1.add(cbxsushitunaroll);
        cbxsushitunaroll.setBounds(60, 160, 130, 20);

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel13.setText("Rp.30.000");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(240, 160, 70, 16);

        jScrollPane6.setViewportView(txtjumlah);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(330, 160, 64, 22);

        cbxocatea.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxocatea.setForeground(new java.awt.Color(51, 51, 0));
        cbxocatea.setText("Oca Tea");
        cbxocatea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxocateaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxocatea);
        cbxocatea.setBounds(470, 160, 130, 20);

        cbxorangejuice.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxorangejuice.setForeground(new java.awt.Color(51, 51, 0));
        cbxorangejuice.setText("Orange Juice");
        cbxorangejuice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxorangejuiceActionPerformed(evt);
            }
        });
        jPanel1.add(cbxorangejuice);
        cbxorangejuice.setBounds(470, 190, 130, 20);

        cbxsweettea.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxsweettea.setForeground(new java.awt.Color(51, 51, 0));
        cbxsweettea.setText("Sweet Tea");
        cbxsweettea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsweetteaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxsweettea);
        cbxsweettea.setBounds(470, 220, 130, 20);

        cbxcappucino.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        cbxcappucino.setForeground(new java.awt.Color(51, 51, 0));
        cbxcappucino.setText("Cappucino");
        cbxcappucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxcappucinoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxcappucino);
        cbxcappucino.setBounds(470, 250, 130, 20);

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel14.setText("Rp.8.000");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(650, 160, 70, 16);

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel15.setText("Rp.12.000");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(650, 190, 70, 16);

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel16.setText("Rp.10.000");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(650, 220, 70, 16);

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel17.setText("Rp.15.000");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(650, 250, 70, 16);

        jScrollPane7.setViewportView(txtNomorMeja);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(740, 30, 64, 22);

        jScrollPane8.setViewportView(txtjumlah6);

        jPanel1.add(jScrollPane8);
        jScrollPane8.setBounds(740, 190, 64, 22);

        jScrollPane9.setViewportView(txtjumlah7);

        jPanel1.add(jScrollPane9);
        jScrollPane9.setBounds(740, 220, 64, 22);

        jScrollPane10.setViewportView(txtjumlah8);

        jPanel1.add(jScrollPane10);
        jScrollPane10.setBounds(740, 250, 64, 22);

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel18.setText("Menu Makanan :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(60, 120, 110, 16);

        txapesan.setColumns(20);
        txapesan.setRows(5);
        jScrollPane11.setViewportView(txapesan);

        jPanel1.add(jScrollPane11);
        jScrollPane11.setBounds(220, 320, 590, 190);

        btnreset.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset);
        btnreset.setBounds(530, 520, 75, 23);

        btnpesan.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        btnpesan.setText("Pesan");
        btnpesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpesanMouseClicked(evt);
            }
        });
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesan);
        btnpesan.setBounds(380, 520, 72, 23);

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel20.setText("Harga :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(650, 120, 50, 16);

        jScrollPane12.setViewportView(txtjumlah5);

        jPanel1.add(jScrollPane12);
        jScrollPane12.setBounds(740, 160, 64, 22);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("History");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(680, 520, 72, 23);

        NomorMeja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/1.png"))); // NOI18N
        NomorMeja.setText("jLabel21");
        jPanel1.add(NomorMeja);
        NomorMeja.setBounds(0, -40, 880, 620);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxsushicrabrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsushicrabrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsushicrabrollActionPerformed

    private void cbxsushisalmonrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsushisalmonrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsushisalmonrollActionPerformed

    private void cbxsushicaliforniarollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsushicaliforniarollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsushicaliforniarollActionPerformed

    private void cbxsweetpotatorollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsweetpotatorollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsweetpotatorollActionPerformed

    private void cbxsushitunarollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsushitunarollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsushitunarollActionPerformed

    private void cbxocateaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxocateaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxocateaActionPerformed

    private void cbxorangejuiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxorangejuiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxorangejuiceActionPerformed

    private void cbxsweetteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsweetteaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsweetteaActionPerformed

    private void cbxcappucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxcappucinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxcappucinoActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtjumlah.setText("");
        txtjumlah.setText("");
        txtjumlah.setText("");
        txtjumlah.setText("");
        txtjumlah.setText("");
        txtjumlah.setText("");
        txtjumlah.setText("");
        txtjumlah.setText("");
        txtjumlah.setText("");
        txapesan.setText("");
        
        
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnpesanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesanMouseClicked
        try {
            // TODO add your handling code here:
           
            String tampil;
            String tuna = null, salmon = null, callifornia = null, potato = null, crab = null, ocaTea = null, orangeJuice = null, sweetTea = null, cappucino = null;
            tampil = "";
            int bayar = 0;
            Connection conn = Koneksi.ConnectDB();
            String query = "SELECT * FROM tb_menu where NoMeja='"+txtNomorMeja.getText()+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            String no = null;
            while(rs.next()){
                no = rs.getString("NoMeja");
                System.out.println(no);
            }
            st.close();
            if((no != null) == true){
                JOptionPane.showMessageDialog(null, "No meja penuh", "Invalid", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(txtNomorMeja.getText().isEmpty() || txtNomorMeja.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "No meja wajib diisi", "Invalid", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(cbxsushitunaroll.isSelected()){
                int jumlah=Integer.parseInt(txtjumlah.getText());
                int total;
                total=jumlah*30000;
                bayar=bayar+total; 
                tuna= cbxsushitunaroll.getText() + "=" + txtjumlah.getText();
                tampil +=cbxsushitunaroll.getText()+"Rp.30000"+" x "+jumlah+" = "+total+"\n";
           }if(cbxsushisalmonroll.isSelected()){
                int jumlah=Integer.parseInt(txtjumlah1.getText());
                int total;
                total=jumlah*30000;
                bayar=bayar+total;
                salmon= cbxsushisalmonroll.getText() + "=" + txtjumlah1.getText();
                tampil +=cbxsushisalmonroll.getText()+"Rp.30000"+" x "+jumlah+" = "+total+"\n";
           }if(cbxsushicaliforniaroll.isSelected()){
                int jumlah=Integer.parseInt(txtjumlah2.getText());
                int total;
                total=jumlah*25000;
                bayar=bayar+total;
                callifornia= cbxsushicaliforniaroll.getText() + "=" + txtjumlah2.getText();
                tampil +=cbxsushicaliforniaroll.getText()+"Rp.25000"+" x "+jumlah+" = "+total+"\n";
           }if(cbxsweetpotatoroll.isSelected()){
                int jumlah=Integer.parseInt(txtjumlah3.getText());
                int total;
                total=jumlah*20000;
                bayar=bayar+total;
                potato=cbxsweetpotatoroll.getText() + "=" + txtjumlah3.getText();
                tampil +=cbxsweetpotatoroll.getText()+"Rp.20000"+" x "+jumlah+" = "+total+"\n";
           }if(cbxsushicrabroll.isSelected()){
                int jumlah=Integer.parseInt(txtjumlah4.getText());
                int total;
                total=jumlah*25000;
                bayar=bayar+total;
                crab=cbxsushicrabroll.getText() + "=" + txtjumlah4.getText();
                tampil +=cbxsushicrabroll.getText()+"Rp.25000"+" x "+jumlah+" = "+total+"\n";
           }if(cbxocatea.isSelected()){
                int jumlah=Integer.parseInt(txtjumlah5.getText());
                int total;
                total=jumlah*8000;
                bayar=bayar+total;
                ocaTea=cbxocatea.getText() + "=" + txtjumlah5.getText();
                tampil +=cbxocatea.getText()+"Rp.8000"+" x "+jumlah+" = "+total+"\n";
           }if(cbxorangejuice.isSelected()){
                int jumlah=Integer.parseInt(txtjumlah6.getText());
                int total;
                total=jumlah*12000;
                bayar=bayar+total;
                orangeJuice=cbxorangejuice.getText() + "=" + txtjumlah6.getText();
                tampil +=cbxorangejuice.getText()+"Rp.12000"+" x "+jumlah+" = "+total+"\n";
           }if(cbxsweettea.isSelected()){
                int jumlah=Integer.parseInt(txtjumlah7.getText());
                int total;
                total=jumlah*10000;
                bayar=bayar+total;
                sweetTea=cbxsweettea.getText() + "=" + txtjumlah7.getText();
                tampil +=cbxsweettea.getText()+"Rp.10000"+" x "+jumlah+" = "+total+"\n";
           }if(cbxcappucino.isSelected()){
                int jumlah=Integer.parseInt(txtjumlah8.getText());
                int total;
                total=jumlah*15000;
                bayar=bayar+total;
                cappucino=cbxcappucino.getText() + "=" + txtjumlah8.getText();
                tampil +=cbxcappucino.getText()+"Rp.15000"+" x "+jumlah+" = "+total+"\n";
           }
            String sql = "INSERT INTO `tb_menu`(`noMeja`, `SushiTunaRoll`, `SushiSalmonRoll`, `SushiCAliforniaRoll`, `SweetPotatoRoll`, `SushiCrabRoll`,`OcaTea`,`OrangeJuice`,`SweetTea`,`Cappucino`) VALUES ("
                            + "'"+txtNomorMeja.getText()+"'"
                            + ",'"+tuna+"'"
                            + ",'"+salmon+"'"
                            + ",'"+callifornia+"'"
                            + ",'"+potato+"'"
                            + ",'"+crab+"'"
                            + ",'"+ocaTea+"'"
                            + ",'"+orangeJuice+"'"
                            + ",'"+sweetTea+"'"
                            + ",'"+cappucino+"')";
            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.execute();
            tampil +="No Meja :"+txtNomorMeja.getText()+"\n";
           txapesan.setText(tampil+"===================================="+"\n"+"Total Bayar ="+bayar);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMakanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpesanMouseClicked

    private void btnpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpesanActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        History h = new History();
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomorMeja;
    private javax.swing.JButton btnpesan;
    private javax.swing.JButton btnreset;
    private javax.swing.JCheckBox cbxcappucino;
    private javax.swing.JCheckBox cbxocatea;
    private javax.swing.JCheckBox cbxorangejuice;
    private javax.swing.JCheckBox cbxsushicaliforniaroll;
    private javax.swing.JCheckBox cbxsushicrabroll;
    private javax.swing.JCheckBox cbxsushisalmonroll;
    private javax.swing.JCheckBox cbxsushitunaroll;
    private javax.swing.JCheckBox cbxsweetpotatoroll;
    private javax.swing.JCheckBox cbxsweettea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea txapesan;
    private javax.swing.JTextPane txtNomorMeja;
    private javax.swing.JTextPane txtjumlah;
    private javax.swing.JTextPane txtjumlah1;
    private javax.swing.JTextPane txtjumlah2;
    private javax.swing.JTextPane txtjumlah3;
    private javax.swing.JTextPane txtjumlah4;
    private javax.swing.JTextPane txtjumlah5;
    private javax.swing.JTextPane txtjumlah6;
    private javax.swing.JTextPane txtjumlah7;
    private javax.swing.JTextPane txtjumlah8;
    // End of variables declaration//GEN-END:variables

    void isVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
