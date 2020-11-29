package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import threads.MovingThread;

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
    
    private boolean twinkle;
    
    @FXML
    private Slider velocity;
    
    public boolean isMovement() {
		return movement;
	}

	private double valueSlider;
    
    @FXML
    private Circle planet1;
    
    @FXML
    private Circle planet2;
    @FXML
    private Circle planet3;
    @FXML
    private Circle planet4;
    @FXML
    private Circle planet5;
    @FXML
    private Circle planet6;
    @FXML
    private Circle planet7;
    @FXML
    private Circle planet8;
    
    private Circle[] planets;
    
    private boolean movement;
    
    private MovingThread mt;
	
	public EclipseG() {
	}
	@FXML
    public void initialize() {
    	color = (Color)sky.getFill();
    	Circle [] circles2 = {start1,start2,start3,start4,start5,start6,start7,start8,start9,start10,start11,start12,start13,start14,start15,start16,start17,start18};
    	circles = circles2;
    	for(int i = 0; i < circles.length;i++) {
    		circles[i].setVisible(false);
    	}
    	Circle[] circles3 = {planet1,planet2,planet3,planet4,planet5,planet6,planet7,planet8};
    	planets =circles3;
    	for(int j = 0; j < planets.length;j++) {
    		planets[j].setVisible(false);
    	}
    	twinkle = false;
    }
    @FXML
    void stop(ActionEvent event) {
    	movement = false;
    }

    @FXML
    void start(ActionEvent event) {
    	if (movement == false){
    	movement = true;
    	} 
    	mt = new MovingThread(this);
		mt.setDaemon(true);
		mt.start();
    }
	public void movement() {
	    	valueSlider = velocity.getValue();
	    	moon.setLayoutX(moon.getLayoutX() + valueSlider);
	    	crater1.setLayoutX(crater1.getLayoutX()+valueSlider);
	    	crater2.setLayoutX(crater2.getLayoutX()+valueSlider);
	    	crater3.setLayoutX(crater3.getLayoutX()+valueSlider);
	    	
	    	if(moon.getLayoutX()>1069+100) {
	    		moon.setLayoutX(114-200);
	    		crater1.setLayoutX(141-200);
	    		crater2.setLayoutX(177-200);
	    		crater3.setLayoutX(125-200);
	    	}

	    	if(moon.getLayoutX() <= sun.getLayoutX() && moon.getLayoutX()>sun.getLayoutX()-sun.getRadius()) {
	    		color = color.darker();
	    		for(int i = 0; i < planets.length;i++) {
	        		planets[i].setVisible(true);
	        	}
	    			if(twinkle == true) {
	    			twinkle=false;
	    			for(int i = 0; i < circles.length;i++) {
	    			circles[i].setVisible(true);
	    			}
	    			}
	    			else {
	    				twinkle=true;
	    				for(int i = 0; i < circles.length;i++) {
	    				circles[i].setVisible(false);
	    				}
	    		}
	    	}
	    	else {
	    		color = color.brighter();
	    		for(int i = 0; i < planets.length;i++) {
	        		planets[i].setVisible(false);
	        	}
	    		for(int i = 0; i < circles.length;i++) {
	        		
	    			circles[i].setVisible(false);
	        	}
	    	}
	    	
	    	sky.setFill(color);
	}
}
