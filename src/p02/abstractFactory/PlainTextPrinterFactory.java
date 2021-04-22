package p02.abstractFactory;

public class PlainTextPrinterFactory implements PrinterAbstractFactory {

	@Override
	public Printer createPrinter() {
		return new PlaneTextPrinter("plain printer", "black");
	}

}
