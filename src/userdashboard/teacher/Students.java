package userdashboard.teacher;

import config.Session;
import config.config;
import javax.swing.JOptionPane;
import userdashboard.admin.profile;

public class Students extends javax.swing.JFrame {

    public Students() {
        initComponents();
        displayClassList();
    }

    public void displayClassList() {
        config db = new config();
        int teacherId = Session.getInstance().getId();

        String sql = "SELECT e.e_id AS 'Enrollment ID', "
                + "u.fullname AS 'Student Name', "
                + "s.s_name AS 'Subject', "
                + "e.e_grade AS 'Grade', "
                + "e.e_status AS 'Status' " // Add this to see the current status
                + "FROM tbl_enrollment e "
                + "JOIN tbl_user u ON e.u_id = u.id "
                + "JOIN tbl_subjects s ON e.s_id = s.s_id "
                + "WHERE s.teacher_id = '" + teacherId + "'";

        db.displayData(sql, student);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        studentmenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        searchField = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setText("logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 20, 81, 35));

        profile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        profile.setText("Profile");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 20, 81, 35));

        studentmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studentmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentmenu.setText("Back");
        studentmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentmenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentmenuMouseExited(evt);
            }
        });
        jPanel1.add(studentmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 20, 138, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 65));

        student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(student);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 770, 270));

        jButton1.setText("Give Grade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 155, 41));

        update.setText("Update Status");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 155, 41));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 245, 40));

        searchField.setText("Search");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 90, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to logout?",
                "Confirm Logout",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {

            Session.destroy();

            main.login loginFrame = new main.login();
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));
        logout.setOpaque(true);
        logout.setBackground(new java.awt.Color(230, 80, 80));

    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setForeground(new java.awt.Color(0, 0, 0));
        logout.setBorder(null);
        logout.setOpaque(false);
        logout.setBackground(new java.awt.Color(255, 102, 102));


    }//GEN-LAST:event_logoutMouseExited

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        profile pro = new profile();
        pro.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_profileMouseClicked

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));
        profile.setOpaque(true);
        profile.setBackground(new java.awt.Color(230, 80, 80));

    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setForeground(new java.awt.Color(0, 0, 0));
        profile.setBorder(null);
        profile.setOpaque(false);
        profile.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_profileMouseExited

    private void studentmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentmenuMouseClicked

        teacher te = new teacher();
        te.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_studentmenuMouseClicked

    private void studentmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentmenuMouseEntered
        studentmenu.setForeground(new java.awt.Color(255, 255, 255));
        studentmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));
        studentmenu.setOpaque(true);
        studentmenu.setBackground(new java.awt.Color(230, 80, 80));
    }//GEN-LAST:event_studentmenuMouseEntered

    private void studentmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentmenuMouseExited

        studentmenu.setForeground(new java.awt.Color(0, 0, 0));
        studentmenu.setBorder(null);
        studentmenu.setOpaque(false);
        studentmenu.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_studentmenuMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        config conf = new config();

        int row = student.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a student!");
            return;
        }

        // Get Data from the selected row
        String enrollmentId = student.getValueAt(row, 0).toString();
        String studentName = student.getValueAt(row, 1).toString();

        String newGrade = JOptionPane.showInputDialog(this, "Enter grade for " + studentName + ":");

        if (newGrade != null && !newGrade.trim().isEmpty()) {
            // Simple numeric check to prevent SQL errors
            if (newGrade.matches("-?\\d+(\\.\\d+)?")) {

                String sql = "UPDATE tbl_enrollment SET e_grade = ? WHERE e_id = ?";
                conf.updateRecord(sql, newGrade, enrollmentId); // Use updateRecord if available

                JOptionPane.showMessageDialog(this, "Grade updated successfully!");
                displayClassList(); // Refresh the table
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a valid number for the grade.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        config conf = new config();
        int row = student.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a student from the table!");
            return;
        }

        // Grab the ID from the first column (index 0)
        String enrollmentId = student.getValueAt(row, 0).toString();
        String studentName = student.getValueAt(row, 1).toString();

        // These are the statuses you want the teacher to be able to switch to
        String[] statusOptions = {"enrolled", "dropped", "completed", "incomplete"};

        String newStatus = (String) JOptionPane.showInputDialog(null,
                "Update status for " + studentName, "Manage Enrollment",
                JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);

        if (newStatus != null) {
            // UPDATE THE DATABASE
            // Ensure 'e_status' matches the exact column name in your tbl_enrollment
            String sql = "UPDATE tbl_enrollment SET e_status = ? WHERE e_id = ?";
            conf.updateRecord(sql, newStatus, enrollmentId);

            // Refresh the JTable
            displayClassList();
            JOptionPane.showMessageDialog(this, "Status updated to: " + newStatus);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        config db = new config();
        int teacherId = Session.getInstance().getId();
        String find = searchField.getText();

        // Query that filters by Student Name or Subject Name
        String sql = "SELECT e.e_id AS 'Enrollment ID', u.fullname AS 'Student Name', "
                + "s.s_name AS 'Subject', e.e_grade AS 'Grade', e.e_status AS 'Status' "
                + "FROM tbl_enrollment e "
                + "JOIN tbl_user u ON e.u_id = u.id "
                + "JOIN tbl_subjects s ON e.s_id = s.s_id "
                + "WHERE s.teacher_id = '" + teacherId + "' "
                + "AND (u.fullname LIKE '%" + find + "%' OR s.s_name LIKE '%" + find + "%')";

        db.displayData(sql, student);
    }//GEN-LAST:event_searchFieldActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        config db = new config();
        // Get the current teacher's ID so they only search within THEIR students
        int teacherId = Session.getInstance().getId();
        String find = jTextField1.getText();

        // The SQL query uses 'LIKE' and '%' to find partial matches for names or subjects
        String sql = "SELECT e.e_id AS 'Enrollment ID', "
                + "u.fullname AS 'Student Name', "
                + "s.s_name AS 'Subject', "
                + "e.e_grade AS 'Grade', "
                + "e.e_status AS 'Status' "
                + "FROM tbl_enrollment e "
                + "JOIN tbl_user u ON e.u_id = u.id "
                + "JOIN tbl_subjects s ON e.s_id = s.s_id "
                + "WHERE s.teacher_id = '" + teacherId + "' "
                + "AND (u.fullname LIKE '%" + find + "%' OR s.s_name LIKE '%" + find + "%')";

        // Update your JTable (named 'student') with the filtered results
        db.displayData(sql, student);
    }//GEN-LAST:event_jTextField1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel profile;
    private javax.swing.JButton searchField;
    private javax.swing.JTable student;
    private javax.swing.JLabel studentmenu;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
