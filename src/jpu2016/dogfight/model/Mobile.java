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
		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.speed = speed;
		this.images = 
	}
	
	public Direction getDirection(){
		return this.direction;
	}
	
	public void setDirection(Direction direction){
		this.direction = direction;
	}
	
	public Point getPosition(){
		return new Point((int) this.position.getX(), (int) this.position.getY());
	}
	
	public Dimension getDimension(){
		return this.dimension;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public int getWidth(){
		return this.dimension.getWidth();
	}
	
	public int getHeight(){
		return this.dimension.getHeight();
	}
	
	public void move(){
		
	}
	
	public void placeInArea(IArea area){
		
	}
	
	public boolean isPlayer(int player){
		if (player == 1){
			return true;
		}
		else return false;
	}
	
	private void moveUp(){
		this.position.setY(this.position.getY() + this.speed);
	}
	
	private void moveDown(){
		this.position.setY(this.position.getY() - this.speed);
	}
	
	private void moveLeft(){
		this.position.setX(this.position.getX() - this.speed);
	}
	
	private void moveRight(){
		this.position.setX(this.position.getX() + this.speed);
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
		return this.images;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		
	}
}
