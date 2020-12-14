/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jtable;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAMYAMUKESH
 */

public class InventoryControl extends javax.swing.JFrame {

    /** Creates new form InventoryControl */
    public InventoryControl() throws SQLException {
        initComponents();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        jRadioButton1.setActionCommand("create");
        jRadioButton2.setActionCommand("update");
        refresh(0);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jFrame1.setSize(new java.awt.Dimension(814, 440));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BarCode ID", "Unique ID", "Name", "MarketPrice", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jRadioButton1.setText("Create new product");

        jRadioButton2.setText("Update the existing one");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("MarketPrice");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantity");

        jLabel5.setText("Quantity");

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Set");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Price");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3))
                    .addComponent(jRadioButton2)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton4)))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(52, 52, 52)
                .addComponent(jRadioButton2)
                .addGap(22, 22, 22)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BarCode ID", "Unique ID", "Name", "MarketPrice", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Long.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("BarCode ID");

        jLabel7.setText("Update the selected");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Quantity", "Price","MarketPrice"}));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Add");

        jLabel9.setText("Search");

        jLabel10.setText("Name");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Delete the selected row product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton1)))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jButton1))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showctrl(int c) 
    {
        try {
 
             PreparedStatement ps;
        ResultSet rs;
        if(jTextField5.getText()==""||c==0){
        String s="SELECT * FROM IC";
        ps=(PreparedStatement) poi.con.prepareStatement(s);
         rs=ps.executeQuery();
        }
        else
        {String s="SELECT * FROM IC where Name LIKE ?";
        ps=(PreparedStatement) poi.con.prepareStatement(s);
        ps.setString(1, jTextField5.getText()+'%');
         rs=ps.executeQuery();
        }
      Object[] r=new Object[6];
         while(rs.next())
         {
             //String Us,String pa,String ro,String date,int a,int id
              // "UserId", "UserName", "Password", "Age", "Role", "DateJoining"
                     r[0]=rs.getLong("BarCodeId");
                     r[1]=rs.getInt("UniqueId");
             r[2]=rs.getString("Name");
             r[3]=rs.getFloat("MarketPrice");
             r[4]=rs.getFloat("Price");
             r[5]=rs.getLong("Quantity");
             
             mo.addRow(r);
           
             
         }
         
     
        } catch (SQLException ex) {
            Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void refresh(int c)
    {
        mo.setRowCount(0);
        mo= (DefaultTableModel)jTable1.getModel();
        showctrl(c);
       
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        if(!(jTextField1.getText().matches("[0-9]+") )&& jTextField1.getText().length() >0)
        {
             JOptionPane.showMessageDialog(this, "Enter valid BarCode ID","Failed"
               , JOptionPane.ERROR_MESSAGE);
             return;
        }
        
         PreparedStatement ps;
        ResultSet rs;
        String s="SELECT * FROM IC WHERE BarCodeId=?";
        try {
            ps=(PreparedStatement) connect.con.prepareStatement(s);
            ps.setLong(1,Long.valueOf(jTextField1.getText()));
         rs=ps.executeQuery();
         if(rs.next())
         {
            jRadioButton2.setSelected(true);
            mo.setRowCount(0);
        mo= (DefaultTableModel)jTable2.getModel();
      Object[] r=new Object[6];
      
         do
         {
             //String Us,String pa,String ro,String date,int a,int id
              // "UserId", "UserName", "Password", "Age", "Role", "DateJoining"
                    r[0]=rs.getLong("BarCodeId");
                     r[1]=rs.getInt("UniqueId");
             r[2]=rs.getString("Name");
             r[3]=rs.getFloat("MarketPrice");
             r[4]=rs.getFloat("Price");
             r[5]=rs.getInt("Quantity");
             mo.addRow(r);
         }while(rs.next());
            jRadioButton2.setSelected(true);
             jRadioButton2.setEnabled(true);
             jSpinner2.setEnabled(true);
             jButton4.setEnabled(true);
             jLabel5.setEnabled(true);
         }
         else
         {
             jRadioButton1.setSelected(true);
             jRadioButton2.setEnabled(false);
             jSpinner2.setEnabled(false);
             jButton4.setEnabled(false);
             jLabel5.setEnabled(false);
         }
         jFrame1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(InventoryControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        refresh(1);
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String s=buttonGroup1.getSelection().getActionCommand();
        if(s.equals("create"))
        {
            String n;
            int q=(int) jSpinner1.getValue();
            float mp,sp;
            n=jTextField2.getText();
            try
            {mp=Float.valueOf(jTextField3.getText());}
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(jFrame1, "Enter valid MarketPrice","Failed ", JOptionPane.ERROR_MESSAGE);
             return;
                }
            try
            {sp=Float.valueOf(jTextField6.getText());}
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(jFrame1, "Enter valid Price","Failed ", JOptionPane.ERROR_MESSAGE);
             return;
                }
            if(sp<mp)
                {
                    JOptionPane.showMessageDialog(jFrame1, "MarketPrice must be less than or equal to price","Failed ", JOptionPane.ERROR_MESSAGE);
             return;
                }
            PreparedStatement ps;
            s="INSERT INTO IC (Name,Price,Quantity,MarketPrice,BarCodeId) values (?,?,?,?,?)";
            try {
                ps=(PreparedStatement) connect.con.prepareStatement(s);
                ps.setString(1, n);
                ps.setFloat(2, sp);
                ps.setFloat(4, mp);
                ps.setInt(3, q);
                 ps.setLong(5,Long.valueOf(jTextField1.getText()));
                int e = ps.executeUpdate();
                if(e==1) JOptionPane.showMessageDialog(jFrame1, "Product added successfully","Success ", JOptionPane.INFORMATION_MESSAGE);
                jFrame1.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(InventoryControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                  
        }else
            {
                 JOptionPane.showMessageDialog(this, "Select the create button","Failed ", JOptionPane.ERROR_MESSAGE);
            }
                  
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String s=buttonGroup1.getSelection().getActionCommand();
        if(s.equals("update"))
        {
           
            int q= (int) jSpinner2.getValue();
            int r=jTable2.getSelectedRow(),o;
            if(r==-1){
                JOptionPane.showMessageDialog(jFrame1, "Select any product from the table to update","Failed ", JOptionPane.ERROR_MESSAGE);
                return;
            }
            o=(int) jTable2.getValueAt(r, 1);
            q+=(int) jTable2.getValueAt(r, 5);
            PreparedStatement ps;
            s="UPDATE IC SET Quantity=? where UniqueId=?";
            try {
                ps=(PreparedStatement) connect.con.prepareStatement(s);
                ps.setInt(1, q);
                 ps.setInt(2,o);
                int e = ps.executeUpdate();
                jTable2.setValueAt(q, r, 5);
                if(e==1) JOptionPane.showMessageDialog(jFrame1, "Quantity updated to "+String.valueOf(q)+" Successfully!","Success ", JOptionPane.INFORMATION_MESSAGE);
                jFrame1.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(InventoryControl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                  
        }else
            {
                 JOptionPane.showMessageDialog(this, "Select the create button","Failed ", JOptionPane.ERROR_MESSAGE);
            }
                  
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i= jTable1.getSelectedRow(),k=0,t1=-1;
        String a="";
        float t=-1;
        if(i==-1){JOptionPane.showMessageDialog(this, "Select the a product from the table","Failed ", JOptionPane.ERROR_MESSAGE);
        return;
        }
        if(((String)jComboBox1.getSelectedItem()).equals("Price"))
        {
            try
            {t=Float.valueOf(jTextField4.getText());}
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Enter valid price in th box","Failed ", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(((String)jComboBox1.getSelectedItem()).equals("Name"))
        {
            try
            {a=jTextField4.getText();}
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Enter valid name in th box","Failed ", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(((String)jComboBox1.getSelectedItem()).equals("MarketPrice"))
        {
            try
            {t=Float.valueOf(jTextField4.getText());}
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Enter valid MarketPrice in th box","Failed ", JOptionPane.ERROR_MESSAGE);
            }}
            if(((String)jComboBox1.getSelectedItem()).equals("Quantity"))
        {
            try
            {t1=Integer.valueOf(jTextField4.getText());}
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Enter valid Quantity in the box","Failed ", JOptionPane.ERROR_MESSAGE);
            }}
            i=-1;
           if(t!=-1) i=JOptionPane.showConfirmDialog(this, "Are to sure in changing value ","Warning ",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
           else if(t1!=-1)
            i=JOptionPane.showConfirmDialog(this, "Are to sure in changing value ","Warning ",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
           else
             i=  JOptionPane.showConfirmDialog(this, "Are to sure in changing value ","Warning ",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
           if(i!=0)return;
           i= jTable1.getSelectedRow();
        PreparedStatement ps;
        String lp="Update IC set "+(String)jComboBox1.getSelectedItem()+"= ? where UniqueId = ?";
        try {
            ps=(PreparedStatement) connect.con.prepareStatement(lp);
            ps.setInt(2, (int) jTable1.getValueAt(i, 1));
            if(t!=-1)ps.setFloat(1, t);
            else if(t1!=-1)ps.setInt(1, t1);
            else ps.setString(1,a);
            ps.executeUpdate();
             refresh(0);
        } catch (SQLException ex) {
            Logger.getLogger(InventoryControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int i= jTable1.getSelectedRow();
     
  
        if(i==-1){JOptionPane.showMessageDialog(this, "Select the a product from the table","Failed ", JOptionPane.ERROR_MESSAGE);
        return;
        }
        i=  JOptionPane.showConfirmDialog(this, "Are to sure in Deleting the selected row ","Warning ",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if(i==0){
            i= jTable1.getSelectedRow();
        PreparedStatement ps;
        String lp="delete from IC where UniqueId=?";
        try {
            ps=(PreparedStatement) connect.con.prepareStatement(lp);
            ps.setInt(1, (int) jTable1.getValueAt(i, 1));
            ps.executeUpdate();
             refresh(0);
        } catch (SQLException ex) {
            Logger.getLogger(InventoryControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new InventoryControl().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(InventoryControl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
   private connect poi =new connect();
   private DefaultTableModel mo=new DefaultTableModel();
}
