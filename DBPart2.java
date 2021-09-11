import java.io.FileNotFoundException;
/**
  * DB part 2.
  * @author Cole Rasmussen
  * Project 9 & Project 10
  * @version 11.6.2020 - 11.13.2020
  */ 
public class DBPart2 {
 /**
   * Main method for DB part 2.
   * @param args Command line - not used
   * @throws FileNotFoundException if file not found
   */
   public static void main(String[] args) throws FileNotFoundException
   {
      DBList liste = new DBList();   
      if (args.length == 0) {
         System.out.println("File name expected as command line argument. "
               + "\nProgram ending.");       
      }
      else {
         liste.readFile(args[0]);
         System.out.print(liste.generateReport()
               + liste.generateReportByName()
               + liste.generateReportByMonthlyCost());
      }
   }
}