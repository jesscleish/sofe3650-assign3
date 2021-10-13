import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

	//Persistence storage of the products in a store
	
public class ProductDB {
	Product product;

	//Gets the product information for the product with the UPCCode code equal to UPCCode.
		
	public Product GetProductInfo(int UPCCode){
		product = null;
		try {
			File productDatabase = new File ("src/ProductDatabase.txt");
			Scanner myReader = new Scanner(productDatabase);

			while (myReader.hasNextLine()){
				String[] product = myReader.nextLine().split(",");
				// Get the UPCCode code, name and price from the database
				int UPC = Integer.parseInt(product[0]);
				String name = product[1];
				double price = Double.parseDouble(product[2]);

				// Get product info if UPCCode codes are equal and only return a product if it's in the database
				if (UPCCode == UPC) {
					this.product = new Product(UPCCode, name, price);
					break;
				}
			}
		} catch (FileNotFoundException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return product;
		}
}




