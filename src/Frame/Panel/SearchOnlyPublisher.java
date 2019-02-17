/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.Panel;

import DataFile.Book;
import Safety.Validation;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SearchOnlyPublisher extends javax.swing.JPanel {

    /**
     * Creates new form SearchAdmin
     */
    public SearchOnlyPublisher() {
        initComponents();
        Book a = new Book();
        String[] arr = a.ListAllNameOfPublisher();
        for (int i = 0; i < arr.length; i++) {
            jComboBox1.addItem(arr[i]);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNoOfBooks = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelSuccessOrFail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPublisherName = new javax.swing.JTextField();
        jPanelSearch = new javax.swing.JPanel();
        jLabelSearch = new javax.swing.JLabel();
        jPanelreset = new javax.swing.JPanel();
        jLabelReset = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        jLabel29.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Search");

        jLabel30.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Reset");

        setBackground(new java.awt.Color(105, 105, 105));

        jComboBox1.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox1.setBorder(null);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Publisher Name");

        jTextFieldNoOfBooks.setEditable(false);
        jTextFieldNoOfBooks.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jTextFieldNoOfBooks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNoOfBooks.setBorder(null);
        jTextFieldNoOfBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoOfBooksActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. Of Books");

        jLabelSuccessOrFail.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabelSuccessOrFail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuccessOrFail.setText("Publisher Details ...!");

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDBook", "NameBook", "DOPPublisher", "NoOfBook", "Reciever", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Publisher Name");

        jTextFieldPublisherName.setEditable(false);
        jTextFieldPublisherName.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldPublisherName.setBorder(null);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSearch)
                .addGap(10, 10, 10))
        );
        jPanelSearchLayout.setVerticalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelreset.setBackground(new java.awt.Color(105, 105, 105));
        jPanelreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelresetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelresetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelresetMouseExited(evt);
            }
        });

        jLabelReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Reset_48px.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanelresetLayout = new javax.swing.GroupLayout(jPanelreset);
        jPanelreset.setLayout(jPanelresetLayout);
        jPanelresetLayout.setHorizontalGroup(
            jPanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelresetLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelReset)
                .addGap(10, 10, 10))
        );
        jPanelresetLayout.setVerticalGroup(
            jPanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelresetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReset)
                .addContainerGap())
        );

        jLabel31.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Search");

        jLabel32.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Reset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTextFieldPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSuccessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jTextFieldNoOfBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanelreset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSuccessOrFail)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelreset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(jTextFieldNoOfBooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel32)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldNoOfBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoOfBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoOfBooksActionPerformed

    private void jLabelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseClicked
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_jLabelSearchMouseClicked

    private void jLabelSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseEntered
        // TODO add your handling code here:
        setColor(jPanelSearch);
    }//GEN-LAST:event_jLabelSearchMouseEntered

    private void jLabelSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseExited
        // TODO add your handling code here:
        getColor(jPanelSearch);
    }//GEN-LAST:event_jLabelSearchMouseExited

    private void jPanelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSearchMouseClicked
        Search();
    }//GEN-LAST:event_jPanelSearchMouseClicked

    private void jPanelSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSearchMouseEntered
        // TODO add your handling code here:
        setColor(jPanelSearch);
    }//GEN-LAST:event_jPanelSearchMouseEntered

    private void jPanelSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSearchMouseExited
        // TODO add your handling code here:
        getColor(jPanelSearch);
    }//GEN-LAST:event_jPanelSearchMouseExited

    private void jLabelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseClicked
        // TODO add your handling code here:
        resetPanel();
    }//GEN-LAST:event_jLabelResetMouseClicked

    private void jLabelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseEntered
        // TODO add your handling code here:
        setColor(jPanelreset);
    }//GEN-LAST:event_jLabelResetMouseEntered

    private void jLabelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseExited
        // TODO add your handling code here:
        getColor(jPanelreset);
    }//GEN-LAST:event_jLabelResetMouseExited

    private void jPanelresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelresetMouseClicked
        // TODO add your handling code here:
        resetPanel();
    }//GEN-LAST:event_jPanelresetMouseClicked

    private void jPanelresetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelresetMouseEntered
        // TODO add your handling code here:
        setColor(jPanelreset);
    }//GEN-LAST:event_jPanelresetMouseEntered

    private void jPanelresetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelresetMouseExited
        // TODO add your handling code here:
        getColor(jPanelreset);
    }//GEN-LAST:event_jPanelresetMouseExited

    public void AddRowsToTable() {
        resetTable();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] rowData = new Object[6];
        ArrayList<Book> book = new Book().ListSpecificPublisher(jComboBox1.getSelectedItem().toString());
        for (Book a : book) {
            rowData[0] = a.getIDBook();
            rowData[1] = a.getNameBook();
            String DOB[] = a.Author.getDOPublisher().split("#");
            rowData[2] = DOB[2] + "/" + DOB[1] + "/" + DOB[0];
            rowData[3] = a.getNoOfBooks();
            rowData[4] = a.Reciever.getName();
            rowData[5] = a.getSalary();
            model.addRow(rowData);
        }
    }

    private void resetTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (jTable1.getRowCount() > 0) {
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    model.removeRow(i);
                }
            }
            model.removeRow(0);
        } catch (Exception e) {
            ;
        }
    }

    private void resetPanel() {
        jTextFieldNoOfBooks.setText("");
        jTextFieldPublisherName.setText("");
        if(jComboBox1.getItemCount()>0)
            jComboBox1.setSelectedIndex(0);
        resetTable();
    }

    private void setColor(JPanel p) {
        p.setBackground(new Color(0, 64, 128));
    }

    private void getColor(JPanel p) {
        p.setBackground(new Color(105, 105, 105));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabelReset;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelSuccessOrFail;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JPanel jPanelreset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNoOfBooks;
    private javax.swing.JTextField jTextFieldPublisherName;
    // End of variables declaration//GEN-END:variables

    private void Search() {
        AddRowsToTable();
        if (jTable1.getRowCount() > 0) {
            jTextFieldNoOfBooks.setText("" + new Book().NoBookInSpecificPublisher(jComboBox1.getSelectedItem().toString()));
            jTextFieldPublisherName.setText(jComboBox1.getSelectedItem().toString());
        }
    }

    
}
