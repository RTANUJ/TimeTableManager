
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class F2 extends javax.swing.JFrame {
    public F2() {
        initComponents();
   
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FREEPERIOD = new javax.swing.JFrame();
        DWSW = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        CBCLASS1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CBSUB = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        T2 = new javax.swing.JTable();
        ViewTT1 = new javax.swing.JButton();
        CBDY = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        ViewTT = new javax.swing.JButton();
        CBCLASS = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        FREEPERIOD.setResizable(false);

        javax.swing.GroupLayout FREEPERIODLayout = new javax.swing.GroupLayout(FREEPERIOD.getContentPane());
        FREEPERIOD.getContentPane().setLayout(FREEPERIODLayout);
        FREEPERIODLayout.setHorizontalGroup(
            FREEPERIODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1075, Short.MAX_VALUE)
        );
        FREEPERIODLayout.setVerticalGroup(
            FREEPERIODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        jLabel3.setText("Grade:");

        CBCLASS1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI Arc", "XI Ant", "XI Atl", "XI Pac", "XII Arc", "XII Ant", "XII Atl", "XII Pac" }));

        jLabel4.setText("Subject: ");

        CBSUB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "English", "IP", "Physics", "Chemistry", "Biology" }));

        T2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Period", "Dy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(T2);

        ViewTT1.setText("Retrieve D");
        ViewTT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTT1ActionPerformed(evt);
            }
        });

        CBDY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        jLabel5.setText("Dy");

        javax.swing.GroupLayout DWSWLayout = new javax.swing.GroupLayout(DWSW.getContentPane());
        DWSW.getContentPane().setLayout(DWSWLayout);
        DWSWLayout.setHorizontalGroup(
            DWSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DWSWLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(ViewTT1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(436, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DWSWLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBDY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(DWSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DWSWLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(DWSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DWSWLayout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CBCLASS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CBSUB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        DWSWLayout.setVerticalGroup(
            DWSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DWSWLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(DWSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBDY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(ViewTT1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(DWSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DWSWLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DWSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBCLASS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(CBSUB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(31, 31, 31)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(219, 219, 219)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Table Manager");

        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Period", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(T1);

        ViewTT.setText("Retrieve Permanent Time Table of the Class");
        ViewTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTTActionPerformed(evt);
            }
        });

        CBCLASS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI Arc", "XI Ant", "XI Atl", "XI Pac", "XII Arc", "XII Ant", "XII Atl", "XII Pac" }));

        jLabel1.setText("Time Table - Grade XI and XII");

        jLabel2.setText("Grade:");

        jButton1.setText("View Day-Wise & Subject-Wise Time Table ");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBCLASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(ViewTT, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBCLASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewTT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTTActionPerformed
DefaultTableModel model =(DefaultTableModel) T1.getModel();
model.setRowCount(0);
            int selclass = CBCLASS.getSelectedIndex();
            String SELCLASS = null;
        switch (selclass){
            case 0 : SELCLASS = "xiarc";break;
            case 1 : SELCLASS = "xiant";break;
            case 2 : SELCLASS = "xiatl";break;
            case 3 : SELCLASS = "xipac";break;
            case 4 : SELCLASS = "xiiarc";break;
            case 5 : SELCLASS = "xiiant";break;
            case 6 : SELCLASS = "xiiatl";break;
            case 7 : SELCLASS = "xiipac";break;
            default :JOptionPane.showMessageDialog(this,"Dear User,Please select a class!!!");break;
            }    
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xii_class","root","");
            Statement stmt=con.createStatement();
            String query = "select * from " + SELCLASS + "  ; ";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
               {String p = rs.getString("Period");
                String mon = rs.getString("Monday");
                String tue = rs.getString("Tuesday");
                String wed = rs.getString("Wednesday");
                String thu = rs.getString("Thursday");
                String fri = rs.getString("Friday");
                model.addRow(new Object[] {p,mon,tue,wed,thu,fri});}           
                rs.close();
                stmt.close();
                con.close();}
catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());} 
if (T1.getRowCount() <=2 )JOptionPane.showMessageDialog(this,"Dear User,The Timetable is not yet updated");
    }//GEN-LAST:event_ViewTTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DWSW.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ViewTT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTT1ActionPerformed
        DefaultTableModel model =(DefaultTableModel) T2.getModel();
        model.setRowCount(0);
        int selclass = CBCLASS.getSelectedIndex();
        String SELCLASS = null,SUBSEL = null;
        switch (selclass){
            case 0 : SELCLASS = "xiarc";break;
            case 1 : SELCLASS = "xiant";break;
            case 2 : SELCLASS = "xiatl";break;
            case 3 : SELCLASS = "xipac";break;
            case 4 : SELCLASS = "xiiarc";break;
            case 5 : SELCLASS = "xiiant";break;
            case 6 : SELCLASS = "xiiatl";break;
            case 7 : SELCLASS = "xiipac";break;
            default :JOptionPane.showMessageDialog(this,"Dear User,Please select a class!!!");break;
        }
        String dysel = (String) CBDY.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xii_class","root","");
            Statement stmt=con.createStatement();
            String query = "select Period , " + dysel + " from " + SELCLASS + "  ; ";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {String p = rs.getString(1);
                String day = rs.getString(2);
            model.addRow(new Object[] {p,day});}
            rs.close();
            stmt.close();
            con.close();}
        catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
        int COLNO = T2.getColumnCount();
        int RowNo = T2.getRowCount();
        int subsel = CBSUB.getSelectedIndex();
        switch (subsel){
            case 1 : SUBSEL = "English";    break;
            case 2 : SUBSEL = "Math/IP";    break;
            case 3 : SUBSEL = "Physics";    break;
            case 4 : SUBSEL = "Chemistry";  break;
            case 5 : SUBSEL = "Biology";    break;
            case 6 : SUBSEL = "English";    break;
            case 7 : SUBSEL = "English";    break;
            default:     break;}
        if (T2.getRowCount() <=2 )JOptionPane.showMessageDialog(this,"Dear User,The Timetable is not yet updated");
        else{
for(int j = 1;j <= RowNo;j ++)
{String CellValue = (String) model.getValueAt(j,2);
if (CellValue.equals(SUBSEL)){;} else {model.setValueAt("-",2,j);}
}                
            }
    }//GEN-LAST:event_ViewTT1ActionPerformed
public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(F2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCLASS;
    private javax.swing.JComboBox<String> CBCLASS1;
    private javax.swing.JComboBox<String> CBDY;
    private javax.swing.JComboBox<String> CBSUB;
    private javax.swing.JFrame DWSW;
    private javax.swing.JFrame FREEPERIOD;
    private javax.swing.JTable T1;
    private javax.swing.JTable T2;
    private javax.swing.JButton ViewTT;
    private javax.swing.JButton ViewTT1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
