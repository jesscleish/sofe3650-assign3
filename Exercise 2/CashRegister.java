public class CashRegister {
   private Display display = new Display();
   private TicketPrinter ticketPrinter = new TicketPrinter();
   private View view; // instead of using Display and TicketPrinter objects, use a reference to View interface
   private Product currentProduct;
   private ProductDB productDB = new ProductDB();
   private int UPCCode;

   //Sets the UPC code for current scanned product
  
 
   public void setCurrentProductUPCCode(int UPCCode) {
       this.UPCCode = UPCCode;
       this.currentProduct = this.getCurrentProductInfo();

       // Only print on the views if the product is defined
       if (this.currentProduct != null){
           /*
           // Displays the current scanned item
           this.display.displayText(this.currentProduct.toString());
           this.ticketPrinter.displayText(this.currentProduct.toString());
            */

           // set view to point to Display object to call displayProduct of Display class
           view = this.display;
           view.displayProduct(currentProduct);

           // set view to TicketPrinter object to call displayProduct of TicketPrinter class
           view = this.ticketPrinter;
           view.displayProduct(currentProduct);
       }
   }
  
   //Gets the product information for the latest scanned product
   
   public Product getCurrentProductInfo() {
       currentProduct = this.productDB.GetProductInfo(this.UPCCode);
       return currentProduct;
   }


}