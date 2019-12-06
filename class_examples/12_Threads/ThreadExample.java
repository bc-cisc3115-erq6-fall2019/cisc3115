/* Example of making threads go to sleep
 * javac ThreadExample.java && java ThreadExample
 * CISC 3115
*/

public class ThreadExample {

  public static void main (String[] args){
   PrintThread p1 = new PrintThread("Class Example");

   // Start the thread by invoking start() method
   System.out.println("Calling start() method of " + p1.getName() + " thread");

   // start
   p1.start();

   // System.out.println("Finished printing");
  }
}

class PrintThread extends Thread {
  String[] s = {
  "Plagiarism is the act of presenting another person’s ideas, research or writing as your own. Examples of plagiarism include:",
  "- Copying another person’s actual words or images without the use of quotation marks and footnotes attributing the words to their source.",
  "- Presenting another person’s ideas or theories in your own words without acknowledging the source.",
  "- Failing to acknowledge collaborators on homework and laboratory assignments.",
  "- Internet plagiarism, including submitting downloaded term papers or parts of term papers, paraphrasing or copying information from the internet without citing the source, or “cutting & pasting” from various sources without proper attribution."
  };

    PrintThread(String name) {
        super(name);
    }

    // Override the run() method of the Thread class.
    // This method gets executed when start() method
    // is invoked.
    public void run() {

        System.out.println("run() method of the " + this.getName() + " thread is called" );
        int random = (int)(Math.random() * 10);

        // Print word by word
        // printByWords(random);

        // Print by element of s
        // printByLine(random);
    }

    public void printByLine(int random) {
      for (int i = 0; i < s.length; i++) {
          System.out.println(i + " " + this.s[i]);
          try {
             Thread.sleep(500*random);
          } catch (InterruptedException ie) {
          }
      }
    }

    public void printByWords(int random) {
      random = random;
      for (int i = 0; i < s.length; i++) {
          String[] words = s[i].split(" ");
          for (int j = 0; j < words.length; j++) {
            System.out.println(j + " " + words[j]);
            try {
               Thread.sleep(500*random);
            } catch (InterruptedException ie) {
            }
          }

      }
    }
}
