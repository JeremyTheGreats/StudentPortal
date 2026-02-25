package userdashboard.admin;

import config.Session;
import config.config;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class admin extends javax.swing.JFrame {

    public admin() {
        initComponents();

        // APPLY THE SESSION DATA
        Session ses = Session.getInstance();

        student.setText(String.valueOf(getStudentCount()));

        if (ses != null) {
            // Change a JLabel text to show the logged-in name
            lbl_welcome.setText("Welcome, " + ses.getFullname());
            lbl_role.setText("Role: " + "ADMIN");
        } else {
            // SECURITY: If someone tries to run this frame without logging in, kick them out
            JOptionPane.showMessageDialog(this, "Please login first!");
            new main.login().setVisible(true);
            this.dispose();
        }
    }

    public int getStudentCount() {
        int total = 0;
        try {
            config db = new config();
            // Query to count only students
            String sql = "SELECT COUNT(*) as total FROM tbl_user WHERE type = 'student'";
            List<Map<String, Object>> result = db.fetchRecords(sql);

            if (result != null && !result.isEmpty()) {
                // Retrieve the "total" column value
                total = Integer.parseInt(result.get(0).get("total").toString());
            }
        } catch (Exception e) {
            System.out.println("Error fetching student count: " + e.getMessage());
        }
        return total;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adminmenu = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        lbl_role = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        student = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        manageuser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminmenu.setText("Admin Menu");
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 65));

        lbl_welcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_welcome.setText("welcome");
        getContentPane().add(lbl_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 47));

        lbl_role.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_role.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_role.setText("role");
        getContentPane().add(lbl_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 200, 38));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/ad.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student User");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 46));

        student.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        student.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 66));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 210, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        jPanel3.add(manageuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Subject");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 210, 220));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminmenuMouseClicked
        admin ad = new admin();
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
            // 1. CLEAR THE SESSION DATA
            Session.destroy();

            // 2. REDIRECT TO LOGIN
            main.login loginFrame = new main.login();
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);

            // 3. CLOSE CURRENT DASHBOARD
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
        Manage ma = new Manage();
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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Subject sub = new Subject();
        sub.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));
        jLabel3.setOpaque(true);
        jLabel3.setBackground(new java.awt.Color(230, 80, 80));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setBorder(null);
        jLabel3.setOpaque(false);
        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_jLabel3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel manageuser;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel student;
    // End of variables declaration//GEN-END:variables
}
