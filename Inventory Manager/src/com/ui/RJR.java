package com.ui;

import com.mysql.SqlDriver;
import com.product.product;
import com.config.Configurations;
import com.order.Order;
import com.organization.Client;
import com.organization.Organization;
import com.organization.Supplier;
import com.product.Equipment;
import com.product.Linen;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jose III
 */
public class RJR extends javax.swing.JFrame {

    //private final product p = new product();
    private final SqlDriver SQL = new SqlDriver();
    private final Configurations CONF = new Configurations();
    
    
    //private final Linen LINEN = new Linen();
    //private final Equipment EQUIPMENT = new Equipment();
    
    private final Order ORDER = new Order();
    
    
    private final ImageIcon IMG = new ImageIcon("logo.png");
    
    public RJR() {
        initComponents();
        
        
       
        setIconImage(IMG.getImage());
        Cart(false);
        ClientSupplier(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtSqlUsername = new javax.swing.JTextField();
        txtSqlPassword = new javax.swing.JTextField();
        txtSqlSchema = new javax.swing.JTextField();
        txtSqlServer = new javax.swing.JTextField();
        txtSqlPort = new javax.swing.JTextField();
        btnConnect = new javax.swing.JButton();
        jLabelCon = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanelAddItem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtItemDescription = new javax.swing.JTextField();
        txtItemGross = new javax.swing.JTextField();
        txtItemNet = new javax.swing.JTextField();
        btnItemAdd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtItemAmount = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        jComboBoxItemType = new javax.swing.JComboBox<>();
        txtItemManufacturer = new javax.swing.JTextField();
        txtItemCalcGrossVAT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtItemType1 = new javax.swing.JTextField();
        txtItemType2 = new javax.swing.JTextField();
        txtItemType3 = new javax.swing.JTextField();
        lblType1 = new javax.swing.JLabel();
        lblType2 = new javax.swing.JLabel();
        lblType3 = new javax.swing.JLabel();
        txtItemBarcode = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtItemModel = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        comboSupplier = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        comboItemName = new javax.swing.JComboBox<>();
        txtItemID = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        btnDeleteItem = new javax.swing.JButton();
        btnModifyItem = new javax.swing.JButton();
        btnLoadItem = new javax.swing.JButton();
        txtItemCalcGross = new javax.swing.JTextField();
        txtDateAdded = new com.toedter.calendar.JDateChooser();
        btnGenerateItemCode = new javax.swing.JButton();
        btnGenerateBarcode = new javax.swing.JButton();
        jPanelAddSupplier = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSupplierAddress2 = new javax.swing.JTextField();
        txtSupplierAddress = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        txtSupplierContact = new javax.swing.JTextField();
        txtSupplierFax = new javax.swing.JTextField();
        txtSupplierEmail = new javax.swing.JTextField();
        btnAddSupplier = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtSupplierTelNum = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtSupplierMobile = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtSupplierTIN = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtSupplierSupplies = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtSupplierBusStyle = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        comboSupplierName = new javax.swing.JComboBox<>();
        txtSupplierID = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        btnDeleteSupplier = new javax.swing.JButton();
        btnModifySupplier = new javax.swing.JButton();
        btnLoadSupplier = new javax.swing.JButton();
        jPanelAddClient = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCart = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtClientMobile = new javax.swing.JTextField();
        txtClientTel = new javax.swing.JTextField();
        txtClientEmail = new javax.swing.JTextField();
        txtClientFax = new javax.swing.JTextField();
        txtClientContact = new javax.swing.JTextField();
        txtClientAddress2 = new javax.swing.JTextField();
        txtClientAddress1 = new javax.swing.JTextField();
        txtClientName = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        comboAddCart = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        caritemAmount = new javax.swing.JSpinner();
        btnAddCart = new javax.swing.JButton();
        btnFinalize = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        comboOrderName = new javax.swing.JComboBox<>();
        btnDeleteOrder = new javax.swing.JButton();
        btnModifyOrder = new javax.swing.JButton();
        btnLoadOrder = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        txtClientPayType = new javax.swing.JComboBox<>();
        txtClientPayMethod = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtOrderName = new javax.swing.JTextField();
        txtOrderCode = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtOrderType = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtOrderDate = new com.toedter.calendar.JDateChooser();
        txtOrderDeadline = new com.toedter.calendar.JDateChooser();
        btnAddOrder = new javax.swing.JButton();
        txtOrderIDTemp = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtClientID = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInventory = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemMysql = new javax.swing.JMenuItem();
        jMenuItemExport = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuInventory = new javax.swing.JMenuItem();
        MenuClient = new javax.swing.JMenuItem();
        MenuSupplier = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RJR Marketing ™");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setEnabled(false);
        jTabbedPane1.setName(""); // NOI18N

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ui/logo.png"))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel47.setText("RJR Marketing Iloilo");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Mysql Connection"));

        jLabel18.setText("Mysql Server:");

        jLabel19.setText("Mysql Username:");

        jLabel20.setText("Mysql Password:");

        jLabel21.setText("Mysql Port:");

