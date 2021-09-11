import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
  * Tests Distributed Database.
  * @author Cole Rasmussen
  * Project 9
  * @version 11/6/2020
  */ 
public class DistributedDBTest {

   private DistributedDB martin = new DistributedDB("D Zero", 1200.0,
         5.00, 20, 4.20);

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that tests user methods. **/
   @Test public void userTest() 
   {
      martin.setNumberOfUsers(267);
      Assert.assertEquals("Test Failed", 267, martin.getNumberOfUsers());
   }
   /** A test that tests cost per user methods. **/
   @Test public void perTest() 
   {
      martin.setCostPerUser(25.2);
      Assert.assertEquals("Test Failed", 25.2, martin.getCostPerUser(), 0.01);
   }
   /** A test that tests monthly cost. **/
   @Test public void monthlyCostTest() 
   {
      Assert.assertEquals(1292.4, martin.monthlyCost(), 0.01);
   }
   /** A test that tests getCostFactor. **/
   @Test public void costFactorTest() 
   {
      Assert.assertEquals(1.1, martin.getCostFactor(), 0.01);
   }
   /** A test that tests toString. **/
   @Test public void toStringTest() 
   {
      Assert.assertEquals("Test Failed", 
         "D Zero (class DistributedDB) Monthly Cost: $1,292.40"
         + "\nStorage: 5.000 TB"
         + "\nBase Cost: $1,200.00"
         + "\nNumber of Users: 20"
         + "\nCost per User: $4.20"
         + "\nUser Cost: $84.00"
         + "\nCost Factor: 1.1", martin.toString());
   }
}
