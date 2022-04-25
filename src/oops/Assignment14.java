package oops;

class Bank {
	int rateInterst() {
		return 5;

	}
}

class SBI extends Bank {
	int rateInterst() {
		return 8;

	}
}

class ICICI extends Bank {
	int rateInterst() {
		return 7;

	}
}

class Axis extends Bank {
	int rateInterst() {
		return 9;

	}
}

public class Assignment14 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		SBI roI1 = new SBI();
		ICICI roI2 = new ICICI();
		Axis roI3 = new Axis();
		System.out.println("SBI bank Interest rate= " + roI1.rateInterst());
		System.out.println("ICICI bank Interest rate= " + roI2.rateInterst());
		System.out.println("Axis bank Interest rate= " + roI3.rateInterst());
	}

}
