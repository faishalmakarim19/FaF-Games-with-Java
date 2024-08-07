/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class brickbreak_med extends JPanel implements KeyListener, ActionListener {
    Random rand = new Random();
    private boolean play = false;
    private int score = 0;
    private int totalBricks;
    private Timer  time;
    private int delay = 8;
    private int playerX = 310;
    private int ballposX = 100 + rand.nextInt(500);
    private int ballposY = 350 + rand.nextInt(100);
    private int ballXdir = -4;
    private int ballYdir = -4;
    private int  x=4, y=8;
    
    private map_bb map;
    
    public brickbreak_med(){
        totalBricks = x*y;
        map = new map_bb(x, y);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        time = new Timer(delay, this);
        time.start();
    }
    
    public void paint(Graphics g){
        //bg
        g.setColor(new Color(29, 49, 60));
        g.fillRect(1,1,692,592);
        
        //draw map
        map.draw((Graphics2D) g);
        
        //borders
        g.setColor(new Color(246,114,58));
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);
        
        //scores
        g.setColor(new Color(80,163,171));
        g.setFont(new Font("OCR A Extended", Font.BOLD, 30));
        g.drawString(""+score, 620, 40);
        
        //paddles
        g.setColor(new Color(80,163,171));
        g.fillRect(playerX, 550, 100, 8);
        
        //ball
        g.setColor(new Color(196,59,57));
        g.fillOval(ballposX, ballposY, 20, 20);
        
        if(totalBricks == 0){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(new Color(250,218,193));
            g.setFont(new Font("OCR A Extended", Font.BOLD, 25));
            g.drawString("You Win !, Your Final Score is : " + score, 45, 270);
            
            g.setFont(new Font("OCR A Extended", Font.BOLD, 25));
            g.drawString("Press (ENTER) to Restart", 150, 310);
            
            g.setFont(new Font("OCR A Extended", Font.BOLD, 25));
            g.drawString("Press (ESC) to Lobby", 175, 350);
        }
        
        if(ballposY > 570){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(new Color(196,59,57));
            g.setFont(new Font("OCR A Extended", Font.BOLD, 25));
            g.drawString("Game Over :(, Your Final Score is : " + score, 45, 270);
                    
            g.setFont(new Font("OCR A Extended", Font.BOLD, 25));
            g.drawString("Press (ENTER) to Restart", 150, 310);
            
            g.setFont(new Font("OCR A Extended", Font.BOLD, 25));
            g.drawString("Press (ESC) to Lobby", 175, 350);
        }
        
        g.dispose();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(playerX >= 600)
                playerX = 600;
            else
                moveRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            if(playerX < 10)
                playerX = 10;
            else
                moveLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            if(!play){
                play = true;
                ballposX = 100 + rand.nextInt(500);
                ballposY = 350 + rand.nextInt(100);
                ballXdir = -4;
                ballYdir = -4;
                playerX = 310;
                score = 0;
                map = new map_bb(x, y);
                totalBricks = x*y;
                repaint();
            }
                
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
            if(!play){
                lobby_bb a = new lobby_bb();
                a.setVisible(true);            }
        }
    }
    public void moveRight(){
        play = true;
        playerX += 20;
    }
    public void moveLeft(){
        play = true;
        playerX -= 20;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        time.start();
        if(play){
            if(new Rectangle(ballposX, ballposY, 20,20).intersects(new Rectangle(playerX, 550, 100,8))){
                ballYdir = -ballYdir;
            }
            
            A:    for(int i = 0; i < map.map.length; i++){
                for(int j = 0; j < map.map[0].length; j++){
                    if(map.map[i][j] > 0){
                        int brickX = j*map.brickWidth+80;
                        int brickY = i*map.brickHeight+50;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;
                        
                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
                        Rectangle brickRect = rect;
                        
                        if(ballRect.intersects(brickRect)){
                            map.setBrickValue(0, i, j);
                            totalBricks--;
                            score += 5;
                            
                            if(ballposX + 19 <= brickRect.x || ballposX+1 >= brickRect.x + brickRect.width){
                                ballXdir = -ballXdir;
                            }else{
                                ballYdir = -ballYdir;
                            }
                            
                            break A;
                        }
                    }
                
                }
            }
            ballposX += ballXdir;
            ballposY += ballYdir;
            if(ballposX < 0){
                ballXdir = -ballXdir;
            }
            if(ballposY < 0){
                ballYdir = -ballYdir;
            }
            if(ballposX > 670){
                ballXdir = -ballXdir;
            }
        }
        repaint();
    }
    
}
