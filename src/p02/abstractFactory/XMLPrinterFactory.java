package p02.abstractFactory;

public class XMLPrinterFactory implements PrinterAbstractFactory {

	@Override
	public Printer createPrinter() {
		return new XMLPrinter("xml printer", "mix");
	}

}
