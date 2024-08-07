/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JOptionPane;
//import finalproject.lobby;
/**
 *
 * @author User
 */
public class tictactoe1 extends javax.swing.JFrame {

    /**
     * Creates new form tictactoe
     */
    boolean player1, player2;
    String p1,p2;
    int p1s=0, p2s=0;
    public tictactoe1() {
        initComponents();
        setTitle("Tic Tac Toe");
        this.setLocationRelativeTo(null);
    }
    public void xwin(){
        JOptionPane.showMessageDialog(null, "The Winner is "+p1, "The Winner", 1);
        p1s++;
        txtScoreP1.setText(""+p1s);
        player1 = true;
        player2 = false;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        txt.setText("Tic Tac Toe");
        btn1.setBackground(new Color(145,10,103));
        btn2.setBackground(new Color(145,10,103));
        btn3.setBackground(new Color(145,10,103));
        btn4.setBackground(new Color(145,10,103));
        btn5.setBackground(new Color(145,10,103));
        btn6.setBackground(new Color(145,10,103));
        btn7.setBackground(new Color(145,10,103));
        btn8.setBackground(new Color(145,10,103));
        btn9.setBackground(new Color(145,10,103));
        
        Random rand = new Random();
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        if (rand.nextInt(2) == 0){
            player1 = true;
            txt.setText(p1+"'s turn");
        }
        else{
            player2 = true;
            txt.setText(p2+"'s turn");
        }
    }
    public void owin(){
        JOptionPane.showMessageDialog(null, "The Winner is "+p2, "The Winner", 1);
        p2s++;
        txtScoreP2.setText(""+p2s);
        player2 = true;
        player1 = false;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        txt.setText("Tic Tac Toe");
        btn1.setBackground(new Color(145,10,103));
        btn2.setBackground(new Color(145,10,103));
        btn3.setBackground(new Color(145,10,103));
        btn4.setBackground(new Color(145,10,103));
        btn5.setBackground(new Color(145,10,103));
        btn6.setBackground(new Color(145,10,103));
        btn7.setBackground(new Color(145,10,103));
        btn8.setBackground(new Color(145,10,103));
        btn9.setBackground(new Color(145,10,103));
        
        Random rand = new Random();
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        if (rand.nextInt(2) == 0){
            player1 = true;
            txt.setText(p1+"'s turn");
        }
        else{
            player2 = true;
            txt.setText(p2+"'s turn");
        }
    }
    public void draw(){
        JOptionPane.showMessageDialog(null, "Player 1 & Player 2 Draw", "The Winner", 1);
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        txt.setText("Tic Tac Toe");
        btn1.setBackground(new Color(145,10,103));
        btn2.setBackground(new Color(145,10,103));
        btn3.setBackground(new Color(145,10,103));
        btn4.setBackground(new Color(145,10,103));
        btn5.setBackground(new Color(145,10,103));
        btn6.setBackground(new Color(145,10,103));
        btn7.setBackground(new Color(145,10,103));
        btn8.setBackground(new Color(145,10,103));
        btn9.setBackground(new Color(145,10,103));
        
        Random rand = new Random();
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        if (rand.nextInt(2) == 0){
            player1 = true;
            txt.setText(p1+"'s turn");
        }
        else{
            player2 = true;
            txt.setText(p2+"'s turn");
        }
    }
    
