/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shoppingall;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class shopgu extends javax.swing.JFrame {
 private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    /**
     * Creates new form shopgu
     */
    public shopgu() {
        initComponents();
    }
     private void gameScore()
    {
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
     private void winningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
       
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        
        // PLAYER X CODING
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            
        }
        
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn6.setBackground(Color.PINK);           
        }
         
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);           
        }
        
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn8.setBackground(Color.PINK);           
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);           
        }
        
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn7.setBackground(Color.PINK);           
        }
        
        
        
        // PLAYER O CODING
        
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn6.setBackground(Color.PINK);           
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);           
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn8.setBackground(Color.PINK);           
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);           
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn7.setBackground(Color.PINK);           
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setPreferredSize(new java.awt.Dimension(950, 550));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoppingall/Q6Y1eGw_1.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 242, 490, 310));

        jLabel2.setFont(new java.awt.Font("華康棒棒體W5", 1, 18)); // NOI18N
        jLabel2.setText("如果覺得程式好用");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 232, -1));

        jLabel3.setFont(new java.awt.Font("華康棒棒體W5", 1, 18)); // NOI18N
        jLabel3.setText("不用訂閱按讚分享");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 173, -1));

        jLabel4.setFont(new java.awt.Font("華康棒棒體W5", 1, 18)); // NOI18N
        jLabel4.setText("更不用開起小鈴鐺");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("華康棒棒體W5", 1, 18)); // NOI18N
        jLabel5.setText("轉帳給我 就是最大的支持");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("華康棒棒體W5", 1, 18)); // NOI18N
        jLabel6.setText("我手打1000多行數學公式");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 210, 24));

        jLabel7.setFont(new java.awt.Font("華康棒棒體W5", 1, 18)); // NOI18N
        jLabel7.setText("該支持一下吧!");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 174, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        jButton2.setText("按我回上一頁");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, -1, 71));

        jLabel8.setText("9/17第一版開發完成");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel9.setText("訪客頁面與返回功能");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel10.setText("新增註冊功能(多筆)");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel11.setText("包含登入頁面與分帳系統");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel12.setText("9/25更新內容");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel13.setText("新增loading畫面");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel14.setText("優化登入版面");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel15.setText("新增第二種分帳計算模式");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel16.setText("新增結算文字輸出txt");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel17.setText("未來計畫");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

        jLabel18.setText("將輸入介面改為1筆資料");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        jLabel19.setText("物件陣列存取資料");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, -1, -1));

        jLabel20.setText("增加修改資料功能");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        jLabel21.setText("學習資料庫之後");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, -1));

        jLabel22.setText("帳號密碼儲存");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));

        jLabel23.setText("會員資料儲存");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));

        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 50, 50));

        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 50, 50));

        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 50, 50));

        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 50, 50));

        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 50, 50));

        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 50, 50));

        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 50, 50));

        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 50, 50));

        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(txtbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 50, 50));
        jPanel2.add(playero, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 50, 20));
        jPanel2.add(playerx, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 50, 20));

        jButton3.setText("重來");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 70, 50));

        jLabel24.setText("O的分數");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jLabel25.setText("X的分數");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 System.exit(0);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new logins().setVisible(true);
         this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
 txtbtn2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn2.setForeground(Color.RED);
        }
        else
        {
            txtbtn2.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        winningGame();         // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
 txtbtn1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn1.setForeground(Color.RED);
        }
        else
        {
            txtbtn1.setForeground(Color.MAGENTA);
        }   
        choose_a_Player();
        winningGame(); // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
 txtbtn3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn3.setForeground(Color.RED);
        }
        else
        {
            txtbtn3.setForeground(Color.MAGENTA);
        }   
        choose_a_Player();
        winningGame(); // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
 txtbtn4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn4.setForeground(Color.RED);
        }
        else
        {
            txtbtn4.setForeground(Color.MAGENTA);
        } 
        choose_a_Player();
        winningGame(); // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
 txtbtn5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn5.setForeground(Color.RED);
        }
        else
        {
            txtbtn5.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        winningGame();         // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
 txtbtn6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn6.setForeground(Color.RED);
        }
        else
        {
            txtbtn6.setForeground(Color.MAGENTA);
        }
choose_a_Player();
        winningGame();         // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
 txtbtn7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn7.setForeground(Color.RED);
        }
        else
        {
            txtbtn7.setForeground(Color.MAGENTA);
        }
choose_a_Player();
        winningGame();         // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
 txtbtn8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn8.setForeground(Color.RED);
        }
        else
        {
            txtbtn8.setForeground(Color.MAGENTA);
        }
choose_a_Player();
        winningGame();         // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
 txtbtn9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn9.setForeground(Color.RED);
        }
        else
        {
            txtbtn9.setForeground(Color.MAGENTA);
        }
choose_a_Player();
        winningGame();         // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn9ActionPerformed

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
            java.util.logging.Logger.getLogger(shopgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shopgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shopgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shopgu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shopgu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
