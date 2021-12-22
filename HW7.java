/* @ author Kevin Morales
 * 
 * Description:
 * This program is a javafx program that
 * will display 5 "java"s set in Times Roman
 * font, in bold italics 22 size font, with each
 * with a random color and opacity. This program 
 * declares an HBox, and the 5 text objects are 
 * placed in the HBox. The HBox is put in a scene, 
 * the scene is put in a stage, and the stage
 * is displayed.
 * 
 * enjoy!!
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class HW7 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		//Declare an HBox
		HBox javaBox = new HBox(0);
		javaBox.setAlignment(Pos.CENTER);
		
		//Create java texts and set their properties
		Text java1 = new Text("Java");
		java1.setFont(Font.font("Time Roman", FontWeight.BOLD,FontPosture.ITALIC, 22));
		//Rotate java text
		java1.setRotate(90);
		Text java2 = new Text("Java");
		java2.setFont(Font.font("Time Roman", FontWeight.BOLD,FontPosture.ITALIC, 22));
		java2.setRotate(90);
		Text java3 = new Text("Java");
		java3.setFont(Font.font("Time Roman", FontWeight.BOLD,FontPosture.ITALIC, 22));
		java3.setRotate(90);
		Text java4 = new Text("Java");
		java4.setFont(Font.font("Time Roman", FontWeight.BOLD,FontPosture.ITALIC, 22));
		java4.setRotate(90);
		Text java5 = new Text("Java");
		java5.setFont(Font.font("Time Roman", FontWeight.BOLD,FontPosture.ITALIC, 22));
		java5.setRotate(90);

		// Give each java text a random color and opacity
		java1.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
		java2.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
		java3.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
		java4.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
		java5.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
		
		//Add texts to hBox
		javaBox.getChildren().add(java1);
		javaBox.getChildren().add(java2);
		javaBox.getChildren().add(java3);
		javaBox.getChildren().add(java4);
		javaBox.getChildren().add(java5);

		//Create a scene and place it in the stage
		Scene javaScene = new Scene(javaBox, 250, 150);
		// Place the scene in the stage
		primaryStage.setScene(javaScene);
		// Display the stage
		primaryStage.show();
	}
}
