/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori_barang;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author adam
 */

public class Frmbarang extends javax.swing.JDialog {

    /**
     * Creates new form Frmmaster_barang
     * @param parent
     * @param modal
     */
    inventori_barang.koneksi konek = new inventori_barang.koneksi();
    
    public Frmbarang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initUI();
        
       datatable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
       datatable.getTableHeader().setOpaque(false);
       datatable.getTableHeader().setBackground(new Color(25, 118, 211));
       datatable.getRowHeight(25);
        
        
        SelectKategori();
        txttemp_kode.hide();
        txtid_kategori.hide();
        GetData();
        BtnEnabled(false);
        btnsave.setText("Simpan");
    }

    Frmbarang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    private void initUI(){ 
        getContentPane().setBackground(new Color(255, 255, 255));
        
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;    
        setLocation(dx, dy);
    }
    
    private void SelectKategori(){
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery("SELECT * FROM tabelkategori");
            
            cmbid_kategori.addItem("Pilih");
            while(rs.next()){
                cmbid_kategori.addItem(rs.getString("nama"));
            }
            konek.closekoneksi();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Frmbarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void TxtEmpty(){
        txtid.setText("");
        txtkode.setText("");
        txtnama.setText("");
        txtsatuan.setText("");
        txtstok.setText("");
        txtid_kategori.setText("");
        txttemp_kode.setText("");
        cmbid_kategori.setSelectedItem("Pilih");
    }
    
    private void BtnEnabled(boolean x){
        btnedit.setEnabled(x);
        btndelete.setEnabled(x);
    }
    
    private void GetData(){
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT tabelbarang.id, tabelbarang.kode, tabelbarang.nama, tabelkategori.nama as kategori, tabelbarang.stok, tabelbarang.satuan FROM tabelbarang JOIN tabelkategori ON tabelkategori.id = tabelbarang.id_kategori");
            datatable.setModel(DbUtils.resultSetToTableModel(sql));
            datatable.getColumnModel().getColumn(0).setPreferredWidth(7);
            datatable.getColumnModel().getColumn(1).setPreferredWidth(20);
            datatable.getColumnModel().getColumn(2).setPreferredWidth(90);
            datatable.getColumnModel().getColumn(3).setPreferredWidth(60);
            datatable.getColumnModel().getColumn(4).setPreferredWidth(40);
            datatable.getColumnModel().getColumn(5).setPreferredWidth(25);


            String count_rows = String.valueOf(datatable.getRowCount());
            lblcount_rows.setText("Jumlah Data : " + count_rows);
            konek.closekoneksi();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Frmbarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void GetData_View(){
        int row = datatable.getSelectedRow();
        String row_id = (datatable.getModel().getValueAt(row, 0).toString());
        txtid.setText(row_id);
        BtnEnabled(true);
    }
    private void cari(){
      
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from tabelbarang where nama like '%"+txtcari.getText()+"%'");
            datatable.setModel(DbUtils.resultSetToTableModel(sql));
            datatable.getColumnModel().getColumn(0).setPreferredWidth(7);
            datatable.getColumnModel().getColumn(1).setPreferredWidth(20);
            datatable.getColumnModel().getColumn(2).setPreferredWidth(90);
            datatable.getColumnModel().getColumn(3).setPreferredWidth(60);
            datatable.getColumnModel().getColumn(4).setPreferredWidth(40);
            datatable.getColumnModel().getColumn(5).setPreferredWidth(25);
       
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Frmbarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        cmbid_kategori = new javax.swing.JComboBox<>();
        txtsatuan = new javax.swing.JTextField();
        txttemp_kode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datatable = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtid = new javax.swing.JTextPane();
        lbl_action = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblcount_rows = new javax.swing.JLabel();
        txtid_kategori = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        cari = new javax.swing.JButton();

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(255, 255, 0));
        btnedit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnedit.setForeground(new java.awt.Color(51, 51, 51));
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Link_edit_24px.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setForeground(new java.awt.Color(245, 245, 245));
        panel.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setLabelFor(txtkode);
        jLabel1.setText("Kode");

        btnsave.setBackground(new java.awt.Color(255, 255, 255));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnsave.setText("Simpan");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setLabelFor(txtnama);
        jLabel2.setText("Nama");

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setLabelFor(txtsatuan);
        jLabel4.setText("Kategori");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        txtnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnamaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Stok");
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel6KeyTyped(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(255, 255, 255));
        btncancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btncancel.setText("Batal");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Satuan");

        txtstok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstokKeyTyped(evt);
            }
        });

        cmbid_kategori.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cmbid_kategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbid_kategoriItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cmbid_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtstok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                            .addComponent(txtsatuan, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(0, 36, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btncancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbid_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btncancel))
                .addGap(502, 502, 502))
        );

        txttemp_kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttemp_kodeActionPerformed(evt);
            }
        });

        datatable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        datatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Kode", "Nama", "Kategori", "Satuan", "Stok"
            }
        ));
        datatable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        datatable.setRowHeight(25);
        datatable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        datatable.setShowVerticalLines(false);
        datatable.getTableHeader().setReorderingAllowed(false);
        datatable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datatableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                datatableMouseReleased(evt);
            }
        });
        datatable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datatableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                datatableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(datatable);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        txtid.setBorder(null);
        txtid.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtid.setForeground(new java.awt.Color(43, 152, 240));
        txtid.setToolTipText("");
        txtid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtid.setEnabled(false);
        txtid.setFocusable(false);
        jScrollPane2.setViewportView(txtid);

        lbl_action.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_action.setText("Tambah Data");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setLabelFor(txtid);
        jLabel7.setText("Terpilih : ");

        btnadd.setBackground(new java.awt.Color(63, 255, 128));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_file_24px.png"))); // NOI18N
        btnadd.setText("Tambah");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(220, 20, 60));
        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btndelete.setForeground(new java.awt.Color(51, 51, 51));
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_disposal_24px.png"))); // NOI18N
        btndelete.setText("Hapus");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_handle_with_care_50px.png"))); // NOI18N
        jLabel8.setText("Data Barang");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Penambahan Data Barang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addGap(1, 1, 1)
                .addComponent(jLabel9)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblcount_rows.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblcount_rows.setText("Jumlah Data ");

        txtid_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_kategoriActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(25, 118, 211));
        back.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        txtcari.setMinimumSize(new java.awt.Dimension(7, 26));
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });

        cari.setBackground(new java.awt.Color(255, 255, 255));
        cari.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_property_24px.png"))); // NOI18N
        cari.setText("Search");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblcount_rows, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txttemp_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtid_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(304, 304, 304)
                                        .addComponent(lbl_action))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cari))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_action)
                        .addGap(2, 2, 2)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttemp_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblcount_rows)
                                        .addComponent(jLabel7)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(1000, 625));
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        String row_id = txtid.getText();
        if(!"0".equals(row_id)){
            try {
                btnsave.setText("Simpan");
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet sql = stm.executeQuery("SELECT tabelbarang.id, tabelbarang.kode, tabelbarang.nama, tabelbarang.id_kategori, tabelkategori.nama as kategori, tabelbarang.satuan, tabelbarang.stok FROM tabelbarang JOIN tabelkategori ON tabelkategori.id = tabelbarang.id_kategori WHERE tabelbarang.id='"+row_id+"'");
                if(sql.next()){
                    lbl_action.setForeground(new Color(43, 152, 240));
                    String kode = sql.getString("kode");
                    lbl_action.setText("Edit Data | " + kode);
                    txtid.setText(sql.getString("id"));
                    txtkode.setText(kode);
                    txtnama.setText(sql.getString("nama"));
                    cmbid_kategori.setSelectedItem(sql.getString("kategori"));
                    txtid_kategori.setText(sql.getString("id_kategori"));
                    txtsatuan.setText(sql.getString("satuan"));
                    txtstok.setText(sql.getString("stok"));
                    txttemp_kode.setText(kode);
                    txtkode.requestFocus();
                }
                konek.closekoneksi();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Frmbarang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Terdapat kesalahan id null!");
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        
        String row_id = txtid.getText();
        String row_txttemp_kode = txttemp_kode.getText();
        String row_txtkode = txtkode.getText();
        String row_txtnama = txtnama.getText();
        String row_txtkategori = txtid_kategori.getText();
        String row_txtsatuan = txtsatuan.getText();
        String row_txtstok = txtstok.getText();
        int c_kode = 0;

        if(!"".equals(row_txtkode) && !"".equals(row_txtnama) && !"".equals(row_txtkategori) && !"".equals(row_txtsatuan) && !"".equals(row_txtstok)){
            try {
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet sql = stm.executeQuery("SELECT COUNT(tabelbarang.id) as count FROM tabelbarang WHERE tabelbarang.kode='"+row_txtkode+"'");
                sql.next();
                c_kode = sql.getInt("count");
                konek.closekoneksi();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Frmbarang.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if("".equals(row_id)){
                if(c_kode == 0)
                {
                    try {
                        Connection conn = konek.openkoneksi();
                        java.sql.Statement stm = conn.createStatement();
                        stm.executeUpdate("INSERT INTO tabelbarang(kode, nama, id_kategori, satuan, stok) VALUES ('" + row_txtkode + "', '" + row_txtnama + "', '" + row_txtkategori + "', '" + row_txtsatuan + "', '" + row_txtstok + "')");
                        JOptionPane.showMessageDialog(null, "Berhasil menyimpan data.");
                        btnadd.doClick();
                        konek.closekoneksi();
                        GetData();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Frmbarang.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Kode barang sudah pernah disimpan.", "Gagal Disimpan", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                if(c_kode == 0 || row_txtkode.equals(row_txttemp_kode))
                {
                    try {
                        Connection conn = konek.openkoneksi();
                        java.sql.Statement stm = conn.createStatement();
                        stm.executeUpdate("UPDATE tabelbarang SET kode='" + row_txtkode + "',nama='" + row_txtnama + "',id_kategori='" + row_txtkategori + "',satuan='" + row_txtsatuan + "',stok='" + row_txtstok + "' WHERE id = '" + row_id + "'");
                        JOptionPane.showMessageDialog(null, "Berhasil mengubah data.");
                        btnadd.doClick();
                        konek.closekoneksi();
                        GetData();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error " + e);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Frmbarang.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Kode barang sudah pernah disimpan.", "Gagal Disimpan", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Terdapat inputan yang kosong.");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        btnadd.doClick();
    }//GEN-LAST:event_btncancelActionPerformed

    private void datatableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datatableMouseClicked
        // TODO add your handling code here:
        GetData_View();
    }//GEN-LAST:event_datatableMouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        lbl_action.setForeground(Color.black);
        lbl_action.setText("Tambah Data");
        datatable.clearSelection();
        TxtEmpty();
        BtnEnabled(false);
        btnsave.setText("Simpan");
        txtkode.requestFocus();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(ok==0) {
            try {
                String row_id = txtid.getText();
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                stm.executeUpdate("DELETE FROM tabelbarang WHERE id = '" + row_id + "'");
                JOptionPane.showMessageDialog(null, "Berhasil menghapus data.");
                btnadd.doClick();
                konek.closekoneksi();
                GetData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Frmbarang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void datatableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datatableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_datatableKeyPressed

    private void datatableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datatableKeyReleased
        // TODO add your handling code here:
        GetData_View();
    }//GEN-LAST:event_datatableKeyReleased

    private void datatableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datatableMouseReleased
        // TODO add your handling code here:
        GetData_View();
    }//GEN-LAST:event_datatableMouseReleased

    private void txtnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaKeyTyped

    private void cmbid_kategoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbid_kategoriItemStateChanged
        // TODO add your handling code here:
        String nm_kategori = cmbid_kategori.getSelectedItem().toString();
        if(!nm_kategori.equals("")){
            try {
                Connection conn = konek.openkoneksi();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet sql = stm.executeQuery("SELECT id FROM tabelkategori WHERE nama='"+nm_kategori+"'");
                if(sql.next()){
                    txtid_kategori.setText(sql.getString("id"));
                }
                konek.closekoneksi();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
  //              Logger.getLogger(FrmtransaksiKeluar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            txtid_kategori.setText("");
        }
    }//GEN-LAST:event_cmbid_kategoriItemStateChanged

    private void jLabel6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6KeyTyped

    private void txtstokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstokKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) && !(c == KeyEvent.VK_BACK_SPACE)){
            JOptionPane.showMessageDialog(null, "Inputan tidak boleh menganduk spasi", "Ilegal Input", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtstokKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GetData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttemp_kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttemp_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttemp_kodeActionPerformed

    private void txtid_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_kategoriActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new mainview().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(25);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        cari();
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
            java.util.logging.Logger.getLogger(Frmbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmbarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            Frmbarang dialog = new Frmbarang(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                    new Frmbarang().setVisible(true);
                }
            });
            dialog.setVisible(true);
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton cari;
    private javax.swing.JComboBox<String> cmbid_kategori;
    private javax.swing.JTable datatable;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_action;
    private javax.swing.JLabel lblcount_rows;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextPane txtid;
    private javax.swing.JTextField txtid_kategori;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtsatuan;
    private javax.swing.JTextField txtstok;
    private javax.swing.JTextField txttemp_kode;
    // End of variables declaration//GEN-END:variables
}
