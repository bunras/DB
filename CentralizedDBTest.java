import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
  * Tests Centralized Database.
  * @author Cole Rasmussen
  * Project 9
  * @version 11/6/2020
  */ 
public class CentralizedDBTest {

   private CentralizedDB martin = new CentralizedDB("D Zero", 1200.0,
         5.00, 1500.0);

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that tests name methods. **/
   @Test public void nameTest() 
   {
      martin.setName("D One");
      Assert.assertEquals("Test Failed", "D One", martin.getName());
   }
   /** A test that tests cost methods. **/
   @Test public void costTest() 
   {
      martin.setBaseCost(1200.0);
      Assert.assertEquals("Test Failed", 1200.0, martin.getBaseCost(), 0.01);
   }
   /** A test that tests storage methods. **/
   @Test public void storageTest() 
   {
      martin.setDbStorage(5.01);
      Assert.assertEquals("Test Failed", 5.01, martin.getDbStorage(), 0.000001);
   }
   /** A test that tests count methods. **/
   @Test public void countTest() 
   {
      martin.resetCount();
      Assert.assertEquals("Test Failed", 0, martin.getCount(), 0.000001);
   }
   /** A test that tests toString. **/
   @Test public void toStringTest() 
   {
      Assert.assertEquals("Test Failed", 
         "D Zero (class CentralizedDB) Monthly Cost: $2,700.00"
         + "\nStorage: 5.000 TB"
         + "\nBase Cost: $1,200.00"
         + "\nLicense: $1,500.00", martin.toString());
   }
   /** A test that tests license methods. **/
   @Test public void licenseTest() 
   {
      martin.setLicense(1420.0);
      Assert.assertEquals("Test Failed", 1420.0, martin.getLicense(), 0.01);
   }
   /** A test that tests monthlyCost. **/
   @Test public void monthlyCostTest() 
   {
      Assert.assertEquals(2700.0, martin.monthlyCost(), 0.01);
   }
}
