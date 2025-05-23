/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import javax.swing.JOptionPane;

/**
 * 
 * @author Siam & Shoyeb
 * 
 */
public class ConverterUI extends javax.swing.JFrame {
    
    public ConverterUI() {
        initComponents();
    }

    String[] currencyUnits = {
        "Units",
        "Australian Dollar",
        "Bangladeshi Taka",
        "Brazilian Real",
        "Canadian Dollar",
        "Chinese Yuan Renminbi",
        "Egyptian Pound",
        "Euro",
        "Indian Rupee",
        "Indonesian Rupiah",
        "Japanese Yen",
        "Malaysian Ringgit",
        "Russian Ruble",
        "Saudi Riyal",
        "South African Rand",
        "South Korean Won",
        "Swiss Franc",
        "Turkish Lira",
        "US Dollar",
        "British Pound",
        "Vietnamese Dong" 
    };
    

    double Australian_Dollar = 2.09;
    double Bangladeshi_Taka = 163.51;
    double Brazilian_Real = 7.55;
    double Canadian_Dollar = 1.86;
    double Chinese_Yuan_Renminbi = 9.67;
    double Egyptian_Pound = 67.01;
    double Euro = 1.19;
    double Indian_Rupee = 115.48;
//    double Indonesian_Rupiah = 21,966.19;
    double Japanese_Yen = 193.40;
    double Malaysian_Ringgit = 5.74;
    double Russian_Ruble = 106.96;
    double Saudi_Riyal = 5.03;
    double South_African_Rand = 24.17;
//    double South_Korean_Won = 1,856.94;
    double Swiss_Franc = 1.11;
    double Turkish_Lira = 52.33;
    double US_Dollar = 1.34;
    double British_Pound = 1.00;
//    double Vietnamese_Dong = 34,880.21;


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jFileChooser1 = new javax.swing.JFileChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        Bg_blue = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        SubTitle = new javax.swing.JLabel();
        Bottom_text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Amount = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        To = new javax.swing.JLabel();
        From = new javax.swing.JLabel();
        secondCountry = new javax.swing.JComboBox<>();
        Exit_Button = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        Convert_Button = new javax.swing.JButton();
        firstCountry = new javax.swing.JComboBox<>();
        firstCurrencyUnit = new javax.swing.JLabel();
        secondCurrencyUnit = new javax.swing.JLabel();
        Reset_Button1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bg_blue.setBackground(new java.awt.Color(0, 51, 204));
        Bg_blue.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bg_blue.setForeground(new java.awt.Color(255, 255, 255));

        Heading.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Currency Converter");

        SubTitle.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        SubTitle.setForeground(new java.awt.Color(255, 255, 255));
        SubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubTitle.setText("Check for live foreign currency converter");

        Bottom_text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bottom_text.setForeground(new java.awt.Color(255, 255, 255));
        Bottom_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bottom_text.setText("We use the mid-market for out converter. This is for informational purpose only. ");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Amount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Amount.setForeground(new java.awt.Color(51, 51, 51));
        Amount.setText("Amount");

        t1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        To.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        To.setForeground(new java.awt.Color(51, 51, 51));
        To.setText("To");

        From.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        From.setForeground(new java.awt.Color(51, 51, 51));
        From.setText("From");

