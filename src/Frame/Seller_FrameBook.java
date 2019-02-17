/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Frame.Panel.ListBook;
import Frame.Panel.ListCategory;
//import Frame.Panel.RentBook;
import Frame.Panel.ReturnBook;
import Frame.Panel.SearchOnlyBook;
import Frame.Panel.SearchOnlyCategory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;

/**
 *
 * @author DELL
 */
public class Seller_FrameBook extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    SearchOnlyBook p1;
    ListBook p2;
    GridBagLayout layout = new GridBagLayout();
    public Seller_FrameBook() {
        initComponents();
        p1 = new SearchOnlyBook();
        p2 = new ListBook();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p1,c);
        DynamicPanel.add(p2,c);
        
        p1.setVisible(false);
        p2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SearchBookPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ListBookPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DynamicPanel = new javax.swing.JPanel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        SearchBookPanel.setBackground(new java.awt.Color(0, 0, 0));
        SearchBookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBookPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchBookPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchBookPanelMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Book_96px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout SearchBookPanelLayout = new javax.swing.GroupLayout(SearchBookPanel);
        SearchBookPanel.setLayout(SearchBookPanelLayout);
        SearchBookPanelLayout.setHorizontalGroup(
            SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchBookPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );
        SearchBookPanelLayout.setVerticalGroup(
            SearchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchBookPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );

        ListBookPanel.setBackground(new java.awt.Color(0, 0, 0));
        ListBookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListBookPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListBookPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListBookPanelMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/New Document_96px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ListBookPanelLayout = new javax.swing.GroupLayout(ListBookPanel);
        ListBookPanel.setLayout(ListBookPanelLayout);
        ListBookPanelLayout.setHorizontalGroup(
            ListBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListBookPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );
        ListBookPanelLayout.setVerticalGroup(
            ListBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListBookPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Search Book");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("List Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(ListBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(406, 406, 406))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        DynamicPanel.setBackground(new java.awt.Color(105, 105, 105));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 931, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
         p1.setVisible(false);
        p2.setVisible(true);p2.AddRowsToTable();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        ListBookPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        ListBookPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLabel1MouseExited

    private void ListBookPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListBookPanelMouseClicked
        // TODO add your handling code here:
         p1.setVisible(false);
        p2.setVisible(true);p2.AddRowsToTable();
    }//GEN-LAST:event_ListBookPanelMouseClicked

    private void ListBookPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListBookPanelMouseEntered
        // TODO add your handling code here:
        ListBookPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_ListBookPanelMouseEntered

    private void ListBookPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListBookPanelMouseExited
        // TODO add your handling code here:
        ListBookPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_ListBookPanelMouseExited

    private void SearchBookPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBookPanelMouseExited
        // TODO add your handling code here:
        SearchBookPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_SearchBookPanelMouseExited

    private void SearchBookPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBookPanelMouseEntered
        // TODO add your handling code here:
        SearchBookPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_SearchBookPanelMouseEntered

    private void SearchBookPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBookPanelMouseClicked
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
    }//GEN-LAST:event_SearchBookPanelMouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        SearchBookPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        SearchBookPanel.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel ListBookPanel;
    private javax.swing.JPanel SearchBookPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
