
import java.io.FileNotFoundException;
/**
  * DB part 3.
  * @author Cole Rasmussen
  * Project 11
  * @version 11.20.2020
  */ 
public class DBPart3
{
    /**
   * Main method for DB part 3.
   * @param args Command line
   */
   public static void main(String[] args)
   {
      try
      {
         DBList part3 = new DBList();
         if (args.length == 0)
         {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");
         }
         else
         {
            part3.readFile(args[0]);
            System.out.print(part3.generateReport()
               + part3.generateReportByName()
               + part3.generateReportByMonthlyCost()
               + part3.generateInvalidRecordsReport());
         }
      }
      catch (FileNotFoundException file)
      {
         String err = "*** Attempted to read file: " + args[0];
         err += " (No such file or directory)";
         err += "\n";
         System.out.print(err);
      }
   }
}