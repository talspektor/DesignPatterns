package p01.factoryMethods;

public class Main {

	public static void main(String[] args) {
		Printer printer;
		
		printer = PrinterFactory.createPrinter(PrinterType.PLAIN_TEXT);
		printer.print("hello");
		
		printer = PrinterFactory.createPrinter(PrinterType.HTML);
		printer.print("hello");
		
		
		
	}

}
