package org.bot.pacman.draw;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Draw extends Applet implements MouseListener,  KeyListener{
	int x, y;
	
	int xPacman, yPacman;
	int xOog, yOog;
	
	int xPacmanTotaal;
	
	public void init(){
		setBackground(Color.BLACK);
		xPacman = 50;
		yPacman = 50;
		xOog = 60;
		yOog = 60;
		
		addKeyListener(this);
		addMouseListener(this);
		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.white);
		g.drawString("X-coordinate: " + x, 10, 10);
		g.drawString("Y-coordinate: " + y, 10, 25);
		
		this.drawPacman(g);
		
	}
	
	public void drawPacman(Graphics g){
		g.setColor(Color.yellow);
		g.fillOval(xPacman, yPacman, 25, 25);
		g.setColor(Color.white);
		g.fillOval(xOog, yOog, 5, 5);
		
		xPacmanTotaal = 3;
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		/**
		 * 
		 * Als de rechter pijltjes toets wordt ingeklikt.
		 * 
		 */
		if(ke.getKeyCode() == 39){
			xPacman += 3;
			xOog += 3;
	
			repaint();
		}
		
		/**
		 * 
		 * 
		 * Als de linker pijltjes toets wordt ingeklikt.
		 * 
		 */
		
		if(ke.getKeyCode() == 37){
			xPacman -= 3;
			xOog -= 3;
			
			repaint();
		}
		
		/**
		 * 
		 *Als de boven pijltjes toets wordt ingeklikt. 
		 * 
		 */
		if(ke.getKeyCode() == 38){
			yPacman -= 3;
			yOog -= 3;
			
			repaint();
		}
		
		/**
		 * 
		 * Als de onder pijltjes toets wordt ingeklikt.
		 * 
		 */
		
		if(ke.getKeyCode() == 40){
			yPacman += 3;
			yOog += 3;
			
			repaint();
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent ke) {

	}

	@Override
	public void keyTyped(KeyEvent ke) {
		
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

/**
 * pijltje rechts -> 39
 * pijltje onder -> 40
 * pijltje links -> 37
 * pijltje boven -> 38
 */
