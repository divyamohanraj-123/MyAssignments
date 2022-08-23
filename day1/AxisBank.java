package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("----Method Overriding----");
		System.out.println("Deposit money in bank through cheque ");
	}
	public static void main(String[] args) {
		AxisBank information=new AxisBank();
		information.saving();
		information.fixed();
		information.deposit();
	}
}
