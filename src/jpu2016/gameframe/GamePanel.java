package jpu2016.gameframe;

import java.util.Observable;
import java.util.Observer;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel implements Observer {
	
	private IGraphicsBuilder graphicsBuilder;
	
	public GamePanel(IGraphicsBuilder graphicBuilder){
		
	}

	@Override
	public void update(Observable observable, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent(Graphics graphic){
		
	}
	
}
