//Graphical display of scanned or manually entered item name and price

public class Display implements View{
  //Displays some text on the screen
 
   public void displayText(String text) {
   System.out.println("Display");
   System.out.println(text);
   }

   // override the displayProduct method of View interface to display the product using toString method of Product class
   @Override
   public void displayProduct(Product p) {
       System.out.println("Display");
       System.out.println(p);
   }
}