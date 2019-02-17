/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Color;
import Frame.Panel.AddComment;
import Frame.Panel.ListComment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
/**
 *
 * @author DELL
 */
public class Admin_FrameComment extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    AddComment p1 ;
    ListComment p2;
    //SearchComment p3;
    GridBagLayout layout = new GridBagLayout();
    public Admin_FrameComment() {
        initComponents();
        p1 = new AddComment();
        p2 = new ListComment();
        //p3 = new SearchComment();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p1,c);
        DynamicPanel.add(p2,c);
        //DynamicPanel.add(p3,c);
        
        p1.setVisible(false);
        p2.setVisible(false);
        //p3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DynamicPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        AddCommentPanel = new javax.swing.JPanel();
        AddCommentLabel = new javax.swing.JLabel();
        ListCommentPanel = new javax.swing.JPanel();
        ListCommentLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1052, 694));

        DynamicPanel.setBackground(new java.awt.Color(105, 105, 105));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanel, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        AddCommentPanel.setBackground(new java.awt.Color(0, 0, 0));
        AddCommentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCommentPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddCommentPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddCommentPanelMouseExited(evt);
            }
        });

        AddCommentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Add_96px.png"))); // NOI18N
        AddCommentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCommentLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddCommentLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddCommentLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AddCommentPanelLayout = new javax.swing.GroupLayout(AddCommentPanel);
        AddCommentPanel.setLayout(AddCommentPanelLayout);
        AddCommentPanelLayout.setHorizontalGroup(
            AddCommentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCommentPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(AddCommentLabel)
                .addGap(10, 10, 10))
        );
        AddCommentPanelLayout.setVerticalGroup(
            AddCommentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCommentPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(AddCommentLabel)
                .addGap(10, 10, 10))
        );

        ListCommentPanel.setBackground(new java.awt.Color(0, 0, 0));
        ListCommentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListCommentPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListCommentPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListCommentPanelMouseExited(evt);
            }
        });

        ListCommentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/List_96px.png"))); // NOI18N
        ListCommentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListCommentLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListCommentLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListCommentLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ListCommentPanelLayout = new javax.swing.GroupLayout(ListCommentPanel);
        ListCommentPanel.setLayout(ListCommentPanelLayout);
        ListCommentPanelLayout.setHorizontalGroup(
            ListCommentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListCommentPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ListCommentLabel)
                .addGap(10, 10, 10))
        );
        ListCommentPanelLayout.setVerticalGroup(
            ListCommentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListCommentPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ListCommentLabel)
                .addGap(10, 10, 10))
        );

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Comment");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("List Comment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddCommentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListCommentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddCommentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addComponent(ListCommentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(360, 360, 360))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddCommentPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCommentPanelMouseClicked
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        //p3.setVisible(false);
    }//GEN-LAST:event_AddCommentPanelMouseClicked

    private void AddCommentPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCommentPanelMouseEntered
        // TODO add your handling code here:
        AddCommentPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_AddCommentPanelMouseEntered

    private void AddCommentPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCommentPanelMouseExited
        // TODO add your handling code here:
        AddCommentPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_AddCommentPanelMouseExited

    private void AddCommentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCommentLabelMouseClicked
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        //p3.setVisible(false);
    }//GEN-LAST:event_AddCommentLabelMouseClicked

    private void AddCommentLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCommentLabelMouseEntered
        // TODO add your handling code here:
        AddCommentLabel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_AddCommentLabelMouseEntered

    private void AddCommentLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCommentLabelMouseExited
        // TODO add your handling code here:
        AddCommentLabel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_AddCommentLabelMouseExited

    private void ListCommentPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListCommentPanelMouseClicked
        // TODO add your handling code here:
        p1.setVisible(false);
        p2.AddRowsToTable();
        p2.setVisible(true);
        //p3.setVisible(false);
    }//GEN-LAST:event_ListCommentPanelMouseClicked

    private void ListCommentPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListCommentPanelMouseEntered
        // TODO add your handling code here:
        ListCommentPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_ListCommentPanelMouseEntered

    private void ListCommentPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListCommentPanelMouseExited
        // TODO add your handling code here:
        ListCommentPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_ListCommentPanelMouseExited

    private void ListCommentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListCommentLabelMouseClicked
        // TODO add your handling code here:
        p1.setVisible(false);
        p2.AddRowsToTable();
        p2.setVisible(true);
        //p3.setVisible(false);
    }//GEN-LAST:event_ListCommentLabelMouseClicked

    private void ListCommentLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListCommentLabelMouseEntered
        // TODO add your handling code here:
        ListCommentLabel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_ListCommentLabelMouseEntered

    private void ListCommentLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListCommentLabelMouseExited
        // TODO add your handling code here:
        ListCommentLabel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_ListCommentLabelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddCommentLabel;
    private javax.swing.JPanel AddCommentPanel;
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JLabel ListCommentLabel;
    private javax.swing.JPanel ListCommentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
