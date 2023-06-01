/**
 * QueueOverflowException.java - This runtime exception used when trying to insert element in full queue
 * 
 * @author Will Bouasisavath
 * @version Lab 4, 10/10/2020
 */

public class QueueOverflowException extends RuntimeException {
  
   public QueueOverflowException() {
       super();
   }

   public QueueOverflowException(String message) {
       super(message);
   }

}
