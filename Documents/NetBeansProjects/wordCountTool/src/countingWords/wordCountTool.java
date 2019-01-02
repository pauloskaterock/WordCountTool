
package countingWords;


public class wordCountTool extends javax.swing.JFrame {

    
    public wordCountTool() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wrdCountpanel = new javax.swing.JPanel();
        wrdLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wrdTextArea = new javax.swing.JTextArea();
        wrdCountButton = new javax.swing.JButton();
        totalCountTextField = new javax.swing.JTextField();
        totalWrdLabel = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wrdCountpanel.setBackground(new java.awt.Color(51, 51, 51));
        wrdCountpanel.setForeground(new java.awt.Color(51, 51, 51));

        wrdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wrdLabel.setForeground(new java.awt.Color(255, 0, 204));
        wrdLabel.setText("Type Your Words");

        wrdTextArea.setColumns(20);
        wrdTextArea.setRows(5);
        jScrollPane1.setViewportView(wrdTextArea);

        wrdCountButton.setBackground(new java.awt.Color(204, 204, 204));
        wrdCountButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wrdCountButton.setForeground(new java.awt.Color(255, 0, 204));
        wrdCountButton.setText("Count Your Words");
        wrdCountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrdCountButtonActionPerformed(evt);
            }
        });

        totalWrdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalWrdLabel.setForeground(new java.awt.Color(255, 0, 204));
        totalWrdLabel.setText("Total Words");

        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 0, 204));
        clearBtn.setText("clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 0, 204));
        exitBtn.setText("exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        titleLabel.setBackground(new java.awt.Color(255, 102, 255));
        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 204));
        titleLabel.setText("Word Count Tool");

        javax.swing.GroupLayout wrdCountpanelLayout = new javax.swing.GroupLayout(wrdCountpanel);
        wrdCountpanel.setLayout(wrdCountpanelLayout);
        wrdCountpanelLayout.setHorizontalGroup(
            wrdCountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrdCountpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wrdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(wrdCountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrdCountpanelLayout.createSequentialGroup()
                        .addComponent(clearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalWrdLabel)
                        .addGap(66, 66, 66)
                        .addComponent(exitBtn))
                    .addComponent(wrdCountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCountTextField))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrdCountpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        wrdCountpanelLayout.setVerticalGroup(
            wrdCountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrdCountpanelLayout.createSequentialGroup()
                .addGroup(wrdCountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wrdCountpanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(wrdCountpanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(wrdLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wrdCountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(wrdCountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalWrdLabel)
                    .addComponent(exitBtn)
                    .addComponent(clearBtn))
                .addGap(18, 18, 18)
                .addComponent(totalCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wrdCountpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(wrdCountpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       wrdTextArea.setText("");
         totalCountTextField.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void wrdCountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrdCountButtonActionPerformed
        String sentence = wrdTextArea.getText ();
        
        int i =0,words = 1;
        
        for (i=0;i<sentence.length();i++)
        {
            if (sentence.charAt(i)==' ');
            words++;
        }
        
        totalCountTextField.setText(" "+words);
    }//GEN-LAST:event_wrdCountButtonActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wordCountTool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField totalCountTextField;
    private javax.swing.JLabel totalWrdLabel;
    private javax.swing.JButton wrdCountButton;
    private javax.swing.JPanel wrdCountpanel;
    private javax.swing.JLabel wrdLabel;
    private javax.swing.JTextArea wrdTextArea;
    // End of variables declaration//GEN-END:variables
}
