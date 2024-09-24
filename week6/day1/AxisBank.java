package week6.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("DEPOSIT AMT..");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.savings();
		obj.fixed();
		obj.deposit();
	}
}
