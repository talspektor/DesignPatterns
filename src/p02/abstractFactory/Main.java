package p02.abstractFactory;

public class Main {

	public static void main(String[] args) {
		Printer printer;
		
		printer = PrinterFactory.createPrinter(new PlainTextPrinterFactory());
		printer.print("hello");
		
		printer = PrinterFactory.createPrinter(new HtmlPrinterFactory());
		printer.print("hello");
		
		printer = PrinterFactory.createPrinter(new XMLPrinterFactory());
		printer.print("hello");
		
	}

}
