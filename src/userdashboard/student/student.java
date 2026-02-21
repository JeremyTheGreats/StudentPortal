package userdashboard.student;

import config.Session;
import config.config;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class student extends javax.swing.JFrame {

    Session ses = Session.getInstance();

    public student() {
        initComponents();

        lbl_welcome.setText("Welcome, " + ses.getFullname());
        lbl_id_display.setText("ID Number: " + ses.getId());
        lbl_email_display.setText("Registered Email: " + ses.getEmail());
        displayEnrolledSubjects();
    }

    public void displayEnrolledSubjects() {
        config db = new config();
        Session ses = Session.getInstance();

        // Get the ID of the logged-in student
        int studentId = ses.getId();

        // Query to fetch subject details joined with enrollment data
        String sql = "SELECT s.s_code AS 'Course Code', "
                + "s.s_name AS 'Subject Title', "
                + "s.s_units AS 'Units', "
                + "e.e_date AS 'Date Enrolled', "
                + "e.e_grade AS 'Current Grade' "
                + "FROM tbl_enrollment e "
                + "JOIN tbl_subjects s ON e.s_id = s.s_id "
                + "WHERE e.u_id = '" + studentId + "'";

        // Use your config helper to fill the JTable
        db.displayData(sql, subjects);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        studentmenu = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_welcome = new javax.swing.JLabel();
        lbl_email_display = new javax.swing.JLabel();
        lbl_id_display = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjects = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studentmenu.setText("Student Menu");
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

        jPanel2.setBackground(new java.awt.Color(83, 19, 25));

        lbl_welcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(255, 255, 255));
        lbl_welcome.setText("jLabel1");

        lbl_email_display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_email_display.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email_display.setText("jLabel3");

        lbl_id_display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_id_display.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id_display.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_email_display, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_id_display, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_welcome)
                    .addComponent(lbl_id_display))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_email_display)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Enroll a Subject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        subjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(subjects);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enrolled Subjects");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to logout?",
                "Confirm Logout",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        config conf = new config();
        Session ses = Session.getInstance();

        // 1. Fetch available subjects from the database
        String sql = "SELECT s_id, s_code, s_name FROM tbl_subjects";
        List<Map<String, Object>> subjects = conf.fetchRecords(sql);

        if (subjects == null || subjects.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No subjects available at the moment.");
            return;
        }

        // 2. Load subjects into a Dropdown (ComboBox)
        JComboBox<String> subjectDropdown = new JComboBox<>();
        for (Map<String, Object> s : subjects) {
            subjectDropdown.addItem(s.get("s_code") + " - " + s.get("s_name"));
        }

        // 3. Show the selection popup
        int choice = JOptionPane.showConfirmDialog(null, subjectDropdown,
                "Select Subject to Enroll", JOptionPane.OK_CANCEL_OPTION);

        if (choice == JOptionPane.OK_OPTION) {
            // Get the selected Subject ID based on the index
            int index = subjectDropdown.getSelectedIndex();
            String selectedSubId = subjects.get(index).get("s_id").toString();
            String studentId = String.valueOf(ses.getId());

            // 4. Check if student is already enrolled in this subject
            String checkSql = "SELECT * FROM tbl_enrollment WHERE u_id = '" + studentId + "' AND s_id = '" + selectedSubId + "'";
            if (!conf.fetchRecords(checkSql).isEmpty()) {
                JOptionPane.showMessageDialog(this, "You are already enrolled in this subject!");
                return;
            }

            // 5. Save the enrollment
            String enrollSql = "INSERT INTO tbl_enrollment (u_id, s_id, e_date) VALUES (?, ?, DATE('now'))";
            conf.addRecord(enrollSql, studentId, selectedSubId);

            JOptionPane.showMessageDialog(this, "Successfully Enrolled!");

            // Refresh your table if you have one showing enrolled subjects
            // displayMySubjects(); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_email_display;
    private javax.swing.JLabel lbl_id_display;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel studentmenu;
    private javax.swing.JTable subjects;
    // End of variables declaration//GEN-END:variables
}
