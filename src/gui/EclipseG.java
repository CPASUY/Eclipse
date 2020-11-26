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
	
	//Starts
	
	@FXML
    private Circle start1;

    @FXML
    private Circle start2;
	
    @FXML
    private Circle start3;

    @FXML
    private Circle start4;

    @FXML
    private Circle start5;

    @FXML
    private Circle start6;

    @FXML
    private Circle start7;

    @FXML
    private Circle start8;

    @FXML
    private Circle start9;

    @FXML
    private Circle start10;
    
    @FXML
    private Circle start11;
    
    @FXML
    private Circle start12;
    
    @FXML
    private Circle start13;
    
    @FXML
    private Circle start14;
    
    @FXML
    private Circle start15;

    @FXML
    private Circle start16;

    @FXML
    private Circle start17;
    
    @FXML
    private Circle start18;
    
    private Circle[] circles; 
    
	
	public EclipseG() {
		// TODO Auto-generated constructor stub
	}
	@FXML
    public void initialize() {
    	color = (Color)sky.getFill();
    	Circle [] circles2 = {start1,start2,start3,start4,start5,start6,start7,start8,start9,start10,start11,start12,start13,start14,start15,start16,start17,start18};
    	circles = circles2;
    	for(int i = 0; i < circles.length;i++) {
    		circles[i].setVisible(false);
    	}
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
    		for(int i = 0; i < circles.length;i++) {
        		circles[i].setVisible(true);
        	}
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
    		for(int i = 0; i < circles.length;i++) {
        		circles[i].setVisible(true);
        	}
    	}
    	else {
    		color = color.brighter();
    	}
    	
    	sky.setFill(color);
    }


}
