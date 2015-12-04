/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipesr_us;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author up720163 & Up739558
 */
public class GUI extends javax.swing.JFrame {

    private String alerts;
    private int grade, quantity, colours;
    private double lenght, outDiam, cost, pipeCost;
    private boolean error, chmRes, insulation, reinforcement;
    private Basket basket;
    private DefaultTableModel basketTable, orderTable, infoModel;
    private Pipes pipes = null;

    
    public GUI() {
        createNewTable();
        initComponents();
        alerts = "Good";
        error = false;
        validator();
        jTable4.getTableHeader().setReorderingAllowed(false);
        classForm.setEnabledAt(3, false);
        shwInfo.setEnabled(false);
        
        String data1[][] = {};
        String col1[] = {"Grade", "Quantity", "Lenghts", "Diameter", "Colours",
            "Chemical Resistance", "Inner Insulation", "Outer Reinforcement", "Pipe Cost", "Total Cost"};
        infoModel = new DefaultTableModel(data1, col1) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Disable editing.
            }
        };
        checkOut.setEnabled(false);
        infoTable.setModel(infoModel);
        delAllQoute.setEnabled(false);
        delQoute.setEnabled(false);
        ordMorePipe.setEnabled(false);
        
         JFormattedTextField tf = ((JSpinner.DefaultEditor) lenghtSpinner.getEditor()).getTextField();
         tf.setEditable(false);
         tf.setBackground(Color.white);
         tf = ((JSpinner.DefaultEditor) OuterSpinner.getEditor()).getTextField();
         tf.setEditable(false);
         tf.setBackground(Color.white);
         tf = ((JSpinner.DefaultEditor) GradeSpinner.getEditor()).getTextField();
         tf.setEditable(false);
         tf.setBackground(Color.white);
         tf = ((JSpinner.DefaultEditor) QuantSpinner.getEditor()).getTextField();
         tf.setEditable(false);
         tf.setBackground(Color.white);
        infoTable.setEnabled(false);
        basket = new Basket("Basket");

        // Add an Order to basket.
        basket.addOrder(new Orders());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classForm = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        innerClassForm = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lenghtSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        OuterSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GradeSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        CrComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        CrComboBox2 = new javax.swing.JComboBox();
        QuantSpinner = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        inInLayer = new javax.swing.JCheckBox();
        outMetRein = new javax.swing.JCheckBox();
        chResis = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        alertsLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();
        order = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        delAllQoute = new javax.swing.JButton();
        checkOut = new javax.swing.JButton();
        delQoute = new javax.swing.JButton();
        addPipe = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        ordMorePipe = new javax.swing.JButton();
        shwInfo = new javax.swing.JButton();
        info = new javax.swing.JPanel();
        infoScroll = new javax.swing.JScrollPane();
        infoTable = new javax.swing.JTable();
        bckOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        classForm.setRequestFocusEnabled(false);

        innerClassForm.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Lenght (meters) :");

        lenghtSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        lenghtSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lenghtSpinnerStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Outer Diameter (inches) :");

        OuterSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        OuterSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                OuterSpinnerStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Quantity:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Grade:");

        GradeSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        GradeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GradeSpinnerStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel5.setText("Colour 1:");

        CrComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Colour", "Green", "Blue", "Yellow", "Red", "Orange", "Black", "Purple" }));
        CrComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 13)); // NOI18N
        jLabel6.setText("Colour 2:");

        CrComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Colour", "Green", "Blue", "Yellow", "Red", "Orange", "Black", "Purple" }));
        CrComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrComboBox2ActionPerformed(evt);
            }
        });

        QuantSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        QuantSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantSpinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OuterSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuantSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GradeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CrComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CrComboBox2, 0, 1, Short.MAX_VALUE))))
                    .addComponent(lenghtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {GradeSpinner, OuterSpinner, QuantSpinner, lenghtSpinner});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CrComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CrComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lenghtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OuterSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GradeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuantSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        innerClassForm.addTab("Specification", jPanel5);

        inInLayer.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        inInLayer.setText("Inner Insulation Layer");
        inInLayer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                inInLayerItemStateChanged(evt);
            }
        });
        inInLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inInLayerActionPerformed(evt);
            }
        });

        outMetRein.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        outMetRein.setText("Outer Metallic Reinforcement");
        outMetRein.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                outMetReinItemStateChanged(evt);
            }
        });
        outMetRein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outMetReinActionPerformed(evt);
            }
        });

        chResis.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        chResis.setText("Chemical Resistance");
        chResis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chResisItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outMetRein)
                    .addComponent(inInLayer)
                    .addComponent(chResis))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(chResis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inInLayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outMetRein)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        innerClassForm.addTab("More", jPanel6);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Alerts:");

        alertsLabel.setText("Fill in the above Box");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Total Cost:");

        costLabel.setText("£0.00");

        order.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        order.setText("Add to Basket");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerClassForm)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alertsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(costLabel)))
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {order, reset});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerClassForm, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alertsLabel)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(costLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(order)
                    .addComponent(reset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {order, reset});

        classForm.addTab("Pipes", jPanel1);

        jScrollPane1.setToolTipText("");

        jTable3.setModel(basketTable);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable3MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        delAllQoute.setText("Delete All");
        delAllQoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delAllQouteActionPerformed(evt);
            }
        });

        checkOut.setText("CheckOut");
        checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutActionPerformed(evt);
            }
        });

        delQoute.setText("Delete Pipe");
        delQoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delQouteActionPerformed(evt);
            }
        });

        addPipe.setText("Add Pipe");
        addPipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(addPipe)
                        .addGap(9, 9, 9)
                        .addComponent(delAllQoute)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delQoute)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkOut))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addPipe, checkOut, delAllQoute, delQoute});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delAllQoute)
                    .addComponent(checkOut)
                    .addComponent(delQoute)
                    .addComponent(addPipe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addPipe, checkOut, delAllQoute, delQoute});

        classForm.addTab("Basket", jPanel3);

        jTable4.setModel(orderTable);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable4MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable4);

        ordMorePipe.setText("Make New Order");
        ordMorePipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordMorePipeActionPerformed(evt);
            }
        });

        shwInfo.setText("Show Info");
        shwInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shwInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ordMorePipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shwInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ordMorePipe, shwInfo});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordMorePipe)
                    .addComponent(shwInfo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        classForm.addTab("Orders", jPanel2);

        infoTable.getTableHeader().setReorderingAllowed(false);
        infoScroll.setViewportView(infoTable);

        bckOrder.setText("Back to Orders");
        bckOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoLayout.createSequentialGroup()
                        .addComponent(infoScroll)
                        .addContainerGap())
                    .addGroup(infoLayout.createSequentialGroup()
                        .addComponent(bckOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 520, Short.MAX_VALUE))))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                .addComponent(infoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bckOrder)
                .addContainerGap())
        );

        classForm.addTab("Info", info);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classForm)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classForm, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void inInLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inInLayerActionPerformed
        if(inInLayer.isSelected()){
            insulation = true;
        }else{
            insulation = false;
        }
    }//GEN-LAST:event_inInLayerActionPerformed

    private void lenghtSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lenghtSpinnerStateChanged
        // TODO add your handling code here:
        try {
            lenght = (Integer) lenghtSpinner.getValue();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());

        }

        costValidator();
    }//GEN-LAST:event_lenghtSpinnerStateChanged

    private void GradeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GradeSpinnerStateChanged
        // TODO add your handling code here:
        try {
            grade = (Integer) GradeSpinner.getValue(); // Store the grade.
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());

        }

        costValidator();

    }//GEN-LAST:event_GradeSpinnerStateChanged

    private void OuterSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_OuterSpinnerStateChanged
        // TODO add your handling code here:
        try {
            outDiam = (Integer) OuterSpinner.getValue();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());

        }

        costValidator();
    }//GEN-LAST:event_OuterSpinnerStateChanged

    private void CrComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrComboBox1ActionPerformed
        // TODO add your handling code here:
        if (CrComboBox1.getSelectedIndex() != 0) {
            // If colours are zero, increase to one.
            if (this.colours == 0) {
                this.colours++;
            }
        } else {
            this.colours = 0; // Set the colours to zero.
        }

        costValidator();
    }//GEN-LAST:event_CrComboBox1ActionPerformed

    private void CrComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrComboBox2ActionPerformed
        // TODO add your handling code here:
        if (CrComboBox2.getSelectedIndex() != 0) {
            // If colours are one, increase to two.
            if (this.colours == 1) {
                this.colours++;
            }
        } else {
            // If colours are two, decrease to one.
            if (this.colours == 2) {
                this.colours = 1;
            }
        }

        costValidator();

    }//GEN-LAST:event_CrComboBox2ActionPerformed

    private void inInLayerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_inInLayerItemStateChanged
        // TODO add your handling code here:
        if (inInLayer.isSelected()) {
            insulation = true;
        } else {
            insulation = false;
        }

        costValidator();

    }//GEN-LAST:event_inInLayerItemStateChanged

    private void outMetReinItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_outMetReinItemStateChanged
        // TODO add your handling code here:

        if (outMetRein.isSelected()) {
            reinforcement = true;
        } else {
            reinforcement = false;
        }

        costValidator();
    }//GEN-LAST:event_outMetReinItemStateChanged

    private void chResisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chResisItemStateChanged
        // TODO add your handling code here:
        if (chResis.isSelected()) {
            chmRes = true;
        } else {
            chmRes = false;
        }

        costValidator();
    }//GEN-LAST:event_chResisItemStateChanged

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        checkOut.setEnabled(true);
        delAllQoute.setEnabled(true);
        validator();
        if (error == false) {
            createPipesType();
            
            int numOfOrders = basket.getOrders().size();
            basket.getOrders().get(numOfOrders-1).getPipes().add(pipes);
            String stCost = new DecimalFormat("'£'0.00").format(cost);
            basketTable.insertRow(jTable3.getRowCount(), new Object[]{
                this.grade, // Grade.
                quantity,
                lenght,
                outDiam,
                colours,
                yesNo(chmRes),
                yesNo(insulation),
                yesNo(reinforcement),
                (new DecimalFormat("'£'0.00").format(pipeCost)),
                stCost

            });
            classForm.setSelectedIndex(1); // Moves to Basket tab.
        } else {
            JOptionPane.showMessageDialog(this, alerts);
        }
    }//GEN-LAST:event_orderActionPerformed

    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
        shwInfo.setEnabled(false);
        ordMorePipe.setEnabled(true);
        classForm.setSelectedIndex(2);
        int numberOfOrders = basket.getOrders().size();
        int count = jTable4.getRowCount(); // Amount of rows in Basket.
        for (int i = 0; i < count; i++) {
            orderTable.removeRow(0); 
        }
        for(int i=0; i<numberOfOrders;i++){
            orderTable.insertRow(i, new Object[]{i+1,basket.getOrders().get(i).getPipes().size(),"£"+new DecimalFormat("0.00").format(basket.getOrders().get(i).getTotal(basket.getOrders().get(i).getPipes()))});
        }
        
    }//GEN-LAST:event_checkOutActionPerformed

    private void QuantSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantSpinnerStateChanged
        // TODO add your handling code here:
        try {
            quantity = (Integer) QuantSpinner.getValue();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());

        }

        costValidator();
    }//GEN-LAST:event_QuantSpinnerStateChanged

    private void delAllQouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delAllQouteActionPerformed
        
        String msg = "Are you sure you want to clear the basket?";
        int ans;
        ans = JOptionPane.showConfirmDialog(this, msg, msg,
                JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            checkOut.setEnabled(false);
            delAllQoute.setEnabled(false);
            delQoute.setEnabled(false);
            ordMorePipe.setEnabled(false);
            int i, count;
            count = jTable3.getRowCount(); // Amount of rows in Basket.
            for (i = 0; i < count; i++) {
                // Because the index changes dynamically, start removing from 0.
                basketTable.removeRow(0); // Remove all row.
            }
            basket.orders.get(basket.amount() - 1).empty();

        }
    }//GEN-LAST:event_delAllQouteActionPerformed

    private void delQouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delQouteActionPerformed
        // TODO add your handling code here:
        if (basket.getOrders().get(basket.getOrders().size()-1).getPipes().isEmpty()==true){
            ordMorePipe.setEnabled(false);
        }
        String msg = "Are you sure you want to delete this order?";
        int ans;
        ans = JOptionPane.showConfirmDialog(this, msg, msg,
                JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            int skip = jTable3.getSelectedRow();
            basketTable.removeRow(skip);
            
            int numOfOrders = basket.getOrders().size();
            basket.getOrders().get(numOfOrders-1).getPipes().remove(skip);

        }
        if(basket.getOrders().get(basket.getOrders().size()-1).getPipes().isEmpty()){
            checkOut.setEnabled(false);
            delAllQoute.setEnabled(false);
            delQoute.setEnabled(false);
        }else{
            checkOut.setEnabled(true);
            delAllQoute.setEnabled(true);
             ordMorePipe.setEnabled(true);
        }
    }//GEN-LAST:event_delQouteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            quantity = (Integer) QuantSpinner.getValue();
            outDiam = (Integer) OuterSpinner.getValue();
            grade = (Integer) GradeSpinner.getValue();
            lenght = (Integer) lenghtSpinner.getValue();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());

        }
        costValidator();

    }//GEN-LAST:event_formWindowOpened

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
        
    }//GEN-LAST:event_resetActionPerformed

    private void ordMorePipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordMorePipeActionPerformed
        ordMorePipe.setEnabled(false);
        checkOut.setEnabled(false);
        delAllQoute.setEnabled(false);
        delQoute.setEnabled(false);
        reset();
        classForm.setSelectedIndex(0);
        basket.addOrder(new Orders());
        int count = jTable3.getRowCount(); // Amount of rows in Basket.
        for (int i = 0; i < count; i++) {
            basketTable.removeRow(0); 
        }
    }//GEN-LAST:event_ordMorePipeActionPerformed

    private void shwInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shwInfoActionPerformed
        classForm.setSelectedIndex(3);
        int index = jTable4.getSelectedRow();
        Orders order = basket.getOrders().get(index);
        int count = infoTable.getRowCount(); // Amount of rows in Basket.
        for (int i = 0; i < count; i++) {
            infoModel.removeRow(0); 
        }
        for (int i=0; i<basket.getOrders().get(index).getPipes().size();i++){
            Pipes pipe = order.getPipes().get(i);
            infoModel.insertRow(i, new Object[]{pipe.getGrade(),pipe.getQuantity(),pipe.getLengthMeter(),pipe.getOutDiam(),pipe.getColours(),yesNo(pipe.getChmRes()),yesNo(pipe.getInsulation()),yesNo(pipe.getReinforcement()),"£"+new DecimalFormat("0.00").format(pipe.pipeCost()),"£"+new DecimalFormat("0.00").format(pipe.pipeCost()*pipe.getQuantity())});
        }
        
    }//GEN-LAST:event_shwInfoActionPerformed

    private void jTable4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MousePressed
        shwInfo.setEnabled(true);
        
    }//GEN-LAST:event_jTable4MousePressed

    private void addPipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPipeActionPerformed
        classForm.setSelectedIndex(0);
        reset();
    }//GEN-LAST:event_addPipeActionPerformed

    private void jTable3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MousePressed
        delQoute.setEnabled(true);
    }//GEN-LAST:event_jTable3MousePressed

    private void bckOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckOrderActionPerformed
        classForm.setSelectedIndex(2);
    }//GEN-LAST:event_bckOrderActionPerformed

    private void outMetReinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outMetReinActionPerformed
        if(outMetRein.isSelected()==true){
            reinforcement = true;
        }else{
            reinforcement = false;
        }
        costValidator();
    }//GEN-LAST:event_outMetReinActionPerformed
    
    
    private void createNewTable() {

        // Basket Table.
        String data1[][] = {};
        String col1[] = {"Grade", "Quantity", "Lenghts", "Diameter", "Colours",
            "Chemical Resistance", "Inner Insulation", "Outer Reinforcement", "Pipe Cost", "Total Cost"};
        this.basketTable = new DefaultTableModel(data1, col1) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Disable editing.
            }
        };

        
        String data2[][] = {};
        String col2[] = {"Order No.", "Number Of Pipes", "Total"};
        this.orderTable = new DefaultTableModel(data2, col2) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Disable editing.
            }
        };
        
        
        
    }


    public void validator() {

        if (grade < 2) {
            colours = 0;
            CrComboBox1.setEnabled(false);
            CrComboBox2.setEnabled(false);
            inInLayer.setEnabled(false);
            outMetRein.setEnabled(false);
        } else if (grade >= 2) {
            // If grade is more than or equal to 2.
            // Colours.
            CrComboBox1.setEnabled(true); // Enable Colour 1.
            if (CrComboBox1.getSelectedIndex() != 0) {
                // If a colour for Colour 1 HAS been selected.
                CrComboBox2.setEnabled(true); // Enable Colour 2.
                if (CrComboBox2.getSelectedIndex() != 0) {
                    // If a colour for Colour 2 HAS been selected.
                    this.colours = 2;
                } else {
                    // If a colour for Colour 2 HASN'T been selected.
                    this.colours = 1;
                }
            } else {
                // If a colour for Colour 1 HASN'T been selected.
                CrComboBox2.setEnabled(false); // Disable Colour 2.
            }

            // insulation.
            if (grade >= 2 && this.colours == 2) {
                // If grade is more than or equal to 2 AND has 2 colours.
                inInLayer.setEnabled(true);

            } else if (grade < 2 || this.colours != 2) {
                // If grade is less than 2 OR if it doesn't have 2 colours.
                inInLayer.setEnabled(false);

            }

            // Rienforcent.
            if (grade >= 3 && this.colours == 2 && insulation == true) {

                outMetRein.setEnabled(true);

            } else if (grade < 3 || this.colours != 2 || insulation == false) {

                outMetRein.setEnabled(false);

            }
        }

        // Validation IF Statements.
        if (grade >= 4 && this.colours == 0) {

            alerts = "Please choose grade 1-3, or select a colour.";
            error = true;
        } else if ((grade == 5 || grade == 1) && this.colours == 1) {
            // If user chose ONE colour, but grade is 1 or 5.
            alerts = "Please choose grade 2-4, or select second colour.";
            error = true;
        } else if (grade < 2 && (this.colours == 1 || this.colours == 2)) {
            // If user chose colours, but grade is 1.
            alerts = "Please choose a grade between 2-5.";
            error = true;
        }  else if (grade >= 2 && this.colours < 2 && (insulation == true
                || reinforcement == true)) {
            // If user chose insulation options, but hasn't chosen 2 colours.
            if (innerClassForm.getSelectedIndex() != 0) {
                // If main options tab isn't selected, select it.
                innerClassForm.setSelectedIndex(0);
            }
            alerts = "Please select two colours";
            error = true;
        } else {
            // If validation is okay.
            alerts = "Good";
            error = false;
        }
        alertsLabel.setText(alerts); // Update the status message.

    }
    private void reset(){
        grade = 1;
        lenght = 1;
        outDiam = 1;
        quantity = 1;
        colours = 0;
        chmRes = false;
        insulation = false; 
        reinforcement = false;
        lenghtSpinner.setValue(1);
        OuterSpinner.setValue(1);
        GradeSpinner.setValue(1);
        QuantSpinner.setValue(1);
        CrComboBox1.setSelectedIndex(0);
        CrComboBox2.setSelectedIndex(0);
        chResis.setSelected(false);
        inInLayer.setSelected(false);
        outMetRein.setSelected(false);
    }

    public void createPipesType() {

        if (grade >= 1 & grade <= 3 & colours == 0 & insulation == false & reinforcement == false) {
            pipes = new Type_1(grade, quantity, lenght, outDiam, chmRes,colours,insulation,reinforcement);

            error = false; // No errors
            cost = pipes.totalCost();
            pipeCost = pipes.pipeCost();
            //System.out.println(pipes.totalCost());
        } else if (grade >= 2 & grade <= 4 & colours == 1 & insulation == false & reinforcement == false) {
            pipes = new Type_2(grade, quantity, lenght, outDiam, chmRes,colours,insulation,reinforcement);

            error = false; // No errors
            cost = pipes.totalCost();
            pipeCost = pipes.pipeCost();
        } else if (grade >= 2 & grade <= 5 & colours == 2 & insulation == false & reinforcement == false) {
            pipes = new Type_3(grade, quantity, lenght, outDiam, chmRes,colours,insulation,reinforcement);

            error = false; // No errors
            cost = pipes.totalCost();
            pipeCost = pipes.pipeCost();
        } else if (grade >= 2 & grade <= 5 & colours == 2 & insulation == true & reinforcement == false) {
            pipes = new Type_4(grade, quantity, lenght, outDiam, chmRes,colours,insulation,reinforcement);

            error = false; // No errors
            cost = pipes.totalCost();
            pipeCost = pipes.pipeCost();
        } else if (grade >= 3 & grade <= 5 & colours == 2 & insulation == true & reinforcement == true) {
            pipes = new Type_5(grade, quantity, lenght, outDiam, chmRes,colours,insulation,reinforcement);

            error = false; // No errors
            cost = pipes.totalCost();
            pipeCost = pipes.pipeCost();
        } else {
            error = true;
            alerts = "Order not accepted";
        }

        if (error = false) {
            // If there were no errors, add pipes to the order.
            basket.orders.get(basket.amount() - 1).addPipe(pipes);

        }

    }

    public void labelCost() {
        String stCost = new DecimalFormat("'£'0.00").format(cost);
        costLabel.setText(stCost);
    }

    public void costValidator() {
        validator();
        createPipesType();
        labelCost();
    }
    
    public String yesNo(Boolean b){
        if(b==true){
            return "yes";
        }else{
            return "no";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CrComboBox1;
    private javax.swing.JComboBox CrComboBox2;
    private javax.swing.JSpinner GradeSpinner;
    private javax.swing.JSpinner OuterSpinner;
    private javax.swing.JSpinner QuantSpinner;
    private javax.swing.JButton addPipe;
    private javax.swing.JLabel alertsLabel;
    private javax.swing.JButton bckOrder;
    private javax.swing.JCheckBox chResis;
    private javax.swing.JButton checkOut;
    private javax.swing.JTabbedPane classForm;
    private javax.swing.JLabel costLabel;
    private javax.swing.JButton delAllQoute;
    private javax.swing.JButton delQoute;
    private javax.swing.JCheckBox inInLayer;
    private javax.swing.JPanel info;
    private javax.swing.JScrollPane infoScroll;
    private javax.swing.JTable infoTable;
    private javax.swing.JTabbedPane innerClassForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JSpinner lenghtSpinner;
    private javax.swing.JButton ordMorePipe;
    private javax.swing.JButton order;
    private javax.swing.JCheckBox outMetRein;
    private javax.swing.JButton reset;
    private javax.swing.JButton shwInfo;
    // End of variables declaration//GEN-END:variables
}
