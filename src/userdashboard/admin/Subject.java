package userdashboard.admin;

import config.Session;
import config.config;
import java.awt.GridLayout;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Subject extends javax.swing.JFrame {

    public Subject() {
        initComponents();
        displayData();
    }

    public void displayData() {
        config db = new config();

        // Use a JOIN to get the Teacher's name from tbl_user instead of just the teacher_id
        String sql = "SELECT s.s_id AS 'ID', "
                + "s.s_code AS 'Code', "
                + "s.s_name AS 'Subject Name', "
                + "s.s_units AS 'Units', "
                + "u.fullname AS 'Assigned Teacher' "
                + "FROM tbl_subjects s "
                + "LEFT JOIN tbl_user u ON s.teacher_id = u.id";

        // This will populate your JTable (make sure your table variable name is 'table')
        db.displayData(sql, table);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adminmenu = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        manageuser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminmenu.setText("Back");
        adminmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminmenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminmenuMouseExited(evt);
            }
        });
        jPanel1.add(adminmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 138, 35));

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

        manageuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageuser.setText("Manage User");
        manageuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageuserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageuserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageuserMouseExited(evt);
            }
        });
        jPanel1.add(manageuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 138, 35));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Subject");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Status ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminmenuMouseClicked
        Subject ad = new Subject();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminmenuMouseClicked

    private void adminmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminmenuMouseEntered
        adminmenu.setForeground(new java.awt.Color(255, 255, 255));
        adminmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));
        adminmenu.setOpaque(true);
        adminmenu.setBackground(new java.awt.Color(230, 80, 80));


    }//GEN-LAST:event_adminmenuMouseEntered

    private void adminmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminmenuMouseExited
        adminmenu.setForeground(new java.awt.Color(0, 0, 0));
        adminmenu.setBorder(null);
        adminmenu.setOpaque(false);
        adminmenu.setBackground(new java.awt.Color(255, 102, 102));


    }//GEN-LAST:event_adminmenuMouseExited

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

    private void manageuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseClicked
        Subject ma = new Subject();
        ma.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_manageuserMouseClicked

    private void manageuserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseEntered
        manageuser.setForeground(new java.awt.Color(255, 255, 255));
        manageuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));
        manageuser.setOpaque(true);
        manageuser.setBackground(new java.awt.Color(230, 80, 80));

    }//GEN-LAST:event_manageuserMouseEntered

    private void manageuserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseExited
        manageuser.setForeground(new java.awt.Color(0, 0, 0));
        manageuser.setBorder(null);
        manageuser.setOpaque(false);
        manageuser.setBackground(new java.awt.Color(255, 102, 102));


    }//GEN-LAST:event_manageuserMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rowIndex = table.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete.");
            return;
        }

        // Get the ID from the first column of the selected row
        String id = table.getModel().getValueAt(rowIndex, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete ID: " + id + "?", "Warning", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            config db = new config();
            db.deleteRecord("DELETE FROM tbl_user WHERE id = ?", id);

            // Refresh the table after deletion
            displayData();
            JOptionPane.showMessageDialog(this, "User deleted successfully!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        // 1. UI COMPONENTS
        JTextField fnField = new JTextField(15);
        JTextField unField = new JTextField(15);
        JTextField emField = new JTextField(15);
        JPasswordField psField = new JPasswordField(15);
        String[] roles = {"student", "teacher", "admin"};
        JComboBox<String> roleBox = new JComboBox<>(roles);

        // 2. ORGANIZE PANEL
        JPanel myPanel = new JPanel(new GridLayout(0, 1, 2, 2));
        myPanel.add(new JLabel("Full Name:"));
        myPanel.add(fnField);
        myPanel.add(new JLabel("Username:"));
        myPanel.add(unField);
        myPanel.add(new JLabel("Email:"));
        myPanel.add(emField);
        myPanel.add(new JLabel("Password:"));
        myPanel.add(psField);
        myPanel.add(new JLabel("User Type:"));
        myPanel.add(roleBox);

        // 3. SHOW DIALOG
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Enter New User Details", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String fn = fnField.getText().trim();
            String un = unField.getText().trim();
            String em = emField.getText().trim();
            String ps = new String(psField.getPassword());
            String role = roleBox.getSelectedItem().toString();

            // --- VALIDATIONS ---
            // Check for empty fields
            if (fn.isEmpty() || un.isEmpty() || em.isEmpty() || ps.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Format Validation (Regex)
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
            if (!em.matches(emailRegex)) {
                JOptionPane.showMessageDialog(this, "Invalid Email Format!", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Password Length Validation
            if (ps.length() < 6) {
                JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long!", "Security Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // 4. DATABASE OPERATIONS
            try {
                config conf = new config();

                // DUPLICATE EMAIL CHECK
                String checkEmailSql = "SELECT id FROM tbl_user WHERE email = ?";
                if (!conf.fetchRecords(checkEmailSql, em).isEmpty()) {
                    JOptionPane.showMessageDialog(this, "The email '" + em + "' is already registered.\nPlease use a different one.", "Duplicate Email", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // DUPLICATE USERNAME CHECK
                String checkUserSql = "SELECT id FROM tbl_user WHERE username = ?";
                if (!conf.fetchRecords(checkUserSql, un).isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Username '" + un + "' is already taken.", "Duplicate Username", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // 5. PROCEED TO SAVE
                String passHash = conf.hashPassword(ps);
                String sql = "INSERT INTO tbl_user (fullname, username, email, pass, type, status) VALUES (?, ?, ?, ?, ?, 'active')";

                conf.addRecord(sql, fn, un, em, passHash, role);

                JOptionPane.showMessageDialog(this, "User successfully added to the database!");
                displayData(); // Refresh the JTable

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // 1. GET THE SELECTED ROW
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to edit!", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 2. EXTRACT CURRENT DATA FROM THE TABLE
        String id = table.getValueAt(row, 0).toString();
        String currentFN = table.getValueAt(row, 1).toString();
        String currentEM = table.getValueAt(row, 2).toString();
        String currentRole = table.getValueAt(row, 3).toString();

        // 3. CREATE UI COMPONENTS PRE-FILLED WITH CURRENT DATA
        JTextField fnField = new JTextField(currentFN, 15);
        JTextField emField = new JTextField(currentEM, 15);
        String[] roles = {"student", "admin"};
        JComboBox<String> roleBox = new JComboBox<>(roles);
        roleBox.setSelectedItem(currentRole);

        // 4. ORGANIZE PANEL (Excluding Username/Password for security/stability)
        JPanel myPanel = new JPanel(new GridLayout(0, 1, 2, 2));
        myPanel.add(new JLabel("Full Name:"));
        myPanel.add(fnField);
        myPanel.add(new JLabel("Email:"));
        myPanel.add(emField);
        myPanel.add(new JLabel("User Type:"));
        myPanel.add(roleBox);

        // 5. SHOW DIALOG
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Edit User ID: " + id, JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String newFN = fnField.getText().trim();
            String newEM = emField.getText().trim();
            String newRole = roleBox.getSelectedItem().toString();

            // VALIDATION
            if (newFN.isEmpty() || newEM.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Full Name and Email cannot be empty!");
                return;
            }

            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
            if (!newEM.matches(emailRegex)) {
                JOptionPane.showMessageDialog(this, "Invalid Email Format!");
                return;
            }

            // 6. UPDATE DATABASE
            try {
                config conf = new config();

                // CHECK FOR DUPLICATE EMAIL (Exclude the current user's ID)
                String checkEmailSql = "SELECT id FROM tbl_user WHERE email = ? AND id != ?";
                if (!conf.fetchRecords(checkEmailSql, newEM, id).isEmpty()) {
                    JOptionPane.showMessageDialog(this, "This email is already used by another user!");
                    return;
                }

                String sql = "UPDATE tbl_user SET fullname = ?, email = ?, type = ? WHERE id = ?";
                conf.addRecord(sql, newFN, newEM, newRole, id);

                JOptionPane.showMessageDialog(this, "User Updated Successfully!");
                displayData(); // Refresh the table

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Update Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // 1. GET THE SELECTED ROW
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to change status!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 2. GET CURRENT DATA
        String id = table.getValueAt(row, 0).toString();
        String currentStatus = table.getValueAt(row, 4).toString(); // Assuming Status is the 5th column
        String newStatus = currentStatus.equalsIgnoreCase("Active") ? "Inactive" : "Active";

        // 3. CONFIRMATION DIALOG
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to change the status of ID: " + id + " to " + newStatus + "?",
                "Confirm Status Change", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                config conf = new config();

                // 4. UPDATE STATUS IN DATABASE
                String sql = "UPDATE tbl_user SET status = ? WHERE id = ?";
                conf.addRecord(sql, newStatus, id);

                JOptionPane.showMessageDialog(this, "User is now " + newStatus + "!");

                // 5. REFRESH TABLE
                displayData();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error updating status: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        config conf = new config();

        // 1. UI Components for the popup
        JTextField codeField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField unitsField = new JTextField();
        JComboBox<String> teacherBox = new JComboBox<>();

        // 2. Fetch Teachers from tbl_user to populate the dropdown
        String teacherSql = "SELECT id, fullname FROM tbl_user WHERE type = 'teacher' AND status = 'active'";
        List<Map<String, Object>> teachers = conf.fetchRecords(teacherSql);

        if (teachers == null || teachers.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No active teachers found. Please add a teacher first.");
            return;
        }

        for (Map<String, Object> t : teachers) {
            teacherBox.addItem(t.get("id") + " - " + t.get("fullname"));
        }

        // 3. Define the Layout
        Object[] message = {
            "Subject Code (e.g., IT101):", codeField,
            "Subject Name:", nameField,
            "Units:", unitsField,
            "Assign Teacher:", teacherBox
        };

        // 4. Show Dialog
        int option = JOptionPane.showConfirmDialog(null, message, "Add New Subject", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String code = codeField.getText().trim();
            String name = nameField.getText().trim();
            String unitsStr = unitsField.getText().trim();

            // Validation
            if (code.isEmpty() || name.isEmpty() || unitsStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!");
                return;
            }

            // Parse Teacher ID from selection (e.g., "5 - John Doe" -> "5")
            String selectedTeacher = teacherBox.getSelectedItem().toString();
            String teacherId = selectedTeacher.split(" - ")[0];

            // 5. Insert into Database
            String sql = "INSERT INTO tbl_subjects (s_code, s_name, s_units, teacher_id) VALUES (?, ?, ?, ?)";
            conf.addRecord(sql, code, name, unitsStr, teacherId);

            // 6. Refresh the Table
            displayData();
            JOptionPane.showMessageDialog(this, "Subject added successfully!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminmenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel manageuser;
    private javax.swing.JLabel profile;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
