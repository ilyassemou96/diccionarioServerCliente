package com.mycompany.echoserver;

import static com.mycompany.echoserver.DiccionarioServer.wordCountMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormServerDictionary extends javax.swing.JFrame {
    
    
    public DiccionarioServer diccionarioServer;
   
    public FormServerDictionary( ) {
        initComponents();
        
        diccionarioServer = new DiccionarioServer(jTAServerDictionary);
        this.jTAServerDictionary.setText("Server runed. Listening on port " + diccionarioServer.portNumber);
        //System.out.println("Server runed. Listening on port " + diccionarioServer.portNumber);
    }
    
    
    public static void main(String[] args) {        
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
              //  DiccionarioServer diccionarioServer = new DiccionarioServer(null);
              /*
                FormServerDictionary fes = new FormServerDictionary();
                fes.setVisible(true);                
                String localhost = null;
               
                //fes.jTAServerDictionary.setText("");
                //fes.jTAServerDictionary.append("");
                fes.tbIPConnected.setText(localhost);
               */
              new FormServerDictionary().setVisible(true);
              

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
        labPortAdress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAServerDictionary = new javax.swing.JTextArea();
        bStopServer = new javax.swing.JButton();
        bStart = new javax.swing.JButton();
        tbPortAdress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(getMinimumSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Server");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
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

        labPortAdress.setBackground(new java.awt.Color(255, 255, 255));
        labPortAdress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labPortAdress.setText("Port Server");

        jTAServerDictionary.setColumns(20);
        jTAServerDictionary.setRows(5);
        jTAServerDictionary.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTAServerDictionaryAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTAServerDictionary);

        bStopServer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bStopServer.setText("Stop");
        bStopServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStopServerActionPerformed(evt);
            }
        });

        bStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bStart.setText("Start");
        bStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartActionPerformed(evt);
            }
        });

        tbPortAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPortAdressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labPortAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bStopServer))
                            .addComponent(tbPortAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                        .addGap(169, 169, 169)))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbPortAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labPortAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bStart)
                    .addComponent(bStopServer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 540, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bStopServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStopServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bStopServerActionPerformed

    private void bStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartActionPerformed
        // TODO add your handling code here:
        requestConnection();
        this.jTAServerDictionary.append("\n Server runed. Listening on port " + diccionarioServer.portNumber);
        diccionarioServer.start();
        //jTAServerDictionary.append("");

    
    }//GEN-LAST:event_bStartActionPerformed

    private void tbPortAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPortAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPortAdressActionPerformed

    private void jTAServerDictionaryAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTAServerDictionaryAncestorAdded

    }//GEN-LAST:event_jTAServerDictionaryAncestorAdded

        
    public void requestConnection(){        
        //echoServer = new serverDictionary(this.jTAServerDictionary);
        bStart.setEnabled(false);  
        
        if (tbPortAdress.getText().isEmpty())
            diccionarioServer.portNumber = 8080;
        else
            diccionarioServer.portNumber = Integer.parseInt(tbPortAdress.getText());  
        
        
       
       // knockKnockServer.threadJTA.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bStart;
    private javax.swing.JButton bStopServer;
    public static javax.swing.ButtonGroup butgrSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAServerDictionary;
    private javax.swing.JLabel labPortAdress;
    private javax.swing.JTextField tbPortAdress;
    // End of variables declaration//GEN-END:variables

}
