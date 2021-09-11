import java.text.DecimalFormat;
 /**
  * Makes a Distributed Database.
  * @author Cole Rasmussen
  * Project 9
  * @version 11/6/2020
  */ 
public class DistributedDB extends DB
{
// instance variables
   protected int users;
   protected double per;
   /**
     * COST_FACTOR sets the cost factor.
     */
   public static final double COST_FACTOR = 1.1;
// constructor
   /**
     * sets the name and the price.
     * @param nameX sets the name
     * @param costX sets the cost
     * @param storageX sets the storage
     * @param usersX sets the number of users
     * @param perX sets the cost per user
     */
   public DistributedDB(String nameX, double costX, double storageX,
      int usersX, double perX)
   {
      super(nameX, costX, storageX);
      users = usersX;
      per = perX;
   }
   //methods
   /** 
     * gets the number of users.
     * @return returns the users
     */
   public int getNumberOfUsers()
   {
      return users;
   }
   /**
     * sets the number of users.
     * @param usersX gets the users
     */
   public void setNumberOfUsers(int usersX)
   {
      users = usersX;
   }
   /** 
     * gets the cost per user.
     * @return returns the cost
     */
   public double getCostPerUser()
   {
      return per;
   }
   /**
     * sets the cost per user.
     * @param perX gets the cost
     */
   public void setCostPerUser(double perX)
   {
      per = perX;
   }
   /**
     * calcualtes the user cost.
     * @return returns the cost
     */
   public double userCost()
   {
      double costU = users * per;
      return costU;
   }
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
      double month = cost + userCost() * DistributedDB.COST_FACTOR;
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
         super.toString() + "\nNumber of Users: " + users 
         + "\nCost per User: " + y.format(per) + "\nUser Cost: " 
         + y.format(userCost())
         + "\nCost Factor: " + this.getCostFactor();
      return output;
   }
}