import java.util.*;
import java.lang.*;
import java.util.ArrayList;

class HelloWorld {
  public static void main(String[] args) {
  }
}


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    List<? extends Number> numbers = new ArrayList<>();
    // numbers.add(3);
    // numbers.add("3");
    List<?> numbers2 = new ArrayList<>();
    // numbers2.add(3);
    // numbers2.add(3.1);
    // Algorithm2 a = new Algorithm2();
    
    // System.out.println(a.<Integer>max(1,2));

    ArrayList<Toppings> pizza = new ArrayList<>();
    HashMap<Toppings, ?> pizza2 = new HashMap<>();

    Toppings<String> pepperoni = new Toppings<String>("pepperoni");
    Toppings<String> cheese = new Toppings<String>("cheese");

    pizza.add(cheese);
    pizza.add(pepperoni);

    String t = (String) pizza.get(0).getName();
    System.out.println(t);


  }
}
class Algorithm2 {
/*
    public static <T> int max(T x, T y) {
        Integer intobject = new Integer(x);
        // Integer intobject = new Integer(y);
        // int x2 = x.intValue();
        // int y2 = y.intValue();
        // return x2 > y2 ? x2 : y2;
        // return x > y ? x : y;
        // Integer intobject = new Integer(1);
        return intobject.intValue();
    }
*/
}

class Toppings<T>{
  private T name;
  public Toppings(T x){
    name = x;
  }
  public void setName(T x){
    name = x;
  }
  public T getName(){
    return name;
  }
}

