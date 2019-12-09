package vending;

public class NotNullPaidException extends RuntimeException {
   private String message;
   private long remaining;

   public NotNullPaidException(String message, long remaining) {
      this.message = message;
      this.remaining = remaining;
   }

   public long getRemaining() {
      return remaining;
   }

   @Override
   public String getMessage() {
      return message + remaining;
   }
}