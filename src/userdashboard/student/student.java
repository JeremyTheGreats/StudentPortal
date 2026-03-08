package userdashboard.student;

import config.Session;
import config.config;
import java.awt.Image;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import userdashboard.admin.profile;

public class student extends javax.swing.JFrame {

    Session ses = Session.getInstance();

    public student() {
        initComponents();

        lbl_welcome.setText("Welcome, " + ses.getFullname());
        lbl_id_display.setText("ID : " + ses.getId());
        lbl_email_display.setText(ses.getEmail());
        
        updateImage(ses.getImagePath());
        displayEnrolledSubjects();
    }

    public void updateImage(String path) {
        try {
            if (path != null && !path.isEmpty()) {
                ImageIcon icon = new ImageIcon(path);
                Image img = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                setprofile.setIcon(new ImageIcon(img));
            }
        } catch (Exception e) {
            System.out.println("Image Error: " + e.getMessage());
        }
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

    public void calculateGWA() {
        double totalGrades = 0;
        int rowCount = subjects.getRowCount(); // Change to your JTable name

        if (rowCount > 0) {
            for (int i = 0; i < rowCount; i++) {
                // Assuming 'Current Grade' is in column index 4
                totalGrades += Double.parseDouble(subjects.getValueAt(i, 4).toString());
            }
            double gwa = totalGrades / rowCount;
            gwas.setText("Your GWA: " + String.format("%.2f", gwa));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        studentmenu = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_email_display = new javax.swing.JLabel();
        lbl_id_display = new javax.swing.JLabel();
        setprofile = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjects = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        gwas = new javax.swing.JLabel();

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_email_display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_email_display.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_email_display.setText("email");
        jPanel2.add(lbl_email_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, -1));

        lbl_id_display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_id_display.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_id_display.setText("ID");
        jPanel2.add(lbl_id_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, -1));

        setprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/student.jpg"))); // NOI18N
        jPanel2.add(setprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 150));

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

        lbl_welcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(83, 19, 25));
        lbl_welcome.setText("welcome");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GWP");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 144, 23));

        gwas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gwas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gwas.setText("1");
        jPanel3.add(gwas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbl_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_welcome)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))))))
        );

        pack();
        setLocationRelativeTo(null);
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
    private javax.swing.JLabel gwas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_email_display;
    private javax.swing.JLabel lbl_id_display;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel setprofile;
    private javax.swing.JLabel studentmenu;
    private javax.swing.JTable subjects;
    // End of variables declaration//GEN-END:variables
}
