
package hallmanagement;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class coupon extends javax.swing.JFrame {

    
    public coupon() {
        initComponents();
    }
    Connection con = null, con1 = null;
    Statement st = null, st1=null;
    ResultSet Rs = null, Rs1 = null; 
    DefaultTableModel Model = new DefaultTableModel();
    
java.util.Date TDate;
java.sql.Date MyTDate;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LLOGOUT = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        T2 = new javax.swing.JCheckBox();
        T1 = new javax.swing.JCheckBox();
        txtlunch = new javax.swing.JSpinner();
        txtsupper = new javax.swing.JSpinner();
        NUMBER = new javax.swing.JTextField();
        TIME = new javax.swing.JTextField();
        BTADD = new javax.swing.JButton();
        BTRECIEPT = new javax.swing.JButton();
        CUPONTABLE = new javax.swing.JScrollPane();
        TC = new javax.swing.JTable();
        LTOTAL = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        LDATE = new javax.swing.JLabel();
        LRoll = new javax.swing.JLabel();
        txtRoll = new javax.swing.JTextField();
        Cpaid = new javax.swing.JCheckBox();
        TDATE = new com.toedter.calendar.JDateChooser();
        Price = new javax.swing.JTextField();
        txtpl = new javax.swing.JTextField();
        txtps = new javax.swing.JTextField();
        coupon = new javax.swing.JLabel();
        selling = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        LLOGOUT.setBackground(new java.awt.Color(0, 51, 51));
        LLOGOUT.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        LLOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        LLOGOUT.setText(" Log out");
        LLOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LLOGOUTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LLOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LLOGOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Coupon");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        T2.setBackground(new java.awt.Color(0, 51, 51));
        T2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        T2.setForeground(new java.awt.Color(255, 255, 255));
        T2.setText("Supper");

        T1.setBackground(new java.awt.Color(0, 51, 51));
        T1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        T1.setForeground(new java.awt.Color(255, 255, 255));
        T1.setText("Lunch");

        txtlunch.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        txtsupper.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        NUMBER.setBackground(new java.awt.Color(0, 102, 102));
        NUMBER.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        NUMBER.setForeground(new java.awt.Color(255, 255, 255));
        NUMBER.setText("Number");
        NUMBER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMBERActionPerformed(evt);
            }
        });

        TIME.setBackground(new java.awt.Color(0, 102, 102));
        TIME.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        TIME.setForeground(new java.awt.Color(255, 255, 255));
        TIME.setText("  Time");

        BTADD.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BTADD.setText("ADD");
        BTADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTADDMouseClicked(evt);
            }
        });
        BTADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTADDActionPerformed(evt);
            }
        });

        BTRECIEPT.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        BTRECIEPT.setText("Receipt");
        BTRECIEPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTRECIEPTActionPerformed(evt);
            }
        });

        TC.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        TC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Number", "Price", "Total"
            }
        ));
        TC.setColumnSelectionAllowed(true);
        TC.setRowHeight(20);
        CUPONTABLE.setViewportView(TC);
        TC.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        LTOTAL.setBackground(new java.awt.Color(204, 204, 204));
        LTOTAL.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        LTOTAL.setForeground(new java.awt.Color(255, 255, 255));
        LTOTAL.setText("SubTotal");

        txtsub.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        LDATE.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        LDATE.setForeground(new java.awt.Color(255, 255, 255));
        LDATE.setText("DATE");

        LRoll.setBackground(new java.awt.Color(0, 102, 102));
        LRoll.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        LRoll.setForeground(new java.awt.Color(255, 255, 255));
        LRoll.setText("Roll No");

        txtRoll.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        Cpaid.setBackground(new java.awt.Color(0, 51, 51));
        Cpaid.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Cpaid.setForeground(new java.awt.Color(255, 255, 255));
        Cpaid.setText("Paid");

        Price.setEditable(false);
        Price.setBackground(new java.awt.Color(0, 102, 102));
        Price.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Price.setForeground(new java.awt.Color(255, 255, 255));
        Price.setText("Price");
        Price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PriceMouseClicked(evt);
            }
        });
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        txtpl.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        txtps.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(LDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TDATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTADD))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTRECIEPT)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(LRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(T2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsupper, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtps, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(T1)
                                .addGap(16, 16, 16)
                                .addComponent(txtlunch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtpl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(LTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(Cpaid))
                    .addComponent(CUPONTABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LRoll, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(txtRoll))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(T1)
                                .addComponent(txtlunch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T2)
                            .addComponent(txtsupper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LDATE)
                            .addComponent(TDATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTADD)
                            .addComponent(BTRECIEPT)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(CUPONTABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cpaid)
                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(367, 367, 367))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        coupon.setBackground(new java.awt.Color(0, 153, 153));
        coupon.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        coupon.setForeground(new java.awt.Color(0, 153, 153));
        coupon.setText("Coupon");

        selling.setBackground(new java.awt.Color(0, 153, 153));
        selling.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        selling.setForeground(new java.awt.Color(0, 153, 153));
        selling.setText("Sellng");
        selling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellingMouseClicked(evt);
            }
        });

        menu.setBackground(new java.awt.Color(0, 153, 153));
        menu.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 153, 153));
        menu.setText(" Menu");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coupon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selling, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coupon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selling, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public class function
    {
        Connection c = null;
        ResultSet r = null;
        PreparedStatement p = null;
        public ResultSet find(String s){
            try{
                c = DriverManager.getConnection("jdbc:derby://localhost:1527/RHALLCUPON","USER1","1234");
                p = c.prepareStatement("select * from MENU where DATE = ?");
                p.setString(1, s);
                r = p.executeQuery();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return r;
        }

    }
    private void BTADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTADDActionPerformed
        // TODO add your handling code here: 
        int l,s;
        int sum = 0;
        int price;
        int qtn;
        int total;            
        SimpleDateFormat dtf = new SimpleDateFormat("dd-MM-yyyy");
        String date = dtf.format(TDATE.getDate());
        //SimpleDateFormat dtf = new SimpleDateFormat("dd-MM-yyyy");
        //String date = dtf.format(TDATE.getDate());
        function f = new function();
        Rs1 = f.find(date);
        try{
            if(Rs1.next())
            {
                txtpl.setText(Rs1.getString("LUNCHPRICE"));
                txtps.setText(Rs1.getString("SUPPERPRICE"));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Not found");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        if(T1.isSelected())
        {
            String lunch = T1.getText();
            price = Integer.parseInt(txtpl.getText());
            //price = 30;
            qtn = Integer.parseInt(txtlunch.getValue().toString());
            total = qtn*price;                
            Model = (DefaultTableModel)TC.getModel();
            Model.addRow(new Object[] {
            date,
            lunch,
            qtn,
            price,
            total                
            });
        } 
        if(T2.isSelected())
        {                
            String supper = T2.getText();
            price = Integer.parseInt(txtps.getText());
            //price = 30;
            qtn = Integer.parseInt(txtsupper.getValue().toString());
            total = qtn*price;
            Model = (DefaultTableModel)TC.getModel();
            Model.addRow(new Object[] {
            date,
            supper,
            qtn,
            price,
            total
            });
        } 
        for(int i=0;i<TC.getRowCount();i++)
        {
            sum = sum + Integer.parseInt(TC.getValueAt(i, 4).toString());
        }
        txtsub.setText(String.valueOf(sum));
        
    }//GEN-LAST:event_BTADDActionPerformed

    private void BTRECIEPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRECIEPTActionPerformed
        // TODO add your handling code here:
        try{
            TC.print();
        }
        catch(Exception e)
        {
            
        }
   
    }//GEN-LAST:event_BTRECIEPTActionPerformed

    private void BTADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTADDMouseClicked
        //TDate = Date.valueOf(TDATE.getText());
        //MyTDate = new java.sql.Date(TDate.getTime());
        
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/RHALLCUPON","USER1","1234");
            PreparedStatement add = con.prepareStatement("insert into COUPON values(?,?,?,?,?)");
            /*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime now = LocalDateTime.now();
            String d = dtf.format(now);*/
            SimpleDateFormat dtf = new SimpleDateFormat("dd-MM-yyyy");
            String date = dtf.format(TDATE.getDate());
            add.setString(1, date);
            add.setInt(2, Integer.parseInt(txtRoll.getText()));
            add.setInt(3, Integer.parseInt(txtlunch.getValue().toString()));
            add.setInt(4, Integer.parseInt(txtsupper.getValue().toString()));
            add.setInt(5, Integer.parseInt(txtsub.getText()));              
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "The cupon is successfully purchased");
            con.close();
        }
        catch(SQLException e)
        {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_BTADDMouseClicked

    private void NUMBERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMBERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUMBERActionPerformed

    private void sellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellingMouseClicked
        // TODO add your handling code here:
        selling sell = new selling();
        sell.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sellingMouseClicked

    private void LLOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LLOGOUTMouseClicked
        // TODO add your handling code here:
        FrontPage f = new FrontPage();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LLOGOUTMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        // TODO add your handling code here:
        Menu men = new Menu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMouseClicked

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PriceActionPerformed

    private void PriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PriceMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat dtf = new SimpleDateFormat("dd-MM-yyyy");
        String date = dtf.format(TDATE.getDate());
        function f = new function();
        Rs1 = f.find(date);
        try{
            if(Rs1.next())
            {
                txtpl.setText(Rs1.getString("LUNCHPRICE"));
                txtps.setText(Rs1.getString("SUPPERPRICE"));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Not found");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_PriceMouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coupon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTADD;
    private javax.swing.JButton BTRECIEPT;
    private javax.swing.JScrollPane CUPONTABLE;
    private javax.swing.JCheckBox Cpaid;
    private javax.swing.JLabel LDATE;
    private javax.swing.JLabel LLOGOUT;
    private javax.swing.JLabel LRoll;
    private javax.swing.JLabel LTOTAL;
    private javax.swing.JTextField NUMBER;
    private javax.swing.JTextField Price;
    private javax.swing.JCheckBox T1;
    private javax.swing.JCheckBox T2;
    private javax.swing.JTable TC;
    private com.toedter.calendar.JDateChooser TDATE;
    private javax.swing.JTextField TIME;
    private javax.swing.JLabel coupon;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel selling;
    private javax.swing.JTextField txtRoll;
    private javax.swing.JSpinner txtlunch;
    private javax.swing.JTextField txtpl;
    private javax.swing.JTextField txtps;
    private javax.swing.JTextField txtsub;
    private javax.swing.JSpinner txtsupper;
    // End of variables declaration//GEN-END:variables
}
