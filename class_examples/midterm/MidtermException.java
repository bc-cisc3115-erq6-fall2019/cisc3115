public class MidtermException {
  public static void main (String[] args){
    try{

      MidtermException m = new MidtermException();
      m.doStuff();

    } catch (A a){
      a.printStackTrace();
    } catch (B b){
      b.printStackTrace();
    } catch (C c){
      c.printStackTrace();
    } finally {
      System.out.println("I love exceptions");
    }
  } // end main

  public void doStuff() throws A,B,C {
    System.out.println("stuff");
  } // end dostuff
}

class A extends Exception {
  // do something
}

class B extends A {
  // do something
}

class C extends B {
  // do something
}
