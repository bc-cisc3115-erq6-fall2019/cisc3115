/**
 * Example with Set
 * This class reads in song lyrics and de-duplicates lines
 * javac SongSet.java
 * java SongSet Song.txt
 */

import java.util.*;
import java.io.*;

public class SongSet {

    public static void main( String[] args ) throws FileNotFoundException  {

        // open the file
        Scanner console = new Scanner(System.in);
        String fileName = args[0];
        Scanner input = new Scanner(new File(fileName));
        int count = 0;

        Set<String> mySet = new HashSet<>();

        while (input.hasNextLine()) {
            String next = input.nextLine().toLowerCase();
            mySet.add(next);
            count ++;
        }


        System.out.println("Total lines in the input file = " + count);
        System.out.println("Total lines after processing = " + mySet.size());

        // printSet(mySet);

    }

    void printSet(Set<String> mySet){
      /* Print out the elements using shorthand for loop */
      for (String item : mySet) {
        System.out.println(item);
      }
    }

}
