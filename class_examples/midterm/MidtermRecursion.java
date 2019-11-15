public class MidtermRecursion {
  public static void main (String[] args){
      MidtermRecursion m = new MidtermRecursion();

      System.out.println("\tn \tx \t y");
      m.t(5);
  }

  public static int t(int n){
    if (n == 1 || n ==2){
      int z = 2*n;
      System.out.println(z);
      return z;
    } else{
      int x= n-1;
      int y = n-2;
      int t = x - y ;
      System.out.println("\t" + n + "\t" + x + " \t " + y + "\t" + t);
      return t(x) - t(y);
    }

  } // end t()

}
