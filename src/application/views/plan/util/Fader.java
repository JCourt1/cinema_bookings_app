package application.views.plan.util;

import javafx.animation.FadeTransition;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Fader {
	
	
	public static void fadeOut(Pane pane) {
		FadeTransition fadeOut = new FadeTransition();
		fadeOut.setDuration(Duration.millis(500));
		fadeOut.setNode(pane);
		fadeOut.setFromValue(1);
		fadeOut.setToValue(0);
		fadeOut.play();
	}
	
	
	public static void fadeIn(Pane pane) {
		FadeTransition fadeIn = new FadeTransition();
		fadeIn.setDuration(Duration.millis(2000));
		fadeIn.setNode(pane);
		fadeIn.setFromValue(0);
		fadeIn.setToValue(1);
		
		fadeIn.play();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