        jLabel22.setText("Mysql Schema:");

        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        jLabelCon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCon.setForeground(new java.awt.Color(255, 51, 0));
        jLabelCon.setText("No Connection !");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSqlServer, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSqlSchema, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSqlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSqlPort, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSqlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelCon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtSqlServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtSqlPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtSqlSchema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtSqlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSqlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCon))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Mysql", jPanel4);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("About Us"));

        jLabel52.setText("Finals");

        jLabel59.setText("Coded By:");

        jLabel60.setText("Jose S Occeña III");

        jLabel61.setText("Lyndon Paul Ampatuan");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("About", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel25))
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel47)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", jPanelHome);

        jPanelAddItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Item Information"));
        jPanelAddItem.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelAddItemComponentShown(evt);
            }
        });

        jLabel1.setText("Item Name:");

        jLabel2.setText("Item Code:");

        jLabel4.setText("Item Manufacturer:");

        jLabel5.setText("Item Description:");

        jLabel6.setText("Item Supplier:");

        jLabel7.setText("Item Amount:");

        jLabel8.setText("Item Gross Price:");

        jLabel9.setText("Item Net Price:");

        txtItemGross.setText("1.00");
        txtItemGross.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtItemGrossFocusLost(evt);
            }
        });

        txtItemNet.setText("1.00");

        btnItemAdd.setText("Add Item");
        btnItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemAddActionPerformed(evt);
            }
        });

        jLabel10.setText("Date Added:");

        txtItemAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtItemAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtItemAmountStateChanged(evt);
            }
        });

        jLabel36.setText("Item Type:");

        jComboBoxItemType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Linen", "Equipment" }));
        jComboBoxItemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxItemTypeActionPerformed(evt);
            }
        });

        txtItemCalcGrossVAT.setEditable(false);

        jLabel12.setText("Calculated Gross:");

        jLabel39.setText("12% VAT:");

        lblType1.setText("Linen Fabric:");

        lblType2.setText("Linen Color:");

        lblType3.setText("Linen Size:");

        jLabel23.setText("Item Barcode:");

        jLabel48.setText("Item Model:");

        comboSupplier.setEditable(true);
        comboSupplier.setMaximumRowCount(100);
        comboSupplier.setName(""); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Modify Items"));

        jLabel49.setText("Item Name:");

        comboItemName.setEditable(true);
        comboItemName.setMaximumRowCount(100);
        comboItemName.setFocusCycleRoot(true);
        comboItemName.setFocusTraversalPolicyProvider(true);
        comboItemName.setName(""); // NOI18N
        comboItemName.setRequestFocusEnabled(true);

        txtItemID.setEditable(false);

        jLabel50.setText("Item ID:");

        btnDeleteItem.setText("Delete Item");
        btnDeleteItem.setEnabled(false);
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        btnModifyItem.setText("Modify Item");
        btnModifyItem.setEnabled(false);
        btnModifyItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyItemActionPerformed(evt);
            }
        });

        btnLoadItem.setText("Load");
        btnLoadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoadItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(comboItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModifyItem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50))
                    .addComponent(btnLoadItem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteItem)
                    .addComponent(btnModifyItem))
                .addContainerGap())
        );

        txtItemCalcGross.setEditable(false);

        txtDateAdded.setDateFormatString("yyyy-MM-dd");

        btnGenerateItemCode.setText("Generate");
        btnGenerateItemCode.setToolTipText("");

        btnGenerateBarcode.setText("Generate");
        btnGenerateBarcode.setToolTipText("");

        javax.swing.GroupLayout jPanelAddItemLayout = new javax.swing.GroupLayout(jPanelAddItem);
        jPanelAddItem.setLayout(jPanelAddItemLayout);
        jPanelAddItemLayout.setHorizontalGroup(
            jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAddItemLayout.createSequentialGroup()
                        .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnItemAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtItemCode)
                            .addComponent(txtItemName, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtItemDescription)
                            .addComponent(jComboBoxItemType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtItemType1)
                            .addComponent(txtItemType2)
                            .addComponent(txtItemType3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtItemManufacturer)
                            .addComponent(txtItemAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtItemGross, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtItemNet, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtItemBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(comboSupplier, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtItemCalcGrossVAT)
                            .addComponent(txtItemCalcGross)
                            .addComponent(txtDateAdded, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtItemModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenerateItemCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerateBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        jPanelAddItemLayout.setVerticalGroup(
            jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddItemLayout.createSequentialGroup()
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerateItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxItemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemType3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtItemManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtItemBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGenerateBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtDateAdded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtItemCalcGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtItemCalcGrossVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnItemAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Item", jPanelAddItem);

        jPanelAddSupplier.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplier Information"));
        jPanelAddSupplier.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelAddSupplierComponentShown(evt);
            }
        });

        jLabel11.setText("Supplier Name:");

        jLabel13.setText("Supplier Address:");

        jLabel14.setText("Supplier Address 2:");

        jLabel15.setText("Supplier Fax:");

        jLabel16.setText("Supplier Contact #:");

        jLabel17.setText("Supplier Email:");

        btnAddSupplier.setText("Add Supplier");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        jLabel37.setText("Supplier Tel Num:");

        jLabel38.setText("Supplier Mobile:");

        jLabel42.setText("Supplier TIN:");

        jLabel43.setText("Supplier Supplies:");

        jLabel44.setText("Supplier Bus. Style:");

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Modify Supplier"));

        jLabel53.setText("Supplier Name:");

        comboSupplierName.setEditable(true);
        comboSupplierName.setMaximumRowCount(100);
        comboSupplierName.setFocusCycleRoot(true);
        comboSupplierName.setFocusTraversalPolicyProvider(true);
        comboSupplierName.setName(""); // NOI18N
        comboSupplierName.setRequestFocusEnabled(true);

        txtSupplierID.setEditable(false);

        jLabel54.setText("Supplier ID:");

        btnDeleteSupplier.setText("Delete Supplier");
        btnDeleteSupplier.setEnabled(false);
        btnDeleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSupplierActionPerformed(evt);
            }
        });

        btnModifySupplier.setText("Modify Supplier");
        btnModifySupplier.setEnabled(false);
        btnModifySupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifySupplierActionPerformed(evt);
            }
        });

        btnLoadSupplier.setText("Load");
        btnLoadSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoadSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(comboSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModifySupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54))
                    .addComponent(btnLoadSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteSupplier)
                    .addComponent(btnModifySupplier))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelAddSupplierLayout = new javax.swing.GroupLayout(jPanelAddSupplier);
        jPanelAddSupplier.setLayout(jPanelAddSupplierLayout);
        jPanelAddSupplierLayout.setHorizontalGroup(
            jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanelAddSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddSupplierLayout.createSequentialGroup()
                        .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel17)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSupplierBusStyle)
                            .addComponent(txtSupplierTelNum)
                            .addComponent(txtSupplierAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtSupplierName, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtSupplierAddress2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtSupplierEmail)
                            .addComponent(txtSupplierFax, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtSupplierContact, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtSupplierMobile)
                            .addComponent(txtSupplierTIN)
                            .addComponent(txtSupplierSupplies))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelAddSupplierLayout.setVerticalGroup(
            jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddSupplierLayout.createSequentialGroup()
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSupplierAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtSupplierContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtSupplierFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtSupplierTelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtSupplierMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtSupplierTIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtSupplierSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtSupplierBusStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddSupplier)
                .addGap(27, 27, 27)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(177, 177, 177))
        );

        jTabbedPane1.addTab("Supplier", jPanelAddSupplier);

        jPanelAddClient.setBorder(javax.swing.BorderFactory.createTitledBorder("Client Information"));
        jPanelAddClient.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelAddClientComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddClientLayout = new javax.swing.GroupLayout(jPanelAddClient);
        jPanelAddClient.setLayout(jPanelAddClientLayout);
        jPanelAddClientLayout.setHorizontalGroup(
            jPanelAddClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanelAddClientLayout.setVerticalGroup(
            jPanelAddClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Client", jPanelAddClient);

        jTabbedPane2.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Order Information"));

        tableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Qty", "Price"
            }
        ));
        tableCart.setEnabled(false);
        jScrollPane1.setViewportView(tableCart);

        jLabel24.setText("Client Name:");

        jLabel26.setText("Client Address:");

        jLabel27.setText("Client Address 2:");

        jLabel29.setText("Client Contact #:");

        jLabel28.setText("Client Fax:");

        jLabel30.setText("Client Email:");

        jLabel40.setText("Client Tel Num:");

        jLabel41.setText("Client Mobile:");

        jLabel45.setText("Client Pay Method:");

        jLabel46.setText("Client Pay Type:");

        jLabel3.setText("Item name:");

        comboAddCart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel55.setText("Item Amount:");

        btnAddCart.setText("Add to cart");
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
            }
        });

        btnFinalize.setText("Add Cart");
        btnFinalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizeActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Modify Order"));

        jLabel56.setText("Order Name:");

        comboOrderName.setEditable(true);
        comboOrderName.setMaximumRowCount(100);
        comboOrderName.setFocusCycleRoot(true);
        comboOrderName.setFocusTraversalPolicyProvider(true);
        comboOrderName.setName(""); // NOI18N
        comboOrderName.setRequestFocusEnabled(true);

        btnDeleteOrder.setText("Delete Item");
        btnDeleteOrder.setActionCommand("Delete Order");
        btnDeleteOrder.setEnabled(false);
        btnDeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrderActionPerformed(evt);
            }
        });

        btnModifyOrder.setText("Modify Order");
        btnModifyOrder.setEnabled(false);
        btnModifyOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyOrderActionPerformed(evt);
            }
        });

        btnLoadOrder.setText("Load");
        btnLoadOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(btnModifyOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLoadOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboOrderName, 0, 190, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboOrderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoadOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteOrder)
                    .addComponent(btnModifyOrder))
                .addContainerGap())
        );

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtClientPayType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Multiple" }));

        txtClientPayMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Bank", "Cheque", "Others" }));

        jLabel31.setText("Order Name:");

        jLabel32.setText("Order Code:");

        jLabel33.setText("Order Type:");

        jLabel34.setText("Order Date:");

        jLabel35.setText("Order Deadline:");

        txtOrderDate.setDateFormatString("yyyy-MM-dd");
        txtOrderDate.setMinSelectableDate(new java.util.Date(978282069000L));

        txtOrderDeadline.setDateFormatString("yyyy-MM-dd");

        btnAddOrder.setText("Add Order");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        txtOrderIDTemp.setEditable(false);

        jLabel51.setText("Order ID:");

        txtClientID.setEditable(false);

        jLabel58.setText("Client ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)
                                .addComponent(comboAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(18, 18, 18)
                                .addComponent(caritemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(btnAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnFinalize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27)
                                .addComponent(jLabel29)
                                .addComponent(jLabel28)
                                .addComponent(jLabel26)
                                .addComponent(jLabel24)
                                .addComponent(jLabel30)
                                .addComponent(jLabel40)
                                .addComponent(jLabel41)
                                .addComponent(jLabel45))
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtClientMobile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClientTel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClientEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClientFax, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClientContact, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClientAddress2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClientAddress1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClientName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClientPayType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtClientPayMethod, 0, 211, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel58))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOrderCode)
                                    .addComponent(txtOrderType)
                                    .addComponent(txtOrderName)
                                    .addComponent(txtOrderDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOrderDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOrderIDTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOrderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOrderCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOrderType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrderDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrderIDTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddOrder))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtClientAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtClientAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtClientContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtClientFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(txtClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(txtClientTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(txtClientMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(txtClientPayMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(txtClientPayType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(caritemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFinalize)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Order", jPanel2);

        jTableInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableInventory.setEnabled(false);
        jScrollPane2.setViewportView(jTableInventory);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane2)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel1);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setToolTipText("");

        jMenu1.setText("File");
        jMenu1.setEnabled(false);

        jMenuItemMysql.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMysql.setText("Mysql Connection");
        jMenuItemMysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMysqlActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMysql);

        jMenuItemExport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemExport.setText("Export");
        jMenu1.add(jMenuItemExport);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("View");
        jMenu4.setEnabled(false);

        MenuInventory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        MenuInventory.setText("Inventory");
        MenuInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInventoryActionPerformed(evt);
            }
        });
        jMenu4.add(MenuInventory);

        MenuClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenuClient.setText("Client");
        MenuClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientActionPerformed(evt);
            }
        });
        jMenu4.add(MenuClient);

        MenuSupplier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenuSupplier.setText("Supplier");
        MenuSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSupplierActionPerformed(evt);
            }
        });
        jMenu4.add(MenuSupplier);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("About");
        jMenu2.setEnabled(false);
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
            try {            
                CONF.printData(txtSqlServer.getText(), txtSqlPort.getText(), 
                        txtSqlSchema.getText(), txtSqlUsername.getText(), txtSqlPassword.getText());
                
                if(SQL.connectSql() == true){
                    try{     
                        this.jMenu1.setEnabled(true);
                        this.jMenu4.setEnabled(true);
                        this.jMenu2.setEnabled(true);
                        this.jTabbedPane1.setEnabled(true);
                        this.jTabbedPane2.setEnabled(true);
                        this.jTableInventory.setEnabled(true);
                        this.tableCart.setEnabled(true);
                        
                        jLabelCon.setForeground(new java.awt.Color(51, 204, 0));

                        jLabelCon.setText("Connected !");
                        
                        System.out.println("test");

                        SQL.executeQuery(SQL.LOAD_PRODUCT);
                        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
                        fillSupplier();
                        fillItem();
                        
                        this.setEnabled(true);
                        ClientSupplier(true);
                        fillOrder();
                        

                        
                        
                       } 
                    catch (Exception ex){
                        Logger.getLogger(RJR.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }           
            catch(Exception ex){
            }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
             
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItemMysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMysqlActionPerformed
        
    }//GEN-LAST:event_jMenuItemMysqlActionPerformed

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        
//        ORG.newOrganization(txtSupplierName.getText(), txtSupplierAddress.getText(), txtSupplierAddress2.getText(), 
//                txtSupplierContact.getText(), txtSupplierTelNum.getText(), txtSupplierMobile.getText(), 
//                txtSupplierFax.getText(), txtSupplierEmail.getText(), "supplier");                        
//        int key = SQL.updateQuery("INSERT INTO rjr.organization VALUES(null,"+ORG.getNewOrganization()+")");
//        SUPP.newSupplier(txtSupplierBusStyle.getText(), txtSupplierSupplies.getText(), txtSupplierTIN.getText());
//        SQL.updateQuery("INSERT INTO rjr.supplier VALUES('"+ key +"' ,"+SUPP.getNewSupplier()+")");

        Supplier SUPP = new Supplier(txtSupplierName.getText(), txtSupplierAddress.getText(), txtSupplierAddress2.getText(), 
                txtSupplierContact.getText(), txtSupplierTelNum.getText(), txtSupplierMobile.getText(), 
                txtSupplierFax.getText(), txtSupplierEmail.getText(), "supplier", txtSupplierBusStyle.getText(), 
                txtSupplierSupplies.getText(), txtSupplierTIN.getText());
        int key = SQL.updateQuery("INSERT INTO rjr.organization VALUES(null,"+SUPP.getNewOrganization()+")");
        SQL.updateQuery("INSERT INTO rjr.supplier VALUES('"+ key +"' ,"+SUPP.getNewSupplier()+")");
        
        SQL.executeQuery(SQL.LOAD_SUPPLIER);       
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));       
        fillSupplier();           
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void btnItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemAddActionPerformed
        
        
//        p.newProduct(txtItemName.getText(), txtItemCode.getText(), txtItemDescription.getText(), Double.parseDouble(txtItemNet.getText()),
//            Double.parseDouble(txtItemGross.getText()), (Integer)txtItemAmount.getValue(), txtItemManufacturer.getText(),
//            txtItemModel.getText(), txtItemBarcode.getText(), String.valueOf(jComboBoxItemType.getSelectedItem()));                            
//        int key = SQL.updateQuery("INSERT INTO rjr.product VALUES(null,"+p.getNewProduct()+")");

