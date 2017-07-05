package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.gameframe.GameFrame;
import jpu2016.dogfight.model.IDogfightModel;
import java.lang.Runnable;

public class DogfightView implements Runnable, IViewSystem {
	private GraphicsBuilder graphicsBuilder;
	private GameFrame gameFrame;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable){
		
	}
	
	public void run(){
		
	}
	
	public void displayMessage(String message){
		
	}
	
	public void closeAll(){
		
	}
}

