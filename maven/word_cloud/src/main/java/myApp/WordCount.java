package myApp;

import java.util.*;
import java.io.*;

/**
 * Hello world!
 *
 */
public class WordCount {
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {

      // Create a list from elements of HashMap
      java.util.List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

      // Sort the list
      Collections.sort(list, new java.util.Comparator<Map.Entry<String, Integer> >() {
        public int compare(Map.Entry<String, Integer> o1,
                           Map.Entry<String, Integer> o2) {
          return (o2.getValue()).compareTo(o1.getValue());
        }
      });

      // put data from sorted list to hashmap
      HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
      for (Map.Entry<String, Integer> aa : list) {
        temp.put(aa.getKey(), aa.getValue());
      }
      return temp;
    }

    public static void main( String[] args ) throws FileNotFoundException  {

        // open the file
        Scanner console = new Scanner(System.in);
        String fileName = args[0];
        Scanner input = new Scanner(new File(fileName));

        // count occurrences
        HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            String clean = next.replaceAll("\\p{Punct}", "").toLowerCase();

            if (!wordCounts.containsKey(clean)) {
                wordCounts.put(clean, 1);
            } else {
                wordCounts.put(clean, wordCounts.get(clean) + 1);
            }
        }


        System.out.println("Total words = " + wordCounts.size());

        HashMap<String, Integer> sortedMapAsc = WordCount.sortByValue(wordCounts);

        // Report frequencies
        for (String word : sortedMapAsc.keySet()) {
            int count = sortedMapAsc.get(word);
            System.out.println(count + ": " + word);
        }
    }
}
