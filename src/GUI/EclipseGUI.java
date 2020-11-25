package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import model.Moon;

public class EclipseGUI {

	@FXML
	private Circle sun;

	@FXML
	private Circle moon;

	@FXML
	private Circle crater1;

	@FXML
	private Circle crater2;

	@FXML
	private Circle crater3;

	
	public EclipseGUI() {
		// TODO Auto-generated constructor stub
	}
	
    @FXML
    void left(ActionEvent event) {
    	Moon newMoon = new Moon(moon.getLayoutX(), crater1.getLayoutX(),crater2.getLayoutX(),crater3.getLayoutX());
    	newMoon.moveLeft();
    	
    	double[] positions = newMoon.getPositions();
    	
    	moon.setLayoutX(positions[0]);
    	crater1.setLayoutX(positions[1]);
    	crater2.setLayoutX(positions[2]);
    	crater3.setLayoutX(positions[3]);
    }

    @FXML
    void right(ActionEvent event) {
    	Moon newMoon = new Moon(moon.getLayoutX(), crater1.getLayoutX(),crater2.getLayoutX(),crater3.getLayoutX());
    	newMoon.moveRight();
    	
    	double[] positions = newMoon.getPositions();
    	
    	moon.setLayoutX(positions[0]);
    	crater1.setLayoutX(positions[1]);
    	crater2.setLayoutX(positions[2]);
    	crater3.setLayoutX(positions[3]);
    }


}
