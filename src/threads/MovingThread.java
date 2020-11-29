package threads;

import gui.EclipseG;
import javafx.application.Platform;

public class MovingThread extends Thread{
	private EclipseG e;
	public MovingThread(EclipseG eg) {
		e= eg;
	}
	public void run() {
		while (e.isMovement()) {
			Platform.runLater(new Thread() {
				public void run() {
					e.movement();
				}
			});

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
