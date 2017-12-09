/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatsView;
import CrudFoodModel.FoodList;
import CrudMoodModel.MoodList;
import MainMenu.MainMenuController;
import StatsController.StatsController;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mlh5614
 */
public class StatsView extends javax.swing.JFrame {
    private StatsController statsCntrl;
    private Date date;
    private ArrayList<String> foodList;
    //private FoodList flcntl;
    //private MoodList mlcntl;
    private ArrayList<String> moodList;
    private static MainMenuController mmc1;
    String f1; //food of day
    String m1; //mood of day
    String foods; //most common foods
    String moods; //most common moods
    
    /**
     * Creates new form ViewCharts
     */
    public StatsView(StatsController statsCntrl) {
        this.statsCntrl = statsCntrl;
        initComponents();
        date = new Date();
        foodList = new ArrayList<>();
        moodList = new ArrayList<>();
        f1 = null;
        m1 = null;
        foods = null;
        moods = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statsPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        notificationsButton = new javax.swing.JButton();
        viewUserButton = new javax.swing.JButton();
        footerPanel = new javax.swing.JPanel();
        goToChartButton = new javax.swing.JButton();
        goToFoodMoodButton = new javax.swing.JButton();
        goToRecommButton = new javax.swing.JButton();
        splitterTopFromBottom = new javax.swing.JSeparator();
        FoodOfDayTitle = new javax.swing.JLabel();
        FoodOfDayValue = new javax.swing.JLabel();
        MoodOfDayTitle = new javax.swing.JLabel();
        MoodOfDayValue = new javax.swing.JLabel();
        FoodsTodayTitle = new javax.swing.JLabel();
        FoodsTodayValue = new javax.swing.JLabel();
        MoodsTodayTitle = new javax.swing.JLabel();
        MoodsTodayValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(382, 689));
        setResizable(false);

        statsPanel.setBackground(new java.awt.Color(255, 255, 255));
        statsPanel.setPreferredSize(new java.awt.Dimension(375, 667));

        titleLabel.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        titleLabel.setText("FoodMood");

        notificationsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/alarm.png"))); // NOI18N
        notificationsButton.setPreferredSize(new java.awt.Dimension(30, 38));
        notificationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationsButtonActionPerformed(evt);
            }
        });

        viewUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crud_user_lines.png"))); // NOI18N

        footerPanel.setBackground(new java.awt.Color(102, 102, 102));
        footerPanel.setPreferredSize(new java.awt.Dimension(375, 56));

        goToChartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pie-chart.png"))); // NOI18N

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        splitterTopFromBottom.setForeground(new java.awt.Color(51, 51, 51));

        FoodOfDayTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FoodOfDayTitle.setText("Food of the Day:");

        FoodOfDayValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FoodOfDayValue.setText("default food");

        MoodOfDayTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MoodOfDayTitle.setText("Mood of the Day:");

        MoodOfDayValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MoodOfDayValue.setText("default mood");

        FoodsTodayTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FoodsTodayTitle.setText("Foods Today:");

        FoodsTodayValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FoodsTodayValue.setText("0");

        MoodsTodayTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MoodsTodayTitle.setText("Moods Today:");

        MoodsTodayValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MoodsTodayValue.setText("0/0");

        javax.swing.GroupLayout statsPanelLayout = new javax.swing.GroupLayout(statsPanel);
        statsPanel.setLayout(statsPanelLayout);
        statsPanelLayout.setHorizontalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitterTopFromBottom)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MoodsTodayTitle)
                    .addComponent(FoodsTodayTitle)
                    .addComponent(MoodOfDayTitle)
                    .addComponent(FoodOfDayTitle)
                    .addGroup(statsPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MoodsTodayValue)
                            .addComponent(FoodsTodayValue)
                            .addComponent(MoodOfDayValue)
                            .addComponent(FoodOfDayValue))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statsPanelLayout.setVerticalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel)
                    .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitterTopFromBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(FoodOfDayTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FoodOfDayValue)
                .addGap(31, 31, 31)
                .addComponent(MoodOfDayTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoodOfDayValue)
                .addGap(35, 35, 35)
                .addComponent(FoodsTodayTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FoodsTodayValue)
                .addGap(31, 31, 31)
                .addComponent(MoodsTodayTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoodsTodayValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationsButtonActionPerformed
        statsCntrl.toNotificationsCntrl();
        this.setVisible(false);
    }//GEN-LAST:event_notificationsButtonActionPerformed

    private void goToFoodMoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToFoodMoodButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_goToFoodMoodButtonActionPerformed

    private void goToRecommButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToRecommButtonActionPerformed
        statsCntrl.toRecommendationCntrl();
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
            java.util.logging.Logger.getLogger(StatsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    
     /**
     * Maintain the current version of the view to know when it is out of sync with the model and controller.
     */
    private int version;
    
    
        /**
     * Populate the JTable with the food and mood data from the text file
     */
    public void readFromFile()
    {   
        //mmc1 = MainMenuController.getMMC();
        if (foodList.isEmpty() || moodList.isEmpty()) 
        {
        try{
            File file = new File("src/food_mood_data.txt");
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNextLine()){
                String foodAndMood = fileScanner.nextLine();
                String foodMood[] = foodAndMood.split(";");
                foodList.add(foodMood[0]);
                moodList.add(foodMood[1]);
            }
            }catch(FileNotFoundException e) {
	        System.out.print("FileNotFoundException");
    	}
    }
    }
    
    /**
     * Find the Food/Mood of the day. [no dates are being stored yet - need to update when possible]
     */
    public String findFoodOfDay()
    {
        //readFromFile();
        //flcntl = FoodList.getTheFoodList();
        foodList = FoodList.getFoodList();
        String foodMode = new String();
        Map<String, Integer> foodCount = new HashMap<>();
        
        for (String s: foodList)
        {
            Integer count = foodCount.get(s);
            //System.out.println("food s: " + s);
            
            if (count == null) {
                count = new Integer(0);
            }
            
            count++;
            
            foodCount.put(s,count);
        }
        
        Map.Entry<String, Integer> modeF = null;
        for (Map.Entry<String, Integer> e: foodCount.entrySet())
        {
            if (modeF == null || modeF.getValue()<e.getValue()) {
                modeF = e;
            }
        }
        
        if (modeF == null)
        {
            System.out.println("most common Food is null");
        }
        else
        {
        foodMode = modeF.getKey();
        }
        
        return foodMode;
    }
    
    public String findMoodOfDay()
    {
        //readFromFile();
        moodList = MoodList.getMoodList();
        String moodMode = new String();
        Map<String, Integer> moodCount = new HashMap<>();
        
        for (String s: moodList)
        {
            Integer count = moodCount.get(s);
            
            if (count == null) {
                count = new Integer(0);
            }
            
            count++;
            
            moodCount.put(s,count);
        }
        
        Map.Entry<String, Integer> modeM = null;
        for (Map.Entry<String, Integer> e: moodCount.entrySet())
        {
            if (modeM == null || modeM.getValue()<e.getValue()) {
                modeM = e;
            }
        }
        
        if (modeM == null)
        {
            System.out.println("most common Food is null");
        }
        else
        {
        moodMode = modeM.getKey();
        }
        
        return moodMode;
    }
    
    /**
     * Calculate the number of foods and moods today.
     */
    public int foodsToday()
    {
        //readFromFile();
        foodList = FoodList.getFoodList();
        int rv = 0;
        
        rv = foodList.size();
        System.out.println("foodList.size: " + rv);
        
        return rv;
    }    
    
    public int moodsToday()
    {
        //readFromFile();
        moodList = MoodList.getMoodList();
        int rv = 0;
        
        rv = moodList.size();
        System.out.println("moodList.size: " + rv);
        
        return rv;
    }
    
    /**
     * Grab the most recent view.
     */    
    public void refreshView()
    {
        String f1 = findFoodOfDay();
        String m1 = findMoodOfDay();
        int p1;
        int p2;
        p1 = foodsToday();
        p2 = moodsToday();
        String foods = Integer.toString(p1);
        String moods = Integer.toString(p1) + "/" + Integer.toString(p2);
        
        FoodOfDayValue.setText(f1);
        MoodOfDayValue.setText(m1);
        FoodsTodayValue.setText(foods);
        MoodsTodayValue.setText(moods);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FoodOfDayTitle;
    private javax.swing.JLabel FoodOfDayValue;
    private javax.swing.JLabel FoodsTodayTitle;
    private javax.swing.JLabel FoodsTodayValue;
    private javax.swing.JLabel MoodOfDayTitle;
    private javax.swing.JLabel MoodOfDayValue;
    private javax.swing.JLabel MoodsTodayTitle;
    private javax.swing.JLabel MoodsTodayValue;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JButton goToChartButton;
    private javax.swing.JButton goToFoodMoodButton;
    private javax.swing.JButton goToRecommButton;
    private javax.swing.JButton notificationsButton;
    private javax.swing.JSeparator splitterTopFromBottom;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewUserButton;
    // End of variables declaration//GEN-END:variables
}
