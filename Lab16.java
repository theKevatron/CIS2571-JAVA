/* @ author Kevin Morales
 * 
 * Description:
 * 
 * This program is a basic calculator
 * that allows you to enter two numbers
 * and either add, subtract multiply or 
 * divide them. The result of the calculation
 * will be displayed in the result text field.
 * 
 * Technical: This program displays three labels
 * (Number 1, Number 2, Result) and three
 * text fields where the user can input. It
 * also displays 4 buttons (Add, Subtract, Multiply,
 * Divide) which will run a calculation and display the
 * result in the "Result" text field based on the
 * Number 1 input, Number 2 input, and the button 
 * pushed.
 * 
 * enjoy!!
 */ 
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Lab16 extends Application {
	//Declare text fields for the first number, second number, and result
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();
	double number1 = 0;
	double number2 = 0;
	double result = 0;
	@Override // Override the start method in the Application class
	public void start (Stage primaryStage) {
		//Create a gridPane and set it's properties
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(7);
		gridPane.setVgap(7);
		//Add labels and text fields to gridPane in desired location
		gridPane.add(new Label("Number 1:"), 2, 2);
		gridPane.add(tfNumber1, 3, 2);
		gridPane.add(new Label("Number 2:"), 2, 4);
		gridPane.add(tfNumber2, 3, 4);
		gridPane.add(new Label("Result:"), 2, 6);
		gridPane.add(tfResult, 3, 6);
		//Center align the text fields
		tfNumber1.setAlignment(Pos.CENTER);
		tfNumber2.setAlignment(Pos.CENTER);
		tfResult.setAlignment(Pos.CENTER);
		//Create an hBox and set it's properties
		HBox hBox = new HBox();
		hBox.setSpacing(4);
		hBox.setAlignment(Pos.CENTER);
		//Create four buttons and set their properties(add, subtract, multiply, divide)
		Button btAdd = new Button("Add");
		Button btSubtract = new Button("Subtract");
		Button btMultiply = new Button("Multiply");
		Button btDivide = new Button("Divide");
		//Process events for each button
		btAdd.setOnAction(e -> calculateAddition());
		btSubtract.setOnAction(e -> calculateSubtraction());
		btMultiply.setOnAction(e -> calculateMultiplication());
		btDivide.setOnAction(e -> calculateDivision());
		//Add all four buttons to hBox
		hBox.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
		//Create a BorderPane and add gridPane(text fields+labels) and hBox(buttons)
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(gridPane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		//Create a scene and place borderPane in the stage
		Scene scene = new Scene(borderPane, 270, 200);
		//Stage title
		primaryStage.setTitle("Calculator");
		//Place the scene in the stage
		primaryStage.setScene(scene);
		//Display the stage
		primaryStage.show();
		}
	
	public static void main(String[] args) {
		//Launch application
		Application.launch(args);
	}
	
	//Event for Addition button
	private void calculateAddition() {
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result = number1 + number2;
		tfResult.setText(String.format("%.2f", result));
	}
	//Event for Subtraction button
	private void calculateSubtraction() {
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result = number1 - number2;
		tfResult.setText(String.format("%.2f", result));
	}
	//Event for Multiplication button
	private void calculateMultiplication() {
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result = number1 * number2;
		tfResult.setText(String.format("%.2f", result));
	}
	//Event for Division button
	private void calculateDivision() {
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result = number1 / number2;
		tfResult.setText(String.format("%.2f" , result));
	}
}