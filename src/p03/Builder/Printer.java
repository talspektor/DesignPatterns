package p03.Builder;

public class Printer {

	@Override
	public String toString() {
		return "Printer [printerType=" + printerType + ", ink=" + ink + ", series=" + series + ", scannerEnabled="
				+ scannerEnabled + ", faxEnabled=" + faxEnabled + "]";
	}

	// required parameters
	private String printerType;
	private String ink;
	private String series;
	// optional parameters
	private boolean scannerEnabled;
	private boolean faxEnabled;
	
	// add private CTOR for the builder use
	private Printer(Builder builder) {
		this.printerType = builder.printerType;
		this.ink = builder.ink;
		this.series = builder.series;
		this.scannerEnabled = builder.scannerEnabled;
		this.faxEnabled = builder.faxEnabled;
	}
	
	// add getters to all fields
	public String getPrinterType() {
		return printerType;
	}
	
	public String getInk() {
		return ink;
	}
	
	public String getSeries() {
		return series;
	}
	
	public boolean isScannerEnabled() {
		return scannerEnabled;
	}
	
	public boolean isFaxEnabled() {
		return faxEnabled;
	}

	// create a static nested class: the builder
	static class Builder {
		// copy the same fields from the outer class
		// required parameters
		private String printerType;
		private String ink;
		private String series;
		// optional parameters
		private boolean scannerEnabled;
		private boolean faxEnabled;
		
		// add CTOR for all the required fields
		public Builder(String printerType, String ink, String series) {
			this.printerType = printerType;
			this.ink = ink;
			this.series = series;
		}

		// add setters for the optional fields that return the builder
		public Builder setFaxEnabled(boolean faxEnabled) {
			this.faxEnabled = faxEnabled;
			return this;
		}

		
		

		public Builder setScannerEnabled(boolean scannerEnabled) {
			this.scannerEnabled = scannerEnabled;
			return this;
		}
		
		// add a build method that returns a Printer
		public Printer build() {
			return new Printer(this);
		}
	}
}
