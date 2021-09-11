 /**
  * Makes a Invalid Category Exception.
  * @author Cole Rasmussen
  * Project 9, Project 10, and Project 11
  * @version 11.6.2020 - 11.20.2020
  */ 
public class InvalidCategoryException extends Exception
{
/**
  * takes the exception.
  * @param categoryX takes the category
  */
   public InvalidCategoryException(String categoryX)
   {
      super("For category: " + categoryX);
   }
}