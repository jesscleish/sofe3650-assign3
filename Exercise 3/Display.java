//Graphical display of scanned or manually entered item name and price
public class Display implements Observer {

	 //Displays some text on the screen
	 
	public void displayText(String text) {
		System.out.println("Display");
		System.out.println(text);
	}

	@Override
	public void update(Product product) {
		this.displayText(product.toString());
	}
}