import java.text.DecimalFormat;
/**
  * Makes a Database.
  * @author Cole Rasmussen
  * Project 9
  * @version 11/6/2020
  */ 
public class CentralizedDB extends DB
{
//instance variables
   private double license;
   //constructor
   /**
     * sets the name and the price.
     * @param nameX sets the name
     * @param costX sets the cost
     * @param storageX sets the storage
     * @param licenseX sets the license
     */
   public CentralizedDB(String nameX, double costX, double storageX, 
      double licenseX)
   {
      super(nameX, costX, storageX);
      license = licenseX;
   }
   //methods
   /** 
     * gets the license.
     * @return returns the license
     */
   public double getLicense()
   {
      return license;
   }
   /**
     * sets the license.
     * @param licenseX takes the license
     */
   public void setLicense(double licenseX)
   {
      license = licenseX;
   }
   /**
     * calculates the monthly cost.
     * @return returns the monthly cost
     */
   public double monthlyCost()
   {
      double month = cost + license;
      return month;
   }
   /**
     * makes a string.
     * @return returns the string.
     */
   public String toString()
   {
      DecimalFormat y = new DecimalFormat("$#,##0.00");
      String output = 
         super.toString() + "\nLicense: " + y.format(getLicense());
      return output;
   }
}