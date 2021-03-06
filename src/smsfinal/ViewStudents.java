/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsfinal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Derrick Witness
 */
public class ViewStudents extends javax.swing.JDialog {
      Connection conn =  null;
      PreparedStatement pst = null;
      Statement stm = null;
      ResultSet rs = null;
    /**
     * Creates new form ViewStudents
     */
    public ViewStudents(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        iconMethod();
//        table_Student.getTableHeader().setOpaque(false);
//        table_Student.getTableHeader().setBackground(table_Student.getGridColor());
        TableCellRenderer rendererFromHeader = table_Student.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        table_Student.getTableHeader().setOpaque(false);
        Color blueColor = new Color(102,255,255);
        table_Student.getTableHeader().setBackground(blueColor);
    }
    public void iconMethod()
    {
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("students.png")));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Student = new javax.swing.JTable()
        {
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
                Component returnComp = super.prepareRenderer(renderer, row, column);
                Color alternateColor = Color.white;
                Color blueColor = new Color(102,255,255);
                if (!returnComp.getBackground().equals(getSelectionBackground())){
                    Color bg = (row % 2 == 0 ? alternateColor : blueColor);
                    returnComp .setBackground(bg);
                    bg = null;
                }
                return returnComp;

            }
        };
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_search = new javax.swing.JButton();
        search_Student = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        combo_form = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        table_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table_Student.getTableHeader().setReorderingAllowed(false);
        table_Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_StudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Student);
        if (table_Student.getColumnModel().getColumnCount() > 0) {
            table_Student.getColumnModel().getColumn(0).setResizable(false);
            table_Student.getColumnModel().getColumn(0).setPreferredWidth(40);
            table_Student.getColumnModel().getColumn(1).setResizable(false);
            table_Student.getColumnModel().getColumn(1).setPreferredWidth(200);
            table_Student.getColumnModel().getColumn(2).setResizable(false);
            table_Student.getColumnModel().getColumn(2).setPreferredWidth(40);
            table_Student.getColumnModel().getColumn(3).setResizable(false);
            table_Student.getColumnModel().getColumn(3).setPreferredWidth(100);
            table_Student.getColumnModel().getColumn(4).setResizable(false);
            table_Student.getColumnModel().getColumn(4).setPreferredWidth(60);
            table_Student.getColumnModel().getColumn(5).setResizable(false);
            table_Student.getColumnModel().getColumn(5).setPreferredWidth(100);
            table_Student.getColumnModel().getColumn(6).setResizable(false);
            table_Student.getColumnModel().getColumn(6).setPreferredWidth(40);
            table_Student.getColumnModel().getColumn(7).setResizable(false);
            table_Student.getColumnModel().getColumn(7).setPreferredWidth(100);
            table_Student.getColumnModel().getColumn(8).setResizable(false);
            table_Student.getColumnModel().getColumn(8).setPreferredWidth(80);
            table_Student.getColumnModel().getColumn(9).setResizable(false);
            table_Student.getColumnModel().getColumn(9).setPreferredWidth(60);
        }

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel1.setText("Student Adm No.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_Student, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search_Student, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton3.setText("PRINT TABLE");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("View Multiple"));

        combo_form.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Form--", "1", "2", "3", "4" }));
        combo_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_formActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(combo_form, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_form, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDesktopPane1)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(138, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        DbConnection Connect = new DbConnection();
        conn = Connect.Connectdb();
          if (search_Student.getText().equals(""))
        {
            JOptionPane.showMessageDialog( this, "Please enter student's Admission number","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
            String sql = "SELECT * FROM `new_student` WHERE `adm` = '"+search_Student.getText()+"' ORDER BY name";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            
            int r = 0;
            
            while (rs.next())
            {
                
                table_Student.setValueAt(rs.getString("adm"), r, 0); 
                table_Student.setValueAt(rs.getString("name"), r, 1); 
                table_Student.setValueAt(rs.getString("kcpe"), r, 2); 
                table_Student.setValueAt(rs.getString("DOB"), r, 3);
                table_Student.setValueAt(rs.getString("gen"), r, 4); 
                table_Student.setValueAt(rs.getString("house"), r, 5); 
                table_Student.setValueAt(rs.getString("form"), r, 6); 
                //table_Student.setValueAt(rs.getString("stream"), r, 7); 
                table_Student.setValueAt(rs.getString("pstd"), r, 7); 
                table_Student.setValueAt(rs.getString("Relig"), r, 8); 
                table_Student.setValueAt(rs.getString("disability"), r, 9); 
            r++;
            }
            rs.close();
            conn.close();           
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_btn_searchActionPerformed

    private void combo_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_formActionPerformed
        DbConnection Connect = new DbConnection();
        conn = Connect.Connectdb();
        if(!combo_form.getSelectedItem().equals("--Select Form--"))
        {
            //refreshTable();
            try
            {
                String sql = "SELECT * FROM `new_student` WHERE `form` = '"+combo_form.getSelectedItem()+"' ORDER BY `stream`";
                stm = conn.createStatement();
                rs = stm.executeQuery(sql);

                int r = 0;

                while (rs.next())
                {

                    table_Student.setValueAt(rs.getString("adm"), r, 0); 
                    table_Student.setValueAt(rs.getString("name"), r, 1); 
                    table_Student.setValueAt(rs.getString("kcpe"), r, 2); 
                    table_Student.setValueAt(rs.getString("DOB"), r, 3);
                    table_Student.setValueAt(rs.getString("gen"), r, 4); 
                    table_Student.setValueAt(rs.getString("house"), r, 5); 
                    table_Student.setValueAt(rs.getString("form"), r, 6); 
                    //table_Student.setValueAt(rs.getString("stream"), r, 7); 
                    table_Student.setValueAt(rs.getString("pstd"), r, 7); 
                    table_Student.setValueAt(rs.getString("Relig"), r, 8); 
                    table_Student.setValueAt(rs.getString("disability"), r, 9); 
                r++;
                }
                rs.close();
                conn.close();           
            }catch(Exception e)
            {
                e.printStackTrace();
            } 
          refreshTable();
        }
        
    }//GEN-LAST:event_combo_formActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       try{
       
           table_Student.print();
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table_StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_StudentMouseClicked
        
    }//GEN-LAST:event_table_StudentMouseClicked
    private void refreshTable()
    {
    DbConnection Connect = new DbConnection();
    conn = Connect.Connectdb();
         //refresh
       try{
            String sql="SELECT adm as 'Adm No', name as 'Name', kcpe as 'KCPE', DOB as 'Date Of Birth', gen as 'Gender', house as 'House', form as 'Form',  pstd as 'Report Date', Relig as 'Religion', disability as 'Disability' FROM new_student WHERE `form` = '"+combo_form.getSelectedItem()+"'";
            stm=conn.prepareStatement(sql);
            rs=stm.executeQuery(sql);
            table_Student.setModel(DbUtils.resultSetToTableModel(rs));
            table_Student.getColumnModel().getColumn(0).setPreferredWidth(40);
            table_Student.getColumnModel().getColumn(1).setPreferredWidth(200);
            table_Student.getColumnModel().getColumn(2).setPreferredWidth(40);
            table_Student.getColumnModel().getColumn(3).setPreferredWidth(100);
            table_Student.getColumnModel().getColumn(4).setPreferredWidth(60);
            table_Student.getColumnModel().getColumn(5).setPreferredWidth(100);
            table_Student.getColumnModel().getColumn(6).setPreferredWidth(40);
            table_Student.getColumnModel().getColumn(7).setPreferredWidth(100);
            table_Student.getColumnModel().getColumn(8).setPreferredWidth(80);
            table_Student.getColumnModel().getColumn(9).setPreferredWidth(60);
            
        }catch(Exception e)
        {
           e.printStackTrace();
        }finally{
        try{
            rs.close();
            pst.close();
            
        }catch(Exception e)
        {
        }
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewStudents dialog = new ViewStudents(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox combo_form;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search_Student;
    private javax.swing.JTable table_Student;
    // End of variables declaration//GEN-END:variables
}