//        product p = new product(txtItemName.getText(), txtItemCode.getText(), txtItemDescription.getText(), Double.parseDouble(txtItemNet.getText()),
//            Double.parseDouble(txtItemGross.getText()), (Integer)txtItemAmount.getValue(), txtItemManufacturer.getText(),
//            txtItemModel.getText(), txtItemBarcode.getText(), String.valueOf(jComboBoxItemType.getSelectedItem()));
        
        if(String.valueOf(jComboBoxItemType.getSelectedItem()).equals("Linen")){
            
            Linen LINEN = new Linen(txtItemName.getText(), txtItemCode.getText(), txtItemDescription.getText(), Double.parseDouble(txtItemNet.getText()),
            Double.parseDouble(txtItemGross.getText()), (Integer)txtItemAmount.getValue(), txtItemManufacturer.getText(),
            txtItemModel.getText(), txtItemBarcode.getText(), String.valueOf(jComboBoxItemType.getSelectedItem()),
            txtItemType1.getText(), txtItemType2.getText(), txtItemType3.getText());
            
            int key = SQL.updateQuery("INSERT INTO rjr.product VALUES(null,"+LINEN.getNewProduct()+")");
            
            SQL.updateQuery("INSERT INTO rjr.linen VALUES(" + key + "," + LINEN.getNewLinen()+")");
            
            SQL.executeQuery("SELECT * FROM rjr.organization WHERE ORG_NAME = '"+comboSupplier.getSelectedItem()+"'");
            int supKey=0;
            try {
                if(SQL.getResult().next()){
                    supKey = Integer.parseInt(SQL.getResult().getString("ORG_ID"));
                }
            } catch (SQLException ex) {

            }

            SQL.updateQuery("INSERT INTO rjr.product_organization VALUES(null ," + key +","+ supKey +")");
        }
        else{
            
            Equipment EQUIPMENT = new Equipment(txtItemName.getText(), txtItemCode.getText(), txtItemDescription.getText(), Double.parseDouble(txtItemNet.getText()),
            Double.parseDouble(txtItemGross.getText()), (Integer)txtItemAmount.getValue(), txtItemManufacturer.getText(),
            txtItemModel.getText(), txtItemBarcode.getText(), String.valueOf(jComboBoxItemType.getSelectedItem()),txtItemType1.getText(), 
                    txtItemType2.getText(), txtItemType3.getText());
            
            int key = SQL.updateQuery("INSERT INTO rjr.product VALUES(null,"+EQUIPMENT.getNewProduct()+")");
            
                           
            SQL.updateQuery("INSERT INTO rjr.equipment VALUES(" + key + "," + EQUIPMENT.getNewEquipment()+")");
            
            
            SQL.executeQuery("SELECT * FROM rjr.organization WHERE ORG_NAME = '"+comboSupplier.getSelectedItem()+"'");
            int supKey=0;
            try {
                if(SQL.getResult().next()){
                    supKey = Integer.parseInt(SQL.getResult().getString("ORG_ID"));
                }
            } catch (SQLException ex) {

            }

            SQL.updateQuery("INSERT INTO rjr.product_organization VALUES(null ," + key +","+ supKey +")");
            
            
            
        }      
        SQL.executeQuery(SQL.LOAD_PRODUCT);
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
        
        
        
        fillItem();
    }//GEN-LAST:event_btnItemAddActionPerformed

    private void MenuInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInventoryActionPerformed
        SQL.executeQuery(SQL.LOAD_PRODUCT);
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));       
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_MenuInventoryActionPerformed

    private void MenuClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientActionPerformed
        SQL.executeQuery(SQL.LOAD_CLIENT);
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_MenuClientActionPerformed

    private void MenuSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSupplierActionPerformed
        SQL.executeQuery(SQL.LOAD_SUPPLIER);
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_MenuSupplierActionPerformed

    private void txtItemAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtItemAmountStateChanged
        product p = new product();
        
        txtItemCalcGross.setText(String.valueOf(p.calculateGross(Double.parseDouble(txtItemGross.getText()), (Integer)txtItemAmount.getValue())));
        txtItemCalcGrossVAT.setText(String.valueOf(p.calculateGrossVAT(Double.parseDouble(txtItemCalcGross.getText()))));
    }//GEN-LAST:event_txtItemAmountStateChanged

    private void txtItemGrossFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemGrossFocusLost
       product p = new product();
       txtItemCalcGross.setText(String.valueOf(p.calculateGross(Double.parseDouble(txtItemGross.getText()), (Integer)txtItemAmount.getValue())));
       txtItemCalcGrossVAT.setText(String.valueOf(p.calculateGrossVAT(Double.parseDouble(txtItemCalcGross.getText()))));
    }//GEN-LAST:event_txtItemGrossFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       try {
            SQL.inData();
            txtSqlServer.setText(SQL.getServer());
            txtSqlPort.setText(SQL.getPort());
            txtSqlSchema.setText(SQL.getSchema());
            txtSqlUsername.setText(SQL.getUsername());
            txtSqlPassword.setText(SQL.getPassword());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RJR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanelAddItemComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelAddItemComponentShown
        SQL.executeQuery(SQL.LOAD_PRODUCT);
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
        fillItem();
    }//GEN-LAST:event_jPanelAddItemComponentShown

    private void jPanelAddSupplierComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelAddSupplierComponentShown
        SQL.executeQuery(SQL.LOAD_SUPPLIER);
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
    }//GEN-LAST:event_jPanelAddSupplierComponentShown

    private void jPanelAddClientComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelAddClientComponentShown
        SQL.executeQuery(SQL.LOAD_CLIENT);
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
    }//GEN-LAST:event_jPanelAddClientComponentShown

    private void jComboBoxItemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxItemTypeActionPerformed
        if(String.valueOf(jComboBoxItemType.getSelectedItem()).equals("Linen")){
            lblType1.setText("Linen Fabric:");
            lblType2.setText("Linen Color:");
            lblType3.setText("Linen Size:");                                
        }
        else{
           lblType1.setText("Equipment Serial:");
           lblType2.setText("Equipment Serial 1:");
           lblType3.setText("Equipment Warranty:"); 
        }
            
    }//GEN-LAST:event_jComboBoxItemTypeActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        if(String.valueOf(jComboBoxItemType.getSelectedItem()).equals("Linen")){
            SQL.updateQuery("DELETE FROM rjr.linen WHERE LINEN_ID = '" + txtItemID.getText()+"'");
        }
        else{
            SQL.updateQuery("DELETE FROM rjr.equipment WHERE EQUIP_ID = '" + txtItemID.getText()+"'");
        }
        SQL.updateQuery("DELETE FROM rjr.product WHERE PROD_ID = '" + txtItemID.getText()+"'");              
        SQL.executeQuery(SQL.LOAD_PRODUCT);
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnModifyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyItemActionPerformed
//        p.newProduct(txtItemName.getText(), txtItemCode.getText(), txtItemDescription.getText(), Double.parseDouble(txtItemNet.getText()),
//            Double.parseDouble(txtItemGross.getText()), (Integer)txtItemAmount.getValue(), txtItemManufacturer.getText(),
//            txtItemModel.getText(), txtItemBarcode.getText(),String.valueOf(jComboBoxItemType.getSelectedItem())); 
//        
//        SQL.updateQuery("UPDATE rjr.product SET " + p.getUpdateProduct(txtItemID.getText()));
        
        
        if(String.valueOf(jComboBoxItemType.getSelectedItem()).equals("Linen")){
            Linen LINEN = new Linen(txtItemName.getText(), txtItemCode.getText(), txtItemDescription.getText(), Double.parseDouble(txtItemNet.getText()),
            Double.parseDouble(txtItemGross.getText()), (Integer)txtItemAmount.getValue(), txtItemManufacturer.getText(),
            txtItemModel.getText(), txtItemBarcode.getText(), String.valueOf(jComboBoxItemType.getSelectedItem()),
            txtItemType1.getText(), txtItemType2.getText(), txtItemType3.getText());
            
            SQL.updateQuery("UPDATE rjr.product SET " + LINEN.getUpdateProduct(txtItemID.getText()));            
            SQL.updateQuery("UPDATE rjr.linen SET " + LINEN.getNewLinenUpdate(txtItemID.getText()));
        }
        else{
            
            Equipment EQUIPMENT = new Equipment(txtItemName.getText(), txtItemCode.getText(), txtItemDescription.getText(), Double.parseDouble(txtItemNet.getText()),
            Double.parseDouble(txtItemGross.getText()), (Integer)txtItemAmount.getValue(), txtItemManufacturer.getText(),
            txtItemModel.getText(), txtItemBarcode.getText(), String.valueOf(jComboBoxItemType.getSelectedItem()),txtItemType1.getText(), 
            txtItemType2.getText(), txtItemType3.getText());
            
            SQL.updateQuery("UPDATE rjr.product SET " + EQUIPMENT.getUpdateProduct(txtItemID.getText()));
            SQL.updateQuery("UPDATE rjr.equipment SET " + EQUIPMENT.getNewEquipmentUpdate(txtItemID.getText()));
        }
        
        
        SQL.executeQuery(SQL.LOAD_PRODUCT);
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
        resetItem();
    }//GEN-LAST:event_btnModifyItemActionPerformed

    private void btnLoadItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadItemActionPerformed
                    
        try {
            SQL.executeQuery("SELECT * FROM product WHERE PROD_NAME = '" + String.valueOf(comboItemName.getSelectedItem()) +"'"); 
            if(SQL.getResult().next()){
                txtItemName.setText(SQL.getResult().getString("PROD_NAME"));
                txtItemCode.setText(SQL.getResult().getString("PROD_CODE"));
                txtItemDescription.setText(SQL.getResult().getString("PROD_DESC"));
                txtItemManufacturer.setText(SQL.getResult().getString("PROD_MANUFACTURER"));
                txtItemModel.setText(SQL.getResult().getString("PROD_MODEL"));
                txtItemBarcode.setText(SQL.getResult().getString("PROD_BARCODE"));
                txtItemAmount.setValue(Integer.parseInt(SQL.getResult().getString("PROD_STACK")));
                txtItemGross.setText(SQL.getResult().getString("PROD_GROSS"));
                txtItemNet.setText(SQL.getResult().getString("PROD_NET"));
                txtItemID.setText(SQL.getResult().getString("PROD_ID"));
                jComboBoxItemType.setSelectedItem(SQL.getResult().getString("PROD_TYPE"));
            }
            
            if(String.valueOf(jComboBoxItemType.getSelectedItem()).equals("Linen")){
                SQL.executeQuery("SELECT * FROM linen WHERE LINEN_ID = '" + txtItemID.getText() +"'");
                
                if(SQL.getResult().next()){
                txtItemType1.setText(SQL.getResult().getString("LINEN_FABRIC"));
                txtItemType2.setText(SQL.getResult().getString("LINEN_COLOR"));
                txtItemType3.setText(SQL.getResult().getString("LINEN_SIZE"));               
                }
            }
            else{
                SQL.executeQuery("SELECT * FROM equipment WHERE EQUIP_ID = '" + txtItemID.getText() +"'");
                if(SQL.getResult().next()){
                txtItemType1.setText(SQL.getResult().getString("EQUIP_SERIAL"));
                txtItemType2.setText(SQL.getResult().getString("EQUIP_SERIAL1"));
                txtItemType3.setText(SQL.getResult().getString("EQUIP_WARRANTY"));               
                }
            }
            
            jComboBoxItemType.setEnabled(false);
            btnModifyItem.setEnabled(true);
            btnDeleteItem.setEnabled(true);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RJR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoadItemActionPerformed

    private void btnDeleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSupplierActionPerformed
        SQL.updateQuery("DELETE FROM rjr.supplier WHERE SUPP_ID = '" + txtSupplierID.getText()+"'");
        SQL.updateQuery("DELETE FROM rjr.organization WHERE ORG_ID = '" + txtSupplierID.getText()+"'");
        SQL.executeQuery(SQL.LOAD_SUPPLIER);       
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));       
        fillSupplier();
        resetSupplier();
    }//GEN-LAST:event_btnDeleteSupplierActionPerformed

    private void btnModifySupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifySupplierActionPerformed
