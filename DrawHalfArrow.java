import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight = 0;
      int arrowBaseWidth  = 0;
      int arrowHeadWidth = 0;
      
      System.out.println("Enter arrow base height: ");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width: ");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.println("Enter arrow head width: ");
      arrowHeadWidth = scnr.nextInt();
      
      while (arrowHeadWidth <= arrowBaseWidth) {
         System.out.println("Enter arrow head width: ");
         arrowHeadWidth = scnr.nextInt();
      }
      
      int i;
      for (i = 0; i < arrowBaseHeight; ++i) {
         int j;
         for (j = 0; j < arrowBaseWidth; ++j) {
            System.out.print("*");
         }
      System.out.println("");
      }
      
      for (i = arrowHeadWidth; i > 0; --i) {
         int j;
         for (j = 0; j < i; ++j) {
            System.out.print("*");
         }
         System.out.println("");
      }
      /*// Draw arrow base (height = 3, width = 2)
      System.out.println("**");
      System.out.println("**");
      System.out.println("**");
      
      // Draw arrow head (width = 4)
      System.out.println("****");
      System.out.println("***");
      System.out.println("**");
      System.out.println("*");
      */
      
      return;
   }
}
