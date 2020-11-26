package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import model.Moon;

public class EclipseG {
	
	@FXML
	private Circle sun;

	@FXML
	private  Rectangle sky;
	
	@FXML
	private Circle moon;

	@FXML
	private Circle crater1;

	@FXML
	private Circle crater2;

	@FXML
	private Circle crater3;
	
	@FXML
	private Color color;
	
	public EclipseG() {
		// TODO Auto-generated constructor stub
	}
	@FXML
    public void initialize() {
    	color = (Color)sky.getFill();
    }
    @FXML
    void left(ActionEvent event) {
    	Moon newMoon = new Moon(moon.getLayoutX(), crater1.getLayoutX(),crater2.getLayoutX(),crater3.getLayoutX());
    	newMoon.moveLeft();
    	
    	moon.setLayoutX(moon.getLayoutX() - 10);
    	crater1.setLayoutX(crater1.getLayoutX()-10);
    	crater2.setLayoutX(crater2.getLayoutX()-10);
    	crater3.setLayoutX(crater3.getLayoutX()-10);
    	
    	if(moon.getLayoutX()<-100) {
    		moon.setLayoutX(1069+150);
    		crater1.setLayoutX(1069+150+(180-141));
    		crater2.setLayoutX(1069+150+(180-177));
    		crater3.setLayoutX(1069+150+(180-125));
    	}
    	
    	if(newMoon.getxPositionMoon() >= sun.getLayoutX() && newMoon.getxPositionMoon() < sun.getLayoutX()+sun.getRadius()) {
    		color = color.darker();
    	}
    	else {
    		color = color.brighter();
    	}
    	
    	sky.setFill(color);
    }

    @FXML
    void right(ActionEvent event) {
    	Moon newMoon = new Moon(moon.getLayoutX(), crater1.getLayoutX(),crater2.getLayoutX(),crater3.getLayoutX());
    	newMoon.moveRight();
    	
    	moon.setLayoutX(moon.getLayoutX() + 10);
    	crater1.setLayoutX(crater1.getLayoutX()+10);
    	crater2.setLayoutX(crater2.getLayoutX()+10);
    	crater3.setLayoutX(crater3.getLayoutX()+10);
    	
    	if(moon.getLayoutX()>1069+100) {
    		moon.setLayoutX(114-200);
    		crater1.setLayoutX(141-200);
    		crater2.setLayoutX(177-200);
    		crater3.setLayoutX(125-200);
    	}

    	if(newMoon.getxPositionMoon() <= sun.getLayoutX() && newMoon.getxPositionMoon()>sun.getLayoutX()-sun.getRadius()) {
    		color = color.darker();
    	}
    	else {
    		color = color.brighter();
    	}
    	
    	sky.setFill(color);
    }


}
