package p02.abstractFactory;

public class HtmlPrinterFactory implements PrinterAbstractFactory {

	@Override
	public Printer createPrinter() {
		return new HTMLPrinter("html printer", "color");
	}

}