    public void check(){
        // X win
        if( btn1.getText().equals("X") && 
            btn2.getText().equals("X") &&
            btn3.getText().equals("X") )
        {
            btn1.setBackground(new Color(60, 7, 83));
            btn2.setBackground(new Color(60, 7, 83));
            btn3.setBackground(new Color(60, 7, 83));
            xwin();
        }
        if( btn4.getText().equals("X") && 
            btn5.getText().equals("X") &&
            btn6.getText().equals("X") )
            {
            btn4.setBackground(new Color(60, 7, 83));
            btn5.setBackground(new Color(60, 7, 83));
            btn6.setBackground(new Color(60, 7, 83));
            xwin();
        }
        if( btn7.getText().equals("X") && 
            btn8.getText().equals("X") &&
            btn9.getText().equals("X") )
            {
            btn7.setBackground(new Color(60, 7, 83));
            btn8.setBackground(new Color(60, 7, 83));
            btn9.setBackground(new Color(60, 7, 83));
            xwin();
        }
        if( btn1.getText().equals("X") && 
            btn4.getText().equals("X") &&
            btn7.getText().equals("X") )
            {
            btn1.setBackground(new Color(60, 7, 83));
            btn4.setBackground(new Color(60, 7, 83));
            btn7.setBackground(new Color(60, 7, 83));
            xwin();
        }
        if( btn2.getText().equals("X") && 
            btn5.getText().equals("X") &&
            btn8.getText().equals("X") )
            {
            btn2.setBackground(new Color(60, 7, 83));
            btn5.setBackground(new Color(60, 7, 83));
            btn8.setBackground(new Color(60, 7, 83));
            xwin();
        }
        if( btn3.getText().equals("X") && 
            btn6.getText().equals("X") &&
            btn9.getText().equals("X") )
            {
            btn3.setBackground(new Color(60, 7, 83));
            btn6.setBackground(new Color(60, 7, 83));
            btn9.setBackground(new Color(60, 7, 83));
            xwin();
        }
        if( btn1.getText().equals("X") && 
            btn5.getText().equals("X") &&
            btn9.getText().equals("X") )
            {
            btn1.setBackground(new Color(60, 7, 83));
            btn5.setBackground(new Color(60, 7, 83));
            btn9.setBackground(new Color(60, 7, 83));
            xwin();
        }
        if( btn3.getText().equals("X") && 
            btn5.getText().equals("X") &&
            btn7.getText().equals("X") )
            {
            btn3.setBackground(new Color(60, 7, 83));
            btn5.setBackground(new Color(60, 7, 83));
            btn7.setBackground(new Color(60, 7, 83));
            xwin();
        }
        
        // O win
        if( btn1.getText().equals("O") && 
            btn2.getText().equals("O") &&
            btn3.getText().equals("O") )
        {
            btn1.setBackground(new Color(114, 4, 85));
            btn2.setBackground(new Color(114, 4, 85));
            btn3.setBackground(new Color(114, 4, 85));
            owin();
        }
        if( btn4.getText().equals("O") && 
            btn5.getText().equals("O") &&
            btn6.getText().equals("O") )
            {
            btn4.setBackground(new Color(114, 4, 85));
            btn5.setBackground(new Color(114, 4, 85));
            btn6.setBackground(new Color(114, 4, 85));
            owin();
        }
        if( btn7.getText().equals("O") && 
            btn8.getText().equals("O") &&
            btn9.getText().equals("O") )
            {
            btn7.setBackground(new Color(114, 4, 85));
            btn8.setBackground(new Color(114, 4, 85));
            btn9.setBackground(new Color(114, 4, 85));
            owin();
        }
        if( btn1.getText().equals("O") && 
            btn4.getText().equals("O") &&
            btn7.getText().equals("O") )
            {
            btn1.setBackground(new Color(114, 4, 85));
            btn4.setBackground(new Color(114, 4, 85));
            btn7.setBackground(new Color(114, 4, 85));
            owin();
        }
        if( btn2.getText().equals("O") && 
            btn5.getText().equals("O") &&
            btn8.getText().equals("O") )
            {
            btn2.setBackground(new Color(114, 4, 85));
            btn5.setBackground(new Color(114, 4, 85));
            btn8.setBackground(new Color(114, 4, 85));
            owin();
        }
        if( btn3.getText().equals("O") && 
            btn6.getText().equals("O") &&
            btn9.getText().equals("O") )
            {
            btn3.setBackground(new Color(114, 4, 85));
            btn6.setBackground(new Color(114, 4, 85));
            btn9.setBackground(new Color(114, 4, 85));
            owin();
        }
        if( btn1.getText().equals("O") && 
            btn5.getText().equals("O") &&
            btn9.getText().equals("O") )
            {
            btn1.setBackground(new Color(114, 4, 85));
            btn5.setBackground(new Color(114, 4, 85));
            btn9.setBackground(new Color(114, 4, 85));
            owin();
        }
        if( btn3.getText().equals("O") && 
            btn5.getText().equals("O") &&
            btn7.getText().equals("O") )
            {
            btn3.setBackground(new Color(114, 4, 85));
            btn5.setBackground(new Color(114, 4, 85));
            btn7.setBackground(new Color(114, 4, 85));
            owin();
        }
        
        if( !(btn1.getText().equals("")) && 
            !(btn2.getText().equals("")) &&
            !(btn3.getText().equals("")) &&
            !(btn4.getText().equals("")) &&
            !(btn5.getText().equals("")) &&
            !(btn6.getText().equals("")) &&
            !(btn7.getText().equals("")) &&
            !(btn8.getText().equals("")) &&
            !(btn9.getText().equals("")) &&
               // ((player1 == true && player2 == true) || (txt.getText().equals("Player 2's turn") && player1 == false && player2 == false))
            !(btn1.getText().equals("X") && 
            btn2.getText().equals("X") &&
            btn3.getText().equals("X"))
             &&
!           (btn4.getText().equals("X") && 
            btn5.getText().equals("X") &&
            btn6.getText().equals("X"))
            &&
!           (btn7.getText().equals("X") && 
            btn8.getText().equals("X") &&
            btn9.getText().equals("X"))
            &&
!           (btn1.getText().equals("X") && 
            btn4.getText().equals("X") &&
            btn7.getText().equals("X"))
            &&
!           (btn2.getText().equals("X") && 
            btn5.getText().equals("X") &&
            btn8.getText().equals("X"))
            &&
!           (btn3.getText().equals("X") && 
            btn6.getText().equals("X") &&
            btn9.getText().equals("X"))
            &&
!           (btn1.getText().equals("X") && 
            btn5.getText().equals("X") &&
            btn9.getText().equals("X"))
            &&
!           (btn3.getText().equals("X") && 
            btn5.getText().equals("X") &&
            btn7.getText().equals("X"))
            &&  

!           (btn1.getText().equals("O") && 
            btn2.getText().equals("O") &&
            btn3.getText().equals("O"))
            &&
!           (btn4.getText().equals("O") && 
            btn5.getText().equals("O") &&
            btn6.getText().equals("O"))
            &&
!           (btn7.getText().equals("O") && 
            btn8.getText().equals("O") &&
            btn9.getText().equals("O"))
            &&
!           (btn1.getText().equals("O") && 
            btn4.getText().equals("O") &&
            btn7.getText().equals("O"))
            &&
!           (btn2.getText().equals("O") && 
            btn5.getText().equals("O") &&
            btn8.getText().equals("O"))
            &&
!           (btn3.getText().equals("O") && 
            btn6.getText().equals("O") &&
            btn9.getText().equals("O"))
            &&
!           (btn1.getText().equals("O") && 
            btn5.getText().equals("O") &&
            btn9.getText().equals("O"))
            &&
!           (btn3.getText().equals("O") && 
            btn5.getText().equals("O") &&
            btn7.getText().equals("O"))   
            )
            draw();
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
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        txtP1 = new javax.swing.JTextField();
        txtP2 = new javax.swing.JTextField();
        txtScoreP2 = new javax.swing.JTextField();
        txtScoreP1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuFile = new javax.swing.JMenu();
        menuStart = new javax.swing.JMenuItem();
        menuReset = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 6, 55));

        btn1.setBackground(new java.awt.Color(145, 10, 103));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(145, 10, 103));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(145, 10, 103));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(145, 10, 103));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(145, 10, 103));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(145, 10, 103));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(145, 10, 103));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(145, 10, 103));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(145, 10, 103));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        txt.setEditable(false);
        txt.setBackground(new java.awt.Color(3, 6, 55));
        txt.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt.setText("Tic Tac Toe");
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        txtP1.setEditable(false);
        txtP1.setBackground(new java.awt.Color(3, 6, 55));
        txtP1.setFont(new java.awt.Font("OCR A Extended", 1, 40)); // NOI18N
        txtP1.setForeground(new java.awt.Color(255, 255, 255));
        txtP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtP1.setText("Player 1");

        txtP2.setEditable(false);
        txtP2.setBackground(new java.awt.Color(3, 6, 55));
        txtP2.setFont(new java.awt.Font("OCR A Extended", 1, 40)); // NOI18N
        txtP2.setForeground(new java.awt.Color(255, 255, 255));
        txtP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtP2.setText("Player 2");

        txtScoreP2.setEditable(false);
        txtScoreP2.setBackground(new java.awt.Color(3, 6, 55));
        txtScoreP2.setFont(new java.awt.Font("OCR A Extended", 0, 88)); // NOI18N
        txtScoreP2.setForeground(new java.awt.Color(255, 255, 255));
        txtScoreP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtScoreP2.setText("0");

        txtScoreP1.setEditable(false);
        txtScoreP1.setBackground(new java.awt.Color(3, 6, 55));
        txtScoreP1.setFont(new java.awt.Font("OCR A Extended", 1, 88)); // NOI18N
        txtScoreP1.setForeground(new java.awt.Color(255, 255, 255));
        txtScoreP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtScoreP1.setText("0");
        txtScoreP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtScoreP1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtScoreP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtScoreP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtScoreP1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtP2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtScoreP2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenuBar1.setBackground(new java.awt.Color(60, 7, 83));
        jMenuBar1.setForeground(new java.awt.Color(60, 7, 83));

        menuHome.setText("Home");
        menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuHomeMousePressed(evt);
            }
        });
        menuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuHome);

        menuFile.setBackground(new java.awt.Color(60, 7, 83));
        menuFile.setForeground(new java.awt.Color(60, 7, 83));
        menuFile.setText("File");

        menuStart.setText("Start");
        menuStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStartActionPerformed(evt);
            }
        });
        menuFile.add(menuStart);

        menuReset.setText("Reset");
        menuReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResetActionPerformed(evt);
            }
        });
        menuFile.add(menuReset);

        jMenuItem1.setText("Reset Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuFile.add(jMenuItem1);

        jMenuBar1.add(menuFile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStartActionPerformed
        // TODO add your handling code here:
        p1 = JOptionPane.showInputDialog(null, "Input Player 1's Name", "Input Player Name", 1);
        txtP1.setText(p1);
        p2 = JOptionPane.showInputDialog(null, "Input Player 2's Name", "Input Player Name", 1);
        txtP2.setText(p2);
        
        Random rand = new Random();
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        if (rand.nextInt(2) == 0){
            player1 = true;
            txt.setText(p1+"'s turn");
        }
        else{
            player2 = true;
            txt.setText(p2+"'s turn");
        }

    }//GEN-LAST:event_menuStartActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
    if (txt.getText().equals(p2+"'s turn") || txt.getText().equals(p1+"'s turn")){
        if (player1 == true){
            if (btn3.getText().equals("")){
                btn3.setForeground(new Color(60, 7, 83)); 
                btn3.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn3.setText("X");
                player1 = false;
                txt.setText(p2+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        else{
            if (btn3.getText().equals("")){
                btn3.setForeground(new Color(114, 4, 85)); 
                btn3.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn3.setText("O");
                player1 = true;
                txt.setText(p1+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
    }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if (txt.getText().equals(p2+"'s turn") || txt.getText().equals(p1+"'s turn")){
        if (player1 == true){
            if (btn1.getText().equals("")){
                btn1.setForeground(new Color(60, 7, 83)); 
                btn1.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn1.setText("X");
                player1 = false;
                txt.setText(p2+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        else{
            if (btn1.getText().equals("")){
                btn1.setForeground(new Color(114, 4, 85)); 
                btn1.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn1.setText("O");
                player1 = true;
                txt.setText(p1+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if (txt.getText().equals(p2+"'s turn") || txt.getText().equals(p1+"'s turn")){
        if (player1 == true){
            if (btn2.getText().equals("")){
                btn2.setForeground(new Color(60, 7, 83)); 
                btn2.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn2.setText("X");
                player1 = false;
                txt.setText(p2+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        else{
            if (btn2.getText().equals("")){
                btn2.setForeground(new Color(114, 4, 85)); 
                btn2.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn2.setText("O");
                player1 = true;
                txt.setText(p1+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if (txt.getText().equals(p2+"'s turn") || txt.getText().equals(p1+"'s turn")){
        if (player1 == true){
            if (btn4.getText().equals("")){
                btn4.setForeground(new Color(60, 7, 83)); 
                btn4.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn4.setText("X");
                player1 = false;
                txt.setText(p2+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        else{
            if (btn4.getText().equals("")){
                btn4.setForeground(new Color(114, 4, 85)); 
                btn4.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn4.setText("O");
                player1 = true;
                txt.setText(p1+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if (txt.getText().equals(p2+"'s turn") || txt.getText().equals(p1+"'s turn")){
        if (player1 == true){
            if (btn5.getText().equals("")){
                btn5.setForeground(new Color(60, 7, 83)); 
                btn5.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn5.setText("X");
                player1 = false;
                txt.setText(p2+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        else{
            if (btn5.getText().equals("")){
                btn5.setForeground(new Color(114, 4, 85)); 
                btn5.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn5.setText("O");
                player1 = true;
                txt.setText(p1+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if (txt.getText().equals(p2+"'s turn") || txt.getText().equals(p1+"'s turn")){
        if (player1 == true){
            if (btn6.getText().equals("")){
                btn6.setForeground(new Color(60, 7, 83)); 
                btn6.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn6.setText("X");
                player1 = false;
                txt.setText(p2+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        else{
            if (btn6.getText().equals("")){
                btn6.setForeground(new Color(114, 4, 85)); 
                btn6.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn6.setText("O");
                player1 = true;
                txt.setText(p1+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if (txt.getText().equals(p2+"'s turn") || txt.getText().equals(p1+"'s turn")){
        if (player1 == true){
            if (btn7.getText().equals("")){
                btn7.setForeground(new Color(60, 7, 83)); 
                btn7.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn7.setText("X");
                player1 = false;
                txt.setText(p2+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        else{
            if (btn7.getText().equals("")){
                btn7.setForeground(new Color(114, 4, 85)); 
                btn7.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn7.setText("O");
                player1 = true;
                txt.setText(p1+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if (txt.getText().equals(p2+"'s turn") || txt.getText().equals(p1+"'s turn")){
        if (player1 == true){
            if (btn8.getText().equals("")){
                btn8.setForeground(new Color(60, 7, 83)); 
                btn8.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn8.setText("X");
                player1 = false;
                txt.setText(p2+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        else{
            if (btn8.getText().equals("")){
                btn8.setForeground(new Color(114, 4, 85)); 
                btn8.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn8.setText("O");
                player1 = true;
                txt.setText(p1+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if (txt.getText().equals(p2+"'s turn") || txt.getText().equals(p1+"'s turn")){
        if (player1 == true){
            if (btn9.getText().equals("")){
                btn9.setForeground(new Color(60, 7, 83)); 
                btn9.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn9.setText("X");
                player1 = false;
                txt.setText(p2+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        else{
            if (btn9.getText().equals("")){
                btn9.setForeground(new Color(114, 4, 85)); 
                btn9.setFont(new Font("MV Boli", Font.BOLD, 120));
                btn9.setText("O");
                player1 = true;
                txt.setText(p1+"'s turn");
                check();
            }
            else
                JOptionPane.showMessageDialog(null, "Choose the empty box", "Warning", 2);
        }
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void menuResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResetActionPerformed
        // TODO add your handling code here:
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        txt.setText("Tic Tac Toe");
        btn1.setBackground(new Color(145,10,103));
        btn2.setBackground(new Color(145,10,103));
        btn3.setBackground(new Color(145,10,103));
        btn4.setBackground(new Color(145,10,103));
        btn5.setBackground(new Color(145,10,103));
        btn6.setBackground(new Color(145,10,103));
        btn7.setBackground(new Color(145,10,103));
        btn8.setBackground(new Color(145,10,103));
        btn9.setBackground(new Color(145,10,103));
        
        Random rand = new Random();
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        if (rand.nextInt(2) == 0){
            player1 = true;
            txt.setText(p1+"'s turn");
        }
        else{
            player2 = true;
            txt.setText(p2+"'s turn");
        }
    }//GEN-LAST:event_menuResetActionPerformed

    private void txtScoreP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtScoreP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtScoreP1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (p1s > p2s)
            JOptionPane.showMessageDialog(null, "The Winner of This Match is " + p1, "Winner", 1);
        else if (p2s > p1s)
            JOptionPane.showMessageDialog(null, "The Winner of This Match is " + p2, "Winner", 1);
        else
            JOptionPane.showMessageDialog(null, "The Match is Draw", "Winner", 1);
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        txt.setText("Tic Tac Toe");
        txtP1.setText("Player 1");
        txtP2.setText("Player 2");
        txtScoreP1.setText("0");
        txtScoreP2.setText("0");   
        p1s = 0;
        p2s = 0;
        btn1.setBackground(new Color(145,10,103));
        btn2.setBackground(new Color(145,10,103));
        btn3.setBackground(new Color(145,10,103));
        btn4.setBackground(new Color(145,10,103));
        btn5.setBackground(new Color(145,10,103));
        btn6.setBackground(new Color(145,10,103));
        btn7.setBackground(new Color(145,10,103));
        btn8.setBackground(new Color(145,10,103));
        btn9.setBackground(new Color(145,10,103));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuHomeActionPerformed

    private void menuHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMousePressed
        // TODO add your handling code here:
        lobby a = new lobby();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_menuHomeMousePressed

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
            java.util.logging.Logger.getLogger(tictactoe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenuItem menuReset;
    private javax.swing.JMenuItem menuStart;
    private javax.swing.JTextField txt;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtP2;
    private javax.swing.JTextField txtScoreP1;
    private javax.swing.JTextField txtScoreP2;
    // End of variables declaration//GEN-END:variables
}
