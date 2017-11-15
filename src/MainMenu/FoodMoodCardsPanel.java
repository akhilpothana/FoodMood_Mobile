package MainMenu;

/**
 * This class represent a single FoodMood entry card
 * These cars will be added as the user chooses to do so
 * @author Akhil
 */
public class FoodMoodCardsPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodMoodCardsPanel
     */
    public FoodMoodCardsPanel() {
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

        firstEntryFoodMood = new javax.swing.JPanel();
        foodLabel1 = new javax.swing.JLabel();
        moodLabel1 = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        deleteButton1 = new javax.swing.JButton();
        editButton1 = new javax.swing.JButton();

        foodLabel1.setText("Food:");

        moodLabel1.setText("Mood:");

        dateLabel1.setText("Date:");

        deleteButton1.setText("Delete");

        editButton1.setText("Edit");
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firstEntryFoodMoodLayout = new javax.swing.GroupLayout(firstEntryFoodMood);
        firstEntryFoodMood.setLayout(firstEntryFoodMoodLayout);
        firstEntryFoodMoodLayout.setHorizontalGroup(
            firstEntryFoodMoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstEntryFoodMoodLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(editButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton1)
                .addContainerGap())
            .addGroup(firstEntryFoodMoodLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(firstEntryFoodMoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodLabel1)
                    .addComponent(moodLabel1)
                    .addComponent(dateLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firstEntryFoodMoodLayout.setVerticalGroup(
            firstEntryFoodMoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstEntryFoodMoodLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foodLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moodLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(firstEntryFoodMoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton1)
                    .addComponent(deleteButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(firstEntryFoodMood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstEntryFoodMood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        if(editButton1.getText().equals("Edit")){
            editButton1.setText("Done");
        }
        else
        editButton1.setText("Edit");

    }//GEN-LAST:event_editButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton editButton1;
    private javax.swing.JPanel firstEntryFoodMood;
    private javax.swing.JLabel foodLabel1;
    private javax.swing.JLabel moodLabel1;
    // End of variables declaration//GEN-END:variables
}
