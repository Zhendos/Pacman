package org.pacman.hack;

import org.bot.pacman.draw.Draw;

public class Change {
	/**
	 * 
	 * Getters
	 * @return
	 */
	public int getOogX(){
		return Draw.xOog;
	}
	
	public int getOogY(){
		return Draw.yOog;
	}
	
	public int getPacmanX(){
		return Draw.xPacman;
	}
	
	public int getPacmanY(){
		return Draw.yPacman;
	}
	
	/**
	 * 
	 * setters
	 * @param x
	 * @return
	 */
	public int setOogX(int x){
		x = getOogX();
		return x;
	}
	
	public int setOogY(int y){
		y = getOogY();
		return y;
	}
	
	public int setPacmanX(int x){
		x = getPacmanX();
		return x;
	}
	
	public int setPacmanY(int y){
		y = getPacmanY();
		return y;
	}
	
	

}
