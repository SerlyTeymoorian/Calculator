/*
 Author: Serly Teymoorian 
 Date: 03 June 2021 
 Assignment: GUI Elements Calculator Part 2
 Class: Java CS/IS 139-Spring 
 */
package myJavaFXpkg;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MyJavaFX extends Application 
{
	String numDisplay = "";
	char operator; 
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception
	{
		// Create a scene and place a button in the scene.
		Pane pane = new Pane();
		
		Label text = new Label();
		text.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,20));
		text.setStyle("-fx-border-color: blue;");
		text.setAlignment(Pos.BASELINE_RIGHT); // align text to the right side of the label.
		text.setLayoutX(70);       // set the x location of the label
		text.setLayoutY(10);       // set the y location of the label
		text.setPrefSize(250, 60); // set the width and height of the label
		pane.getChildren().add(text);
		
		Button btNum0 = new Button("0");
		btNum0.setLayoutX(0);
		btNum0.setLayoutY(274);
		btNum0.setPrefWidth(140);
		btNum0.setPrefHeight(20);
		pane.getChildren().add(btNum0);
		btNum0.setOnAction(e->{
			text.setText(text.getText() + "0");
		});
		
		
		Button btNumOne = new Button("1");
		btNumOne.setLayoutX(0);
		btNumOne.setLayoutY(246.9);
		btNumOne.setPrefWidth(70);
		pane.getChildren().add(btNumOne);
		btNumOne.setOnAction(e->{
			text.setText(text.getText() + "1");
		});
		
		
		Button btNum2 = new Button("2");
		btNum2.setLayoutX(70);
		btNum2.setLayoutY(246.9);
		btNum2.setPrefWidth(70);
		pane.getChildren().add(btNum2);
		btNum2.setOnAction(e->{
			text.setText(text.getText() + "2");
		});
		
		Button btNum3 = new Button("3");
		btNum3.setLayoutX(140);
		btNum3.setLayoutY(246.9);
		btNum3.setPrefWidth(70);
		pane.getChildren().add(btNum3);
		btNum3.setOnAction(e->{
			text.setText(text.getText() + "3");
		});
		
		Button btNum4 = new Button("4");
		btNum4.setLayoutX(0);
		btNum4.setLayoutY(221.5);
		btNum4.setPrefWidth(70);
		pane.getChildren().add(btNum4);
		btNum4.setOnAction(e->{
			text.setText(text.getText() + "4");
		});
		
		Button btNum5 = new Button("5");
		btNum5.setLayoutX(70);
		btNum5.setLayoutY(221.5);
		btNum5.setPrefWidth(70);
		pane.getChildren().add(btNum5);
		btNum5.setOnAction(e->{
			text.setText(text.getText() + "5");
		});
		
		Button btNum6 = new Button("6");
		btNum6.setLayoutX(140);
		btNum6.setLayoutY(221.5);
		btNum6.setPrefWidth(70);
		pane.getChildren().add(btNum6);
		btNum6.setOnAction(e->{
			text.setText(text.getText() + "6");
		});
		
		Button btNum7 = new Button("7");
		btNum7.setLayoutX(0);
		btNum7.setLayoutY(195);
		btNum7.setPrefWidth(70);
		pane.getChildren().add(btNum7);
		btNum7.setOnAction(e->{
			text.setText(text.getText() + "7");
		});
		
		Button btNum8 = new Button("8");
		btNum8.setLayoutX(70);
		btNum8.setLayoutY(195);
		btNum8.setPrefWidth(70);
		pane.getChildren().add(btNum8);
		btNum8.setOnAction(e->{
			text.setText(text.getText() + "8");
		});
		
		Button btNum9 = new Button("9");
		btNum9.setLayoutX(140);
		btNum9.setLayoutY(195);
		btNum9.setPrefWidth(70);
		pane.getChildren().add(btNum9);
		btNum9.setOnAction(e->{
			text.setText(text.getText() + "9");
		});
		
		//clear button 
		Button btClear = new Button("C");
		btClear.setLayoutX(0);
		btClear.setLayoutY(169);
		btClear.setPrefWidth(70);
		pane.getChildren().add(btClear);
		//action
		btClear.setOnAction(e->{
			numDisplay = ""; 
			text.setText(""); 
		});
		
		Button btAdd = new Button("+");
		btAdd.setLayoutX(210);
		btAdd.setLayoutY(246.9);
		btAdd.setPrefWidth(70);
		pane.getChildren().add(btAdd);
		//action 
		btAdd.setOnAction(e->{
			numDisplay = text.getText(); 
			text.setText(""); 
			 operator = '+'; 
		});
		
		Button btSub = new Button("-");
		btSub.setLayoutX(210);
		btSub.setLayoutY(221.5);
		btSub.setPrefWidth(70);
		pane.getChildren().add(btSub);
		btSub.setOnAction(e->{
			numDisplay = text.getText(); 
			text.setText(""); 
			 operator = '-'; 
		});
		
		Button btMult = new Button("x");
		btMult.setLayoutX(210);
		btMult.setLayoutY(195);
		btMult.setPrefWidth(70);
		pane.getChildren().add(btMult);
		btMult.setOnAction(e->{
			numDisplay = text.getText(); 
			text.setText(""); 
			 operator = '*'; 
		});
		
		Button btDiv = new Button("/");
		btDiv.setLayoutX(210);
		btDiv.setLayoutY(169);
		btDiv.setPrefWidth(70);
		pane.getChildren().add(btDiv);
		btDiv.setOnAction(e->{
			numDisplay = text.getText(); 
			text.setText(""); 
			 operator = '/'; 
		});
	
		
		Button btEqual = new Button("=");
		btEqual.setLayoutX(210);
		btEqual.setLayoutY(274);
		btEqual.setPrefWidth(70);
		pane.getChildren().add(btEqual);
		btEqual.setOnAction(e->{
			
			if(operator == '*')
			{
				text.setText(Double.toString(Double.parseDouble(numDisplay) * Double.parseDouble(text.getText()))); 
			}
			else if(operator == '+')
			{
				text.setText(Double.toString(Double.parseDouble(numDisplay) + Double.parseDouble(text.getText()))); 
			}
			else if(operator == '-')
			{
				text.setText(Double.toString(Double.parseDouble(numDisplay) - Double.parseDouble(text.getText()))); 
			}
			else if(operator == '/')
			{
				text.setText(Double.toString(Double.parseDouble(numDisplay) / Double.parseDouble(text.getText()))); 
			}
		});
		
		Button btPoint = new Button(".");
		btPoint.setLayoutX(140);
		btPoint.setLayoutY(274);
		btPoint.setPrefWidth(70);
		pane.getChildren().add(btPoint);
		btPoint.setOnAction(e->{
			text.setText(text.getText() + ".");
		});
		
		ImageView image = new ImageView("image/ChangeSign.png"); 
		image.setFitHeight(17);
		image.setFitWidth(32); 
		
		Button btChangeSign = new Button("", image); 
		btChangeSign.setLayoutX(70);
		btChangeSign.setLayoutY(169);
		btChangeSign.setPrefWidth(70);
		pane.getChildren().add(btChangeSign);
		btChangeSign.setOnAction(e->{
			text.setText(Double.toString(Double.parseDouble(text.getText()) * -1)); 
		});
		
		ImageView image2 = new ImageView("image/SquareRoot.png");
		image2.setFitHeight(17);
		image2.setFitWidth(32); 
		
		Button btSqrRoot = new Button("", image2);
		btSqrRoot.setLayoutX(280);
		btSqrRoot.setLayoutY(274);
		btSqrRoot.setPrefWidth(70);
		pane.getChildren().add(btSqrRoot);
		btSqrRoot.setOnAction(e->{
			text.setText(Double.toString(Math.sqrt(Double.parseDouble(text.getText())))); 
		});
		
		Button btSqr = new Button("x^2"); 
		btSqr.setLayoutX(280);
		btSqr.setLayoutY(246.9);
		btSqr.setPrefWidth(70);
		pane.getChildren().add(btSqr);
		btSqr.setOnAction(e->{
			text.setText(Double.toString(Math.pow(Double.parseDouble(text.getText()), 2))); 
		});
		
		Button btCub = new Button("x^3"); 
		btCub.setLayoutX(280);
		btCub.setLayoutY(221.5);
		btCub.setPrefWidth(70);
		pane.getChildren().add(btCub);
		btCub.setOnAction(e->{
			text.setText(Double.toString(Math.pow(Double.parseDouble(text.getText()), 3))); 
		});
		
		Scene scene = new Scene(pane,350,300);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
