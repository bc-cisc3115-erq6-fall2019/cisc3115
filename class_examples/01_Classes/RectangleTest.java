/* Introduction to Java Programming, page 386
Design a class named Rectangle to represent a rectangle
*/

class Rectangle {

  /* Two double data fields named width and height that specify the width and
  height of the rectangle. The default values are 1 for both width and height.*/

  double width;
  double height;
  // int test = 1.0; // can't do this

  // A no-arg constructor that creates a default rectangle.
  public Rectangle(){
    // Create a default rectangle, value 1 for both width & height
     width = 1;
     height = 1;
  }

  // A constructor that creates a rectangle with the specified width and height.
  public Rectangle(double width, double height){
    // Create a rectangle with the specified width and height
    this.width = width;
    this.height = height;
  }

  // A method named getArea() that returns the area of this rectangle.
  public double getArea(){
    return width * height;
  }

  // A method named getPerimeter() that returns the perimeter.
  public double getPerimeter(){
    double perimeter = (height + width) * 2;
    return perimeter;
  }

  public void setWidth(double w){
    width = w;
  }

  void setHeight(String h){
    double newHeight;
    try {
      int hInt = Integer.parseInt(h);
      newHeight = hInt;
      // won't work when input is has a decimal
    } catch(Exception e) {
      System.out.println("Error. Please don't use decimals in your height settings.");
      newHeight = new Double(h);
    }
    height = newHeight;
  }

  void setEverything(double height, double width){
    this.height = width;
    this.width = height;
  }

}

/*
Write a test program that creates two Rectangle objects
- one with width 4 and height 40, and
the other with width 3.5 and height 35.9.
Display the width, height, area, and
perimeter of each rectangle in this order.*/
class RectangleTest {
  public static void main(String[] args) {
    // create a new rectangle with defaults
    System.out.println("rectangle\twidth\theight\tarea\tperimeter");

    Rectangle rect0 = new Rectangle();
    System.out.println("rectangle 0\t"+rect0.width+"\t"+rect0.height+"\t"+rect0.getArea()+"\t"+rect0.getPerimeter());

    Rectangle rect1 = new Rectangle(4, 40);
    System.out.println("rectangle 1\t"+rect1.width+"\t"+rect1.height+"\t"+rect1.getArea()+"\t"+rect1.getPerimeter());

    Rectangle rect2 = new Rectangle(3.5, 35.9);
    System.out.println("rectangle 2\t"+rect2.width+"\t"+rect2.height+"\t"+rect2.getArea()+"\t"+rect2.getPerimeter());

    rect2.setWidth(101.5);
    rect2.setHeight("1001.5");
    rect2.setEverything(1,2);
    System.out.println("rectangle 2'\t"+rect2.width+"\t"+rect2.height+"\t"+rect2.getArea()+"\t"+rect2.getPerimeter());

  }
}
