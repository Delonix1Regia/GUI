// Laman 5



import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class laman5 extends javax.swing.JFrame {

    /**
     * Creates new form frame2
     */
    private void kosong_form(){
        txtMatkul.setEditable(true);
        txtMatkul.setText(null);
        txtDateline.setText(null);
        txtCatatan.setText(null);
    }
    
    private void tampil_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Mata Kuliah");
        model.addColumn("Dateline");
        model.addColumn("Catatan");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM tugas";
            java.sql.Connection conn = (Connection)JavaApplication5.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[] { no++, res.getString(1), res.getString(2), res.getString(3)});
            }
            tabeltugas.setModel(model);
            
        }catch(SQLException e){
            System.out.println("Error : "+ e.getMessage());
        }
    }
    public laman5() {
        initComponents();
        this.setLocationRelativeTo(null);
        tampil_data();
        kosong_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtMatkul = new javax.swing.JTextField();
        txtDateline = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtCatatan = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltugas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 966));
        jPanel1.setLayout(null);

        txtMatkul.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtMatkul.setPreferredSize(new java.awt.Dimension(20, 55));
        txtMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatkulActionPerformed(evt);
            }
        });
        jPanel1.add(txtMatkul);
        txtMatkul.setBounds(450, 340, 340, 50);

        txtDateline.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDateline.setPreferredSize(new java.awt.Dimension(20, 55));
        txtDateline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatelineActionPerformed(evt);
            }
        });
        jPanel1.add(txtDateline);
        txtDateline.setBounds(450, 430, 340, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Keluar.png"))); // NOI18N
        jButton1.setText("Keluar");
        jButton1.setPreferredSize(new java.awt.Dimension(130, 45));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(890, 680, 130, 45);

        txtCatatan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCatatan.setPreferredSize(new java.awt.Dimension(20, 55));
        txtCatatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCatatanActionPerformed(evt);
            }
        });
        jPanel1.add(txtCatatan);
        txtCatatan.setBounds(450, 520, 340, 50);

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Simpan.png"))); // NOI18N
        btnSimpan.setPreferredSize(new java.awt.Dimension(130, 45));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan);
        btnSimpan.setBounds(890, 280, 130, 45);

        btnTambah.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Simpan (1).png"))); // NOI18N
        btnTambah.setPreferredSize(new java.awt.Dimension(130, 45));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah);
        btnTambah.setBounds(890, 390, 130, 45);

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Hapus.png"))); // NOI18N
        btnHapus.setPreferredSize(new java.awt.Dimension(130, 45));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus);
        btnHapus.setBounds(890, 490, 130, 45);

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Edit.png"))); // NOI18N
        btnEdit.setPreferredSize(new java.awt.Dimension(130, 45));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit);
        btnEdit.setBounds(880, 590, 130, 45);

        tabeltugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeltugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltugasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltugas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(1200, 170, 679, 648);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 2030, 970);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2025, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtMatkulActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtDatelineActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void txtCatatanActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void tabeltugasMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        int baris = tabeltugas.rowAtPoint(evt.getPoint());
        String matkul = tabeltugas.getValueAt(baris, 1).toString();
        txtMatkul.setText(matkul);
        
        String DL = tabeltugas.getValueAt(baris, 2).toString();
        txtDateline.setText(DL);
        
        String Catatan = tabeltugas.getValueAt(baris, 3).toString();
        txtCatatan.setText(Catatan);
        
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        setVisible(false);
        new laman3().setVisible(true);
    }                                        

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM tugas WHERE `Mata Kuliah`='" + txtMatkul.getText() + "'";
            java.sql.Connection conn = (Connection) JavaApplication5.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
        kosong_form();
    }                                        

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO tugas VALUES ('"
                + txtMatkul.getText() + "','" + txtDateline.getText() + "','" + txtCatatan.getText()
                + "')";
            java.sql.Connection conn = (Connection)JavaApplication5.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil!");
            tampil_data();
            kosong_form();
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }                                         

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        kosong_form();
    }                                         

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
            String sql = "UPDATE tugas SET `Mata Kuliah`='" + txtMatkul.getText() + "', Dateline='" + txtDateline.getText() + "', Catatan='" + txtCatatan.getText()
                 + "' WHERE `Mata Kuliah`='" + txtMatkul.getText() + "'";
            java.sql.Connection conn = (Connection) JavaApplication5.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
            tampil_data();
            kosong_form();
    }                                       

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
            java.util.logging.Logger.getLogger(laman4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laman4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laman4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laman4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laman5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeltugas;
    private javax.swing.JTextField txtCatatan;
    private javax.swing.JTextField txtDateline;
    private javax.swing.JTextField txtMatkul;
    // End of variables declaration                   
}
