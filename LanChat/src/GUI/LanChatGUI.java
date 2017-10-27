/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Client.ClientInformation;
import Client.SendMessage;
import Client.ShowOnlineUsers;
import Main.SetUPServerClient;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Emon
 */
public class LanChatGUI extends javax.swing.JFrame {
    
    private static ButtonGroup bg=new ButtonGroup();
    private String userName;
    private String userIP;
    
    /**
     * Creates new form LanChatGUI
     */
    public LanChatGUI() throws SocketException {
        this.initComponents();
        this.customCode();
        this.setUserNameandIP();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void setUserNameandIP() throws SocketException
    {
        userName=ClientInformation.getHostUserName();
        userIP=ClientInformation.getHostIP();
    }
    
    private void customCode()
    {
        //getMsgPane.getViewport().setOpaque(true);
        //showMsgPane.getViewport().setOpaque(false);
        showMsgPane.getViewport().setBackground(new Color(0,0,0,180));
        showOnlineUsersPanel.getViewport().setBackground(new Color(0,0,0,180));
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        MessaginggPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sendButton = new javax.swing.JButton();
        getMsgPane = new javax.swing.JScrollPane();
        getMessageArea = new javax.swing.JTextArea();
        showMsgPane = new javax.swing.JScrollPane();
        showMessageArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        OnlineUsersPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        showOnlineUsersPanel = new javax.swing.JScrollPane();
        showOnline = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        About = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTextPane1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        MessaginggPanel.setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        getMsgPane.setBackground(new Color(0,0,0,0));
        getMsgPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getMsgPane.setHorizontalScrollBar(null);
        getMsgPane.setOpaque(false);

        getMessageArea.setBackground(new Color(0,0,0,50));
        getMessageArea.setColumns(20);
        getMessageArea.setLineWrap(true);
        getMessageArea.setRows(5);
        getMessageArea.setOpaque(false);
        getMsgPane.setViewportView(getMessageArea);

        showMsgPane.setBackground(new Color(0,0,0,128));
        showMsgPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        showMsgPane.setOpaque(false);

        showMessageArea.setEditable(false);
        showMessageArea.setBackground(new Color(0,0,0,0));
        showMessageArea.setColumns(20);
        showMessageArea.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        showMessageArea.setForeground(new java.awt.Color(255, 255, 255));
        showMessageArea.setLineWrap(true);
        showMessageArea.setRows(5);
        showMessageArea.setOpaque(false);
        showMsgPane.setViewportView(showMessageArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(getMsgPane, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(sendButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(showMsgPane)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showMsgPane, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getMsgPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        MessaginggPanel.add(jPanel2, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/image (1).jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        MessaginggPanel.add(jLabel1, gridBagConstraints);

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8-Conference-48.png")), MessaginggPanel); // NOI18N

        OnlineUsersPanel.setLayout(new java.awt.GridBagLayout());

        jPanel3.setOpaque(false);

        showOnlineUsersPanel.setBackground(new Color(0,0,0,128));
        showOnlineUsersPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        showOnlineUsersPanel.setOpaque(false);

        showOnline.setBackground(new java.awt.Color(0, 0, 0));
        showOnline.setForeground(new java.awt.Color(255, 255, 255));
        showOnline.setOpaque(false);

        javax.swing.GroupLayout showOnlineLayout = new javax.swing.GroupLayout(showOnline);
        showOnline.setLayout(showOnlineLayout);
        showOnlineLayout.setHorizontalGroup(
            showOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        showOnlineLayout.setVerticalGroup(
            showOnlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        showOnlineUsersPanel.setViewportView(showOnline);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Online Users");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(showOnlineUsersPanel)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(showOnlineUsersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        OnlineUsersPanel.add(jPanel3, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/image.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        OnlineUsersPanel.add(jLabel2, gridBagConstraints);

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8-Chat-48.png")), OnlineUsersPanel); // NOI18N
        OnlineUsersPanel.getAccessibleContext().setAccessibleName("tab2");

        About.setLayout(new java.awt.GridBagLayout());

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        About.add(jPanel4, gridBagConstraints);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/download (2).jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        About.add(jLabel3, gridBagConstraints);

        jTabbedPane2.addTab("About", About);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void setOnlineUsers(String oUsers)
    {
        String []users=oUsers.split(":");
       
        JRadioButton button;
        JRadioButton btton1;
       // JPanel panel = new JPanel(new GridLayout(0,1));
        //panel.setVisible(true);
        
       // showOnlineUsersPanel.removeAll();
       // showOnlineUsersPanel.revalidate();
       // showOnlineUsersPanel.repaint();
        
        showOnline.setLayout(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        
        constraints.gridx=0;
        constraints.anchor=GridBagConstraints.WEST;
        constraints.gridy =GridBagConstraints.RELATIVE;
        
      //  int val=0;
        
     //   for(int i=0;i<30;i++)
        for(String i:users)
        {
            
        //    System.out.println(5);
            
            button=new JRadioButton(i);
        //    btton1=new JRadioButton("Hi");
            //btton1.setBounds(35,50,175,30);
           // button.setBounds(35, 50, 175, 30);
            bg.add(button);
            //bg.add(btton1);
            
        //    constraints.gridy = val;
         //   val+=2;
            showOnline.add(button,constraints);
           // constraints.gridy=1;
            //showOnline.add(btton1,constraints);
            //showOnlineS.add(button, WIDTH)
           // showOnline.revalidate();
            //showOnline.repaint();
        }
        
       // showOnlineUsersPanel.setLayout(new GridLayout(0,1));
         showOnlineUsersPanel.setViewportView(showOnline);
       
        //showOnlineUsersPanel.setVisible(true);
        
            
//            String []nameIP=i.split(",");
//            showOnlineSrea.setText(nameIP[0]+"\n");
//            showOnlineSrea.setText(nameIP[1]+"\n");
            
        
    }
    
    private String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
    public static void showReceivedMessage(String msg)
    {
        String []breakDownMsg=msg.split(":");
        showMessageArea.append(breakDownMsg[1]+":");
        showMessageArea.append(breakDownMsg[0]);
    }
    
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        
       // System.out.println("dfdkfjd");
        
        String intendedUser=this.getSelectedButtonText(bg);
        
        if(intendedUser==null)
        {
            JOptionPane.showMessageDialog(rootPane,"Please, select a User to chat","ALERT",JOptionPane.WARNING_MESSAGE);
        }
        
        else{
        
        String []intendedUserInfo=intendedUser.split(",");
        
        //System.out.println(intendedUserInfo[1]);
        
        String message= getMessageArea.getText();
        String sIP=SetUPServerClient.getInstance().getServerIP();
       // System.out.println(message);
        showMessageArea.append(userName+": ");
        showMessageArea.append(message+"\n");

        message=message+":"+intendedUserInfo[0];
        
        try {
            SendMessage temp=new SendMessage(sIP,intendedUserInfo[1],message);
            temp.run();
            
            //  new SendMessage(serverIP,"10.220.62.5",message).run();
        } catch (IOException ex) {
            Logger.getLogger(LanChatGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        }
        
    }//GEN-LAST:event_sendButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LanChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LanChatGUI().setVisible(true);
                } catch (SocketException ex) {
                    Logger.getLogger(LanChatGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JPanel MessaginggPanel;
    private javax.swing.JPanel OnlineUsersPanel;
    private javax.swing.JTextArea getMessageArea;
    private javax.swing.JScrollPane getMsgPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton sendButton;
    private static javax.swing.JTextArea showMessageArea;
    private javax.swing.JScrollPane showMsgPane;
    private static javax.swing.JPanel showOnline;
    private static javax.swing.JScrollPane showOnlineUsersPanel;
    // End of variables declaration//GEN-END:variables
}
