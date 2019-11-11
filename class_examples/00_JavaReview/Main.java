/* Comparing while and do while loops
*  CISC 3115, Brooklyn College
*  Author: Kathering Chuang
*/

/* Compare a while loop to a do while loop
*/

class Main {
  public static void main(String[] args) {
    
    // give x a random value as an example
    int x = 2;

    // runs statements only if condition matches
    while ( x == 2 ) {
      System.out.println(x);
      x++;
    }

    // runs the body statements at least once
    do {
      System.out.println(x);
      x++;
    } while (x == 2);

  }
}
