/**
  * Makes a Heterogeneous Database.
  * @author Cole Rasmussen
  * Project 9
  * @version 11/6/2020
  */ 
public class HeterogeneousDB extends DistributedDB
{
//instance variables 
   /**
     * COST_FACTOR sets the cost factor.
     */
   public static final double COST_FACTOR = 1.3;
   //constructor
   /**
     * sets the name and the price.
     * @param nameX sets the name
     * @param costX sets the cost
     * @param storageX sets the storage
     * @param usersX sets the number of users
     * @param perX sets the cost per user
     */
   public HeterogeneousDB(String nameX, double costX, double storageX,
      int usersX, double perX)
   {
      super(nameX, costX, storageX, usersX, perX);
   }
   //methods
   /** 
     * gets the cost factor.
     * @return returns the factor
     */
   public double getCostFactor()
   {
      return COST_FACTOR;
   }
   /**
     * calculates the monthly cost.
     * @return returns the monthly cost
     */
   public double monthlyCost()
   {
      double month = cost + userCost() * HeterogeneousDB.COST_FACTOR;
      return month;
   } 
}