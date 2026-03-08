package main;

import config.Session;
import config.config;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        login = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        register = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 1, 250)); // NOI18N
        jLabel1.setText("SP");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel2.setText("Portal");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel3.setText("Student");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(133, 133, 133))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, -1, 500));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("LOGIN");

        jLabel6.setText("Password");

        jLabel7.setText("Email");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Don't have an account?");

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(login)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(register)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 3, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        register regFrame = new register();
        regFrame.setLocationRelativeTo(null);
        regFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String usernameOrEmail = jTextField2.getText().trim();
        String pass = new String(jPasswordField1.getPassword());

        if (usernameOrEmail.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter both username/email and password.", "Input Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            config db = new config();
            String hash = db.hashPassword(pass);

            String qry = "SELECT * FROM tbl_user WHERE (username = ? OR email = ?) AND pass = ?";
            List<Map<String, Object>> result = db.fetchRecords(qry, usernameOrEmail, usernameOrEmail, hash);

            if (result.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid username/email or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                jPasswordField1.setText("");
                return;
            }

            Map<String, Object> userRow = result.get(0);

            // 1. EXTRACT DATA
            int id = Integer.parseInt(String.valueOf(userRow.get("id")));
            String fullname = (String) userRow.get("fullname");
            String username = (String) userRow.get("username");
            String userType = (String) userRow.get("type");
            String status = (String) userRow.get("status");
            String email = (String) userRow.get("email");
            String path = (String ) userRow.get("u_image");

            if ("active".equalsIgnoreCase(status)) {

                
                Session ses = Session.getInstance();
                ses.setId(id);
                ses.setFullname(fullname);
                ses.setEmail(email);
                ses.setRole(userType);
                ses.setStatus(status);
                ses.setUsername(username);
                ses.setImagePath(path); 

                String welcomeName = (fullname != null && !fullname.isEmpty()) ? fullname : username;
                JOptionPane.showMessageDialog(null, "Welcome back, " + welcomeName + "!", "Login Successful", JOptionPane.INFORMATION_MESSAGE);

                
                if ("admin".equalsIgnoreCase(userType)) {
                    userdashboard.admin.admin adminFrame = new userdashboard.admin.admin();
                    adminFrame.setLocationRelativeTo(null);
                    adminFrame.setVisible(true);
                } else if ("teacher".equalsIgnoreCase(userType)) {
                    
                    userdashboard.teacher.teacher teacherFrame = new userdashboard.teacher.teacher();
                    teacherFrame.setLocationRelativeTo(null);
                    teacherFrame.setVisible(true);
                } else {
                    userdashboard.student.student studentFrame = new userdashboard.student.student();
                    studentFrame.setLocationRelativeTo(null);
                    studentFrame.setVisible(true);
                }

                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Your account is currently " + status, "Access Denied", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "System Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Look and Feel Error: " + ex.getMessage());
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login start = new login();
                start.setLocationRelativeTo(null); // Centers the login window
                start.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton login;
    private javax.swing.JToggleButton register;
    // End of variables declaration//GEN-END:variables
}
