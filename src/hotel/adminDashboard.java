/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author ziamdriel03
 */
public class adminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public adminDashboard() {
        initComponents();
        Connect();
        Load_reservation();
         
    }
 Connection con;
    PreparedStatement pat;
    DefaultTableModel d;
     public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(room.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(room.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DLTBTN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 650));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 650));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("WELCOME ADMIN");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Search by Name or Email");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "ReserveNo", "Name", "Address", "MobileNo", "CheckIn", "CheckOut", "RoomType", "RoomNo", "BedType", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(10).setResizable(false);
        }

        DLTBTN.setText("DELETE");
        DLTBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLTBTNActionPerformed(evt);
            }
        });

        jButton3.setText("VIEW CLIENTS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("APPROVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(DLTBTN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DLTBTN)
                    .addComponent(jButton4))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown
private String selectedReservationID;
    private int previouslySelectedRow = -1;
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int selectedRow = jTable1.getSelectedRow();

    // Ensure a row is selected
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "No row selected.");
        return;
    }

    // Get the ReserveID from the selected row
    String reserveID = (String) jTable1.getValueAt(selectedRow, 1); // Assuming ReserveID is in column 1
    if (reserveID == null || reserveID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selected row does not have a valid ReserveID.");
        return;
    }

    // Store the selected ReserveID for further use
    selectedReservationID = reserveID;

    // Debugging: Print the selected reservation details for confirmation
    System.out.println("Selected Reservation ID: " + reserveID);
}