        secondCountry.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Country....", "Australia", "Bangladesh", "Brazil", "Canada", "China", "Egypt", "Euro", "India", "Indonesia", "Japan", "Malaysia", "Russia", "Saudi_Arab", "South_Africa", "South_Korea", "Sweden", "Turkey", "USA", "UK", "Vietnam" }));
        secondCountry.setMinimumSize(new java.awt.Dimension(200, 20));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });
        secondCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondCountryActionPerformed(evt);
            }
        });

        Exit_Button.setBackground(new java.awt.Color(0, 0, 255));
        Exit_Button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Exit_Button.setForeground(new java.awt.Color(255, 255, 255));
        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        Convert_Button.setBackground(new java.awt.Color(0, 0, 255));
        Convert_Button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Convert_Button.setForeground(new java.awt.Color(255, 255, 255));
        Convert_Button.setText("Convert");
        Convert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Convert_ButtonActionPerformed(evt);
            }
        });

        firstCountry.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Country....", "Australia", "Bangladesh", "Brazil", "Canada", "China", "Egypt", "Euro", "India", "Indonesia", "Japan", "Malaysia", "Russia", "Saudi_Arab", "South_Africa", "South_Korea", "Sweden", "Turkey", "USA", "UK", "Vietnam" }));
        firstCountry.setMinimumSize(new java.awt.Dimension(200, 20));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        firstCurrencyUnit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstCurrencyUnit.setForeground(new java.awt.Color(51, 51, 51));
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("Units");

        secondCurrencyUnit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("Units");

        Reset_Button1.setBackground(new java.awt.Color(0, 0, 255));
        Reset_Button1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Reset_Button1.setForeground(new java.awt.Color(255, 255, 255));
        Reset_Button1.setText("Reset");
        Reset_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(firstCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47)
                        .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(secondCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Convert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reset_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(From)
                    .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(To)
                    .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Amount)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCurrencyUnit)
                    .addComponent(secondCurrencyUnit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Convert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout Bg_blueLayout = new javax.swing.GroupLayout(Bg_blue);
        Bg_blue.setLayout(Bg_blueLayout);
        Bg_blueLayout.setHorizontalGroup(
            Bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bg_blueLayout.createSequentialGroup()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Bg_blueLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Bg_blueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bottom_text, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bg_blueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        Bg_blueLayout.setVerticalGroup(
            Bg_blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bg_blueLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bottom_text)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void secondCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondCountryActionPerformed

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCountryActionPerformed

    private void Convert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Convert_ButtonActionPerformed
        
        if (firstCountry.getSelectedIndex()==0 || secondCountry.getSelectedIndex()==0 || t1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "You must select both countries and must input the amount.","Error Message",JOptionPane.INFORMATION_MESSAGE);
            
            return;
            
        }
        
        double amountToChange = Double.parseDouble(t1.getText());
        
        double amountInPounds = 0.0;
        
        //Convert all selected country amount in pounds....
        
        switch(firstCountry.getSelectedItem().toString())
        {
            case "Australia" : amountInPounds = amountToChange / Australian_Dollar; break;
            case "Bangladesh" : amountInPounds = amountToChange / Bangladeshi_Taka; break;
            case "Brazil" : amountInPounds = amountToChange / Brazilian_Real; break;
            case "Canada" : amountInPounds = amountToChange / Canadian_Dollar; break;
            case "China" : amountInPounds = amountToChange / Chinese_Yuan_Renminbi; break;
            case "Egypt" : amountInPounds = amountToChange / Egyptian_Pound; break;
            case "Euro" : amountInPounds = amountToChange / Euro; break;
            case "India" : amountInPounds = amountToChange / Indian_Rupee; break;
            //case "Indonesia" : amountInPounds = amountToChange / Indonesian_Rupiah; break;
            case "Japan" : amountInPounds = amountToChange / Japanese_Yen; break;
            case "Malaysia" : amountInPounds = amountToChange / Malaysian_Ringgit; break;
            case "Russia" : amountInPounds = amountToChange / Russian_Ruble; break;
            case "Saudi_Arab" : amountInPounds = amountToChange / Saudi_Riyal; break;
            case "South_Africa" : amountInPounds = amountToChange / South_African_Rand; break;
            //case "South_Korea" : amountInPounds = amountToChange / South_Korean_Won; break;
            case "Sweden" : amountInPounds = amountToChange / Swiss_Franc; break;
            case "Turkey" : amountInPounds = amountToChange / Turkish_Lira; break;
            case "USA" : amountInPounds = amountToChange / US_Dollar; break;
            case "UK" : amountInPounds = amountToChange / British_Pound; break;
            //case "Vietnam" : amountInPounds = amountToChange / Vietnamese_Dong; break;
            default: amountInPounds = 0.0;
	}

        
        //Convert pound amount to second selected country amount....
        
        double amountChanged = 0.0;
        switch(secondCountry.getSelectedItem().toString())
        {
            case "India" : amountChanged = amountInPounds / Indian_Rupee; break;
        }
        switch(secondCountry.getSelectedItem().toString())
        {
            case "Australia" : amountChanged = amountInPounds * Australian_Dollar; break;
            case "Bangladesh" : amountChanged = amountInPounds * Bangladeshi_Taka; break;
            case "Brazil" : amountChanged = amountInPounds * Brazilian_Real; break;
            case "Canada" : amountChanged = amountInPounds * Canadian_Dollar; break;
            case "China" : amountChanged = amountInPounds * Chinese_Yuan_Renminbi; break;
            case "Egypt" : amountChanged = amountInPounds * Egyptian_Pound; break;
            case "Euro" : amountChanged = amountInPounds * Euro; break;
            case "India" : amountChanged = amountInPounds * Indian_Rupee; break;
            //case "Indonesia" : amountChanged = amountInPounds * Indonesian_Rupiah; break;
            case "Japan" : amountChanged = amountInPounds * Japanese_Yen; break;
            case "Malaysia" : amountChanged = amountInPounds * Malaysian_Ringgit; break;
            case "Russia" : amountChanged = amountInPounds * Russian_Ruble; break;
            case "Saudi_Arab" : amountChanged = amountInPounds * Saudi_Riyal; break;
            case "South_Africa" : amountChanged = amountInPounds * South_African_Rand; break;
            //case "South_Korea" : amountChanged = amountInPounds * South_Korean_Won; break;
            case "Sweden" : amountChanged = amountInPounds * Swiss_Franc; break;
            case "Turkey" : amountChanged = amountInPounds * Turkish_Lira; break;
            case "USA" : amountChanged = amountInPounds * US_Dollar; break;
            case "UK" : amountChanged = amountInPounds * British_Pound; break;
            //case "Vietnam" : amountChanged = amountInPounds * Vietnamese_Dong; break;
            default: amountChanged = amountInPounds * 0.0;
	}
        
        //Converted amount will be two digits after decimal point.....
        String value = String.format("%.2f", amountChanged);
        
        t2.setText(value);
                
    }//GEN-LAST:event_Convert_ButtonActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged

        int position = firstCountry.getSelectedIndex();
        
        firstCurrencyUnit.setText(currencyUnits[position]);
        
        
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
       
        int position = secondCountry.getSelectedIndex();
        
        secondCurrencyUnit.setText(currencyUnits[position]);
        
        
    }//GEN-LAST:event_secondCountryItemStateChanged

    private void Reset_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_Button1ActionPerformed
        
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
        
    }//GEN-LAST:event_Reset_Button1ActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("ConvertUI".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConverterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JPanel Bg_blue;
    private javax.swing.JLabel Bottom_text;
    private javax.swing.JButton Convert_Button;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JLabel From;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton Reset_Button1;
    private javax.swing.JLabel SubTitle;
    private javax.swing.JLabel To;
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables

    private String currencyUnits(int position) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
