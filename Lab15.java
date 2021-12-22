/* @ author Kevin Morales
 * 
 * Description:
 * This program displays a rectangle
 * centered in the scene, with a button
 * in the center bottom. Clicking on the 
 * button rotates the rectangle 15 degrees.
 * This program uses a class called 
 * RotateHandlerClass derived from the
 * EventHandler class which handles the 
 * pushing button event(which rotates the 
 * rectangle 15 degrees and sets the new
 * value of r as r+15).
 * 
 * enjoy!!
 */ 
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
public class Lab15 extends Application {
	//Declare variable to store rectangle rotation amount
	double r = 0;
	//Create a Rectangle
	private Rectangle rectangle = new Rectangle (50, 50, 25, 50);
	@Override // Override the start method in the Application class
	public void start (Stage primaryStage) {
		//Create a pane and set its properties
		StackPane pane = new StackPane();
		rectangle.setFill(Color.WHITE);
		rectangle.setStroke(Color.BLACK);
		pane.getChildren().add(rectangle);
		//Create an hBox and set it's properties
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		//Create a button and set it's properties
		Button btRotate = new Button("Rotate");
		//Create handler
		RotateHandlerClass handler1 = new RotateHandlerClass();
		//Register handler
		btRotate.setOnAction(handler1);
		//Add button to hBox
		hBox.getChildren().add(btRotate);
		//Create a BorderPane and set it's properties, adding pane(rectangle) and hBox(button)
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		//Create a scene and place borderPane in the stage
		Scene scene = new Scene(borderPane, 175, 125);
		//Stage title
		primaryStage.setTitle("RotateRectangle");
		//Place the scene in the stage
		primaryStage.setScene(scene);
		//Display the stage
		primaryStage.show();
		}
	
	public static void main(String[] args) {
		//Launch application
		Application.launch(args);
	}
	
	//Create a handler class
	class RotateHandlerClass implements EventHandler<ActionEvent> {
		@Override
		//Create a handler event for button click
		public void handle(ActionEvent e) {
			//Rotate the rectangle 15 degrees on event
			rectangle.setRotate(r + 15);
			//Set variable r to new value to keep track of rectangle's previous location on event
			r = r + 15;
		}
	}
}