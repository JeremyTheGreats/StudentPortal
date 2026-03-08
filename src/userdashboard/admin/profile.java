package userdashboard.admin;

import config.Session;
import config.config;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import userdashboard.student.student;
import userdashboard.teacher.teacher;

public class profile extends javax.swing.JFrame {

    private String path = "";
    String destinationPath = "";
    File selectedFile;

    Session ses = Session.getInstance();

    public profile() {
        initComponents();

        displayCurrentProfile();
    }

    public void displayCurrentProfile() {
        Session ses = Session.getInstance();

        txt_username.setEnabled(false);
        txt_email.setEnabled(false);

        txt_fullname.setText(ses.getFullname());
        txt_username.setText(ses.getUsername());
        txt_email.setText(ses.getEmail());
        updateImage(ses.getImagePath());
        // Set the labels on the left sidebar
        lbl_id_display.setText("ID : " + ses.getId());
        lbl_email_display.setText(ses.getEmail());
    }

    public void setProfileImage(String imagePath) {
        if (imagePath != null && !imagePath.isEmpty()) {
            ImageIcon icon = new ImageIcon(imagePath);
            // Force the scaling to exactly 150x150
            Image img = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            setprofile.setIcon(new ImageIcon(img));
        } else {
            // Load a default "No Image" icon if path is empty
            setprofile.setIcon(new ImageIcon("src/Picture/default_user.png"));
        }
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
        txt_fullname = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_image_preview = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txt_fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fullnameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Edit Your Profile");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fullname");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        lbl_image_preview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_image_preview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/default.jpg"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Select Photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_image_preview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lbl_image_preview, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(jButton2))))
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

    private void studentmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentmenuMouseExited

        studentmenu.setForeground(new java.awt.Color(0, 0, 0));
        studentmenu.setBorder(null);
        studentmenu.setOpaque(false);
        studentmenu.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_studentmenuMouseExited

    private void studentmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentmenuMouseEntered
        studentmenu.setForeground(new java.awt.Color(255, 255, 255));
        studentmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));
        studentmenu.setOpaque(true);
        studentmenu.setBackground(new java.awt.Color(230, 80, 80));
    }//GEN-LAST:event_studentmenuMouseEntered

    private void studentmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentmenuMouseClicked

        // 1. Get the session instance so 'ses' is recognized
        Session ses = Session.getInstance();

        // 2. Get the role (ensure this matches your Session class method, e.g., getRole or getType)
        String role = ses.getRole(); // Using getType based on your earlier setup

        // 3. Navigate based on role
        if (role.equalsIgnoreCase("admin")) {
            new admin().setVisible(true);
        } else if (role.equalsIgnoreCase("teacher")) {
            new teacher().setVisible(true);
        } else if (role.equalsIgnoreCase("student")) {
            new student().setVisible(true);
        }

        // 4. Close the current Edit Profile window
        this.dispose();
    }//GEN-LAST:event_studentmenuMouseClicked

    private void txt_fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fullnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();

            // 1. Define the destination: src/Picture folder
            // We use the original filename or you can rename it to the User ID
            destinationPath = "src/Picture/" + selectedFile.getName();

            // 2. Preview the image in your JLabel (Scaled to 150x150)
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
            Image img = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            lbl_image_preview.setIcon(new ImageIcon(img));

            JOptionPane.showMessageDialog(this, "Image selected. Click Save to finalize.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // 1. Get the Session instance first
            Session ses = Session.getInstance();
            config conf = new config();
            int userId = ses.getId();

            // 2. Only copy the file if a new one was actually selected
            if (selectedFile != null) {
                File directory = new File("src/Picture");
                if (!directory.exists()) {
                    directory.mkdirs();
                }

                Path source = Paths.get(selectedFile.getAbsolutePath());
                Path target = Paths.get(destinationPath);
                Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

                // Update session with new path
                ses.setImagePath(destinationPath);
            } else {
                // Keep the old path if no new file was chosen
                destinationPath = ses.getImagePath();
            }

            // 3. Update Database (fullname and email from text fields)
            String sql = "UPDATE tbl_user SET fullname = ?, email = ?, u_image = ? WHERE id = ?";
            conf.updateRecord(sql, txt_fullname.getText(), txt_email.getText(), destinationPath, String.valueOf(userId));

            // Sync text data back to session
            ses.setFullname(txt_fullname.getText());
            ses.setEmail(txt_email.getText());

            JOptionPane.showMessageDialog(this, "Profile and Image Saved!");

            // 4. Role-based Redirection
            String role = ses.getRole(); // Using getType() based on your earlier session setup
            if (role.equalsIgnoreCase("admin")) {
                new admin().setVisible(true);
            } else if (role.equalsIgnoreCase("teacher")) {
                new teacher().setVisible(true);
            } else if (role.equalsIgnoreCase("student")) {
                new student().setVisible(true);
            }

            this.dispose();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "File Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_email_display;
    private javax.swing.JLabel lbl_id_display;
    private javax.swing.JLabel lbl_image_preview;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel setprofile;
    private javax.swing.JLabel studentmenu;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
