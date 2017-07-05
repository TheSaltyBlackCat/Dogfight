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
		return 0;
	}
	
	public int getHeightWithADirection(Direction direction){
		return 0;
	}
	
	public void move(){
		
	}
	
	public boolean isWeapon(){
		return false;
	}
	
}
