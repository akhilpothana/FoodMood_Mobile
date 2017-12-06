package Login;


import CrudUserModel.User;
import MainMenu.MainMenuController;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.json.simple.parser.ParseException;

public class LoginUI extends javax.swing.JFrame {
    private JLabel backgroundImageLabel;
    private ImageIcon backgroundImage;
    private LoginController loginCtrl;
    private boolean validUser;

    
    /**
     * Creates new form LoginUI
     */
    public LoginUI(LoginController loginCtrl) {
       this.loginCtrl = loginCtrl;
       validUser = false;
       initComponents();
       
       //Miscellaneous custom code
       this.getRootPane().setDefaultButton(login_button);
       login_button.requestFocus();
       
       backgroundImage = new ImageIcon("src/Images/loginView.png");
       backgroundImageLabel = new JLabel(backgroundImage);
       backgroundImageLabel.setBounds(0, 0, 375, 667);
       loginPanel.add(backgroundImageLabel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        welcomingJlabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();
        newAccount_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginPanel.setAutoscrolls(true);
        loginPanel.setPreferredSize(new java.awt.Dimension(375, 667));

        usernameField.setText("Username");
        usernameField.setMinimumSize(new java.awt.Dimension(10, 10));
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });

        welcomingJlabel.setFont(new java.awt.Font("Lucida Sans", 1, 22)); // NOI18N
        welcomingJlabel.setText("<html><div style='text-align: center;'>A simple and great<br> way to monitor your<br> health</div></html>");

        passwordField.setText("Password");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        login_button.setBackground(new java.awt.Color(204, 102, 0));
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("Login");
        login_button.setBorderPainted(false);
        login_button.setOpaque(true);
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        newAccount_button.setBackground(new java.awt.Color(204, 204, 204));
        newAccount_button.setForeground(new java.awt.Color(255, 255, 255));
        newAccount_button.setText("Sign Up");
        newAccount_button.setBorderPainted(false);
        newAccount_button.setOpaque(true);
        newAccount_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccount_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(welcomingJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(passwordField)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newAccount_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(login_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addComponent(welcomingJlabel)
                .addGap(44, 44, 44)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newAccount_button)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        if(usernameField.getText().equals("Username"))
        {
            usernameField.setText("");
        }
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        if(usernameField.getText().isEmpty())
        {
            usernameField.setText("Username");
        }
    }//GEN-LAST:event_usernameFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {                                          
        if(passwordField.getText().equals("Password"))
        {
            passwordField.setText("");
        }
    }                                         

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {                                        
        if(passwordField.getText().isEmpty())
        {
            passwordField.setText("Password");
        }
    }

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        if(loginCtrl.validateUser(usernameField.getText(), passwordField.getText()))
        {
            loginCtrl.toMainMenuUICntrl();
        }
        else {
            JOptionPane.showMessageDialog(null,"Incorrect username or password. Please try again!");
        }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void newAccount_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccount_buttonActionPerformed
        loginCtrl.createUserUI();
        this.setVisible(false);
    }//GEN-LAST:event_newAccount_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton login_button;
    private javax.swing.JButton newAccount_button;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel welcomingJlabel;
    // End of variables declaration//GEN-END:variables
}
