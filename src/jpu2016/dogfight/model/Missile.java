package jpu2016.dogfight.model;

public class Missile {
	
	private int SPEED = 2;
	private int WIDTH = 100;
	private int HEIGHT = 30;
	private int MAX_DISTANCE_TRAVELED = 1400;
	private int distanceTraveled = 0;
	private String IMAGE = "missile";

	public Missile(Direction direction, Dimension dimension){
		
	}
	
	public int getWidthWithADirection(Direction direction){
		return this.WIDTH;
	}
	
	public int getHeightWithADirection(Direction direction){
		return this.HEIGHT;
	}
	
	public void move(){
		if (this.distanceTraveled < MAX_DISTANCE_TRAVELED){
			this.distanceTraveled = this.distanceTraveled + SPEED;
		}
		else 
	}
	
	public boolean isWeapon(){
		return false;
	}
	
}
