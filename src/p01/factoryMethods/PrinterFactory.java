package p01.factoryMethods;

public class PrinterFactory {

	public static Printer createPrinter(PrinterType type) {
		
		switch (type) {
		case PLAIN_TEXT: 
			return new PlaneTextPrinter("plain printer", "black");
		case HTML: 
			return new HTMLPrinter("html printer", "color");
		}
		return null;
	}
}