//        ORG.newOrganization(txtSupplierName.getText(), txtSupplierAddress.getText(), txtSupplierAddress2.getText(), 
//                txtSupplierContact.getText(), txtSupplierTelNum.getText(), txtSupplierMobile.getText(), 
//                txtSupplierFax.getText(), txtSupplierEmail.getText(), "supplier");
//        SQL.updateQuery("UPDATE rjr.organization SET " + ORG.getUpdateOrganization(txtSupplierID.getText()));
//        
//        SUPP.newSupplier(txtSupplierBusStyle.getText(), txtSupplierSupplies.getText(), txtSupplierTIN.getText());
//        SQL.updateQuery("UPDATE rjr.supplier SET " + SUPP.getNewSupplierUpdate(txtSupplierID.getText()));

        Supplier SUPP = new Supplier(txtSupplierName.getText(), txtSupplierAddress.getText(), txtSupplierAddress2.getText(), 
                txtSupplierContact.getText(), txtSupplierTelNum.getText(), txtSupplierMobile.getText(), 
                txtSupplierFax.getText(), txtSupplierEmail.getText(), "supplier",txtSupplierBusStyle.getText(), 
                txtSupplierSupplies.getText(), txtSupplierTIN.getText());
        SQL.updateQuery("UPDATE rjr.organization SET " + SUPP.getUpdateOrganization(txtSupplierID.getText()));
        SQL.updateQuery("UPDATE rjr.supplier SET " + SUPP.getNewSupplierUpdate(txtSupplierID.getText()));

        
        SQL.executeQuery(SQL.LOAD_SUPPLIER);       
        jTableInventory.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));       
        fillSupplier();
        resetSupplier();
    }//GEN-LAST:event_btnModifySupplierActionPerformed

    private void btnLoadSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadSupplierActionPerformed
        try {
            SQL.executeQuery("SELECT * FROM organization WHERE ORG_NAME = '" + String.valueOf(comboSupplierName.getSelectedItem()) +"'"); 
            if(SQL.getResult().next()){
                txtSupplierName.setText(SQL.getResult().getString("ORG_NAME"));
                txtSupplierAddress.setText(SQL.getResult().getString("ORG_ADDRESS1"));
                txtSupplierAddress2.setText(SQL.getResult().getString("ORG_ADDRESS2"));
                txtSupplierContact.setText(SQL.getResult().getString("ORG_CONTACT"));
                txtSupplierFax.setText(SQL.getResult().getString("ORG_FAX"));
                txtSupplierEmail.setText(SQL.getResult().getString("ORG_EMAIL"));
                txtSupplierTelNum.setText(SQL.getResult().getString("ORG_TELNUM"));
                txtSupplierMobile.setText(SQL.getResult().getString("ORG_MOBILE"));
                txtSupplierID.setText(SQL.getResult().getString("ORG_ID"));
                
            }
                    
                SQL.executeQuery("SELECT * FROM supplier WHERE SUPP_ID = " + txtSupplierID.getText() +"");
                
                if(SQL.getResult().next()){
                txtSupplierTIN.setText(SQL.getResult().getString("SUP_TIN"));
                txtSupplierSupplies.setText(SQL.getResult().getString("SUPP_SUPPLIES"));
                txtSupplierBusStyle.setText(SQL.getResult().getString("SUPP_BUS_TYPE"));           
                }
            
            
            
            btnModifySupplier.setEnabled(true);
            btnDeleteSupplier.setEnabled(true);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RJR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoadSupplierActionPerformed

    private void btnLoadOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadOrderActionPerformed
        
        try {
            SQL.executeQuery("SELECT * FROM rjr.order WHERE ORDER_NAME = '" + String.valueOf(comboOrderName.getSelectedItem()) +"'");
            if(SQL.getResult().next()){
                txtOrderName.setText(SQL.getResult().getString("ORDER_NAME"));
                txtOrderCode.setText(SQL.getResult().getString("ORDER_CODE"));
                txtOrderType.setText(SQL.getResult().getString("ORDER_TYPE"));
                txtOrderDate.setDate(SQL.getResult().getDate("ORDER_DATE"));
                txtOrderDeadline.setDate(SQL.getResult().getDate("ORDER_DEADLINE"));
                txtOrderIDTemp.setText(SQL.getResult().getString("ORDER_ID"));
            }
            SQL.executeQuery("SELECT organization.ORG_ADDRESS1, organization.ORG_ADDRESS2, organization.ORG_CONTACT, organization.ORG_EMAIL,"
                    + " organization.ORG_FAX, organization.ORG_MOBILE, organization.ORG_NAME, organization.ORG_TELNUM, organization.ORG_ID "
                    + " FROM rjr.organization "
                    + " INNER JOIN rjr.organization_order "
                    + " ON organization.ORG_ID = organization_order.ORG_ID"
                    + " WHERE organization_order.ORDER_ID = " + txtOrderIDTemp.getText());
            if(SQL.getResult().next()){
                txtClientID.setText(SQL.getResult().getString("ORG_ID"));
                txtClientName.setText(SQL.getResult().getString("ORG_NAME"));
                txtClientAddress1.setText(SQL.getResult().getString("ORG_ADDRESS1"));
                txtClientAddress2.setText(SQL.getResult().getString("ORG_ADDRESS2"));
                txtClientContact.setText(SQL.getResult().getString("ORG_CONTACT"));
                txtClientFax.setText(SQL.getResult().getString("ORG_FAX"));
                txtClientEmail.setText(SQL.getResult().getString("ORG_EMAIL"));
                txtClientTel.setText(SQL.getResult().getString("ORG_TELNUM"));
                txtClientMobile.setText(SQL.getResult().getString("ORG_MOBILE"));
                
                
            }
            SQL.executeQuery("SELECT * FROM rjr.client WHERE CLIENT_ID = '" + txtClientID.getText() +"'");
            if(SQL.getResult().next()){
                txtClientPayMethod.setSelectedItem(SQL.getResult().getString("CLIENT_PAY_METHOD"));
                txtClientPayType.setSelectedItem(SQL.getResult().getString("CLIENT_PAY_TYPE"));
            }
            
            SQL.executeQuery("SELECT product.PROD_NAME AS Name, product.PROD_GROSS AS Gross, product_order.PROD_STACK AS Qty"
                + " FROM rjr.product_order"
                + " INNER JOIN product"
                + " ON product_order.PROD_ID = product.PROD_ID"
                + " WHERE product_order.ORDER_ID='"+txtOrderIDTemp.getText()+"'");
            tableCart.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
            
            Cart(true);
        } catch (SQLException ex) {
            
        }
        
        
        
    }//GEN-LAST:event_btnLoadOrderActionPerformed

    private void btnModifyOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyOrderActionPerformed

    private void btnDeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteOrderActionPerformed

    private void btnFinalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizeActionPerformed
        
        
    }//GEN-LAST:event_btnFinalizeActionPerformed

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
       int key=0;
        SQL.executeQuery("SELECT * FROM product WHERE PROD_NAME = '" + String.valueOf(comboAddCart.getSelectedItem()) +"'");
        try {
            if(SQL.getResult().next()){
                key = Integer.parseInt((SQL.getResult().getString("PROD_ID")));
            }
        } catch (SQLException ex) {
            
        }
        
        SQL.updateQuery("INSERT INTO rjr.product_order VALUES(null,"+key+","+txtOrderIDTemp.getText()+","+(Integer)caritemAmount.getValue()+")");
        
        SQL.executeQuery("SELECT product_order.ORDER_ID, product.PROD_NAME, product.PROD_GROSS"
                + " FROM rjr.product_order"
                + " INNER JOIN product"
                + " ON product_order.PROD_ID = product.PROD_ID"
                + " WHERE product_order.ORDER_ID='"+txtOrderIDTemp.getText()+"'");
        tableCart.setModel(DbUtils.resultSetToTableModel(SQL.getResult()));
    }//GEN-LAST:event_btnAddCartActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
