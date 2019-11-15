/**
 * Example with ArrayList
 * This class reads in song lyrics and saves into a list.
 * javac SongList.java
 * java SongList Song.txt
 */

import java.util.*;
import java.io.*;

public class SongList {

    public static void main( String[] args ) throws FileNotFoundException  {

        // open the file
        Scanner console = new Scanner(System.in);
        String fileName = args[0];
        Scanner input = new Scanner(new File(fileName));
        int count = 0;

        ArrayList<String> myList = new ArrayList<>();

        while (input.hasNextLine()) {
            String next = input.nextLine().toLowerCase();
            myList.add(next);
            count ++;
        }


        System.out.println("Total lines = " + myList.size());

        // printSet(myList);
    }

    void printSet(ArrayList myList){
      /* Print out the elements */
      for (int i = 0; i<myList.size(); i++){
        System.out.println(myList.get(i));
      }
    }

    void printSet1(ArrayList<String> myList){
      /* Print out the elements using shorthand for loop */
      for (String item : myList) {
        System.out.println(item);
      }
    }

}
