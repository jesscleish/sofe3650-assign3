
// Manual input of a UPCCode 

public class Keyboard {
	private CashRegister cashRegister;

	public Keyboard(CashRegister cashRegister) {
		this.cashRegister = cashRegister;
	}

	 //Saves the UPCCode code entered by cashier
	public void setUPCCode(int UPCCode){
		this.cashRegister.setCurrentProductUPCCode(UPCCode);
	}


}

