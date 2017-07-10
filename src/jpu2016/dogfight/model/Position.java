package jpu2016.dogfight.model;

public class Position {
	
	private double x;
	private double maxX;
	private double y;
	private double maxY;
	
	public Position(double x, double maxX, double y, double maxY){
		this.x = x;
		this.maxX = maxX;
		this.y = y;
		this.maxY = maxY;
	}
	
	public Position(Position position){
		this.x = position.x;
		this.y = position.y;
		this.maxX = position.maxX;
		this.maxY = position.maxY;
	}
	
	public double getX(){
		return this.x;
	}
	
	public void setX(double x){
		this.x = x;
		
		if (this.x > maxX){
			this.x = this.x % maxX;
		}
	}
	
	public double getY(){
		return this.y;
	}
	
	public void setY(double y){
		this.y = y;

		if (this.y > maxY){
			this.y = this.y % maxY;
		}
		
	}
	
	protected void setMaxX(double maxX){
		this.maxX = maxX;
	}
	
	protected void setMaxY(double maxY){
		this.maxX = maxY;
	}
	
}