//        ORG.newOrganization(txtClientName.getText(), txtClientAddress1.getText(), txtClientAddress2.getText(), 
//                txtClientContact.getText(), txtClientTel.getText(), txtClientMobile.getText(), 
//                txtClientFax.getText(), txtClientEmail.getText(), "client");       
//        int orgKey = SQL.updateQuery("INSERT INTO rjr.organization VALUES(null,"+ORG.getNewOrganization()+")");        
//        CLIENT.newClient(String.valueOf(txtClientPayMethod.getSelectedItem()), String.valueOf(txtClientPayType.getSelectedItem()));
//        SQL.updateQuery("INSERT INTO rjr.client VALUES('"+ orgKey +"' ,"+CLIENT.getNewClient()+")");       

        Client CLIENT = new Client(txtClientName.getText(), txtClientAddress1.getText(), txtClientAddress2.getText(),
                txtClientContact.getText(), txtClientTel.getText(), txtClientMobile.getText(),
                txtClientFax.getText(), txtClientEmail.getText(), "client", 
                String.valueOf(txtClientPayMethod.getSelectedItem()), String.valueOf(txtClientPayType.getSelectedItem()));

        
        int orgKey = SQL.updateQuery("INSERT INTO rjr.organization VALUES(null,"+CLIENT.getNewOrganization()+")");
        SQL.updateQuery("INSERT INTO rjr.client VALUES('"+ orgKey +"' ,"+CLIENT.getNewClient()+")");
        
        ORDER.newOrder(txtOrderName.getText(), txtOrderType.getText(), (((JTextField)txtOrderDate.getDateEditor().getUiComponent()).getText()), 
                (((JTextField)txtOrderDeadline.getDateEditor().getUiComponent()).getText()), txtOrderCode.getText());
        int Orderkey=0;
        Orderkey = SQL.updateQuery("INSERT INTO rjr.order VALUES('"+ Orderkey +"' ,"+ORDER.getNewOrder()+")");
        SQL.updateQuery("INSERT INTO rjr.organization_order VALUES(null,'"+ Orderkey +"' ,"+orgKey+")");
        txtOrderIDTemp.setText(""+Orderkey);
        ClientSupplier(false);
        Cart(true);
    }//GEN-LAST:event_btnAddOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RJR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuClient;
    private javax.swing.JMenuItem MenuInventory;
    private javax.swing.JMenuItem MenuSupplier;
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnDeleteOrder;
    private javax.swing.JButton btnDeleteSupplier;
    private javax.swing.JButton btnFinalize;
    private javax.swing.JButton btnGenerateBarcode;
    private javax.swing.JButton btnGenerateItemCode;
    private javax.swing.JButton btnItemAdd;
    private javax.swing.JButton btnLoadItem;
    private javax.swing.JButton btnLoadOrder;
    private javax.swing.JButton btnLoadSupplier;
    private javax.swing.JButton btnModifyItem;
    private javax.swing.JButton btnModifyOrder;
    private javax.swing.JButton btnModifySupplier;
    private javax.swing.JSpinner caritemAmount;
    private javax.swing.JComboBox<String> comboAddCart;
    private javax.swing.JComboBox<String> comboItemName;
    private javax.swing.JComboBox<String> comboOrderName;
    private javax.swing.JComboBox<String> comboSupplier;
    private javax.swing.JComboBox<String> comboSupplierName;
    private javax.swing.JComboBox<String> jComboBoxItemType;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCon;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExport;
    private javax.swing.JMenuItem jMenuItemMysql;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelAddClient;
    private javax.swing.JPanel jPanelAddItem;
    private javax.swing.JPanel jPanelAddSupplier;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTableInventory;
    private javax.swing.JLabel lblType1;
    private javax.swing.JLabel lblType2;
    private javax.swing.JLabel lblType3;
    private javax.swing.JTable tableCart;
    private javax.swing.JTextField txtClientAddress1;
    private javax.swing.JTextField txtClientAddress2;
    private javax.swing.JTextField txtClientContact;
    private javax.swing.JTextField txtClientEmail;
    private javax.swing.JTextField txtClientFax;
    private javax.swing.JTextField txtClientID;
    private javax.swing.JTextField txtClientMobile;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JComboBox<String> txtClientPayMethod;
    private javax.swing.JComboBox<String> txtClientPayType;
    private javax.swing.JTextField txtClientTel;
    private com.toedter.calendar.JDateChooser txtDateAdded;
    private javax.swing.JSpinner txtItemAmount;
    private javax.swing.JTextField txtItemBarcode;
    private javax.swing.JTextField txtItemCalcGross;
    private javax.swing.JTextField txtItemCalcGrossVAT;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemDescription;
    private javax.swing.JTextField txtItemGross;
    private javax.swing.JTextField txtItemID;
    private javax.swing.JTextField txtItemManufacturer;
    private javax.swing.JTextField txtItemModel;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemNet;
    private javax.swing.JTextField txtItemType1;
    private javax.swing.JTextField txtItemType2;
    private javax.swing.JTextField txtItemType3;
    private javax.swing.JTextField txtOrderCode;
    private com.toedter.calendar.JDateChooser txtOrderDate;
    private com.toedter.calendar.JDateChooser txtOrderDeadline;
    private javax.swing.JTextField txtOrderIDTemp;
    private javax.swing.JTextField txtOrderName;
    private javax.swing.JTextField txtOrderType;
    private javax.swing.JTextField txtSqlPassword;
    private javax.swing.JTextField txtSqlPort;
    private javax.swing.JTextField txtSqlSchema;
    private javax.swing.JTextField txtSqlServer;
    private javax.swing.JTextField txtSqlUsername;
    private javax.swing.JTextField txtSupplierAddress;
    private javax.swing.JTextField txtSupplierAddress2;
    private javax.swing.JTextField txtSupplierBusStyle;
    private javax.swing.JTextField txtSupplierContact;
    private javax.swing.JTextField txtSupplierEmail;
    private javax.swing.JTextField txtSupplierFax;
    private javax.swing.JTextField txtSupplierID;
    private javax.swing.JTextField txtSupplierMobile;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtSupplierSupplies;
    private javax.swing.JTextField txtSupplierTIN;
    private javax.swing.JTextField txtSupplierTelNum;
    // End of variables declaration//GEN-END:variables
    private void fillSupplier(){
            SQL.executeQuery("SELECT * FROM organization WHERE ORG_TYPE = 'supplier'");
            comboSupplier.removeAllItems();
            comboSupplierName.removeAllItems();
            try {
                while(SQL.getResult().next()){
                    String name = SQL.getResult().getString("ORG_NAME");
                    comboSupplier.addItem(name);
                    comboSupplierName.addItem(name);
                }
            } catch (SQLException ex) {
                Logger.getLogger(RJR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    private void fillItem(){        
        SQL.executeQuery("SELECT * FROM product");
        comboItemName.removeAllItems();
        comboAddCart.removeAllItems();
        try {
                while(SQL.getResult().next()){
                    String name = SQL.getResult().getString("PROD_NAME");
                    comboItemName.addItem(name);
                    comboAddCart.addItem(name);
                }
            } catch (SQLException ex) {
                Logger.getLogger(RJR.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void fillOrder(){        
        SQL.executeQuery("SELECT * FROM rjr.order");
        comboOrderName.removeAllItems();
        
        try {
                while(SQL.getResult().next()){
                    String name = SQL.getResult().getString("ORDER_NAME");
                    comboOrderName.addItem(name);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(RJR.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    
    
    public void resetItem(){
        txtItemName.setText(null);
        txtItemCode.setText(null);
        txtItemDescription.setText(null);
        jComboBoxItemType.setSelectedIndex(0);
        jComboBoxItemType.setEnabled(true);
        txtItemType1.setText(null);
        txtItemType2.setText(null);
        txtItemType3.setText(null);
        txtItemManufacturer.setText(null);
        txtItemModel.setText(null);
        txtItemBarcode.setText(null);
        txtItemAmount.setValue(1);
        txtItemGross.setText("1.00");
        txtItemNet.setText("1.00");
        txtItemCalcGross.setText(null);
        txtItemID.setText(null);
        btnModifyItem.setEnabled(false);
        btnDeleteItem.setEnabled(false);
    }
    
    public void resetSupplier(){
        txtSupplierAddress.setText(null);
        txtSupplierAddress2.setText(null);
        txtSupplierBusStyle.setText(null);
        txtSupplierContact.setText(null);
        txtSupplierEmail.setText(null);
        txtSupplierFax.setText(null);
        txtSupplierID.setText(null);
        txtSupplierMobile.setText(null);
        txtSupplierName.setText(null);
        txtSupplierSupplies.setText(null);
        txtSupplierTIN.setText(null);
        txtSupplierTelNum.setText(null);
    }
    
    public void ClientSupplier(boolean x){
        txtClientName.setEnabled(x);
        txtClientAddress1.setEnabled(x);
        txtClientAddress2.setEnabled(x);
        txtClientContact.setEnabled(x);
        txtClientFax.setEnabled(x);
        txtClientEmail.setEnabled(x);
        txtClientTel.setEnabled(x);
        txtClientMobile.setEnabled(x);
        txtClientPayMethod.setEnabled(x);
        txtClientPayType.setEnabled(x);
        txtOrderName.setEnabled(x);
        txtOrderCode.setEnabled(x);
        txtOrderType.setEnabled(x);
        txtOrderDate.setEnabled(x);
        txtOrderDeadline.setEnabled(x);
        btnAddOrder.setEnabled(x);      
    }
    
    public void Cart(boolean x){
        tableCart.setEnabled(x);
        comboAddCart.setEnabled(x);
        caritemAmount.setEnabled(x);
        btnAddCart.setEnabled(x);
        btnFinalize.setEnabled(x);
    }
}

