package com.mycompany.sockets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormClientDictionary extends javax.swing.JFrame {
    
     public ClientDictionary clientDictionary;

    
    public FormClientDictionary() throws IOException {
        initComponents();
        clientDictionary = new ClientDictionary("192.168.0.25", 2000, jTAMsgFromServer );
        //(tbIPAdress.getText(), Integer.parseInt((tbPortAdress.getText())), jTAMsgFromServer);
    }

    public static void main(String[] args) throws IOException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FormClientDictionary fcd = null;
                try {
                    fcd = new FormClientDictionary();
                } catch (IOException ex) {
                    Logger.getLogger(FormClientDictionary.class.getName()).log(Level.SEVERE, null, ex);
                }
                fcd.setVisible(true);
                fcd.jTAMsgFromServer.setEditable(false);
                fcd.jTAShowMsgIN.setEditable(false);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butgrSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labIPAdress = new javax.swing.JLabel();
        labPortAdress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAShowMsgIN = new javax.swing.JTextArea();
        bStopClient = new javax.swing.JButton();
        bStart = new javax.swing.JButton();
        tbIPAdress = new javax.swing.JTextField();
        tbPortAdress = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAMsgFromServer = new javax.swing.JTextArea();
        labNombre2 = new javax.swing.JLabel();
        labNombre3 = new javax.swing.JLabel();
        labNombre4 = new javax.swing.JLabel();
        jBSendWord = new javax.swing.JButton();
        jTFSendMsgToServer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(getMinimumSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Client");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 40));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        labIPAdress.setBackground(new java.awt.Color(255, 255, 255));
        labIPAdress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labIPAdress.setText("IP Adress");

        labPortAdress.setBackground(new java.awt.Color(255, 255, 255));
        labPortAdress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labPortAdress.setText("Port Server");

        jTAShowMsgIN.setColumns(20);
        jTAShowMsgIN.setRows(5);
        jScrollPane1.setViewportView(jTAShowMsgIN);

        bStopClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bStopClient.setText("Strop");
        bStopClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStopClientActionPerformed(evt);
            }
        });

        bStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bStart.setText("Start");
        bStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartActionPerformed(evt);
            }
        });

        tbIPAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbIPAdressActionPerformed(evt);
            }
        });

        tbPortAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPortAdressActionPerformed(evt);
            }
        });

        jTAMsgFromServer.setColumns(20);
        jTAMsgFromServer.setRows(5);
        jScrollPane2.setViewportView(jTAMsgFromServer);

        labNombre2.setBackground(new java.awt.Color(255, 255, 255));
        labNombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labNombre2.setText("Message from Server");

        labNombre3.setBackground(new java.awt.Color(255, 255, 255));
        labNombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labNombre3.setText("Show MessagesClient");

        labNombre4.setBackground(new java.awt.Color(255, 255, 255));
        labNombre4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labNombre4.setText("Message sent to Server: (Words)");

        jBSendWord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBSendWord.setText("Send");
        jBSendWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSendWordActionPerformed(evt);
            }
        });

        jTFSendMsgToServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSendMsgToServerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labNombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labIPAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labPortAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbPortAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbIPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bStart)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bStopClient))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTFSendMsgToServer, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSendWord))
                            .addComponent(labNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labIPAdress)
                    .addComponent(tbIPAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labPortAdress)
                    .addComponent(tbPortAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bStart)
                    .addComponent(bStopClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(labNombre4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBSendWord)
                        .addGap(28, 28, 28)
                        .addComponent(labNombre3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labNombre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFSendMsgToServer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 540, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbPortAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPortAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPortAdressActionPerformed

    private void tbIPAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbIPAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbIPAdressActionPerformed

    private void bStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartActionPerformed
         try {
             // TODO add your handling code here:
             enviarPeticion();
         } catch (IOException ex) {
             Logger.getLogger(FormClientDictionary.class.getName()).log(Level.SEVERE, null, ex);
         }
        clientDictionary.start();
        
    }//GEN-LAST:event_bStartActionPerformed

    private void bStopClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStopClientActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_bStopClientActionPerformed
   
    private void jBSendWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSendWordActionPerformed
        
        jTAShowMsgIN.append(jTFSendMsgToServer.getText() + "\n");
        clientDictionary.out.println(jTFSendMsgToServer.getText());
        try {
            clientDictionary.esperar();
            try {
                clientDictionary.palabra = jTFSendMsgToServer.getText();
                clientDictionary.enviarMensaje(clientDictionary.out, clientDictionary.in, jTFSendMsgToServer.getText());
            } catch (IOException ex) {
                Logger.getLogger(FormClientDictionary.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(FormClientDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        /*
            try {
            // TODO add your handling code here:
            //clientDictionary.palabra = jTFSendMsgToServer.getText();
            clientDictionary.enviarMensaje(clientDictionary.out, clientDictionary.in, jTFSendMsgToServer.getText());
            } catch (IOException ex) {
            Logger.getLogger(FormClientDictionary.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
        
    }//GEN-LAST:event_jBSendWordActionPerformed

    private void jTFSendMsgToServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSendMsgToServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSendMsgToServerActionPerformed
    //
    
    public void enviarPeticion() throws IOException {
        
        bStart.setEnabled(false);
        if (tbIPAdress.getText().isEmpty()) {
            clientDictionary.HOST = "127.0.0.1";//localhost
        } else {
            clientDictionary.HOST = tbIPAdress.getText();
        }
        if (tbPortAdress.getText().isEmpty()) {
            clientDictionary.PORT = 8080;
        } else {
            clientDictionary.PORT = Integer.parseInt(tbPortAdress.getText());
        }
        
        String palabra = "#DICTIONARY#CONECTION#miUsuario"; //jTFSendMsgToServer.getText();
        clientDictionary.enviarMensaje(clientDictionary.out, clientDictionary.in, palabra);
        //clientDictionary = new ClientDictionary();        
        //clientDictionary.sendWordToServer();
        //clientDictionary.start();


    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bStart;
    private javax.swing.JButton bStopClient;
    public static javax.swing.ButtonGroup butgrSexo;
    public static javax.swing.JButton jBSendWord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea jTAMsgFromServer;
    public static javax.swing.JTextArea jTAShowMsgIN;
    public static javax.swing.JTextField jTFSendMsgToServer;
    private javax.swing.JLabel labIPAdress;
    private javax.swing.JLabel labNombre2;
    private javax.swing.JLabel labNombre3;
    private javax.swing.JLabel labNombre4;
    private javax.swing.JLabel labPortAdress;
    public static javax.swing.JTextField tbIPAdress;
    public static javax.swing.JTextField tbPortAdress;
    // End of variables declaration//GEN-END:variables
}
