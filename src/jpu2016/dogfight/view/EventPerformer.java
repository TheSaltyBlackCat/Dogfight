package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer {
	private IOrderPerformer orderPerformer;
	UserOrder userorder = new UserOrder(0, null);
	
	public EventPerformer(IOrderPerformer orderPerformer){
		
	}
	
	public void eventPerform(KeyEvent keyCode){
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode){
		return null;
	}
	
}
