import java.util.Comparator;
/**
  * Makes a monthly cost comparator.
  * @author Cole Rasmussen
  * Project 9 & Project 10
  * @version 11.6.2020 - 11.13.2020
  */ 
public class MonthlyCostComparator implements Comparator<DB>
{
/**
  * compares the two objects.
  * @param db1 takes the first DB object
  * @param db2 takes the second DB object
  * @return returns an int
  */
   public int compare(DB db1, DB db2)
   {
      if (db1.monthlyCost() < db2.monthlyCost())
      {
         return 1;
      }
      else if (db1.monthlyCost() > db2.monthlyCost())
      {
         return -1;
      }
      else
      {
         return 0;
      }
   }
}