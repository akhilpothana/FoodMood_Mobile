/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsView;
import NotificationsController.ControlViewNotifications;

/**
 *
 * @author edgardoreinoso
 */
public class ViewNotificationsUI extends javax.swing.JFrame {
    private ControlViewNotifications notificationsCntrl;
    
    /**
     * Creates new form ViewNotificationsUI
     */
    public ViewNotificationsUI(ControlViewNotifications notificationsCntrl) {
        this.notificationsCntrl = notificationsCntrl;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notificationsPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        notificationsButton = new javax.swing.JButton();
        viewUserButton = new javax.swing.JButton();
        footerPanel = new javax.swing.JPanel();
        goToChartButton = new javax.swing.JButton();
        goToFoodMoodButton = new javax.swing.JButton();
        goToRecommButton = new javax.swing.JButton();
        splitterTopFromBottom = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        notificationsPanel.setBackground(new java.awt.Color(255, 255, 255));
        notificationsPanel.setPreferredSize(new java.awt.Dimension(375, 667));
        notificationsPanel.setSize(new java.awt.Dimension(375, 667));

        titleLabel.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        titleLabel.setText("FoodMood");

        notificationsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/alarm.png"))); // NOI18N
        notificationsButton.setPreferredSize(new java.awt.Dimension(30, 38));

        viewUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crud_user_lines.png"))); // NOI18N

        footerPanel.setBackground(new java.awt.Color(102, 102, 102));
        footerPanel.setPreferredSize(new java.awt.Dimension(375, 56));

        goToChartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pie-chart.png"))); // NOI18N
        goToChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToChartButtonActionPerformed(evt);
            }
        });

        goToFoodMoodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cutlery_1.png"))); // NOI18N
        goToFoodMoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToFoodMoodButtonActionPerformed(evt);
            }
        });

        goToRecommButton.setBackground(new java.awt.Color(204, 204, 204));
        goToRecommButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/recommended.png"))); // NOI18N
        goToRecommButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToRecommButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(goToChartButton)
                .addGap(54, 54, 54)
                .addComponent(goToFoodMoodButton)
                .addGap(54, 54, 54)
                .addComponent(goToRecommButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goToChartButton)
                    .addComponent(goToFoodMoodButton)
                    .addComponent(goToRecommButton))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        splitterTopFromBottom.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout notificationsPanelLayout = new javax.swing.GroupLayout(notificationsPanel);
        notificationsPanel.setLayout(notificationsPanelLayout);
        notificationsPanelLayout.setHorizontalGroup(
            notificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitterTopFromBottom)
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
            .addGroup(notificationsPanelLayout.createSequentialGroup()
                .addGroup(notificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notificationsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(notificationsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        notificationsPanelLayout.setVerticalGroup(
            notificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(notificationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel)
                    .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitterTopFromBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notificationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notificationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goToChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToChartButtonActionPerformed
        notificationsCntrl.toStatsCntrl();
        this.setVisible(false);
    }//GEN-LAST:event_goToChartButtonActionPerformed

    private void goToFoodMoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToFoodMoodButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_goToFoodMoodButtonActionPerformed

    private void goToRecommButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToRecommButtonActionPerformed
        notificationsCntrl.toRecommendationCntrl();
        this.setVisible(false);
    }//GEN-LAST:event_goToRecommButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewNotificationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewNotificationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewNotificationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewNotificationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel footerPanel;
    private javax.swing.JButton goToChartButton;
    private javax.swing.JButton goToFoodMoodButton;
    private javax.swing.JButton goToRecommButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton notificationsButton;
    private javax.swing.JPanel notificationsPanel;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JSeparator splitterTopFromBottom;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewUserButton;
    // End of variables declaration//GEN-END:variables
}
