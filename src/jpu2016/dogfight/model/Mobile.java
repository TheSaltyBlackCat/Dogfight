package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{
	private int speed;
	private Image images;
	private Direction direction;
	private Dimension dimension;
	private Position position;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		
	}
	
	public Direction getDirection(){
		return null;
	}
	
	public void setDirection(Direction direction){
		
	}
	
	public Point getPosition(){
		return null;
	}
	
	public Dimension getDimension(){
		return null;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public int getWidth(){
		return 0;
	}
	
	public int getHeight(){
		return 0;
	}
	
	public void move(){
		
	}
	
	public void placeInArea(IArea area){
		
	}
	
	public boolean isPlayer(int player){
		return true;
	}
	
	private void moveUp(){
		
	}
	
	private void moveDown(){
		
	}
	
	private void moveLeft(){
		
	}
	
	private void moveRight(){
		
	}
	
	public Color getColor(){
		return null;
	}
	
	public IDogfightModel getDogfightModel(){
		return null;
	}
	
	public boolean hit(){
		return false;
	}
	
	public boolean isWeapon(){
		return false;
	}
	
	public Image getImage(){
		return null;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}
}
