
//Prints on paper the scanned or manually entered item name and price

public class TicketPrinter implements Observer{
	//Prints some text on the paper.
	
	public void displayText(String text) {
		System.out.println("Ticket Printer");
		System.out.println(text);
	}

	@Override
	public void update(Product product) {
		this.displayText(product.toString());
	}
}