private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (selectedReservationID == null) {
        JOptionPane.showMessageDialog(this, "Please select a reservation to approve.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        pat = con.prepareStatement("UPDATE reservation SET status = ? WHERE ReserveID = ?");
        pat.setString(1, "Approved");
        pat.setString(2, selectedReservationID);
        pat.executeUpdate();

        JOptionPane.showMessageDialog(this, "Reservation approved successfully!");
        Load_reservation(); // Refresh the table
    } catch (SQLException ex) {
        Logger.getLogger(adminDashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void DLTBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLTBTNActionPerformed
        // Get selected row from JTable
    if (selectedReservationID == null || selectedReservationID.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please select a reservation to delete.");
    return;
}

// Confirm deletion
int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this reservation?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
if (confirm != JOptionPane.YES_OPTION) {
    return; // User canceled
}

try {
    // Retrieve userID from the selected row (adjust the column index if needed)
    int selectedRow = jTable1.getSelectedRow();
    String selectedUserID = jTable1.getValueAt(selectedRow, 0).toString(); // Assuming userID is in column 0

    // Prepare the DELETE query with both ReserveID and userID
    pat = con.prepareStatement("DELETE FROM reservation WHERE ReserveID = ? AND userID = ?");
    pat.setString(1, selectedReservationID);
    pat.setString(2, selectedUserID); // Bind the userID to the query

    // Execute the delete query
    int rowsAffected = pat.executeUpdate();

    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(this, "Reservation deleted successfully.");
        Load_reservation(); // Refresh the table
    } else {
        JOptionPane.showMessageDialog(this, "Reservation could not be deleted.");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error deleting reservation: " + ex.getMessage());
}
    }//GEN-LAST:event_DLTBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login obj = new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        adminClients obj = new adminClients();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
private JTable reservation;
private void initializeTable() {
  DefaultTableModel model = new DefaultTableModel(
    new Object[][]{}, // Initial empty rows
    new String[]{"userID", "ReserveID", "Name", "Address", "MobileNo", "CheckIn", "CheckOut", "roomType", "roomNo", "bedType", "amount", "status"}
);
jTable1.setModel(model); // Set the model for the JTable

// Call Load_reservation() to populate the table
Load_reservation();
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          try {
        // Get the selected row index
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a reservation to approve.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get the ReserveID, RoomNo, and Check-in/Check-out dates from the selected row
        String selectedReserveID = jTable1.getValueAt(selectedRow, 1).toString(); // Assuming ReserveID is in column 1
        String roomNo = jTable1.getValueAt(selectedRow, 8).toString();  // Assuming Room No is in column 8
        String checkIn = jTable1.getValueAt(selectedRow, 5).toString(); // Assuming Check-In is in column 5
        String checkOut = jTable1.getValueAt(selectedRow, 6).toString(); // Assuming Check-Out is in column 6
        String selectedUserID = jTable1.getValueAt(selectedRow, 0).toString(); // Assuming userID is in column 0

        // Convert dates to the proper format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date checkInDate = sdf.parse(checkIn);
        java.util.Date checkOutDate = sdf.parse(checkOut);

        // Prepare SQL query to check if the room is already booked for the selected dates (excluding the current reservation)
        pat = con.prepareStatement(
            "SELECT * FROM reservation WHERE roomNo = ? AND status = 'Pending' AND ( " +
            "(CheckIn BETWEEN ? AND ?) OR " + 
            "(CheckOut BETWEEN ? AND ?) OR " + 
            "(CheckIn <= ? AND CheckOut >= ?) ) AND ReserveID != ?" // Exclude the current reservation (ReserveID != ?)
        );

        // Set parameters for roomNo and the date ranges
        pat.setString(1, roomNo);
        pat.setDate(2, new java.sql.Date(checkInDate.getTime()));
        pat.setDate(3, new java.sql.Date(checkOutDate.getTime()));
        pat.setDate(4, new java.sql.Date(checkInDate.getTime()));
        pat.setDate(5, new java.sql.Date(checkOutDate.getTime()));
        pat.setDate(6, new java.sql.Date(checkInDate.getTime()));
        pat.setDate(7, new java.sql.Date(checkOutDate.getTime()));
        pat.setString(8, selectedReserveID); // Exclude the current reservation by ReserveID

        ResultSet rs = pat.executeQuery();

        // If a conflicting pending reservation exists, show an error message and return
        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Room is already booked for the selected dates.", "Room Conflict", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // If no conflict, update the reservation status
        pat = con.prepareStatement("UPDATE reservation SET status = ? WHERE ReserveID = ? AND userID = ?");
        pat.setString(1, "Approved");  // Change Pending to "Reservation"
        pat.setString(2, selectedReserveID);  // Set the selected ReserveID
        pat.setString(3, selectedUserID);  // Set the selected userID
        pat.executeUpdate();

        // Show success message
        JOptionPane.showMessageDialog(this, "Reservation approved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Refresh the table or reload reservations
        Load_reservation();

    } catch (SQLException | ParseException ex) {
        Logger.getLogger(adminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error while updating reservation status.", "Error", JOptionPane.ERROR_MESSAGE);
    }                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
        // Get the search query from the JTextField
        String searchQuery = jTextField1.getText().trim();

        // Check if the search field is empty
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a search term.", "Empty Search", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // SQL query to search for the term in ReserveID, Name, or any other column
        String query = "SELECT * FROM reservation WHERE ReserveID LIKE ? OR Name LIKE ? OR userID LIKE ?";
        
        // Prepare the statement
        pat = con.prepareStatement(query);
        pat.setString(1, "%" + searchQuery + "%");  // Add wildcard for partial matches
        pat.setString(2, "%" + searchQuery + "%");
        pat.setString(3, "%" + searchQuery + "%");

        ResultSet rs = pat.executeQuery();

        // Get table model and clear existing rows
        d = (DefaultTableModel) jTable1.getModel();
        d.setRowCount(0);

        // Check if the ResultSet has any rows
        boolean hasResults = false;

        // Loop through the results and add to the table
        while (rs.next()) {
            hasResults = true;  // Mark as true if there are any results
            Vector<String> row = new Vector<>();
            row.add(rs.getString("userID"));
            row.add(rs.getString("ReserveID"));
            row.add(rs.getString("Name"));
            row.add(rs.getString("Address"));
            row.add(rs.getString("MobileNo"));
            row.add(rs.getString("CheckIn"));
            row.add(rs.getString("CheckOut"));
            row.add(rs.getString("roomType"));
            row.add(rs.getString("roomNo"));
            row.add(rs.getString("bedType"));
            row.add(rs.getString("amount"));
            row.add(rs.getString("status"));
            d.addRow(row);
        }

        // If no results were found, show a message
        if (!hasResults) {
            JOptionPane.showMessageDialog(this, "No reservations found for the given search query.", "No Results", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException ex) {
        Logger.getLogger(adminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error while searching.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed
public void Load_reservation() {
      try {
        // Use a parameterized query to prevent SQL injection
        pat = con.prepareStatement("SELECT * FROM reservation");
        ResultSet rs = pat.executeQuery();

        // Get table model and clear existing rows
        d = (DefaultTableModel) jTable1.getModel();
        d.setRowCount(0); // Clear previous data

        while (rs.next()) {
            // Create a new row with values for the current reservation
            Vector<String> v2 = new Vector<>();
            v2.add(rs.getString("userID"));
            v2.add(rs.getString("ReserveID"));
            v2.add(rs.getString("Name"));
            v2.add(rs.getString("Address"));
            v2.add(rs.getString("MobileNo"));
            v2.add(rs.getString("CheckIn"));
            v2.add(rs.getString("CheckOut"));
            v2.add(rs.getString("roomType"));
            v2.add(rs.getString("roomNo"));
            v2.add(rs.getString("bedType"));
            v2.add(rs.getString("amount"));
            v2.add(rs.getString("status"));  // Ensure the status is displayed correctly

            // Add the row to the table model
            d.addRow(v2);
        }
    } catch (SQLException ex) {
        Logger.getLogger(room.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error loading reservations: " + ex.getMessage());
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DLTBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
