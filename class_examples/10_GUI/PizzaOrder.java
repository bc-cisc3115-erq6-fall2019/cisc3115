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
import java.text.NumberFormat;

public class PizzaOrder extends Application {
  private RadioButton smallRB;
  private RadioButton mediumRB;
	private RadioButton ToppingsRB;
  Label msg1;

  //For currency formatting
  NumberFormat currency = NumberFormat.getCurrencyInstance();

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
    Scene scene = new Scene(grid, 300, 400);
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
    grid.add(new Label("Size: "), 0, 2);
		grid.add(box, 1, 2, 2, 1);

    grid.add(new Label("Toppings: "), 0, 3);
    // Toppings Group 1 (Left)
    ToggleGroup toppings = new ToggleGroup();
    CheckBox olives = new CheckBox("Olives");
    CheckBox cheese = new CheckBox("Cheese");
    CheckBox mushrooms = new CheckBox("Mushrooms");
    CheckBox pineapple = new CheckBox("Pineapple");
    olives.setSelected(true);
    VBox veggies = new VBox(15, olives, cheese, mushrooms, pineapple);

    // Toppings Group 2 (Right)
    CheckBox sausage = new CheckBox("Sausage");
    CheckBox pepperoni = new CheckBox("Pepperoni");
    CheckBox meatballs = new CheckBox("Meatballs");
    CheckBox ham = new CheckBox("Ham");
    ham.setSelected(true);
    VBox meats = new VBox(15, sausage, pepperoni, meatballs, ham);

    HBox toppingsBox = new HBox(15, veggies, meats);
    toppingsBox.setAlignment(Pos.BOTTOM_LEFT);
    grid.add(toppingsBox, 0, 4, 2, 4);

    // Message to user
    msg1 = new Label();
		msg1.setWrapText(true);
		msg1.setPrefWidth(300);
		msg1.setWrapText(true);
		grid.add(msg1, 0, 12, 2, 3);

    grid.add(new Label("Spinner: "), 0, 8);
    // Creates an integer spinner with 1 as min, 5 as max and 1 as initial value
    Spinner<Integer> spinner1 = new Spinner<>(1, 10, 2);
    // HBox box = new HBox(20, label, spinner1);
    // box.setAlignment(Pos.BOTTOM_LEFT);
    grid.add(spinner1, 1, 8, 2, 1);

    Button btn = new Button();
    btn.setText("Calculate");
    btn.setOnAction(event -> calculateButtonClicked());

    HBox buttonBox = new HBox(15);
		buttonBox.getChildren().add(btn);
    buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
		grid.add(buttonBox, 0, 10, 2, 1);

    // Finally, display
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  public void calculateButtonClicked(){
    // calculate stuff
    msg1.setText("Hi");
  }


  public static void main(String[] args) {
    launch(args);
  }
}
