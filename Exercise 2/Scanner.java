
//Capture of UPCCode code using a bar scanner

public class Scanner {
	private CashRegister cashRegister;

	public Scanner(CashRegister cashRegister) {
		this.cashRegister = cashRegister;
	}
	//Capture of UPCCode code using a bar scanner
	
	public void scannedUPCCode(int UPCCode) {
		this.cashRegister.setCurrentProductUPCCode(UPCCode);
	}
}