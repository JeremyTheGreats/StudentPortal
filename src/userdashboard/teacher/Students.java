package userdashboard.teacher;

import config.Session;
import config.config;
import javax.swing.JOptionPane;


public class Students extends javax.swing.JFrame {

    public Students() {
        initComponents();
        displayClassList();
    }

    public void displayClassList() {
        config db = new config();
        Session ses = Session.getInstance();
        int teacherId = ses.getId();

        // Added e.e_id as the first column so the button can find it
        String sql = "SELECT e.e_id AS 'Enrollment ID', "
                + "u.fullname AS 'Student Name', "
                + "s.s_name AS 'Subject', "
                + "e.e_date AS 'Enrollment Date', "
                + "e.e_grade AS 'Grade' "
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        studentmenu.setText("Teacher Menu");
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

        student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(student);

        jButton1.setText("Give Grade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

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
        // future gui design if mo click sa same frame kay mo refresh.
        JOptionPane.showMessageDialog(this,
                "Welcome to Student Dashboard!",
                "Student Menu",
                JOptionPane.INFORMATION_MESSAGE);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel profile;
    private javax.swing.JTable student;
    private javax.swing.JLabel studentmenu;
    // End of variables declaration//GEN-END:variables
}
