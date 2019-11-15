/* Example of GUI
*  CISC 3115
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;


public class PizzaOrder extends Application {
  private RadioButton smallRB;
  private RadioButton mediumRB;
	private RadioButton ToppingsRB;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane to display the menu
    // Pane pane = new Pane();

    /* Using GridPane instead of Pane */
    GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.setHgap(10);
		grid.setVgap(10);

    // Create a scene and place it in the stage
    Scene scene = new Scene(grid, 300, 300);
    primaryStage.setTitle("Pizza Calculator"); // Set the stage title

    grid.add(new Label("Name: "), 0, 0);
		TextField name = new TextField();
		grid.add(name, 1, 0);

    ToggleGroup size = new ToggleGroup();
    smallRB = new RadioButton("Small");
    smallRB.setToggleGroup(size);

    mediumRB = new RadioButton("Large");
    mediumRB.setToggleGroup(size);
    mediumRB.setSelected(true);

    HBox box = new HBox(20, smallRB, mediumRB);
    box.setAlignment(Pos.BOTTOM_LEFT);
		grid.add(box, 0, 2, 2, 1);

    // Toppings Group 1
    ToggleGroup toppings = new ToggleGroup();
    CheckBox olives = new CheckBox("Olives");
    CheckBox cheese = new CheckBox("Cheese");
    CheckBox mushrooms = new CheckBox("Mushrooms");
    CheckBox pineapple = new CheckBox("Pineapple");
    olives.setSelected(true);
    VBox veggies = new VBox(15, olives, cheese, mushrooms, pineapple);

    // Toppings Group 2
    CheckBox sausage = new CheckBox("Sausage");
    CheckBox pepperoni = new CheckBox("Pepperoni");
    CheckBox meatballs = new CheckBox("Meatballs");
    CheckBox ham = new CheckBox("Ham");
    ham.setSelected(true);
    VBox meats = new VBox(15, sausage, pepperoni, meatballs, ham);

    HBox toppingsBox = new HBox(15, veggies, meats);
    toppingsBox.setAlignment(Pos.BOTTOM_LEFT);
    grid.add(toppingsBox, 0, 3, 2, 4);


    Button btn = new Button();
    btn.setText("Calculate");
    btn.setOnAction(event -> calculateButtonClicked());
    // grid.add(box, 2, 3);

    HBox buttonBox = new HBox(15);
		buttonBox.getChildren().add(btn);
    buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
		grid.add(buttonBox, 0, 8, 2, 1);

    // Finally, display
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage


  }

  public static void main(String[] args) {
    launch(args);
  }
}
