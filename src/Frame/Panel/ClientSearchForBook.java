/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.Panel;

import DataFile.Book;
import Safety.Validation;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class ClientSearchForBook extends javax.swing.JPanel {

    /**
     * Creates new form BuyingBook
     */
    public ClientSearchForBook() {
        initComponents();
        jPanelWrongName.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldSearhKey = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jTextFieldQuantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelSuccessOFail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCategory = new javax.swing.JTextField();
        jTextFieldSubSection = new javax.swing.JTextField();
        jTextFieldSection = new javax.swing.JTextField();
        jPanelSearch = new javax.swing.JPanel();
        jLabelSearch = new javax.swing.JLabel();
        jPanelReset = new javax.swing.JPanel();
        jLabelReset = new javax.swing.JLabel();
        jPanelWrongName = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(105, 105, 105));

        jTextFieldSearhKey.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldSearhKey.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSearhKey.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");

        jTextFieldID.setEditable(false);
        jTextFieldID.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldID.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");

        jTextFieldName.setEditable(false);
        jTextFieldName.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldName.setBorder(null);

        jTextFieldPrice.setEditable(false);
        jTextFieldPrice.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPrice.setBorder(null);

        jTextFieldQuantity.setEditable(false);
        jTextFieldQuantity.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldQuantity.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Name");

        jLabelSuccessOFail.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabelSuccessOFail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuccessOFail.setText("Search For Book  ...!");

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Category");

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sub Section");

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Section");

        jTextFieldCategory.setEditable(false);
        jTextFieldCategory.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldCategory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCategory.setBorder(null);

        jTextFieldSubSection.setEditable(false);
        jTextFieldSubSection.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldSubSection.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSubSection.setBorder(null);
        jTextFieldSubSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubSectionActionPerformed(evt);
            }
        });

        jTextFieldSection.setEditable(false);
        jTextFieldSection.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldSection.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSection.setBorder(null);

        jPanelSearch.setBackground(new java.awt.Color(105, 105, 105));
        jPanelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSearchMouseExited(evt);
            }
        });

        jLabelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search_48px.png"))); // NOI18N
        jLabelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
        jPanelSearch.setLayout(jPanelSearchLayout);
        jPanelSearchLayout.setHorizontalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelSearch)
                .addGap(10, 10, 10))
        );
        jPanelSearchLayout.setVerticalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelSearch)
                .addGap(10, 10, 10))
        );

        jLabelSearch.getAccessibleContext().setAccessibleName("jLabelSearch");

        jPanelReset.setBackground(new java.awt.Color(105, 105, 105));
        jPanelReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelResetMouseExited(evt);
            }
        });

        jLabelReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Reset_48px.png"))); // NOI18N
        jLabelReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelResetMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelResetLayout = new javax.swing.GroupLayout(jPanelReset);
        jPanelReset.setLayout(jPanelResetLayout);
        jPanelResetLayout.setHorizontalGroup(
            jPanelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResetLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelReset)
                .addGap(10, 10, 10))
        );
        jPanelResetLayout.setVerticalGroup(
            jPanelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResetLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelReset)
                .addGap(10, 10, 10))
        );

        jPanelWrongName.setBackground(new java.awt.Color(105, 105, 105));

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabel9.setText("Wrong Name");

        javax.swing.GroupLayout jPanelWrongNameLayout = new javax.swing.GroupLayout(jPanelWrongName);
        jPanelWrongName.setLayout(jPanelWrongNameLayout);
        jPanelWrongNameLayout.setHorizontalGroup(
            jPanelWrongNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWrongNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelWrongNameLayout.setVerticalGroup(
            jPanelWrongNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWrongNameLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jTextFieldSubSection, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jTextFieldSection, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jPanelWrongName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(34, 34, 34)
                                        .addComponent(jTextFieldSearhKey, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelSuccessOFail)))
                        .addGap(34, 34, 34)
                        .addComponent(jPanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanelReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSuccessOFail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSearhKey, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelWrongName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldSubSection, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSection, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSubSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubSectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubSectionActionPerformed

    private void jLabelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseClicked
        // TODO add your handling code here:
        if(!jTextFieldSearhKey.getText().equals("")){
            if(new Validation().checkName(jTextFieldSearhKey.getText())){
                Book b = new Book();
                b=b.getBook(jTextFieldSearhKey.getText());
                if(b!=null){
                    jLabelSuccessOFail.setText("Founded ...! :) ");
                    setPanel(b);
                }
                else
                    jLabelSuccessOFail.setText("Not Found ...! :( ");
            }
            else{
                    JOptionPane.showMessageDialog(null, "Not valid Name Of Book Try Again :(");
                    jPanelWrongName.setVisible(true);
                }
        }
        else
            jLabelSuccessOFail.setText("Missing Required Name Book ... !  Please, complete it before submit ...! :(");
    }//GEN-LAST:event_jLabelSearchMouseClicked

    private void jLabelSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseEntered
        // TODO add your handling code here:
        jPanelSearch.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jLabelSearchMouseEntered

    private void jLabelSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseExited
        // TODO add your handling code here:
        jPanelSearch.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLabelSearchMouseExited

    private void jPanelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSearchMouseClicked
        // TODO add your handling code here:
        if(!jTextFieldSearhKey.getText().equals("")){
            if(new Validation().checkName(jTextFieldSearhKey.getText())){
                Book b = new Book();
                b=b.getBook(jTextFieldSearhKey.getText());
                if(b!=null){
                    jLabelSuccessOFail.setText("Founded ...! :) ");
                    setPanel(b);
                }
                else
                    jLabelSuccessOFail.setText("Not Found ...! :( ");
            }
            else{
                    JOptionPane.showMessageDialog(null, "Not valid Name Of Book Try Again :(");
                    jPanelWrongName.setVisible(true);
                }
        }
        else
            jLabelSuccessOFail.setText("Missing Required Name Book ... !  Please, complete it before submit ...! :(");
    }//GEN-LAST:event_jPanelSearchMouseClicked

    private void jPanelSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSearchMouseEntered
        // TODO add your handling code here:
        jPanelSearch.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jPanelSearchMouseEntered

    private void jPanelSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSearchMouseExited
        // TODO add your handling code here:
        jPanelSearch.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanelSearchMouseExited

    private void jPanelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelResetMouseClicked
        // TODO add your handling code here:
        resetPanel();
        jLabelSuccessOFail.setText("Search For Book ...!");
    }//GEN-LAST:event_jPanelResetMouseClicked

    private void jPanelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelResetMouseEntered
        // TODO add your handling code here:
        jPanelReset.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jPanelResetMouseEntered

    private void jPanelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelResetMouseExited
        // TODO add your handling code here:
        jPanelReset.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanelResetMouseExited

    private void jLabelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseClicked
        // TODO add your handling code here:
        resetPanel();
        jLabelSuccessOFail.setText("Search For Book ...!");
    }//GEN-LAST:event_jLabelResetMouseClicked

    private void jLabelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseEntered
        // TODO add your handling code here:
        jPanelReset.setBackground(new java.awt.Color(0,64,128));
    }//GEN-LAST:event_jLabelResetMouseEntered

    private void jLabelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseExited
        // TODO add your handling code here:
        jPanelReset.setBackground(new Color(105, 105, 105));
    }//GEN-LAST:event_jLabelResetMouseExited
    public void setPanel(Book b)
    {
        jTextFieldName.setText(b.getNameBook());
        jTextFieldPrice.setText(""+(b.getSalary()));
        jTextFieldQuantity.setText(""+(b.getNoOfBooks()));
        //jTextFieldRentPerDay.setText(""+b.getRentPerDay());
        jTextFieldSection.setText(""+b.cat.ss.sec.getSectionID());
        jTextFieldCategory.setText(b.cat.getNameCategory());
        jTextFieldSubSection.setText(b.cat.ss.getSubSectionName());
        jTextFieldID.setText(""+b.getIDBook());
        
    }
    public void resetPanel()
    {
        
        jTextFieldName.setText("");
        jTextFieldPrice.setText("");
        jTextFieldQuantity.setText("");
        //jTextFieldRentPerDay.setText("");
        jTextFieldSection.setText("");
        jTextFieldCategory.setText("");
        jTextFieldSubSection.setText("");
        jTextFieldID.setText("");
        jPanelWrongName.setVisible(false);
    }
    
private void setColor(JPanel p){
    p.setBackground(new Color(0,64,128));
}
private void getColor(JPanel p){
    p.setBackground(new Color(105,105,105));
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelReset;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelSuccessOFail;
    private javax.swing.JPanel jPanelReset;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JPanel jPanelWrongName;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldSearhKey;
    private javax.swing.JTextField jTextFieldSection;
    private javax.swing.JTextField jTextFieldSubSection;
    // End of variables declaration//GEN-END:variables
}
