package p02.abstractFactory;

public class PrinterFactory {

	public static Printer createPrinter(PrinterAbstractFactory factory) {
		return factory.createPrinter();
	}
}
