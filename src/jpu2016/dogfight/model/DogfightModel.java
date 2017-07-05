package jpu2016.dogfight.model;

import java.awt.Image;
import java.util.ArrayList;
import jpu2016.dogfight.model.Mobile;
import java.util.Observable;


public class DogfightModel implements IDogfightModel{
	private IMobile mobiles;
	private Sky sky;
	
	public DogfightModel(){
		
	}
	
	public IArea getArea(){
		return null;
	}
	
	public void buildArea(Dimension dimension){
		
	}
	
	public void addMobile(IMobile Mobile){
		
	}
	
	public ArrayList<Mobile> getMobiles(){
		
	}
	
	public IMobile getMobileByPlayer(int player){
		return null;
		
	}

	@Override
	public void removeMobiles(IMobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
		
	}
}
