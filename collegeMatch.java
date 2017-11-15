import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class collegeMatch{
  public static void main (String [] args) throws FileNotFoundException{
    String[][] convertedFile = readFile();
    test(convertedFile);
  }

  public static String [][] readFile() throws FileNotFoundException{
    File file = new File("FinalData.csv");
    Scanner console = new Scanner(file);
    console.next();
    int dataSize = 1492;
    String[][] stats = new String[dataSize][9];
    console.nextLine();
    int pos=0;
     while(console.hasNext()){
       String line = console.nextLine();
       String[] fields = line.split(","); // split the columns apart
       for(int i = 0; i < fields.length; i++){
          stats[pos][i] = fields[i];
       }
       pos++;
     }
     return stats;
  }

}
