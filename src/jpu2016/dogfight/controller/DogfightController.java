package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer{
	private int TIME_SLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	Missile missile = new Missile(null, null);
	
	public DogfightController(DogfightModel dogfightModel){
		
	}
	
	public void orderPerform(UserOrder userOrder){
		
	}
	
	public void play(){
		
	}
	
	public void setViewSystem(IViewSystem viewSystem){
		
	}
	
	private void launchMissile(int player){
		
	}
	
	private void gameLoop(){
		
	}
	
	
}
