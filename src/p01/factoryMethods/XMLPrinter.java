package p01.factoryMethods;

public class XMLPrinter implements Printer {
	
	// fields
	private String printerType;
	private String ink;

	// CTOR
	public XMLPrinter(String printerType, String ink) {
		super();
		this.printerType = printerType;
		this.ink = ink;
	}

	// methods
	@Override
	public void print(String text) {
		System.out.println("=================");
		System.out.println(text);
		System.out.println("=================");
	}

	@Override
	public String getPrinterType() {
		return this.printerType;
	}

	@Override
	public String getInk() {
		return this.ink;
	}

	@Override
	public String toString() {
		return "PlaneTextPrinter [printerType=" + printerType + ", ink=" + ink + "]";
	}
	
	

}
