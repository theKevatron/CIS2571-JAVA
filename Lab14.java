/* @ author Kevin Morales
 * 
 * Description:
 * This program displays the text 
 * "Welcome to Java" (which is stored in a 
 * string) in a circular pattern
 * in Javafx using the properties of a circle.
 * By using the radius, center point of the pane/
 * center point of the circle, we can orient
 * each letter in the string to the correct position 
 * and rotation by using a for loop.
 * 
 * enjoy!!
 */
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.text.*;
public class Lab14 extends Application {
	//Override the start method in the Application class
	@Override 
	public void start (Stage primaryStage) {
		//Create a pane
		Pane pane = new Pane();
		//Create a circle
		Circle circle = new Circle();
		//Set center of circle to center of pane
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		//Set circle radius
		circle.setRadius(150);
		//Store text in a string
        String[] welcome = "Welcome to Java".split("");
        //Set starting angle and starting rotation
        double a = 0;
        double r = 90;
        //For loop to set position/rotation of each new letter
        for (int i = 0; i < welcome.length; i++) {
        	//Increment angle and rotation for next iteration
        	a = a + 24;
        	r = r + 24;
        	//Use center point(200), radius, and cos/sin equations to find location to put letter
            double x = 200 + circle.getRadius() * Math.cos(Math.toRadians(a));
            double y = 200 + circle.getRadius() * Math.sin(Math.toRadians(a));
            //Create new text in x, y location using string[i]
            Text text = new Text(x, y, welcome[i]);
            //Rotate text
            text.setRotate(r);
            //Set font for text
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 50));
            //Add text to pane
            pane.getChildren().add(text);
        }
		//Create a scene and place pane in scene
		Scene scene = new Scene(pane, 400, 400);
		//Stage title
		primaryStage.setTitle("Lab 14");
		//Place the scene in the stage
		primaryStage.setScene(scene);
		//Display the stage
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		//Launch application
		Application.launch(args);
	}

}
