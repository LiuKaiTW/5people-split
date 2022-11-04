package shoppingall;


import java.awt.event.KeyEvent;
import java.util.List;
import shoppingall.shop;
import shoppingall.shopgu;
public class logins extends javax.swing.JFrame {
    
   

int Ri=0;
    public logins() {
       
        initComponents();
    }
String username;
String password;
String registerusername[]=new String[20];
String registerpassword[]=new String[20];

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        login = new javax.swing.JButton();
        guest = new javax.swing.JButton();
        jpassword = new javax.swing.JPasswordField();
        jusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registerbt = new javax.swing.JButton();
        show = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        find = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        show123 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 41, 61));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setBackground(new java.awt.Color(255, 0, 0));
        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ExitKeyPressed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 50, 20));

        login.setBackground(new java.awt.Color(239, 240, 240));
        login.setContentAreaFilled(false);
        login.setFocusable(false);
        login.setRequestFocusEnabled(false);
        login.setRolloverEnabled(false);
        login.setVerifyInputWhenFocusTarget(false);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 411, 65, 29));

        guest.setText("guest");
        guest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestMouseClicked(evt);
            }
        });
        guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestActionPerformed(evt);
            }
        });
        jPanel1.add(guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        jpassword.setText("請輸入密碼");
        jpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(214, 255, 246)));
        jpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpasswordMouseClicked(evt);
            }
        });
        jPanel1.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 260, 182, 40));

        jusername.setText("請輸入帳號");
        jusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new javax.swing.ImageIcon(getClass().getResource("/shoppingall/line.png")))); // NOI18N
        jusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jusernameMouseClicked(evt);
            }
        });
        jPanel1.add(jusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 183, 37));

        jLabel3.setFont(new java.awt.Font("華康寶風體W4", 0, 18)); // NOI18N
        jLabel3.setText("記得註冊後登入");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, 30));

        jLabel6.setFont(new java.awt.Font("華康寶風體W4", 0, 18)); // NOI18N
        jLabel6.setText("輸入金額 自動分帳的好程式!");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 240, -1));

        jLabel5.setFont(new java.awt.Font("華康寶風體W4", 0, 18)); // NOI18N
        jLabel5.setText("讓你腦袋退化的必備良藥");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 230, -1));

        jLabel4.setFont(new java.awt.Font("華康寶風體W4", 0, 18)); // NOI18N
        jLabel4.setText("居家旅行、朋友出遊");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 190, -1));

        registerbt.setContentAreaFilled(false);
        registerbt.setFocusPainted(false);
        registerbt.setFocusable(false);
        registerbt.setRequestFocusEnabled(false);
        registerbt.setRolloverEnabled(false);
        registerbt.setVerifyInputWhenFocusTarget(false);
        registerbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerbtMouseClicked(evt);
            }
        });
        registerbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtActionPerformed(evt);
            }
        });
        jPanel1.add(registerbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 411, 67, 29));

        show.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 90, 20));

        jLabel9.setFont(new java.awt.Font("華康寶風體W4", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sign in");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 130, -1));

        find.setText("jButton1");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        jPanel1.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        show123.setColumns(20);
        show123.setRows(5);
        jScrollPane1.setViewportView(show123);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoppingall/indexphoto5.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExitKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          System.exit(0);}// TODO add your handling code here:
    }//GEN-LAST:event_ExitKeyPressed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
     username=jusername.getText();  //帳號輸入的框框
     password=jpassword.getText();  //密碼輸入的框框
     
     /*if(username.contains("ace")&&password.contains("0000"))
     {   
         new shop().setVisible(true);
         this.setVisible(false);}*/
     
        List<registerfile> l=new Method().query2();
        registerfile[] s1=l.toArray(new registerfile[l.size()]);
        
        for(int i=0;i<s1.length;i++)
        {if(username.equals(s1[i].getUsername()) && password.equals(s1[i].getPassword()))
          {show123.append("success"); 
          new shop().setVisible(true);
          this.setVisible(false);
          }
        }
         
    
     
     
    }//GEN-LAST:event_loginMouseClicked

    private void guestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestMouseClicked
 {   
         new shopgu().setVisible(true);
         this.setVisible(false);}        // TODO add your handling code here:
    }//GEN-LAST:event_guestMouseClicked

    private void jusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jusernameMouseClicked
    jusername.setText("");
    }//GEN-LAST:event_jusernameMouseClicked

    private void guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestActionPerformed

    private void jpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpasswordMouseClicked
    jpassword.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordMouseClicked

    private void registerbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerbtMouseClicked
        
        
    }//GEN-LAST:event_registerbtMouseClicked

    private void registerbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtActionPerformed
    registerfile rf=new registerfile(jusername.getText(), jpassword.getText());
    new Method().add(rf);
    jusername.setText("");
    jpassword.setText("");
    
    }//GEN-LAST:event_registerbtActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        List<registerfile> l=new Method().query2();
        registerfile[] s1=l.toArray(new registerfile[l.size()]);
        for(int i=0;i<s1.length;i++)
        show123.append(s1[i].getUsername() +"\n"+s1[i].getPassword()+"\n");       // TODO add your handling code here:
    }//GEN-LAST:event_findActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton find;
    private javax.swing.JButton guest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jusername;
    private javax.swing.JButton login;
    private javax.swing.JButton registerbt;
    private javax.swing.JLabel show;
    private javax.swing.JTextArea show123;
    // End of variables declaration//GEN-END:variables
}
