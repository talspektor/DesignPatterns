package p03.Builder;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer.Builder("plain", "color", "1500se")
				.setScannerEnabled(true)
				.setFaxEnabled(true)
				.build();
		
		System.out.println(printer);
		
	}

}
