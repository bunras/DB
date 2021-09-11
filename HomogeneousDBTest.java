import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;  
 /**
  * Tests Homogeneous Database.
  * @author Cole Rasmussen
  * Project 9
  * @version 11/6/2020
  */ 
public class HomogeneousDBTest {

   private HomogeneousDB martin = new HomogeneousDB("D Zero", 1200.0,
         5.00, 20, 4.20);

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that tests getCostFactor. **/
   @Test public void getCostFactorTest() 
   {
      Assert.assertEquals(1.2, martin.getCostFactor(), 0.01);
   }
   /** A test that tests monthlyCost. **/
   @Test public void monthlyCostTest() 
   {
      Assert.assertEquals(1300.8, martin.monthlyCost(), 0.01);
   }
}
