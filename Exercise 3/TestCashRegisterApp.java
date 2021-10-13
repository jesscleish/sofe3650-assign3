
public class TestCashRegisterApp {
	public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
		Scanner scanner = new Scanner(cashRegister);
		Keyboard keyboard = new Keyboard(cashRegister);


        //UPC codes with number correlate to the alphabetical order of our group members
        keyboard.setUPCCode(3);
        scanner.scannedUPCCode(2);
        keyboard.setUPCCode(1);
        scanner.scannedUPCCode(4);

        //UPC codes that aren't in the database
        scanner.scannedUPCCode(7);
        scanner.scannedUPCCode(12);
	}
}