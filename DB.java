import java.text.DecimalFormat;
/**
  * Makes a Database.
  * @author Cole Rasmussen
  * Project 9 & Project 10
  * @version 11.6.2020 - 11.13.2020
  */ 
public abstract class DB implements Comparable<DB>
{
// instance variables
   protected String name;
   protected double cost;
   protected double storage;
   protected static int count = 0;
   //constructor
   /**
     * sets the name and the price.
     * @param nameX sets the name
     * @param costX sets the cost
     * @param storageX sets the storage
     */
   public DB(String nameX, double costX, double storageX)
   {
      name = nameX;
      cost = costX;
      storage = storageX;
      count++;
   }
   //methods
   /** 
     * gets the name.
     * @return returns the name
     */
   public String getName()
   {
      return name;
   }
   /**
     * sets the name.
     * @param nameX takes the name
     */
   public void setName(String nameX)
   {
      name = nameX;
   }
   /** 
     * gets the base cost.
     * @return returns the base cost
     */
   public double getBaseCost()
   {
      return cost;
   }
   /**
     * sets the base cost.
     * @param costX takes the cost
     */
   public void setBaseCost(double costX)
   {
      cost = costX;
   }
   /** 
     * gets the storage.
     * @return returns the storage
     */
   public double getDbStorage()
   {
      return storage;
   }
   /**
     * sets the storage.
     * @param storageX takes the storage
     */
   public void setDbStorage(double storageX)
   {
      storage = storageX;
   }
   /** 
     * gets the count.
     * @return returns the count
     */
   public static int getCount()
   {
      return count;
   }
   /**
     * resets the count.
     */
   public static void resetCount()
   {
      count = 0;
   }
   /**
     * makes a string.
     * @return returns the string.
     */
   public String toString()
   {
      DecimalFormat x = new DecimalFormat("0.000");
      DecimalFormat y = new DecimalFormat("$#,##0.00");
      String output = name + " (" + this.getClass() + ") Monthly Cost: " 
         + y.format(monthlyCost());
      output += "\nStorage: " + x.format(storage) + " TB";
      output += "\nBase Cost: " + y.format(cost);
      return output;
   }
   /**
     * compares the DB objects.
     * @param deeb takes the DB object
     * @return returns the comparison
     */
   public int compareTo(DB deeb)
   {
      return this.getName().compareTo(deeb.getName());
   }
   /**
     * calculates the monthly cost.
     * @return returns the monthly cost
     */
   public abstract double monthlyCost();
}