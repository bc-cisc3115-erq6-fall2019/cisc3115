import java.lang.NumberFormatException;
import java.lang.Exception;

class Calculator {
  /** Main method */
  public static void main(String[] args) {
    // Check number of strings passed
    if (args.length != 3) {
      System.out.println(
        "Usage: java Calculator operand1 operator operand2");
      System.exit(1);
    }

    try {
       int op1 = Integer.parseInt(args[0]);
       int op2 = Integer.parseInt(args[2]);
       
       System.out.println("op1 = " + op1);
       System.out.println("op2 = " + op2);

       String operator = args[1];

       // The result of the operation
       int result = mathiness(op1, op2, operator);


       System.out.println("op1 = " + op1);

       // Display result
       System.out.println("Result = " +  op1 + ' ' + operator + ' ' + op2
         + " = " + result);

    } catch (NumberFormatException e1){
//      System.out.println(E.printStackTrace());
//      E.getMessage();
      e1.printStackTrace();
    } catch (Exception e2){
//      System.out.println(E.printStackTrace());
      e2.printStackTrace();
    }
  }
  static int mathiness(int left, int right, String operator){
    int result = 0;

    // Determine the operator
    switch (operator.charAt(0)) { 
      case '+': result = left + right; 
                break;
      case '-': result = left - right;
                break;
      case '.': result = left * right;
                break;
      case '/': result = left / right;
    }
    return result;
  }
}
