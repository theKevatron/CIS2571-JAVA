/* @ author Kevin Morales(comments only)
 * 
 * Description:
 * This program displays a scene
 * representing traffic lights in javaFx. 
 * When the program starts, no lights are on.
 * You can turn either of the three lights on
 * by clicking on the "green" button, the "yellow"
 * button, or the "red" button, and only one light
 * can be on at a time. Event handlers for each button
 * have specified actions which change the fill color of
 * certain circles used in this program to produce the 
 * desired effect based on the button clicked. 
 * 
 * (This program stores the shapes(rectangle and three circles)
 * in a pane, the RadioButtons(yellow, green, red) in an hBox, 
 * and puts the pane and the hBox in a borderPane, which is staged
 * in a scene. Clicking one of the three buttons triggers an event
 * handler which changes the fill color of the circles to create the
 * image of a traffic light.)
 * 
 * enjoy!!
 */ 
import javafx.application.Application; 
import javafx.geometry.Pos; 
import javafx.scene.Scene;
import javafx.scene.control.RadioButton; 
import javafx.scene.control.ToggleGroup; 
import javafx.scene.layout.BorderPane; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.Pane; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.scene.shape.Rectangle; 
import javafx.stage.Stage; 
public class HW8 extends Application { 
	//Declare pane width and height
	private double paneWidth = 200; 
	private double paneHeight = 90; 
	@Override // Override the start method in the Application class  
	public void start(Stage primaryStage) { 
	//Create a pane
	Pane pane = new Pane(); 
	//Create three circles and set their properties
	Circle circleRed = new Circle(paneWidth / 2, 20, 10);  
	Circle circleYellow = new Circle(paneWidth / 2, 50, 10);  
	Circle circleGreen = new Circle(paneWidth / 2, 80, 10);  
	//Set circle line color
	circleRed.setStroke(Color.BLACK); 
	circleYellow.setStroke(Color.BLACK); 
	circleGreen.setStroke(Color.BLACK);
	//Set circle fill color
	circleRed.setFill(Color.WHITE); 
	circleYellow.setFill(Color.WHITE); 
	circleGreen.setFill(Color.WHITE); 
	//Create a rectangle and set its properties
	Rectangle rectangle = new Rectangle(paneWidth / 2 - 15, 5, 30, 90);  
	rectangle.setFill(Color.WHITE); 
	rectangle.setStroke(Color.BLACK); 
	//Add rectangle and circles to pane
	pane.getChildren().addAll(rectangle, circleRed, circleYellow,  circleGreen); 
	//Create three RadioButtons, one titled red, one titled yellow, and one titled green
	RadioButton rbRed = new RadioButton("Red"); 
	RadioButton rbYellow = new RadioButton("Yellow"); 
	RadioButton rbGreen = new RadioButton("Green"); 
	//Create a new group
	ToggleGroup group = new ToggleGroup(); 
	//Add buttons to group
	rbRed.setToggleGroup(group); 
	rbYellow.setToggleGroup(group); 
	rbGreen.setToggleGroup(group); 
	//Create an hBox
	HBox hBox = new HBox(5); 
	//Add buttons to hBox
	hBox.getChildren().addAll(rbRed, rbYellow, rbGreen);  
	//Center align buttons
	hBox.setAlignment(Pos.CENTER); 
	//Add pane(rectangle and circles) and hBox(buttons) to BorderPane with specified locations
	BorderPane borderPane = new BorderPane(); 
	borderPane.setCenter(pane); 
	borderPane.setBottom(hBox);
	//Create a scene and place the borderPane in the stage with specified values
	Scene scene = new Scene(borderPane, paneWidth, paneHeight + 40);  
	primaryStage.setTitle("HW8 - Traffic Lights"); //Set the stage title  
	primaryStage.setScene(scene); //Place the scene in the stage  
	primaryStage.show(); //Display the stage 
  
	//Event handler to set first circle red and others to white when the "red" button is hit
	rbRed.setOnAction(e -> { 
		circleRed.setFill(Color.RED); 
		circleYellow.setFill(Color.WHITE); 
		circleGreen.setFill(Color.WHITE); 
	}); 
	//Event handler to set second circle yellow and others to white when the "yellow" button is hit
	rbYellow.setOnAction(e -> { 
		circleYellow.setFill(Color.YELLOW); 
		circleRed.setFill(Color.WHITE); 
		circleGreen.setFill(Color.WHITE); 
	}); 
	//Event handler to set third circle green and others to white when the "green" button is hit
	rbGreen.setOnAction(e -> { 
		circleGreen.setFill(Color.GREEN); 
		circleYellow.setFill(Color.WHITE); 
		circleRed.setFill(Color.WHITE); 
	}); 
}
	//The main method is only needed for the IDE with limited  * JavaFX support, used to launch program.
 	public static void main(String[] args) { 
 		launch(args); 
 	} 
 	
} 
